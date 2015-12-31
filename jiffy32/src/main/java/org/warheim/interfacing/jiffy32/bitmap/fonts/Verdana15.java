package org.warheim.interfacing.jiffy32.bitmap.fonts;
// coding=utf-8
// Module verdana_15
// generated from Verdana 12pt

public class Verdana15 extends BitmapFont {
	public Verdana15() {
		super("Verdana 15", '!', (char)127, 15, 7, 1, "Verdana15.bin");
	}


	private static final int[][] descriptors = {
    {1,0},// !
    {5,15},// "
    {10,30},// #
    {8,60},// $
    {15,75},// %
    {10,105},// &
    {1,135},// '
    {5,150},// {
    {5,165},// }
    {7,180},// *
    {9,195},// +
    {2,225},// ,
    {5,240},// -
    {1,255},// .
    {7,270},// /
    {8,285},// 0
    {5,300},// 1
    {8,315},// 2
    {8,330},// 3
    {9,345},// 4
    {8,375},// 5
    {8,390},// 6
    {8,405},// 7
    {8,420},// 8
    {8,435},// 9
    {1,450},// :
    {2,465},// ;
    {9,480},// <
    {9,510},// =
    {9,540},// >
    {7,570},// ?
    {14,585},// @
    {9,615},// A
    {9,645},// B
    {9,675},// C
    {10,705},// D
    {8,735},// E
    {8,750},// F
    {10,765},// G
    {10,795},// H
    {5,825},// I
    {6,840},// J
    {9,855},// K
    {8,885},// L
    {11,900},// M
    {10,930},// N
    {11,960},// O
    {8,990},// P
    {11,1005},// Q
    {10,1035},// R
    {8,1065},// S
    {9,1080},// T
    {10,1110},// U
    {9,1140},// V
    {15,1170},// W
    {9,1200},// X
    {9,1230},// Y
    {9,1260},// Z
    {4,1290},// [
    {7,1305},// \
    {4,1320},// ]
    {10,1335},// ^
    {10,1365},// _
    {2,1395},// `
    {8,1410},// a
    {8,1425},// b
    {7,1440},// c
    {8,1455},// d
    {8,1470},// e
    {6,1485},// f
    {8,1500},// g
    {8,1515},// h
    {1,1530},// i
    {3,1545},// j
    {7,1560},// k
    {1,1575},// l
    {13,1590},// m
    {8,1620},// n
    {8,1635},// o
    {8,1650},// p
    {8,1665},// q
    {5,1680},// r
    {7,1695},// s
    {5,1710},// t
    {8,1725},// u
    {7,1740},// v
    {11,1755},// w
    {7,1785},// x
    {7,1800},// y
    {7,1815},// z
    {7,1830},// {
    {1,1845},// |
    {7,1860},// }
    {10,1875},// ~
    {6,1905},// °
};

