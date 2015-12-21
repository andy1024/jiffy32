#!/bin/bash
#Automatic converter for python font files to java
#it accepts files built for py-gaugette project
#it produces two files: java class for font and binary resource containing bitmap
#author: andrzej.maslowski1024@gmail.com
#
#usage:
#bash font_converter.sh python_font_filename.py java.destination.package
#
IFS="
"
STATE=0
FILENAME=$1
PACKAGE=$2
echo Input file name: $FILENAME
echo Destination package: $PACKAGE
FILE_NO_EXT=`echo "${FILENAME%%.*}"`
JCLASS=`echo $FILE_NO_EXT | sed -re "s~(^|_)(.)~\U\2~g"`
JFILENAME=$JCLASS.java
BITMAPFILE=$JCLASS.bin
echo Output java class name: $JCLASS
echo Output binary bitmap file name: $BITMAPFILE
#exit
echo "package $PACKAGE;" >$JFILENAME

#iterate over input file in 5 stages:
#0: preamble - comments, configuration parameters
#1: bitmap data
#2: descriptors
#3: kerning
#4: ending line
for line in `cat $FILENAME`; do
  if [ $STATE -eq 0 ]; then
    #echo $line
    if [[ "$line" == '#'* ]]; then
      echo $line|sed 's/#/\/\//' >>$JFILENAME
    fi
    if [[ "$line" == "name"* ]]; then
      NAME=`echo $line|cut -d"=" -f2| sed -e 's/^[ \t]*//'`
    fi
    if [[ "$line" == "start_char"* ]]; then #extract value from pair and substitute chr(x) with (char)x
      START_CHAR=`echo $line|cut -d"=" -f2| sed -e 's/^[ \t]*//'|sed 's/chr(\(.*\))/(char)\1/'`
    fi
    if [[ "$line" == "end_char"* ]]; then
      END_CHAR=`echo $line|cut -d"=" -f2| sed -e 's/^[ \t]*//'|sed 's/chr(\(.*\))/(char)\1/'`
    fi
    if [[ "$line" == "char_height"* ]]; then
      CHAR_HEIGHT=`echo $line|cut -d"=" -f2| sed -e 's/^[ \t]*//'`
    fi
    if [[ "$line" == "space_width"* ]]; then
      SPACE_WIDTH=`echo $line|cut -d"=" -f2| sed -e 's/^[ \t]*//'`
    fi
    if [[ "$line" == "gap_width"* ]]; then
      GAP_WIDTH=`echo $line|cut -d"=" -f2| sed -e 's/^[ \t]*//'`
    fi
    if [ "$line" == "bitmaps = (" ]; then #state change ->1
      STATE=1
      echo -e "\npublic class $JCLASS extends Font {" >>$JFILENAME
      echo -e "\tpublic $JCLASS() {" >>$JFILENAME
      echo -e "\t\tsuper($NAME, $START_CHAR, $END_CHAR, $CHAR_HEIGHT, $SPACE_WIDTH, $GAP_WIDTH, \"$BITMAPFILE\");" >>$JFILENAME
      echo -e "\t}\n\n" >>$JFILENAME
      #echo -e "\tprivate static byte[] bitmaps;" >>$JFILENAME
      rm -rf $BITMAPFILE #any better solutions?
    fi
  fi
  if [ $STATE -gt 1 ]; then #for states 2-4 replace comment sign to c-style and 0x with byte cast
    line=`echo $line|sed 's/#/\/\//'|sed 's/0x/\(byte\)0x/'g`
  fi
  if [ $STATE -gt 1 ]; then #for states 2-4 also replace parentheses with curly brackets
    line=`echo $line|tr '(' '{'|tr ')' '}'`
  fi
  if [ $STATE -eq 1 ]; then
    if [ "$line" == "descriptors = (" ]; then #state change ->2
      STATE=2
      #echo -e "};\n" >>$JFILENAME
      line=`echo -e "\tprivate static final int[][] descriptors = {"`
    else
      if [ "$line" != ')' ]; then
	if [[ "$line" =~ "0x" ]]; then
          echo -n -e `echo $line|sed 's/#.*$//'|sed 's/0x//'g|sed "s/\([0-9A-Fa-f]*\),/\\\\\\\x\1/"g|tr -d ' '` >>$BITMAPFILE
        fi
        #echo $line >>$JFILENAME
      fi
    fi
  fi
  if [ $STATE -eq 2 ]; then
    if [ "$line" == "kerning = {" ]; then #state change ->3
      STATE=3
      echo -e "};\n" >>$JFILENAME
      line=`echo -e "\tprivate static final byte[][] kerning = {"`
    else
      if [ "$line" != '}' ]; then
        echo $line >>$JFILENAME
      fi
    fi
  fi
  if [ $STATE -eq 3 ]; then
    if [ "$line" == "// End of font" ]; then #state change ->4
      STATE=4
      echo -e ";\n" >>$JFILENAME
      #echo -e "\t@Override" >>$JFILENAME
      #echo -e "\tpublic byte[] getBitmaps() {" >>$JFILENAME
      #echo -e "\t\treturn bitmaps;" >>$JFILENAME
      #echo -e "\t}\n" >>$JFILENAME

      echo -e "\t@Override" >>$JFILENAME
      echo -e "\tpublic int[][] getDescriptors() {" >>$JFILENAME
      echo -e "\t\treturn descriptors;" >>$JFILENAME
      echo -e "\t}\n" >>$JFILENAME

      echo -e "\t@Override" >>$JFILENAME
      echo -e "\tpublic byte[][] getKerning() {" >>$JFILENAME
      echo -e "\t\treturn kerning;" >>$JFILENAME
      echo -e "\t}\n" >>$JFILENAME

      echo -e "}\n" >>$JFILENAME
    else
      echo $line >>$JFILENAME
    fi
  fi
done
echo Done
