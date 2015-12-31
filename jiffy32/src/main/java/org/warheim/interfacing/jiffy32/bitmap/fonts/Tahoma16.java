package org.warheim.interfacing.jiffy32.bitmap.fonts;
// coding=utf-8
// Module tahoma_16
// generated from Tahoma 12pt

public class Tahoma16 extends BitmapFont {
	public Tahoma16() {
		super("Tahoma 16", '!', (char)127, 16, 8, 2, "Tahoma16.bin");
	}


	private static final int[][] descriptors = {
    {1,0},// !
    {4,16},// "
    {11,32},// #
    {7,64},// $
    {14,80},// %
    {10,112},// &
    {1,144},// '
    {4,160},// {
    {4,176},// }
    {7,192},// *
    {9,208},// +
    {2,240},// ,
    {5,256},// -
    {1,272},// .
    {6,288},// /
    {8,304},// 0
    {5,320},// 1
    {7,336},// 2
    {7,352},// 3
    {8,368},// 4
    {7,384},// 5
    {8,400},// 6
    {7,416},// 7
    {8,432},// 8
    {8,448},// 9
    {1,464},// :
    {2,480},// ;
    {8,496},// <
    {9,512},// =
    {8,544},// >
    {6,560},// ?
    {13,576},// @
    {10,608},// A
    {8,640},// B
    {9,656},// C
    {10,688},// D
    {8,720},// E
    {7,736},// F
    {10,752},// G
    {10,784},// H
    {3,816},// I
    {6,832},// J
    {8,848},// K
    {7,864},// L
    {11,880},// M
    {10,912},// N
    {11,944},// O
    {8,976},// P
    {11,992},// Q
    {9,1024},// R
    {8,1056},// S
    {9,1072},// T
    {10,1104},// U
    {9,1136},// V
    {13,1168},// W
    {8,1200},// X
    {9,1216},// Y
    {8,1248},// Z
    {4,1264},// [
    {6,1280},// \
    {4,1296},// ]
    {10,1312},// ^
    {9,1344},// _
    {2,1376},// `
    {7,1392},// a
    {8,1408},// b
    {6,1424},// c
    {8,1440},// d
    {7,1456},// e
    {5,1472},// f
    {8,1488},// g
    {8,1504},// h
    {1,1520},// i
    {4,1536},// j
    {7,1552},// k
    {1,1568},// l
    {11,1584},// m
    {8,1616},// n
    {8,1632},// o
    {8,1648},// p
    {8,1664},// q
    {5,1680},// r
    {6,1696},// s
    {5,1712},// t
    {8,1728},// u
    {7,1744},// v
    {11,1760},// w
    {7,1792},// x
    {7,1808},// y
    {6,1824},// z
    {7,1840},// {
    {1,1856},// |
    {7,1872},// }
    {10,1888},// ~
    {6,1920},// °
};