	private static final byte[][] kerning = {
    {1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,},
    {5,5,4,5,5,4,5,4,5,5,1,3,0,4,1,5,5,5,5,2,4,5,5,5,5,5,4,0,0,5,5,4,2,5,5,5,5,5,5,5,5,3,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,3,0,5,3,5,3,3,3,5,3,5,5,5,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,5,2,5,5,0,5,},
    {10,10,9,10,10,9,10,9,8,9,7,8,7,9,7,10,9,9,9,9,9,10,9,10,10,10,9,7,9,9,9,9,8,10,10,10,10,10,10,10,9,7,10,10,10,10,10,10,10,10,10,9,10,9,9,9,9,9,10,8,7,8,0,9,9,10,9,9,9,10,9,10,10,10,10,10,10,10,9,10,9,10,9,10,10,10,10,10,10,10,7,10,7,9,10,},
    {8,8,8,7,8,8,8,8,5,6,6,6,6,7,6,8,8,7,7,8,7,8,5,8,8,7,6,6,8,8,7,8,8,8,8,8,8,8,8,8,6,6,8,8,8,8,8,8,8,8,8,4,8,8,8,6,7,7,8,7,5,5,4,6,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,7,7,8,6,7,7,6,7,6,8,5,8,8,},
    {15,11,15,15,14,15,14,15,12,11,15,14,15,15,14,15,14,14,15,15,15,15,13,15,14,15,14,15,15,15,12,15,15,15,15,15,15,15,15,15,14,14,15,15,15,15,15,15,15,15,15,11,15,13,14,14,11,15,15,12,12,14,5,13,15,15,15,15,15,14,15,15,15,13,15,15,15,15,15,15,15,15,15,14,15,14,14,14,14,15,15,15,12,15,13,},
    {10,7,9,9,9,9,9,9,7,6,9,9,9,10,9,9,10,10,9,9,9,9,8,9,9,10,9,9,9,9,7,9,10,10,9,10,10,10,9,10,10,10,10,10,10,10,9,10,9,10,8,6,9,7,8,10,6,10,10,6,7,9,0,8,9,10,9,9,9,9,9,10,10,8,10,10,10,10,9,10,9,10,9,8,9,8,8,10,8,10,9,10,7,9,8,},
    {1,1,0,1,1,0,1,0,1,1,0,0,0,0,0,1,1,1,1,0,0,1,1,1,1,1,0,0,0,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1,0,0,0,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,1,0,1,},
    {4,5,1,2,3,2,5,1,5,4,1,4,1,4,4,2,2,3,3,1,3,2,4,2,2,4,4,1,1,2,3,1,2,4,2,4,4,4,2,4,4,2,4,4,4,4,2,4,2,4,2,4,4,4,4,4,4,4,5,5,5,1,4,4,1,5,1,1,1,3,3,5,4,2,5,5,2,2,1,4,1,2,2,3,2,2,2,2,2,2,1,5,5,1,3,},
    {5,4,5,5,5,5,4,5,1,5,5,3,5,4,3,5,4,4,4,5,4,5,2,5,5,5,4,5,5,4,3,5,5,5,5,5,5,5,5,5,4,4,5,5,5,5,5,5,5,5,5,2,5,4,4,4,3,4,5,3,2,5,2,3,5,5,5,5,5,4,5,5,5,4,5,5,5,5,5,5,5,5,5,4,5,5,5,4,5,4,5,5,2,5,5,},
    {7,7,5,7,7,5,7,7,6,7,3,5,2,6,3,7,5,6,6,5,6,7,7,6,7,7,6,4,4,5,6,6,5,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,6,4,6,0,7,6,7,6,6,6,6,6,7,7,6,7,7,7,7,6,7,6,7,7,6,7,7,7,6,7,6,4,7,4,2,7,},
    {9,5,7,7,8,8,8,9,5,5,9,7,9,8,6,9,7,4,5,9,5,9,5,8,8,8,7,9,5,5,5,9,7,9,9,9,9,9,9,9,7,4,9,9,9,9,9,9,9,9,5,5,9,7,8,5,5,5,9,6,6,5,0,7,7,9,9,9,9,8,9,9,9,7,9,9,9,9,9,9,9,9,9,8,9,8,8,7,8,5,9,9,4,8,5,},
    {2,0,1,2,0,1,1,1,0,0,0,1,0,2,1,1,2,2,2,0,2,1,0,1,1,2,1,0,0,2,0,1,2,2,1,2,2,2,1,2,2,2,2,2,2,2,1,2,1,2,1,0,1,0,0,2,0,2,2,0,0,0,1,0,1,2,1,1,1,1,1,2,2,0,2,2,2,2,1,2,1,2,2,1,1,0,0,2,0,2,0,2,0,0,0,},
    {5,0,3,3,4,4,4,5,1,0,5,3,5,4,2,5,3,0,0,5,0,5,1,4,4,4,3,5,0,0,1,5,3,5,5,5,5,5,5,5,3,0,5,5,5,5,5,5,5,5,1,1,5,3,4,1,1,1,5,2,2,0,0,3,3,5,5,5,5,4,5,5,5,3,5,5,5,5,5,5,5,5,5,4,5,4,4,3,4,1,5,5,0,4,0,},
    {1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,0,0,0,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,1,1,1,1,0,1,0,1,1,0,0,0,0,1,0,1,0,1,0,0,0,},
    {6,7,4,5,6,5,7,5,7,6,4,5,4,6,1,6,6,6,6,4,5,5,6,6,6,6,5,4,4,6,6,4,3,6,5,6,6,6,5,6,6,4,6,6,6,6,5,6,5,6,6,6,6,6,6,6,6,6,7,7,7,4,1,6,4,7,4,4,4,5,4,7,6,5,7,7,5,5,4,5,4,5,5,5,5,5,5,5,5,5,4,7,7,4,6,},
    {8,8,8,8,8,8,8,8,5,8,8,6,8,7,6,8,8,7,7,8,7,8,6,8,8,8,7,8,8,8,7,8,8,8,8,8,8,8,8,8,6,6,8,8,8,8,8,8,8,8,8,6,8,8,8,6,7,7,8,7,5,8,0,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,5,8,8,},
    {5,3,4,4,3,3,4,4,2,3,3,4,3,5,4,3,5,5,4,3,4,3,3,3,4,5,4,3,3,3,3,4,5,5,3,5,5,5,3,5,5,5,5,5,5,5,3,5,3,5,3,3,3,3,3,5,3,5,5,2,2,3,0,3,3,5,3,3,3,4,3,5,5,3,5,5,5,5,3,5,3,5,4,3,3,3,3,5,3,5,3,5,2,3,3,},
    {8,8,7,8,8,7,8,8,5,8,6,7,6,8,7,8,8,8,7,6,7,8,6,8,8,8,7,6,7,8,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,6,8,8,8,8,7,8,8,7,5,7,0,6,7,8,7,7,7,8,7,8,8,8,8,8,8,8,7,8,7,8,8,8,8,8,8,8,8,8,6,8,5,5,8,},
    {8,8,8,8,8,8,8,8,5,7,7,6,7,7,6,8,8,7,7,8,7,8,6,8,8,8,7,7,8,8,7,8,8,8,8,8,8,8,8,8,6,6,8,8,8,8,8,8,8,8,8,6,8,8,8,6,7,7,8,7,5,6,0,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,7,8,5,8,8,},
    {9,7,9,7,7,9,8,9,6,7,7,7,7,8,7,9,7,7,7,9,7,9,7,9,7,8,7,7,9,7,7,9,8,9,9,9,9,9,9,9,7,7,9,9,9,9,9,9,9,9,7,7,9,7,7,7,7,7,9,6,6,7,0,7,9,9,9,9,9,8,9,9,9,7,9,9,9,9,9,9,9,9,7,8,9,7,8,7,7,7,7,9,6,9,7,},
    {8,8,8,7,7,8,8,8,7,8,8,6,8,7,6,8,6,7,7,8,7,8,8,8,7,7,6,8,8,7,7,8,8,8,8,8,8,8,8,8,8,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,5,7,0,8,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,7,8,7,7,7,7,7,8,8,5,8,7,},
    {8,7,8,7,7,8,7,8,6,7,8,6,8,7,6,8,6,6,7,8,7,8,7,8,7,7,6,8,8,7,6,8,8,8,8,8,8,8,8,8,7,6,8,8,8,8,8,8,8,8,8,7,8,7,7,7,7,7,8,6,5,7,0,7,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,7,8,7,7,7,7,7,8,8,5,8,6,},
    {8,8,6,7,8,7,8,6,7,8,5,6,5,7,3,7,7,8,8,5,7,7,8,7,7,7,6,5,6,7,8,6,4,8,7,8,8,8,7,8,8,6,8,8,8,8,7,8,7,8,7,8,8,8,8,8,8,8,8,7,5,6,0,8,5,8,6,6,6,7,6,8,8,7,8,8,7,7,6,7,6,7,6,7,7,7,7,7,7,7,5,8,5,5,8,},
    {8,8,8,8,8,8,8,8,5,7,7,6,7,7,6,8,8,7,7,8,7,8,6,8,8,8,7,7,8,8,7,8,8,8,8,8,8,8,8,8,6,6,8,8,8,8,8,8,8,8,8,6,8,8,8,6,7,7,8,7,5,6,0,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,7,8,5,8,8,},
    {8,8,8,8,8,8,8,8,5,8,8,6,8,7,6,8,8,7,7,8,7,8,6,8,8,8,7,8,8,8,7,8,7,8,8,8,8,8,8,8,6,5,8,8,8,8,8,8,8,8,8,6,8,8,8,6,7,6,8,7,5,8,0,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,5,8,8,},
    {1,1,0,1,1,0,1,1,0,1,0,0,0,1,0,1,1,1,1,0,1,1,0,1,1,1,0,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0,0,1,},
    {2,2,1,2,2,1,2,2,0,2,0,1,0,2,1,2,2,2,2,0,2,2,0,2,2,2,1,0,0,2,0,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,2,1,1,2,0,2,2,0,0,1,1,0,1,2,1,1,1,2,1,2,2,2,2,2,2,2,1,2,1,2,2,2,2,2,2,2,2,2,0,2,0,0,2,},
    {9,9,8,9,9,8,9,8,6,7,5,8,4,9,8,9,9,8,9,5,9,8,7,9,9,9,8,2,5,9,6,8,9,9,8,9,9,9,8,9,7,5,9,9,9,9,8,9,8,9,9,5,9,9,9,8,8,9,9,8,6,6,0,7,8,9,8,8,8,8,8,9,9,7,9,9,9,9,8,9,8,9,9,8,8,7,7,8,7,9,6,9,6,5,9,},
    {9,4,9,8,9,9,8,9,5,6,5,7,4,8,7,9,7,6,6,9,3,9,6,9,9,8,7,8,9,5,6,9,8,9,9,9,9,9,9,9,7,4,9,9,9,9,9,9,9,9,8,5,9,7,8,7,6,7,9,6,6,9,0,7,9,9,9,9,9,8,9,9,9,7,9,9,9,9,9,9,9,9,9,8,9,8,8,8,8,7,7,9,6,9,8,},
    {9,4,7,7,8,8,8,9,5,6,9,7,9,8,6,9,7,4,5,9,5,9,5,8,8,8,7,9,8,2,5,9,7,9,9,9,9,9,9,9,7,4,9,9,9,9,9,9,9,9,7,5,9,7,8,5,5,5,9,6,6,8,0,7,7,9,9,9,9,8,9,9,9,7,9,9,9,9,9,9,9,9,9,8,9,8,8,7,8,5,9,9,4,8,7,},
    {7,7,6,7,7,6,7,7,4,7,5,5,5,6,3,7,7,6,6,5,6,7,5,7,7,7,6,5,6,7,6,6,5,7,7,7,7,7,7,7,5,4,7,7,7,7,7,7,7,7,7,5,7,7,7,5,6,5,7,6,4,6,0,5,6,7,6,6,6,7,6,7,7,7,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,5,7,4,4,7,},
    {14,13,14,14,14,14,13,14,10,14,14,12,14,13,12,14,13,12,13,14,13,14,11,14,14,14,13,14,14,13,12,14,14,14,14,14,14,14,14,14,12,9,14,14,14,14,14,14,14,14,14,10,14,13,13,12,12,13,14,12,11,14,10,12,14,14,14,14,14,13,14,14,14,13,14,14,14,14,14,14,14,14,14,13,14,14,14,13,14,13,14,14,11,14,14,},
    {9,6,8,9,7,9,8,9,6,7,7,8,7,9,8,9,9,9,9,8,9,9,7,9,8,9,8,7,8,9,6,9,9,9,8,9,9,9,8,9,9,9,9,9,9,9,8,9,8,9,9,5,9,6,7,9,5,9,9,5,6,7,0,7,9,9,9,9,9,8,9,9,9,7,9,9,9,9,9,9,9,9,9,8,9,7,8,9,7,9,7,9,6,8,7,},
    {9,8,9,8,8,9,8,9,6,7,8,7,8,8,7,9,8,8,8,9,8,9,7,9,8,8,7,8,9,8,8,9,9,9,9,9,9,9,9,9,7,7,9,9,9,9,9,9,9,9,9,7,9,8,8,7,7,8,9,7,6,7,0,7,9,9,9,9,9,8,9,9,9,8,9,9,9,9,9,9,9,9,8,8,9,8,8,8,8,8,8,9,6,9,8,},
    {9,9,8,9,9,9,9,9,7,8,5,8,4,9,8,9,9,9,9,5,9,9,7,9,9,9,8,4,1,9,9,9,9,9,8,9,9,9,8,9,7,7,9,9,9,9,8,9,8,9,9,7,9,9,9,8,8,9,9,8,6,6,0,8,9,9,9,9,9,8,9,9,9,7,9,9,9,9,9,9,9,9,9,8,9,7,8,8,7,9,6,9,6,1,9,},
    {10,9,9,10,10,10,9,10,6,10,10,8,10,9,7,10,9,8,8,10,9,10,6,10,10,10,9,10,10,9,8,10,9,10,10,10,10,10,10,10,8,6,10,10,10,10,10,10,10,10,10,6,10,9,9,7,8,8,10,8,7,10,0,8,9,10,10,10,10,9,10,10,10,9,10,10,10,10,10,10,10,10,10,9,10,10,10,9,10,9,10,10,7,10,10,},
    {8,8,7,7,8,6,8,8,7,8,4,7,3,8,7,8,8,8,7,7,7,8,8,6,8,8,7,7,8,2,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,7,5,8,0,8,6,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,7,8,7,7,8,7,8,6,8,5,6,7,},
    {8,8,4,6,7,6,8,7,7,8,3,6,3,7,4,7,6,7,7,6,7,7,8,6,7,7,6,6,7,1,7,7,5,8,7,8,8,8,7,8,8,6,8,8,8,8,7,8,7,8,6,8,8,8,8,8,8,8,8,7,5,7,0,8,1,8,7,7,7,7,7,8,8,6,8,8,7,7,7,7,7,7,7,7,7,6,6,6,6,2,5,8,5,5,7,},
    {10,10,10,10,10,10,10,10,8,9,10,9,10,10,9,10,10,10,10,10,10,10,8,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,9,9,10,10,10,10,10,10,10,10,10,8,10,10,10,9,9,10,10,9,7,7,0,9,10,10,10,10,10,9,10,10,10,8,10,10,10,10,10,10,10,10,10,9,10,9,9,9,9,10,10,10,7,10,10,},
    {10,10,10,10,10,10,10,10,9,10,10,9,10,10,9,10,10,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,9,7,10,0,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,10,},
    {5,5,4,4,4,3,5,4,4,5,3,4,3,5,4,3,5,5,4,3,4,3,5,3,4,5,4,3,3,3,4,4,5,5,3,5,5,5,3,5,5,5,5,5,5,5,3,5,3,5,3,5,5,5,5,5,5,5,5,4,2,3,0,5,3,5,3,3,3,4,3,5,5,3,5,5,5,5,3,5,3,5,4,4,3,3,3,5,3,5,3,5,2,3,4,},
    {6,6,6,6,6,6,6,6,5,6,6,4,6,5,4,6,6,6,6,6,5,6,6,6,6,6,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,4,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,5,3,6,0,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,3,6,6,},
    {9,9,8,8,8,7,9,8,8,9,4,8,4,9,8,7,9,9,8,6,8,7,9,7,8,9,8,4,6,8,8,8,9,9,7,9,9,9,7,9,9,9,9,9,9,9,7,9,7,9,7,9,9,9,9,9,9,9,9,8,6,5,0,9,7,9,7,7,7,8,7,9,9,7,9,9,9,9,7,9,7,9,8,8,7,6,7,9,6,9,6,9,6,6,8,},
    {8,3,7,7,4,6,7,7,5,1,1,7,3,8,7,6,8,8,7,2,7,6,6,6,7,8,7,1,1,1,5,7,8,8,5,8,8,8,5,8,8,8,8,8,8,8,5,8,5,8,6,4,6,4,5,8,4,8,8,3,5,1,0,6,6,8,6,6,6,7,6,8,8,6,8,8,8,8,6,8,6,8,7,6,6,5,6,8,5,8,5,8,5,1,2,},
    {11,11,11,11,11,11,11,11,10,11,11,10,11,11,10,11,11,11,11,11,11,11,11,11,11,11,10,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,10,8,11,1,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,8,11,11,},
    {10,10,10,10,10,10,10,10,9,10,10,9,10,10,9,10,10,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,9,7,10,0,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,10,},
    {11,11,11,11,11,11,11,11,8,11,11,9,11,10,9,11,10,10,10,11,10,11,8,11,11,11,10,11,11,10,10,11,10,11,11,11,11,11,11,11,9,8,11,11,11,11,11,11,11,11,11,8,11,10,10,9,9,10,11,9,8,11,1,9,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,8,11,11,},
    {8,8,7,8,8,7,8,8,5,8,7,6,7,7,5,8,8,7,7,7,7,8,6,8,8,8,7,7,8,8,7,8,6,8,8,8,8,8,8,8,6,4,8,8,8,8,8,8,8,8,8,6,8,8,8,6,7,6,8,7,5,8,0,6,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,5,6,8,},
    {11,11,11,11,11,11,11,11,8,11,11,9,11,10,9,11,10,10,10,11,10,11,8,11,11,11,10,11,11,10,10,11,10,11,11,11,11,11,11,11,9,8,11,11,11,11,11,11,11,11,11,8,11,10,10,9,9,10,11,9,8,11,7,9,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,8,11,11,},
    {10,8,9,9,8,8,9,9,7,8,6,9,6,10,9,8,10,10,9,7,9,8,8,8,9,10,9,6,7,9,7,9,10,10,8,10,10,10,8,10,10,10,10,10,10,10,8,10,8,10,8,6,8,8,8,10,7,10,10,7,7,7,0,8,8,10,8,8,8,9,8,10,10,8,10,10,10,10,8,10,8,10,9,8,8,8,8,10,8,10,7,10,7,7,8,},
    {8,8,8,7,8,8,8,8,5,6,7,6,7,7,6,8,8,7,7,8,7,8,6,8,8,7,6,7,8,8,7,8,8,8,8,8,8,8,8,8,6,6,8,8,8,8,8,8,8,8,8,6,8,8,8,6,7,7,8,7,5,5,0,6,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,7,7,8,7,7,7,7,7,7,8,5,8,8,},
    {9,9,5,6,8,7,9,6,8,9,5,7,5,8,4,7,7,8,8,5,8,6,9,7,7,8,7,5,5,5,8,5,5,9,6,9,9,9,6,9,9,7,9,9,9,9,6,9,6,9,7,9,9,9,9,9,9,9,9,8,6,5,0,9,5,9,5,5,5,8,5,9,9,7,9,9,5,5,5,5,5,5,5,8,5,5,5,5,5,5,6,9,6,5,8,},
    {10,10,10,10,10,10,10,10,9,10,10,8,10,9,8,10,10,10,10,10,9,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,8,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,9,7,10,0,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,10,},
    {9,9,7,8,9,8,9,8,8,9,7,7,7,8,4,9,9,9,9,7,8,8,9,9,9,8,7,7,7,9,9,7,6,9,8,9,9,9,8,9,9,7,9,9,9,9,8,9,8,9,9,9,9,9,9,9,9,9,9,8,6,7,0,9,7,9,7,7,7,8,7,9,9,8,9,9,8,8,7,8,7,8,8,8,8,8,8,8,8,8,7,9,6,7,9,},
    {15,15,13,14,15,14,15,14,14,15,14,13,14,14,11,15,15,15,15,14,14,14,15,15,15,14,13,14,14,15,15,14,13,15,14,15,15,15,14,15,15,13,15,15,15,15,14,15,14,15,15,15,15,15,15,15,15,15,15,14,12,14,5,15,13,15,14,14,14,14,14,15,15,14,15,15,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,15,12,13,15,},
    {9,9,8,8,8,7,9,8,8,9,5,8,5,9,8,7,9,9,8,7,8,7,9,7,8,9,8,5,7,8,8,8,9,9,7,9,9,9,7,9,9,9,9,9,9,9,7,9,7,9,7,9,9,9,9,9,9,9,9,8,6,5,0,9,7,9,7,7,7,8,7,9,9,7,9,9,9,9,7,9,7,9,8,8,7,7,7,9,7,9,6,9,6,7,8,},
    {9,9,6,7,8,7,9,7,8,9,5,7,5,8,4,8,8,8,8,5,8,7,9,8,8,8,7,5,6,8,8,6,5,9,7,9,9,9,7,9,9,7,9,9,9,9,7,9,7,9,8,9,9,9,9,9,9,9,9,8,6,6,0,9,5,9,6,6,6,8,6,9,9,7,9,9,7,7,6,7,6,7,6,8,7,7,7,7,7,7,6,9,6,5,8,},
    {9,9,8,8,9,8,9,8,8,9,5,8,5,9,8,8,9,9,9,5,8,7,9,8,8,9,8,5,5,8,9,8,9,9,8,9,9,9,8,9,9,9,9,9,9,9,8,9,8,9,8,9,9,9,9,9,9,9,9,8,6,6,0,9,7,9,7,7,7,8,7,9,9,7,9,9,9,9,7,9,7,9,8,8,7,7,7,9,7,9,6,9,6,4,9,},
    {3,4,1,1,1,1,4,1,4,1,1,2,1,3,1,1,1,1,1,1,1,1,1,1,1,3,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,4,4,1,1,2,1,4,1,1,1,2,1,4,3,1,4,4,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,4,1,1,},
    {6,3,5,6,4,5,6,5,6,3,4,7,4,6,7,5,6,6,6,5,6,5,4,5,5,6,7,4,5,6,3,5,6,6,5,6,6,6,5,6,6,6,6,6,6,6,5,6,5,6,5,2,5,2,3,6,2,6,7,1,4,4,7,5,5,6,5,5,5,5,6,6,6,5,6,6,6,6,5,7,5,6,6,5,5,3,4,6,5,6,4,7,4,5,3,},
    {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,},
    {10,8,7,9,10,8,9,10,6,9,6,8,5,9,7,10,8,7,7,9,8,10,6,8,10,9,8,9,10,7,7,10,8,10,10,10,10,10,10,10,8,5,10,10,10,10,10,10,10,10,9,6,10,8,9,6,7,6,10,7,7,10,0,8,8,10,10,10,10,9,10,10,10,8,10,10,10,10,10,10,10,10,10,9,10,9,9,9,9,8,8,10,6,8,9,},
    {9,5,0,7,0,0,9,7,9,3,1,10,5,9,10,2,5,2,2,1,2,2,2,2,2,9,10,1,1,1,3,6,1,1,1,0,2,2,0,0,5,4,1,2,0,0,0,2,4,0,2,1,0,1,0,1,1,1,10,4,7,0,10,8,2,2,3,2,2,4,9,2,9,8,3,9,0,2,2,10,3,5,3,5,2,3,0,3,8,3,7,10,7,0,4,},
    {2,2,0,0,2,1,2,0,0,1,0,0,0,1,0,1,0,2,2,0,1,0,1,1,1,1,0,0,0,0,2,0,0,2,1,2,2,2,1,2,1,0,2,2,2,2,1,2,1,2,1,1,2,2,2,1,1,1,2,1,0,0,0,1,0,2,0,0,0,1,0,2,2,0,2,2,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,2,0,0,2,},
    {8,7,8,8,8,8,7,8,5,8,8,7,8,8,7,8,8,8,8,8,8,8,6,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,7,7,8,5,8,8,6,5,8,0,6,8,8,8,8,8,7,8,8,8,7,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,5,8,8,},
    {8,6,8,7,8,8,7,8,4,7,8,6,8,7,6,8,6,6,7,8,7,8,5,8,8,7,6,8,8,7,5,8,8,8,8,8,8,8,8,8,6,6,8,8,8,8,8,8,8,8,8,4,8,6,7,6,5,7,8,5,5,8,0,6,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,7,8,7,7,7,7,7,8,8,5,8,7,},
    {7,6,6,7,7,6,6,7,4,7,3,6,2,7,6,7,6,6,7,5,7,7,5,6,7,7,6,4,1,7,4,6,7,7,7,7,7,7,7,7,6,6,7,7,7,7,7,7,7,7,7,3,7,6,6,6,4,7,7,5,4,6,0,5,6,7,6,6,6,6,6,7,7,6,7,7,7,7,6,7,6,7,7,6,7,7,7,6,7,7,4,7,4,1,7,},
    {8,8,8,8,8,8,8,8,8,8,8,7,8,8,7,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,0,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,},
    {8,6,7,8,8,8,7,8,5,7,8,7,8,8,7,8,7,7,8,8,8,8,6,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,7,7,8,8,8,8,8,8,8,8,7,4,8,6,7,7,5,8,8,5,5,8,0,6,7,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,7,8,7,7,7,7,8,8,8,5,8,7,},
    {5,6,4,5,5,4,6,4,6,4,2,4,2,5,1,5,3,2,2,2,4,5,2,5,5,5,4,2,2,3,2,4,2,5,5,5,5,5,5,5,3,2,5,5,5,5,5,5,5,5,5,2,5,4,4,3,3,2,6,6,6,3,0,4,3,6,3,3,3,5,3,6,5,5,6,6,5,5,3,5,3,5,4,5,5,5,5,5,5,5,2,6,6,2,5,},
    {8,8,8,8,8,8,8,8,6,8,8,7,8,8,7,8,8,8,8,8,8,8,6,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,7,7,8,6,8,8,6,5,8,7,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,5,8,8,},
    {8,6,8,8,8,8,7,8,5,7,8,7,8,8,7,8,8,8,8,8,8,8,6,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,6,7,8,5,8,8,5,5,8,0,6,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,7,8,7,7,8,7,8,8,8,5,8,7,},
    {1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,},
    {3,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,3,3,},
    {7,7,6,7,7,6,7,6,4,6,4,6,4,7,6,7,7,7,6,4,6,7,5,7,7,7,6,4,5,6,4,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,6,6,7,5,7,7,5,4,5,0,5,5,7,5,5,5,7,5,7,7,7,7,7,7,7,5,7,5,7,6,7,7,7,7,7,7,7,4,7,4,4,7,},
    {1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
    {13,12,13,13,13,13,12,13,10,13,13,12,13,13,12,13,13,13,13,13,13,13,11,13,13,13,12,13,13,13,10,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,9,13,12,12,13,10,13,13,11,10,13,3,11,13,13,13,13,13,12,13,13,13,12,13,13,13,13,13,13,13,13,13,12,13,13,13,13,13,13,13,13,10,13,13,},
    {8,6,8,8,8,8,7,8,5,7,8,7,8,8,7,8,8,8,8,8,8,8,6,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,6,7,8,5,8,8,5,5,8,0,6,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,7,8,7,7,8,7,8,8,8,5,8,7,},
    {8,6,8,7,8,8,7,8,4,7,8,6,8,7,6,8,6,6,7,8,7,8,5,8,8,7,6,8,8,7,5,8,8,8,8,8,8,8,8,8,6,6,8,8,8,8,8,8,8,8,8,4,8,6,7,6,5,7,8,5,5,8,0,6,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,7,8,7,7,7,7,7,8,8,5,8,7,},
    {8,6,8,7,8,8,7,8,4,7,8,6,8,7,6,8,6,6,7,8,7,8,5,8,8,7,6,8,8,7,5,8,8,8,8,8,8,8,8,8,6,6,8,8,8,8,8,8,8,8,8,4,8,6,7,6,5,7,8,5,5,8,1,6,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,7,8,7,7,7,7,7,8,8,5,8,7,},
    {8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,6,8,8,8,8,8,8,8,5,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,7,7,8,6,8,8,6,5,8,8,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,5,8,8,},
    {5,5,4,5,5,4,5,4,2,4,1,3,1,4,1,5,3,1,1,2,4,5,0,5,5,5,4,1,1,3,0,4,2,5,5,5,5,5,5,5,3,1,5,5,5,5,5,5,5,5,5,1,5,4,4,3,3,1,5,3,2,3,0,3,3,5,3,3,3,5,3,5,5,5,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,5,2,5,2,1,5,},
    {7,6,7,7,7,7,6,7,4,7,3,6,2,7,6,7,6,6,7,7,7,7,5,7,7,7,6,5,7,7,4,7,7,7,7,7,7,7,7,7,6,6,7,7,7,7,7,7,7,7,7,3,7,6,6,6,4,7,7,5,4,6,0,5,7,7,7,7,7,6,7,7,7,6,7,7,7,7,7,7,7,7,7,6,7,7,7,6,7,7,4,7,4,7,7,},
    {5,5,4,5,5,4,5,4,2,4,2,4,2,5,4,5,5,5,4,2,4,5,3,5,5,5,4,2,2,3,2,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,2,5,4,4,5,3,5,5,3,2,3,0,3,3,5,3,3,3,5,3,5,5,5,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,5,2,5,2,2,5,},
    {8,8,8,8,8,8,8,8,5,8,8,7,8,8,7,8,8,8,8,8,8,8,6,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,7,7,8,6,8,8,6,5,8,0,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,5,8,8,},
    {7,7,6,7,7,6,7,7,4,7,6,5,6,6,3,7,5,4,4,6,6,7,2,7,7,7,6,6,6,5,3,6,5,7,7,7,7,7,7,7,5,4,7,7,7,7,7,7,7,7,7,3,7,6,6,5,5,4,7,5,4,6,0,5,6,7,6,6,6,7,6,7,7,7,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,6,7,4,6,7,},
    {11,11,10,11,11,10,11,11,8,11,10,9,10,10,8,11,9,9,9,10,10,11,7,11,11,11,10,10,10,9,7,10,10,11,11,11,11,11,11,11,9,9,11,11,11,11,11,11,11,11,11,7,11,10,10,9,9,9,11,9,8,10,1,9,10,11,10,10,10,11,10,11,11,11,11,11,11,11,10,11,10,11,11,11,11,11,11,11,11,11,10,11,8,10,11,},
    {7,7,6,7,7,6,7,6,4,6,5,6,5,7,6,7,7,7,6,5,6,7,5,7,7,7,6,5,6,6,4,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,6,6,7,5,7,7,5,4,6,0,5,6,7,6,6,6,7,6,7,7,7,7,7,7,7,6,7,6,7,6,7,7,7,7,7,7,7,5,7,4,5,7,},
    {7,7,6,7,7,6,7,7,4,7,6,5,6,6,3,7,5,4,4,6,6,7,2,7,7,7,6,6,6,5,3,6,5,7,7,7,7,7,7,7,5,4,7,7,7,7,7,7,7,7,7,3,7,6,6,5,5,4,7,5,4,6,3,5,6,7,6,6,6,7,6,7,7,7,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,6,7,4,6,7,},
    {7,7,6,7,7,6,7,7,4,7,5,6,5,7,6,7,7,7,6,5,6,7,5,7,7,7,6,5,6,5,4,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,6,6,7,5,7,7,5,4,6,0,5,6,7,6,6,6,7,6,7,7,7,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,5,7,4,4,7,},
    {6,7,4,4,4,4,7,4,7,4,2,5,2,6,4,4,4,4,4,4,4,4,4,4,4,6,5,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,7,7,3,4,5,4,7,4,4,4,5,4,7,6,4,7,7,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,7,7,4,4,},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
    {7,4,5,5,6,6,6,7,3,4,7,5,7,6,4,7,5,4,4,7,4,7,4,6,6,6,5,7,5,4,4,7,5,7,7,7,7,7,7,7,5,4,7,7,7,7,7,7,7,7,4,4,7,5,6,4,4,4,7,4,4,5,4,5,5,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,6,6,5,6,4,7,7,3,6,4,},
    {10,5,8,9,10,9,9,10,6,7,10,8,10,9,7,10,8,5,7,10,4,10,6,9,10,9,8,10,10,4,6,10,8,10,10,10,10,10,10,10,8,5,10,10,10,10,10,10,10,10,9,6,10,8,9,6,7,6,10,7,7,10,0,8,8,10,10,10,10,9,10,10,10,8,10,10,10,10,10,10,10,10,10,9,10,9,9,9,9,6,10,10,6,9,9,},
    {6,6,5,6,6,5,6,6,4,6,2,4,1,5,2,6,6,6,6,4,5,6,5,6,6,6,5,4,5,6,6,5,4,6,6,6,6,6,6,6,5,3,6,6,6,6,6,6,6,6,6,5,6,6,6,5,5,5,6,5,3,5,0,5,5,6,5,5,5,6,5,6,6,6,6,6,6,6,5,6,5,6,6,6,6,6,6,6,6,6,3,6,3,3,6,},
}
;

	@Override
	public int[][] getDescriptors() {
		return descriptors;
	}

	@Override
	public byte[][] getKerning() {
		return kerning;
	}

}