	private static final byte[][] kerning = {
    {1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,},
    {4,4,3,4,4,3,4,4,4,4,0,2,0,3,0,4,4,4,4,1,4,4,4,4,4,4,3,0,0,4,4,3,1,4,4,4,4,4,4,4,4,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,2,0,4,2,4,2,2,2,4,2,4,4,3,4,4,4,4,2,4,2,4,3,4,4,4,4,4,4,4,1,4,4,0,4,},
    {11,11,10,11,11,10,11,11,9,10,8,9,8,10,8,11,9,10,10,8,11,11,10,11,11,11,10,8,10,10,10,10,9,11,11,11,11,11,11,11,10,8,11,11,11,11,11,11,11,11,11,10,11,10,10,10,10,10,11,10,8,9,2,10,10,11,10,10,10,11,10,11,11,10,11,11,11,11,10,11,10,11,10,11,11,11,11,11,11,11,8,11,8,10,11,},
    {7,7,7,7,7,7,7,7,4,6,4,6,4,7,6,7,6,7,7,6,7,7,6,7,7,7,6,5,7,7,5,7,7,7,7,7,7,7,7,7,6,6,7,7,7,7,7,7,7,7,7,4,7,6,6,6,5,7,7,6,4,5,4,5,7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,4,7,4,7,7,},
    {14,11,14,14,13,14,13,14,11,11,14,13,14,14,13,14,13,14,14,14,14,14,13,14,13,14,13,14,14,14,12,14,14,14,14,14,14,14,14,14,13,13,14,14,14,14,14,14,14,14,14,11,14,12,13,13,11,14,14,12,11,13,5,12,14,14,14,14,14,13,14,14,14,11,14,14,14,14,14,14,14,14,14,13,14,13,13,13,13,14,14,14,11,14,12,},
    {10,7,9,9,9,9,9,9,8,6,9,9,9,10,9,9,10,10,9,9,9,9,9,9,9,10,9,9,9,9,8,9,10,10,9,10,10,10,9,10,10,10,10,10,10,10,9,10,9,10,9,6,9,7,8,10,6,10,10,7,7,9,1,8,9,10,9,9,9,9,9,10,10,7,10,10,10,10,9,10,9,10,9,8,9,8,8,10,8,10,9,10,7,9,8,},
    {1,1,0,1,1,0,1,1,1,1,0,0,0,0,0,1,1,1,1,0,1,1,1,1,1,1,0,0,0,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1,0,0,0,1,0,1,1,0,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,1,0,1,},
    {3,4,1,1,2,1,4,1,4,3,1,4,1,3,4,2,2,2,2,1,3,1,3,2,2,3,4,1,1,2,2,1,2,3,1,3,3,3,1,3,3,2,3,3,3,3,1,3,1,3,2,3,3,3,3,3,3,3,4,4,4,1,3,4,1,4,1,1,1,2,2,4,3,4,4,4,2,2,1,4,1,2,1,2,1,1,1,2,2,2,1,4,4,1,2,},
    {4,4,4,4,4,4,4,4,1,4,4,3,4,4,3,4,3,4,4,4,4,4,3,4,4,4,3,4,4,4,3,4,4,4,4,4,4,4,4,4,3,3,4,4,4,4,4,4,4,4,4,2,4,3,3,3,2,4,4,3,1,4,2,2,4,4,4,4,4,4,4,4,4,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,1,4,4,},
    {7,7,5,7,7,5,7,7,6,7,3,5,2,6,4,7,5,6,6,5,7,7,7,6,7,7,6,4,4,5,6,7,5,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,4,6,0,7,6,7,6,6,6,6,6,7,7,5,7,7,7,7,6,7,6,7,7,6,7,7,7,6,7,6,4,7,4,2,7,},
    {9,5,7,8,8,8,8,9,6,5,9,7,9,8,6,9,7,5,5,9,5,9,6,8,8,8,7,9,5,5,6,9,7,9,9,9,9,9,9,9,8,4,9,9,9,9,9,9,9,9,5,5,9,7,8,6,5,6,9,7,6,5,0,7,7,9,9,9,9,8,9,9,9,6,9,9,9,9,9,9,9,9,9,8,9,8,8,7,8,6,9,9,4,8,5,},
    {2,0,1,2,0,1,1,2,1,0,0,1,0,2,1,1,2,2,2,0,2,1,1,1,1,2,1,0,0,2,0,1,2,2,1,2,2,2,1,2,2,2,2,2,2,2,1,2,1,2,2,0,1,0,0,2,0,2,2,0,1,0,1,0,2,2,1,1,1,1,1,2,2,1,2,2,2,2,1,2,1,2,2,1,1,0,0,2,0,2,0,2,1,0,0,},
    {5,1,3,4,4,4,4,5,2,0,5,3,5,4,2,5,3,1,0,5,0,5,2,4,4,4,3,5,0,0,2,5,3,5,5,5,5,5,5,5,4,0,5,5,5,5,5,5,5,5,1,1,5,3,4,2,1,2,5,3,2,0,0,3,3,5,5,5,5,4,5,5,5,2,5,5,5,5,5,5,5,5,5,4,5,4,4,3,4,2,5,5,0,4,0,},
    {1,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,1,0,0,0,0,1,0,1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,1,1,1,1,0,1,0,1,1,0,0,0,0,1,0,1,0,1,0,0,0,},
    {6,6,4,5,5,4,6,5,6,6,4,4,4,5,1,5,5,5,5,4,6,5,6,5,5,5,4,4,4,5,5,4,2,6,5,6,6,6,5,6,6,4,6,6,6,6,5,6,5,6,5,6,6,6,6,6,6,6,6,6,6,4,1,6,3,6,4,4,4,5,4,6,6,4,6,6,5,5,4,5,4,5,4,5,5,5,5,5,5,5,4,6,6,3,5,},
    {8,8,8,8,8,8,8,8,6,8,8,6,8,7,6,8,8,7,7,8,8,8,6,8,8,8,7,8,8,8,7,8,7,8,8,8,8,8,8,8,7,6,8,8,8,8,8,8,8,8,8,6,8,7,7,7,7,7,8,7,5,8,0,6,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,5,8,8,},
    {5,3,4,4,3,3,4,4,3,3,3,4,3,5,4,3,5,5,4,3,4,3,4,3,4,5,4,3,3,3,3,4,5,5,3,5,5,5,3,5,5,5,5,5,5,5,3,5,3,5,4,3,3,3,3,5,3,5,5,3,2,3,0,3,4,5,3,3,3,4,3,5,5,2,5,5,5,5,3,5,3,5,4,3,3,3,3,5,3,5,3,5,2,3,3,},
    {7,7,6,7,7,6,7,7,5,7,5,6,5,7,6,7,7,7,6,5,7,7,6,7,7,7,6,5,6,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,7,6,6,7,6,7,7,6,4,6,0,5,6,7,6,6,6,7,6,7,7,6,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,5,7,4,4,7,},
    {7,7,7,7,7,7,7,7,5,6,6,5,6,6,5,7,7,6,6,7,7,7,5,7,7,7,6,6,7,7,6,7,6,7,7,7,7,7,7,7,6,5,7,7,7,7,7,7,7,7,7,5,7,6,6,6,6,6,7,6,4,5,0,5,7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,6,7,4,7,7,},
    {8,7,7,7,7,8,7,8,6,7,7,6,7,7,6,8,7,7,7,8,7,8,7,8,7,7,6,7,7,7,7,8,7,8,8,8,8,8,8,8,7,7,8,8,8,8,8,8,8,8,7,7,8,7,7,7,7,7,8,7,5,7,0,7,7,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,7,7,8,7,7,7,7,7,7,8,4,8,7,},
    {7,7,7,6,6,7,7,7,6,7,7,5,7,6,5,7,5,6,6,7,7,7,7,7,6,6,5,7,7,6,6,7,6,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,4,6,0,7,7,7,7,7,7,6,7,7,7,4,7,7,7,7,7,7,7,7,7,6,7,6,6,5,6,6,7,7,4,7,6,},
    {8,7,8,7,7,8,7,8,6,7,8,6,8,7,6,8,6,7,7,8,7,8,7,8,7,7,6,8,8,7,6,8,7,8,8,8,8,8,8,8,7,6,8,8,8,8,8,8,8,8,7,7,8,7,7,7,7,7,8,7,5,7,0,7,8,8,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,7,8,7,7,6,7,7,8,8,5,8,6,},
    {7,7,5,6,7,6,7,6,6,7,4,5,4,6,3,6,6,7,7,4,7,6,7,6,6,6,5,4,5,6,7,5,4,7,6,7,7,7,6,7,7,5,7,7,7,7,6,7,6,7,6,7,7,7,7,7,7,7,7,7,4,5,0,7,4,7,5,5,5,6,5,7,7,5,7,7,6,6,5,6,5,6,5,6,6,6,6,6,6,6,4,7,4,4,7,},
    {8,8,8,8,8,8,8,8,6,7,7,6,7,7,6,8,8,7,7,8,8,8,6,8,8,8,7,7,8,8,7,8,7,8,8,8,8,8,8,8,7,6,8,8,8,8,8,8,8,8,8,6,8,7,7,7,7,7,8,7,5,6,0,6,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,7,8,5,8,8,},
    {8,8,8,8,8,8,8,8,6,8,8,6,8,7,6,8,8,7,7,8,8,8,6,8,8,8,7,8,8,8,7,8,7,8,8,8,8,8,8,8,7,5,8,8,8,8,8,8,8,8,8,6,8,7,7,7,7,6,8,7,5,8,0,6,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,5,8,8,},
    {1,1,0,1,1,0,1,1,0,1,0,0,0,1,0,1,1,1,1,0,1,1,0,1,1,1,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,1,1,0,0,0,0,0,1,1,0,0,0,1,0,1,1,0,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0,0,1,},
    {2,2,1,2,2,1,2,2,1,2,0,1,0,2,1,2,2,2,2,0,2,2,1,2,2,2,1,0,0,2,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,2,1,1,2,0,2,2,1,1,1,1,0,2,2,1,1,1,2,1,2,2,1,2,2,2,2,1,2,1,2,2,2,2,2,2,2,2,2,0,2,1,0,2,},
    {8,8,7,8,8,7,8,8,6,6,4,7,3,8,7,8,8,8,8,4,8,7,7,8,8,8,7,2,5,8,6,7,8,8,7,8,8,8,7,8,7,3,8,8,8,8,7,8,7,8,8,4,8,7,7,7,7,8,8,7,5,5,0,6,8,8,7,7,7,7,7,8,8,6,8,8,8,8,7,8,7,8,8,7,7,7,7,7,7,8,5,8,5,5,8,},
    {9,5,9,9,9,9,8,9,6,6,5,7,4,8,7,9,7,7,7,8,4,9,7,9,9,8,7,8,9,6,7,9,8,9,9,9,9,9,9,9,8,4,9,9,9,9,9,9,9,9,8,5,9,7,8,7,6,7,9,7,6,9,0,7,9,9,9,9,9,8,9,9,9,6,9,9,9,9,9,9,9,9,9,8,9,8,8,7,8,7,7,9,6,9,8,},
    {8,4,6,7,7,7,7,8,5,5,8,6,8,7,5,8,6,4,5,8,5,8,5,7,7,7,6,8,7,2,5,8,6,8,8,8,8,8,8,8,7,3,8,8,8,8,8,8,8,8,6,4,8,6,7,5,4,5,8,6,5,7,0,6,6,8,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,7,8,7,7,6,7,5,8,8,3,7,6,},
    {6,6,5,6,6,5,6,6,4,6,4,4,4,5,3,6,6,5,5,4,6,6,4,6,6,6,5,4,5,6,5,6,4,6,6,6,6,6,6,6,5,3,6,6,6,6,6,6,6,6,6,4,6,5,5,5,5,4,6,5,3,5,0,4,5,6,5,5,5,6,5,6,6,5,6,6,6,6,5,6,5,6,6,6,6,6,6,6,6,6,4,6,3,3,6,},
    {13,12,13,13,13,13,12,13,10,13,13,11,13,12,11,13,12,12,12,13,13,13,11,13,13,13,12,13,13,12,11,13,12,13,13,13,13,13,13,13,12,8,13,13,13,13,13,13,13,13,13,9,13,12,12,12,11,12,13,11,10,13,9,11,13,13,13,13,13,12,13,13,13,11,13,13,13,13,13,13,13,13,13,12,13,13,13,12,13,12,13,13,10,13,13,},
    {10,7,9,10,8,9,9,10,8,8,8,9,8,10,9,9,10,10,10,9,10,9,9,9,9,10,9,8,9,10,8,9,10,10,9,10,10,10,9,10,10,10,10,10,10,10,9,10,9,10,10,6,9,7,8,10,6,10,10,6,7,8,1,8,10,10,9,9,9,9,9,10,10,7,10,10,10,10,9,10,9,10,10,9,9,8,8,10,8,10,8,10,7,9,8,},
    {8,7,8,7,7,8,7,8,5,6,7,6,7,7,6,8,7,7,7,8,7,8,6,8,7,7,6,7,8,7,7,8,7,8,8,8,8,8,8,8,7,6,8,8,8,8,8,8,8,8,7,6,8,7,7,7,6,7,8,6,5,6,0,6,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,7,7,8,7,7,7,7,7,7,8,5,8,7,},
    {9,9,8,9,9,8,9,9,7,8,5,8,4,9,8,8,8,9,9,4,9,8,8,8,8,9,8,2,1,9,9,8,9,9,8,9,9,9,8,9,8,8,9,9,9,9,8,9,8,9,9,8,9,9,9,8,8,9,9,8,6,6,0,8,9,9,8,8,8,8,8,9,9,6,9,9,9,9,8,9,8,9,9,8,8,6,7,8,6,9,6,9,6,1,9,},
    {10,9,9,10,10,10,9,10,7,10,10,8,10,9,8,10,9,8,8,10,10,10,7,10,10,10,9,10,10,9,8,10,9,10,10,10,10,10,10,10,9,6,10,10,10,10,10,10,10,10,10,6,10,9,9,8,8,8,10,8,7,10,1,8,9,10,10,10,10,9,10,10,10,8,10,10,10,10,10,10,10,10,10,9,10,10,10,9,10,9,10,10,7,10,10,},
    {8,8,7,8,8,6,8,8,7,8,4,7,3,8,7,8,8,8,7,7,8,8,8,6,8,8,7,7,8,3,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,5,8,0,8,7,8,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,7,8,7,7,8,7,8,6,8,5,6,7,},
    {7,7,4,7,7,5,7,7,6,7,3,5,2,6,4,7,5,6,6,6,7,7,7,5,7,6,5,6,7,2,6,7,5,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,4,7,0,7,1,7,7,7,7,6,7,7,7,4,7,7,7,7,7,7,7,7,7,6,7,6,6,5,6,3,5,7,4,5,6,},
    {10,10,10,10,10,10,10,10,8,9,10,9,10,10,9,10,9,10,10,10,10,10,9,10,9,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,9,9,10,10,10,10,10,10,10,10,10,9,10,10,10,9,9,10,10,9,7,7,1,9,10,10,10,10,10,9,10,10,10,7,10,10,10,10,10,10,10,10,10,9,10,9,9,9,9,10,10,10,7,10,10,},
    {10,10,10,10,10,10,10,10,9,10,10,9,10,10,9,10,10,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,1,10,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,10,},
    {3,3,2,2,2,2,3,2,2,3,2,2,2,3,2,2,3,3,2,2,3,2,3,2,2,3,2,2,2,2,2,2,3,3,2,3,3,3,2,3,3,3,3,3,3,3,2,3,2,3,2,3,3,3,3,3,3,3,3,3,0,2,0,3,2,3,2,2,2,2,2,3,3,1,3,3,3,3,2,3,2,3,2,2,2,2,2,3,2,3,2,3,0,2,2,},
    {6,6,6,6,6,6,6,6,5,6,6,5,6,6,5,6,6,6,6,6,6,6,6,6,6,6,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,3,6,0,6,6,6,6,6,6,6,6,6,6,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,3,6,6,},
    {8,8,7,7,7,6,8,7,7,8,3,7,3,8,7,6,8,8,7,4,8,6,8,6,7,8,7,3,5,7,7,7,8,8,6,8,8,8,6,8,8,8,8,8,8,8,6,8,6,8,7,8,8,8,8,8,8,8,8,8,5,4,0,8,7,8,6,6,6,7,6,8,8,5,8,8,8,8,6,8,6,8,7,7,6,5,6,8,5,8,5,8,5,5,7,},
    {7,3,6,6,4,5,6,6,5,1,1,6,2,7,6,5,7,7,6,1,6,5,6,5,6,7,6,1,1,1,5,6,7,7,4,7,7,7,4,7,7,7,7,7,7,7,4,7,4,7,6,3,5,3,4,7,3,7,7,3,4,1,0,5,6,7,5,5,5,6,5,7,7,4,7,7,7,7,5,7,5,7,6,5,5,4,5,7,4,7,4,7,4,1,1,},
    {11,11,11,11,11,11,11,11,10,11,11,10,11,11,10,11,11,11,11,11,11,11,11,11,11,11,10,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,8,11,2,11,11,11,11,11,11,11,11,11,11,10,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,8,11,11,},
    {10,10,10,10,10,10,10,10,9,10,10,9,10,10,9,10,10,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,1,10,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,10,},
    {11,11,11,11,11,11,11,11,8,11,11,9,11,10,9,11,10,10,10,11,11,11,9,11,11,11,10,11,11,10,10,11,10,11,11,11,11,11,11,11,10,8,11,11,11,11,11,11,11,11,11,8,11,10,10,9,9,10,11,10,8,11,2,9,11,11,11,11,11,11,11,11,11,10,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,8,11,11,},
    {8,8,7,8,8,7,8,8,6,8,7,6,7,7,5,8,8,7,7,7,8,8,6,8,8,8,7,7,8,8,7,8,6,8,8,8,8,8,8,8,7,4,8,8,8,8,8,8,8,8,8,6,8,7,7,7,7,6,8,7,5,8,0,6,7,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,5,6,8,},
    {11,11,11,11,11,11,11,11,11,11,11,11,11,10,11,11,10,10,10,11,11,11,9,11,11,11,11,11,11,10,10,11,10,11,11,11,11,11,11,11,10,8,11,11,11,11,11,11,11,11,11,8,11,10,10,9,9,10,11,10,11,11,7,9,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,},
    {9,7,8,8,7,7,8,8,7,7,5,8,5,9,8,7,9,9,8,5,8,7,8,7,8,9,8,5,6,8,7,8,9,9,7,9,9,9,7,9,9,9,9,9,9,9,7,9,7,9,8,6,7,7,7,9,6,9,9,6,6,6,0,7,8,9,7,7,7,8,7,9,9,6,9,9,9,9,7,9,7,9,8,7,7,7,7,9,7,9,6,9,6,6,7,},
    {8,8,8,7,8,8,8,8,6,7,7,6,7,7,6,8,6,8,8,8,8,8,7,8,7,7,6,7,8,7,8,8,7,8,8,8,8,8,8,8,7,6,8,8,8,8,8,8,8,8,7,7,8,8,8,7,7,7,8,7,5,5,0,7,8,8,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,7,7,8,7,7,6,7,7,7,8,5,8,8,},
    {9,9,5,6,8,7,9,7,8,9,5,7,5,8,4,7,7,8,8,5,9,6,9,7,7,8,7,5,5,5,8,5,5,9,6,9,9,9,6,9,9,7,9,9,9,9,6,9,6,9,7,9,9,9,9,9,9,9,9,9,6,5,0,9,5,9,5,5,5,8,5,9,9,6,9,9,5,5,5,5,5,5,5,8,5,5,5,5,5,5,6,9,6,5,8,},
    {10,10,10,10,10,10,10,10,9,10,10,8,10,9,8,10,10,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,9,10,10,10,10,10,10,10,10,8,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,1,10,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,10,},
    {9,9,7,8,9,8,9,8,8,9,7,7,7,8,5,8,8,9,9,7,9,8,9,8,8,8,7,7,7,8,9,8,6,9,8,9,9,9,8,9,9,7,9,9,9,9,8,9,8,9,8,9,9,9,9,9,9,9,9,9,6,7,0,9,7,9,7,7,7,8,7,9,9,7,9,9,8,8,7,8,7,8,8,8,8,8,8,8,8,8,7,9,6,7,9,},
    {13,13,11,12,13,12,13,12,12,13,12,11,12,12,10,12,12,13,13,12,13,12,13,12,12,12,11,12,12,12,13,12,11,13,12,13,13,13,12,13,13,11,13,13,13,13,12,13,12,13,12,13,13,13,13,13,13,13,13,13,10,12,4,13,11,13,12,12,12,12,12,13,13,11,13,13,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,13,10,11,13,},
    {8,8,7,7,7,7,8,7,7,8,5,7,5,8,7,7,8,8,7,5,8,7,8,7,7,8,7,5,6,7,7,7,8,8,6,8,8,8,6,8,8,8,8,8,8,8,6,8,6,8,7,8,8,8,8,8,8,8,8,8,5,5,0,8,7,8,7,7,7,7,7,8,8,5,8,8,8,8,7,8,7,8,7,7,7,6,6,8,6,8,5,8,5,6,7,},
    {9,9,6,7,8,7,9,7,8,9,5,7,5,8,4,8,8,8,8,5,9,7,9,8,8,8,7,5,6,8,8,7,5,9,7,9,9,9,7,9,9,7,9,9,9,9,7,9,7,9,8,9,9,9,9,9,9,9,9,9,6,6,0,9,5,9,6,6,6,8,6,9,9,6,9,9,7,7,6,7,6,7,6,8,7,7,7,7,7,7,6,9,6,5,8,},
    {8,8,7,7,8,7,8,7,7,8,4,7,4,8,7,7,8,8,8,4,8,6,8,7,7,8,7,4,5,7,8,7,8,8,7,8,8,8,7,8,8,8,8,8,8,8,7,8,7,8,7,8,8,8,8,8,8,8,8,8,5,5,0,8,7,8,6,6,6,7,6,8,8,5,8,8,8,8,6,8,6,8,7,7,6,6,6,8,6,8,5,8,5,3,8,},
    {3,4,1,1,1,1,4,1,4,1,1,4,1,3,4,1,1,1,1,1,1,1,1,1,1,3,4,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,4,4,1,1,4,1,4,1,1,1,2,2,4,3,4,4,4,1,1,1,4,1,1,1,1,1,1,1,1,2,1,1,4,4,1,1,},
    {5,2,4,5,3,4,5,5,6,3,3,6,3,5,6,4,5,5,5,4,5,4,4,4,4,5,6,3,4,5,3,4,5,5,4,5,5,5,4,5,5,5,5,5,5,5,4,5,4,5,5,1,4,2,3,5,1,5,6,1,6,3,6,4,5,5,4,4,4,4,5,5,5,6,5,5,5,5,4,6,4,5,5,4,4,3,3,5,4,5,3,6,6,4,3,},
    {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,},
    {10,8,7,10,10,8,9,10,7,9,6,8,5,9,7,10,8,7,8,9,9,10,6,8,10,9,8,9,10,7,7,10,8,10,10,10,10,10,10,10,9,5,10,10,10,10,10,10,10,10,9,6,10,8,9,7,7,6,10,8,7,10,1,8,8,10,10,10,10,9,10,10,10,7,10,10,10,10,10,10,10,10,10,9,10,9,9,8,9,8,8,10,6,8,9,},
    {8,5,0,6,0,0,8,7,8,2,0,9,4,8,9,1,4,2,2,1,2,1,2,1,1,8,9,1,0,1,3,5,0,1,0,0,1,2,0,0,6,3,1,2,0,0,0,1,3,0,1,0,0,0,0,1,0,1,9,4,6,0,9,7,2,1,3,1,2,4,8,1,8,6,2,8,0,1,1,9,2,4,3,4,1,2,0,2,7,3,6,9,6,0,3,},
    {2,2,0,0,2,1,2,1,1,1,0,0,0,1,0,1,0,2,2,0,2,0,1,1,1,1,0,0,0,0,2,0,0,2,1,2,2,2,1,2,1,0,2,2,2,2,1,2,1,2,1,1,2,2,2,1,1,1,2,1,1,0,0,1,0,2,0,0,0,1,0,2,2,0,2,2,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,2,1,0,2,},
    {7,6,7,7,7,7,6,7,5,7,7,6,7,7,6,7,7,7,7,7,7,7,6,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,6,6,7,4,7,7,5,4,7,0,5,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,4,7,7,},
    {8,6,8,8,8,8,7,8,5,7,8,6,8,7,6,8,6,7,7,8,7,8,6,8,8,7,6,8,8,7,6,8,7,8,8,8,8,8,8,8,7,6,8,8,8,8,8,8,8,8,7,4,8,6,7,7,5,7,8,6,5,8,0,6,8,8,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,7,8,7,7,6,7,7,8,8,5,8,7,},
    {6,5,5,6,6,5,5,6,3,6,2,5,1,6,5,6,5,6,6,4,6,6,5,5,6,6,5,3,1,6,4,6,6,6,6,6,6,6,6,6,5,5,6,6,6,6,6,6,6,6,6,2,6,5,5,5,3,6,6,4,3,5,0,4,6,6,5,5,5,5,5,6,6,4,6,6,6,6,5,6,5,6,6,5,6,6,6,5,6,6,3,6,3,1,6,},
    {8,8,8,8,8,8,8,8,8,8,8,7,8,8,7,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,0,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,},
    {7,5,6,7,7,7,6,7,4,6,7,6,7,7,6,7,6,7,7,7,7,7,6,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,6,7,7,7,7,7,7,7,7,7,3,7,5,6,6,4,7,7,5,4,7,0,5,7,7,7,7,7,6,7,7,7,4,7,7,7,7,7,7,7,7,7,6,7,6,6,6,6,7,7,7,4,7,6,},
    {4,5,3,4,4,3,5,4,5,3,2,3,2,4,1,4,2,2,2,2,4,4,2,4,4,4,3,2,2,3,2,3,2,4,4,4,4,4,4,4,3,2,4,4,4,4,4,4,4,4,4,2,4,3,3,2,2,2,5,5,5,2,0,5,2,5,2,2,2,4,2,5,4,3,5,5,4,4,2,4,2,4,3,4,4,4,4,4,4,4,2,5,5,2,4,},
    {8,8,8,8,8,8,8,8,6,8,8,7,8,8,7,8,8,8,8,8,8,8,7,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,7,7,8,6,8,8,7,6,8,7,6,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,6,8,8,},
    {8,6,8,8,8,8,7,8,6,7,8,7,8,8,7,8,8,8,8,8,8,8,7,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,6,7,8,5,8,8,6,5,8,0,6,8,8,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,7,8,7,7,8,7,8,8,8,5,8,7,},
    {1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,},
    {4,4,4,4,4,4,4,4,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,4,4,4,4,4,4,4,4,4,4,4,4,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,4,4,},
    {7,6,6,6,6,5,6,6,5,5,3,6,3,7,6,6,7,7,6,3,6,6,6,6,6,7,6,3,4,6,5,6,7,7,6,7,7,7,6,7,7,7,7,7,7,7,6,7,6,7,6,3,6,5,5,7,4,7,7,5,4,4,0,5,6,7,5,5,5,6,5,7,7,5,7,7,7,7,5,7,5,7,6,6,6,6,6,7,6,7,4,7,4,4,6,},
    {1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
    {11,10,11,11,11,11,10,11,9,11,11,10,11,11,10,11,11,11,11,11,11,11,10,11,11,11,10,11,11,11,9,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,7,11,10,10,11,8,11,11,9,8,11,2,9,11,11,11,11,11,10,11,11,11,9,11,11,11,11,11,11,11,11,11,10,11,11,11,11,11,11,11,11,8,11,11,},
    {8,6,8,8,8,8,7,8,6,7,8,7,8,8,7,8,8,8,8,8,8,8,7,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,6,7,8,5,8,8,6,5,8,0,6,8,8,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,7,8,7,7,8,7,8,8,8,5,8,7,},
    {8,6,8,8,8,8,7,8,5,7,8,6,8,7,6,8,6,7,7,8,7,8,6,8,8,7,6,8,8,7,6,8,7,8,8,8,8,8,8,8,7,6,8,8,8,8,8,8,8,8,7,4,8,6,7,7,5,7,8,6,5,8,0,6,8,8,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,7,8,7,7,6,7,7,8,8,5,8,7,},
    {8,6,8,8,8,8,7,8,5,7,8,6,8,7,6,8,6,7,7,8,7,8,6,8,8,7,6,8,8,7,6,8,7,8,8,8,8,8,8,8,7,6,8,8,8,8,8,8,8,8,7,4,8,6,7,7,5,7,8,6,5,8,1,6,8,8,8,8,8,7,8,8,8,5,8,8,8,8,8,8,8,8,8,7,8,7,7,6,7,7,8,8,5,8,7,},
    {8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,7,7,8,6,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,},
    {5,5,4,5,5,4,5,5,2,4,1,3,1,4,1,5,3,1,1,2,5,5,0,5,5,5,4,1,1,4,0,4,2,5,5,5,5,5,5,5,4,1,5,5,5,5,5,5,5,5,5,1,5,4,4,3,3,1,5,4,2,3,0,3,3,5,3,3,3,5,3,5,5,4,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,5,2,5,2,1,5,},
    {6,5,6,6,6,6,5,6,3,6,2,5,1,6,5,6,5,6,6,5,6,6,5,6,6,6,5,4,6,6,4,6,6,6,6,6,6,6,6,6,5,5,6,6,6,6,6,6,6,6,6,2,6,5,5,5,3,6,6,4,3,5,0,4,6,6,6,6,6,5,6,6,6,4,6,6,6,6,6,6,6,6,6,5,6,6,6,5,6,6,3,6,3,6,6,},
    {5,5,4,5,5,4,5,5,3,4,2,4,2,5,4,5,5,5,4,2,5,5,4,5,5,5,4,2,2,4,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,2,5,4,4,5,3,5,5,4,2,3,0,3,4,5,3,3,3,5,3,5,5,4,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,5,2,5,2,2,5,},
    {8,8,8,8,8,8,8,8,6,8,8,7,8,8,7,8,8,8,8,8,8,8,7,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,4,8,7,7,8,6,8,8,7,5,8,0,6,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,5,8,8,},
    {7,7,6,7,7,6,7,7,4,7,6,5,6,6,4,7,5,4,4,6,7,7,3,7,7,7,6,6,6,6,4,7,5,7,7,7,7,7,7,7,6,4,7,7,7,7,7,7,7,7,7,3,7,6,6,5,5,4,7,6,4,6,0,5,6,7,6,6,6,7,6,7,7,6,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,6,7,4,6,7,},
    {11,11,10,11,11,10,11,11,8,11,10,9,10,10,8,11,9,9,9,10,11,11,8,11,11,11,10,10,10,10,8,11,9,11,11,11,11,11,11,11,10,9,11,11,11,11,11,11,11,11,11,7,11,10,10,9,9,9,11,10,8,10,2,9,10,11,10,10,10,11,10,11,11,10,11,11,11,11,10,11,10,11,11,11,11,11,11,11,11,11,10,11,8,10,11,},
    {7,7,6,7,7,6,7,7,5,6,5,6,5,7,6,7,7,7,6,5,7,7,6,7,7,7,6,5,5,6,5,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,6,6,7,5,7,7,6,4,5,0,5,6,7,5,5,5,7,5,7,7,6,7,7,7,7,5,7,5,7,6,7,7,7,7,7,7,7,5,7,4,5,7,},
    {7,7,6,7,7,6,7,7,4,7,6,5,6,6,4,7,5,4,4,6,7,7,3,7,7,7,6,6,6,6,4,7,5,7,7,7,7,7,7,7,6,4,7,7,7,7,7,7,7,7,7,3,7,6,6,5,5,4,7,6,4,6,3,5,6,7,6,6,6,7,6,7,7,6,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,6,7,4,6,7,},
    {6,6,5,6,6,5,6,6,4,6,4,5,4,6,5,6,6,6,5,4,6,6,5,6,6,6,5,4,5,5,4,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,2,6,5,5,6,4,6,6,5,3,5,0,4,5,6,5,5,5,6,5,6,6,5,6,6,6,6,5,6,5,6,6,6,6,6,6,6,6,6,4,6,3,3,6,},
    {6,7,4,4,4,4,7,4,7,4,2,7,2,6,7,4,4,4,4,3,4,4,4,4,4,6,7,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,7,7,3,4,7,4,7,4,4,4,5,5,7,6,7,7,7,4,4,4,7,4,4,4,4,4,4,4,4,5,4,3,7,7,4,4,},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
    {7,4,5,6,6,6,6,7,4,4,7,5,7,6,4,7,5,4,4,7,4,7,4,6,6,6,5,7,5,4,4,7,5,7,7,7,7,7,7,7,6,4,7,7,7,7,7,7,7,7,4,4,7,5,6,4,4,4,7,5,4,5,4,5,5,7,7,7,7,6,7,7,7,4,7,7,7,7,7,7,7,7,7,6,7,6,6,5,6,4,7,7,3,6,4,},
    {10,6,8,10,10,9,9,10,7,7,10,8,10,9,7,10,8,6,8,10,5,10,7,9,10,9,8,10,10,5,7,10,8,10,10,10,10,10,10,10,9,5,10,10,10,10,10,10,10,10,9,6,10,8,9,7,7,7,10,8,7,10,1,8,8,10,10,10,10,9,10,10,10,7,10,10,10,10,10,10,10,10,10,9,10,9,9,8,9,7,10,10,6,9,9,},
    {6,6,5,6,6,5,6,6,4,6,2,4,1,5,3,6,6,6,6,4,6,6,5,6,6,6,5,4,5,6,6,6,4,6,6,6,6,6,6,6,5,3,6,6,6,6,6,6,6,6,6,5,6,6,6,5,5,5,6,5,3,5,0,5,5,6,5,5,5,6,5,6,6,5,6,6,6,6,5,6,5,6,6,6,6,6,6,6,6,6,3,6,3,3,6,},
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

