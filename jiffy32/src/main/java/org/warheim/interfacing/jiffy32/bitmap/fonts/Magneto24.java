package org.warheim.interfacing.jiffy32.bitmap.fonts;
// coding=utf-8
// Module magneto_bold_24
// generated from Magneto 18pt

public class Magneto24 extends BitmapFont {
	public Magneto24() {
		super("Magneto 24", '!', (char)127, 24, 12, 3, "Magneto24.bin");
	}


	private static final int[][] descriptors = {
    {10,0},// !
    {10,48},// "
    {18,96},// #
    {19,168},// $
    {13,240},// %
    {18,288},// &
    {5,360},// '
    {10,384},// {
    {10,432},// }
    {7,480},// *
    {14,504},// +
    {5,552},// ,
    {9,576},// -
    {5,624},// .
    {12,648},// /
    {16,696},// 0
    {8,744},// 1
    {15,768},// 2
    {15,816},// 3
    {16,864},// 4
    {15,912},// 5
    {15,960},// 6
    {13,1008},// 7
    {16,1056},// 8
    {13,1104},// 9
    {6,1152},// :
    {6,1176},// ;
    {12,1200},// <
    {11,1248},// =
    {12,1296},// >
    {13,1344},// ?
    {19,1392},// @
    {32,1464},// A
    {22,1560},// B
    {17,1632},// C
    {21,1704},// D
    {19,1776},// E
    {23,1848},// F
    {19,1920},// G
    {33,1992},// H
    {17,2112},// I
    {18,2184},// J
    {24,2256},// K
    {26,2328},// L
    {27,2424},// M
    {27,2520},// N
    {20,2616},// O
    {20,2688},// P
    {19,2760},// Q
    {20,2832},// R
    {25,2904},// S
    {24,3000},// T
    {19,3072},// U
    {19,3144},// V
    {27,3216},// W
    {24,3312},// X
    {21,3384},// Y
    {23,3456},// Z
    {12,3528},// [
    {10,3576},// \
    {12,3624},// ]
    {11,3672},// ^
    {25,3720},// _
    {4,3816},// `
    {15,3840},// a
    {21,3888},// b
    {15,3960},// c
    {16,4008},// d
    {15,4056},// e
    {19,4104},// f
    {15,4176},// g
    {17,4224},// h
    {9,4296},// i
    {14,4344},// j
    {17,4392},// k
    {10,4464},// l
    {24,4512},// m
    {17,4584},// n
    {21,4656},// o
    {16,4728},// p
    {15,4776},// q
    {14,4824},// r
    {14,4872},// s
    {11,4920},// t
    {16,4968},// u
    {17,5016},// v
    {18,5088},// w
    {13,5160},// x
    {16,5208},// y
    {12,5256},// z
    {11,5304},// {
    {2,5352},// |
    {12,5376},// }
    {12,5424},// ~
    {8,5472},// °
};

	private static final byte[][] kerning = {
    {5,8,5,5,7,5,8,7,4,10,6,5,5,5,4,7,8,7,7,7,5,6,8,6,8,5,5,6,6,7,9,7,5,9,7,9,5,8,7,5,8,8,9,4,9,4,9,9,4,9,5,8,9,9,9,7,9,5,5,9,2,4,0,8,5,6,5,5,5,5,5,5,8,3,5,5,5,5,5,4,5,7,5,6,5,6,5,4,5,6,6,10,2,5,10,},
    {5,8,2,4,7,4,8,6,4,10,1,5,1,5,0,6,8,7,7,7,5,5,8,5,8,4,4,0,0,5,9,6,0,9,5,9,3,8,5,0,8,8,9,0,9,0,9,9,4,9,0,8,9,9,9,7,9,5,5,9,2,0,0,8,0,6,0,0,0,3,0,5,8,3,5,5,0,0,0,0,0,0,0,2,0,0,0,0,0,0,5,10,2,0,10,},
    {15,14,15,13,13,15,14,17,11,16,16,13,15,13,12,17,15,15,14,16,15,16,15,16,18,15,15,16,16,17,17,17,13,15,17,15,15,18,16,13,18,18,15,10,15,10,15,15,14,15,15,18,15,15,15,14,17,12,15,15,12,14,0,16,14,16,14,14,15,15,15,15,16,11,15,15,14,14,15,14,14,17,11,16,15,16,14,13,15,16,15,18,12,15,16,},
    {15,19,15,15,17,15,19,18,12,18,14,14,15,15,13,18,18,17,17,17,16,17,19,16,19,15,13,14,15,17,19,18,15,19,17,19,15,19,17,15,19,19,19,13,19,13,19,19,15,19,15,19,19,19,19,17,19,15,15,17,12,15,0,19,15,16,15,15,15,14,15,15,18,13,15,15,14,14,15,13,15,16,15,14,15,15,14,13,15,15,15,19,12,15,19,},
    {12,11,9,12,11,12,11,12,9,13,9,11,11,12,11,11,12,12,12,11,12,12,11,12,11,12,11,8,12,12,12,11,12,11,11,11,12,10,11,12,10,11,11,11,12,11,12,11,11,11,12,10,12,11,11,12,12,12,12,12,9,11,0,11,12,12,12,12,12,10,12,12,12,10,12,12,12,12,12,11,12,12,12,12,12,12,12,11,12,12,12,13,9,6,13,},
    {18,16,15,18,17,17,16,17,15,15,15,17,12,18,17,16,18,18,18,14,17,16,16,16,16,18,17,12,13,18,17,15,18,16,15,16,17,16,15,18,16,17,16,17,16,17,16,16,17,16,17,16,16,16,16,18,16,18,18,14,15,12,0,16,18,18,17,18,17,16,18,18,18,16,18,18,18,18,17,17,18,14,18,18,18,18,18,17,18,18,18,18,15,12,16,},
    {0,3,0,0,2,0,3,1,0,5,0,0,0,0,0,1,3,2,2,2,0,0,3,0,3,0,0,0,0,0,4,1,0,4,0,4,0,3,0,0,3,3,4,0,4,0,4,4,0,4,0,3,4,4,4,2,4,0,0,4,0,0,0,3,0,1,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,0,5,},
    {3,6,3,3,5,3,6,4,5,9,3,5,3,5,4,4,6,5,5,5,3,3,6,3,5,4,5,3,3,3,7,4,4,6,3,6,3,5,3,4,5,5,6,4,7,4,7,6,4,6,3,5,7,6,6,4,7,5,5,10,5,3,0,6,3,4,3,3,3,4,4,4,6,5,4,3,4,4,3,4,3,4,4,3,4,4,3,4,4,4,5,10,5,3,8,},
    {8,10,9,9,8,9,10,10,4,9,10,5,9,8,6,10,9,8,9,10,9,10,10,10,10,9,9,10,10,9,10,10,8,10,10,10,9,10,10,8,10,10,10,5,10,5,10,10,6,10,9,10,10,10,10,9,10,7,8,8,5,9,0,10,9,9,9,9,9,9,9,8,9,4,8,8,8,8,9,7,9,10,7,10,9,10,8,8,9,10,9,10,5,9,9,},
    {2,5,0,1,4,1,5,3,1,7,0,2,0,2,0,3,5,4,4,4,2,1,5,2,5,1,1,0,0,0,6,3,0,6,2,6,0,5,1,0,5,5,6,0,6,0,6,6,1,6,0,5,6,6,6,4,6,2,2,6,0,0,0,3,0,3,0,0,0,0,0,2,5,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,7,0,0,7,},
    {11,10,12,8,9,12,10,14,7,10,13,9,12,9,9,14,11,9,9,13,12,13,11,13,14,12,12,13,13,10,11,14,9,11,14,11,12,14,14,10,14,14,11,5,11,5,11,11,10,11,12,14,11,11,11,9,11,9,11,10,8,11,0,10,11,12,11,11,12,12,12,11,12,7,11,11,11,11,12,10,11,14,9,13,12,13,11,11,12,13,13,14,8,12,10,},
    {5,0,2,5,3,5,0,5,2,0,1,3,0,5,3,4,4,4,5,0,5,4,2,4,0,5,3,0,0,5,4,3,5,1,4,2,5,3,3,5,3,3,2,3,2,3,1,2,4,2,5,3,3,1,0,5,0,5,4,0,2,0,0,1,5,5,5,5,5,3,5,4,5,3,4,4,4,4,5,3,5,5,5,4,5,5,4,3,5,5,4,5,2,0,0,},
    {7,0,8,8,5,8,4,9,3,2,9,4,8,7,5,9,7,4,8,9,8,9,7,9,7,8,8,9,7,4,6,9,7,4,9,5,8,6,9,7,7,8,5,0,5,0,6,5,3,5,8,6,6,5,4,8,4,6,7,4,4,8,0,5,8,8,8,8,8,8,8,7,8,3,7,7,7,7,8,6,8,8,5,9,8,9,7,6,8,9,7,9,4,8,1,},
    {5,0,2,5,4,5,0,5,2,0,2,4,4,5,4,4,5,5,5,4,5,5,2,5,1,5,4,1,5,5,4,4,5,2,4,3,5,3,4,5,3,4,2,4,3,4,2,3,4,3,5,3,3,1,0,5,1,5,5,0,2,4,0,1,5,5,5,5,5,3,5,5,5,3,5,5,5,5,5,4,5,5,5,5,5,5,5,4,5,5,5,5,2,0,0,},
    {7,10,6,5,9,5,10,8,6,12,7,7,5,7,3,8,10,9,9,9,7,7,10,7,10,6,6,7,7,8,11,8,4,10,8,10,5,9,7,4,9,9,10,2,11,2,11,10,6,10,6,9,11,10,10,8,11,7,7,11,4,5,0,10,5,7,5,5,5,6,5,6,10,5,6,6,5,5,6,5,5,8,4,6,6,7,5,5,6,7,7,12,4,6,12,},
    {14,16,15,15,13,15,16,16,10,14,16,12,15,14,12,16,14,14,15,16,15,16,15,16,16,15,15,16,16,15,16,16,14,15,16,15,15,16,16,14,16,16,15,12,15,11,15,15,13,15,15,16,15,15,15,15,16,14,14,13,11,15,0,15,15,15,15,15,15,15,15,14,15,10,14,14,14,14,15,13,15,16,14,16,15,16,14,14,15,16,15,16,11,15,14,},
    {5,8,6,6,6,6,8,7,2,8,6,4,6,5,4,7,7,6,6,6,6,6,8,6,8,5,5,6,6,6,8,7,5,8,7,8,6,8,7,5,8,8,8,4,8,4,8,8,4,8,6,8,8,8,8,6,8,5,5,7,2,6,0,8,6,6,6,6,6,5,6,5,7,3,5,5,5,5,6,4,6,7,5,6,6,6,5,4,6,6,6,8,2,6,8,},
    {14,15,13,14,13,14,15,14,11,14,13,13,11,14,13,15,14,14,14,13,14,14,15,13,15,14,13,13,14,14,15,15,14,15,14,15,14,15,14,14,15,15,15,13,15,13,15,15,13,15,14,15,15,15,15,14,15,14,14,13,11,10,0,15,14,14,14,14,14,12,14,14,14,12,14,14,14,14,14,13,14,15,14,14,14,14,14,13,14,14,14,15,11,11,14,},
    {13,13,14,14,12,14,13,14,9,15,14,11,14,13,11,14,13,12,14,14,14,14,13,14,13,13,13,14,14,13,14,14,13,13,14,13,14,13,14,13,13,14,13,11,14,10,14,13,12,13,14,13,14,13,13,14,14,13,13,14,10,14,0,12,14,14,14,14,14,13,14,13,14,9,13,13,13,13,14,12,14,14,13,14,14,14,13,12,14,14,13,15,10,14,15,},
    {14,15,15,15,14,15,15,16,10,16,16,11,15,14,12,16,14,14,15,16,15,16,15,16,15,15,15,16,14,13,16,16,14,15,16,15,15,15,16,14,15,15,15,10,15,10,15,15,11,15,15,15,15,15,15,15,16,13,14,15,11,15,0,15,15,15,15,15,15,15,15,14,15,10,14,14,14,14,15,13,15,15,12,16,15,16,14,13,15,16,14,16,11,15,16,},
    {12,14,14,14,13,14,14,14,9,15,14,10,14,13,11,14,13,13,14,14,14,14,14,14,13,13,13,14,14,12,15,14,13,14,14,14,14,13,14,13,13,14,14,10,14,10,14,14,11,14,14,13,14,14,14,14,15,12,13,14,10,14,0,11,14,14,14,14,14,13,14,13,14,9,13,13,13,13,14,12,14,14,12,14,14,14,13,12,14,14,13,15,10,14,15,},
    {14,9,15,15,12,15,10,15,10,11,15,12,15,14,12,15,14,13,15,15,15,15,13,15,14,14,14,15,15,14,13,15,14,11,15,12,15,14,15,14,14,15,11,12,12,12,12,12,13,12,15,14,13,11,10,15,10,14,14,10,11,15,0,11,15,15,15,15,15,14,15,14,15,11,14,14,14,14,15,13,15,15,14,15,15,15,14,13,15,15,14,15,11,15,11,},
    {9,11,10,8,10,10,11,12,7,13,12,8,10,8,7,12,11,10,10,11,8,12,11,11,11,11,11,12,12,10,12,12,8,12,12,12,10,11,12,8,11,12,12,6,12,6,12,12,7,12,10,11,12,12,12,10,12,8,10,12,7,9,0,11,9,11,9,9,10,11,10,10,11,6,10,10,10,10,10,9,9,12,7,11,11,12,10,10,11,12,10,13,5,10,13,},
    {14,16,15,15,14,15,16,15,10,15,15,12,15,15,13,15,15,14,15,15,15,15,16,15,16,14,14,15,15,15,16,15,15,16,15,16,15,16,15,15,16,16,16,12,16,12,16,16,13,16,15,16,16,16,16,15,16,14,14,14,11,15,0,16,15,15,15,15,15,14,15,14,15,11,14,14,14,14,15,13,15,15,14,15,15,15,14,12,15,15,14,16,11,15,15,},
    {10,13,12,11,11,11,13,13,6,11,13,8,11,10,9,13,11,11,11,12,11,13,13,12,13,12,12,13,13,12,13,13,10,12,13,12,11,13,13,10,13,13,12,7,12,7,12,12,9,12,12,13,12,12,12,11,13,9,11,11,8,11,0,13,11,12,11,11,11,12,11,11,12,7,11,11,11,11,12,10,11,13,9,12,12,13,11,11,12,13,12,13,7,12,11,},
    {5,0,5,5,4,5,1,6,2,0,6,4,5,5,4,6,5,5,5,6,5,6,4,6,5,5,5,6,6,5,4,6,5,2,6,3,5,5,6,5,5,6,2,4,3,4,3,3,4,3,5,5,3,2,1,5,1,5,5,1,2,4,0,2,5,5,5,5,5,5,5,5,5,3,5,5,5,5,5,4,5,6,5,6,5,6,5,4,5,6,5,6,2,5,0,},
    {5,0,5,5,3,5,1,6,2,0,6,3,5,5,3,6,4,4,5,6,5,6,4,6,5,5,5,6,6,5,4,6,5,1,6,2,5,5,6,5,5,6,2,3,2,3,3,2,4,2,5,5,3,2,1,5,1,5,4,1,2,4,0,2,5,5,5,5,5,5,5,4,5,3,4,4,4,4,5,3,5,6,5,6,5,6,4,4,5,6,4,6,2,5,0,},
    {10,12,9,10,9,10,12,11,7,5,7,9,7,10,9,11,10,10,10,10,10,10,7,9,12,10,9,5,9,11,12,11,10,7,11,8,10,12,10,10,12,12,7,9,8,9,7,8,9,8,10,12,8,7,6,10,12,10,10,9,7,7,0,11,10,10,10,10,10,8,10,10,11,8,10,10,10,10,10,9,10,11,10,10,10,10,10,9,10,10,10,12,7,5,4,},
    {9,1,11,11,8,11,6,11,6,4,10,6,11,10,8,11,10,8,11,11,11,11,7,11,11,9,9,10,10,9,9,11,10,7,11,8,11,11,11,10,11,11,7,0,8,3,8,8,7,8,11,11,9,7,6,11,6,9,10,7,7,11,0,9,11,11,11,11,11,9,11,10,11,6,10,10,10,10,11,9,11,11,8,10,11,11,10,8,11,10,10,11,7,11,3,},
    {10,3,11,9,7,11,7,12,6,5,12,7,11,8,8,12,10,5,10,12,9,12,10,12,10,11,11,12,11,5,9,12,9,7,12,8,11,10,12,9,10,11,8,2,8,3,9,8,6,8,11,10,9,8,7,10,7,8,10,7,7,10,0,8,10,11,10,10,11,11,11,10,11,6,10,10,10,10,11,9,10,11,7,12,11,12,10,9,11,12,10,12,6,11,4,},
    {10,13,10,8,11,8,13,12,6,12,10,8,7,8,6,12,12,11,11,11,10,11,13,10,13,9,9,9,11,12,13,12,6,13,12,13,7,13,11,6,13,13,13,5,13,5,13,13,9,13,7,13,13,13,13,11,13,9,10,11,7,8,0,13,6,11,6,6,7,8,7,10,12,7,10,10,7,7,7,9,6,12,6,9,8,9,7,7,8,9,10,13,7,7,12,},
    {16,19,17,16,17,16,19,19,12,17,18,14,16,16,14,19,17,17,16,17,17,18,19,18,19,17,17,18,18,18,19,19,16,18,19,18,16,19,19,16,19,19,18,13,18,13,18,18,15,18,16,19,18,18,18,16,19,15,16,17,13,15,0,19,16,17,16,16,16,17,16,16,18,13,16,16,16,16,16,15,16,19,15,17,17,18,16,16,17,18,18,19,13,16,18,},
    {29,24,30,25,27,30,27,32,25,26,32,27,30,27,27,32,30,23,24,31,24,32,29,31,31,31,31,32,32,25,29,32,27,27,32,28,30,31,32,28,31,32,27,21,28,23,29,28,27,28,30,31,29,27,26,23,27,27,30,27,27,29,7,28,29,31,29,29,30,31,30,30,31,26,30,30,30,30,30,29,29,32,27,31,31,32,30,30,31,32,30,32,25,30,26,},
    {18,22,18,18,20,18,22,21,15,21,18,17,18,18,16,21,21,20,20,20,19,20,22,19,22,17,17,17,19,20,22,21,18,22,20,22,18,22,20,18,22,22,22,15,22,15,22,22,18,22,18,22,22,22,22,20,22,18,18,20,15,18,0,22,18,19,18,18,18,17,18,18,21,16,18,18,17,17,18,17,18,20,17,17,18,18,17,15,18,17,18,22,15,18,21,},
    {17,17,14,17,16,16,17,16,14,16,14,16,8,17,16,16,17,17,17,15,16,15,17,15,17,17,16,8,6,17,17,16,17,17,15,17,16,17,15,17,17,17,17,16,17,16,17,17,16,17,16,17,17,17,17,17,17,17,17,15,14,11,0,17,17,17,16,17,16,15,17,17,17,15,17,17,17,17,16,16,17,15,17,17,17,17,17,16,17,17,17,17,14,5,17,},
    {18,21,19,18,19,19,21,21,14,19,20,16,19,17,16,21,19,19,18,20,19,20,21,20,21,19,19,20,20,20,21,21,17,20,21,20,19,21,21,17,21,21,20,13,20,12,20,20,17,20,19,21,20,20,20,18,21,16,18,19,15,18,0,21,18,19,18,18,19,19,19,18,20,15,18,18,18,18,19,17,18,21,16,20,19,20,18,18,19,20,20,21,15,19,19,},
    {18,19,15,18,17,17,19,18,15,18,15,17,10,18,17,18,18,18,18,17,17,17,19,16,19,18,17,10,10,18,19,18,18,19,17,19,17,19,17,18,19,19,19,17,19,17,19,19,17,19,17,19,19,19,19,18,19,18,18,17,15,13,0,19,18,18,17,18,17,16,18,18,18,16,18,18,18,18,17,17,18,17,18,18,18,18,18,17,18,18,18,19,15,7,19,},
    {18,21,17,16,20,17,21,19,17,23,19,18,17,18,14,19,21,20,20,20,18,19,21,18,20,18,18,19,19,14,22,19,14,21,19,21,17,20,19,15,20,20,21,11,22,11,22,21,16,21,17,20,22,21,21,19,22,18,18,22,15,16,0,19,16,18,16,16,17,18,17,17,21,16,17,17,17,17,17,16,16,19,14,18,18,19,17,17,18,19,18,23,15,17,23,},
    {16,19,17,17,17,17,19,18,14,18,18,15,17,16,15,18,18,17,17,17,17,18,19,17,19,17,17,18,18,17,19,18,16,19,18,19,17,19,18,16,19,19,19,15,19,15,19,19,15,19,17,19,19,19,19,17,19,16,16,17,14,17,0,19,17,17,17,17,17,17,17,16,18,15,16,16,16,16,17,15,17,18,16,17,17,18,16,16,17,18,16,19,14,17,19,},
    {30,25,31,26,28,31,28,33,26,27,33,28,31,28,28,33,31,24,25,32,25,33,30,32,32,32,32,33,33,26,30,33,28,28,33,29,31,32,33,29,32,33,28,21,29,24,30,29,28,29,31,32,30,28,27,24,28,28,31,28,28,30,8,29,30,32,30,30,31,32,31,31,32,27,31,31,31,31,31,30,30,33,28,32,32,33,31,31,32,33,31,33,26,31,27,},
    {13,16,14,13,15,13,16,15,11,17,14,12,13,13,11,15,15,15,14,15,13,14,16,14,16,13,13,14,14,14,17,15,13,16,15,16,13,16,15,13,16,16,16,11,16,11,16,16,12,16,14,16,16,16,16,14,17,13,12,16,9,13,0,16,13,13,13,13,13,13,13,12,16,11,12,12,12,12,14,11,13,15,13,14,13,14,12,12,13,14,14,17,9,14,17,},
    {13,16,14,14,15,14,16,15,12,18,15,13,14,14,12,16,16,15,15,15,14,15,17,15,17,14,14,15,15,15,17,16,14,17,15,17,14,16,15,14,16,16,17,12,17,12,17,17,13,17,14,16,17,17,17,15,17,13,13,17,10,14,0,17,14,14,14,14,14,14,14,13,16,11,13,13,13,13,14,12,14,16,13,15,14,15,13,13,14,15,14,18,10,14,18,},
    {21,22,18,21,21,20,22,20,18,24,18,20,16,21,20,19,22,21,21,21,20,19,22,19,21,21,20,17,17,21,23,19,21,22,18,22,20,21,18,21,21,21,22,20,23,20,23,22,20,22,20,21,23,22,22,21,23,21,21,23,18,16,0,21,21,21,20,21,20,19,21,21,22,19,21,21,21,21,20,20,21,17,21,21,21,21,21,20,21,21,21,24,18,17,24,},
    {25,26,22,25,24,24,26,25,22,25,22,24,17,25,24,25,25,25,25,24,24,24,26,23,26,25,24,17,16,25,26,25,25,26,24,26,24,26,24,25,26,26,26,24,26,24,26,26,24,26,24,26,26,26,26,25,26,25,25,24,22,20,1,26,25,25,24,25,24,23,25,25,25,23,25,25,25,25,24,24,25,24,25,25,25,25,25,24,25,25,25,26,22,15,26,},
    {27,25,24,27,26,26,25,26,24,20,24,26,23,27,26,25,27,27,27,24,26,25,24,25,25,27,26,24,24,27,26,25,27,24,25,25,26,25,25,27,25,26,24,26,25,26,22,25,26,25,26,25,24,23,22,27,25,27,27,22,24,23,2,24,27,27,26,27,26,25,27,27,27,25,27,27,27,27,26,26,27,25,27,27,27,27,27,26,27,27,27,27,24,23,19,},
    {23,27,23,22,25,22,27,26,20,26,22,22,20,22,20,26,26,25,25,25,24,25,27,24,27,21,21,22,22,25,27,26,20,27,25,27,21,27,25,20,27,27,27,18,27,18,27,27,23,27,21,27,27,27,27,25,27,23,23,25,20,21,2,27,20,24,20,20,20,22,20,23,26,21,23,23,20,20,21,22,20,25,19,22,21,22,20,20,21,22,23,27,20,21,27,},
    {17,20,19,18,18,18,20,20,13,18,20,15,18,17,16,20,18,18,18,19,18,20,20,19,20,19,19,20,20,19,20,20,17,19,20,19,18,20,20,17,20,20,19,14,19,14,19,19,16,19,19,20,19,19,19,18,20,16,18,18,15,18,0,20,18,19,18,18,18,19,18,18,19,14,18,18,18,18,19,17,18,20,16,19,19,20,18,18,19,20,19,20,14,19,18,},
    {17,20,17,15,18,15,20,19,13,19,17,15,14,15,13,19,19,18,18,18,17,18,20,17,20,16,16,17,18,19,20,19,11,20,19,20,14,20,18,12,20,20,20,8,20,9,20,20,16,20,14,20,20,20,20,18,20,16,17,18,14,15,0,20,14,18,14,14,14,16,14,17,19,14,17,17,15,15,14,16,14,19,13,16,16,17,15,15,16,17,17,20,14,15,19,},
    {19,18,16,19,18,18,18,18,16,16,17,18,16,19,18,18,19,19,19,17,18,17,18,17,18,19,18,17,17,19,18,18,19,17,18,17,18,18,18,19,18,18,17,18,17,18,17,17,18,17,18,18,17,17,17,19,18,19,19,16,16,15,0,18,19,19,18,19,18,17,19,19,19,17,19,19,19,19,18,18,19,18,19,19,19,19,19,18,19,19,19,19,16,16,16,},
    {20,20,17,20,19,19,20,19,17,19,17,19,14,20,19,19,20,20,20,18,19,18,20,18,20,20,19,15,18,20,20,19,20,20,18,20,19,20,18,20,20,20,20,19,20,19,20,20,19,20,19,20,20,20,20,20,20,20,20,18,17,14,0,20,20,20,19,20,19,18,20,20,20,18,20,20,20,20,19,19,20,19,20,20,20,20,20,19,20,20,20,20,17,14,19,},
    {21,25,21,20,23,20,25,24,18,24,19,20,19,20,18,24,24,23,23,23,22,23,25,22,25,19,19,19,19,23,25,24,19,25,23,25,19,25,23,19,25,25,25,17,25,17,25,25,21,25,19,25,25,25,25,23,25,21,21,23,18,19,0,25,19,22,19,19,19,20,19,21,24,19,21,21,18,18,19,20,19,23,18,20,19,19,18,17,19,19,21,25,18,19,25,},
    {19,22,16,18,21,18,22,20,18,24,16,19,15,19,14,20,22,21,21,21,19,18,22,19,22,18,18,16,16,16,23,20,14,23,19,23,17,22,18,14,22,22,23,12,23,12,23,23,18,23,15,22,23,23,23,21,23,19,19,23,16,14,0,20,14,20,14,14,14,17,14,19,22,17,19,19,14,14,15,13,14,17,14,15,15,16,14,14,15,16,19,24,16,15,24,},
    {16,19,16,16,17,16,19,18,12,18,17,14,16,15,13,18,18,17,17,17,16,17,19,17,19,16,16,17,17,18,19,18,15,19,18,19,16,19,18,15,19,19,19,12,19,12,19,19,15,19,16,19,19,19,19,17,19,15,16,17,13,16,0,19,16,17,16,16,16,16,16,16,18,13,16,16,15,15,16,15,16,18,14,17,16,17,15,15,16,17,17,19,13,16,19,},
    {15,19,15,14,17,14,19,18,12,18,15,14,13,14,12,18,18,17,17,17,16,17,19,16,19,14,14,15,16,17,19,18,12,19,17,19,13,19,17,12,19,19,19,9,19,9,19,19,15,19,13,19,19,19,19,17,19,15,15,17,12,13,0,19,12,16,12,12,13,14,13,15,18,13,15,15,13,13,13,14,12,17,11,14,14,15,13,13,14,15,15,19,12,13,19,},
    {22,26,21,21,25,21,26,24,21,27,22,22,21,22,18,24,25,25,24,25,23,23,26,23,25,21,21,22,22,23,27,24,20,26,23,26,21,25,23,20,25,25,26,18,26,18,26,26,21,26,21,25,26,26,26,24,27,22,22,26,19,20,2,25,20,23,20,20,21,21,21,22,26,21,22,22,20,20,21,20,20,23,19,22,21,22,20,20,21,22,22,27,19,21,27,},
    {22,24,20,22,22,21,24,23,19,23,19,21,15,22,21,23,23,22,22,22,21,22,24,21,24,22,21,15,15,22,24,23,22,24,22,24,21,24,22,22,24,24,24,21,24,21,24,24,21,24,21,24,24,24,24,22,24,22,22,22,19,18,0,24,22,22,21,22,21,20,22,22,23,20,22,22,22,22,21,21,22,22,22,22,22,22,22,21,22,22,22,24,19,14,24,},
    {17,20,18,17,19,17,20,19,15,21,18,16,17,17,15,19,19,19,18,19,17,18,20,18,20,17,17,18,18,18,21,19,17,20,19,20,17,20,19,17,20,20,20,15,20,15,20,20,16,20,18,20,20,20,20,18,21,17,16,20,13,17,0,20,17,17,17,17,17,17,17,16,20,15,16,16,16,16,18,15,17,19,17,18,17,18,16,16,17,18,18,21,13,18,21,},
    {20,17,21,16,18,21,18,23,16,18,23,18,21,18,18,23,21,16,15,22,15,23,20,22,22,22,22,23,23,16,20,23,18,18,23,19,21,22,23,19,22,23,18,12,19,14,20,19,18,19,21,22,20,18,17,15,18,18,21,18,18,20,0,19,20,22,20,20,21,22,21,21,22,17,21,21,21,21,21,20,20,23,18,22,22,23,21,21,22,23,21,23,16,21,18,},
    {5,8,6,6,7,6,8,7,7,11,7,7,6,7,4,7,7,7,6,7,6,7,8,6,8,6,6,7,7,6,9,7,5,8,7,8,6,8,7,5,8,8,8,4,8,4,8,8,4,8,6,8,8,8,8,6,9,6,6,12,6,6,0,8,6,6,6,6,6,6,6,5,8,6,5,5,5,5,6,5,6,7,5,6,6,7,5,5,6,7,6,12,6,6,10,},
    {9,5,8,9,10,9,5,9,8,3,7,9,8,9,10,8,10,10,9,8,9,8,8,8,7,9,9,7,8,9,8,8,10,7,8,8,9,9,8,10,9,10,8,10,8,10,5,8,10,8,9,9,7,6,5,9,7,10,10,3,7,8,0,6,9,10,9,9,9,9,9,10,10,9,10,9,10,10,9,9,9,9,10,9,10,10,9,10,10,10,10,10,7,8,4,},
    {8,11,9,9,10,9,11,10,7,12,9,7,9,8,7,10,10,10,9,10,9,9,11,9,11,8,8,9,9,9,12,10,8,11,10,11,9,11,10,8,11,11,11,7,11,7,11,11,7,11,9,11,11,11,11,9,12,8,8,12,6,9,0,11,9,9,9,9,9,8,9,8,11,7,8,8,8,8,9,7,9,10,8,9,9,9,8,7,9,9,9,12,6,9,12,},
    {8,1,10,11,8,11,6,11,6,4,10,6,11,10,8,11,10,7,11,11,11,11,8,11,9,9,9,10,10,7,8,10,10,7,11,8,11,9,11,10,9,10,7,0,8,3,8,8,5,8,11,9,9,7,6,11,7,9,10,5,7,11,0,7,11,11,11,11,11,9,11,10,11,6,10,10,10,10,11,9,11,10,8,10,11,11,10,8,11,10,10,11,7,10,3,},
    {15,15,7,6,12,7,20,15,15,18,11,20,16,20,13,9,17,10,10,9,10,10,12,9,12,19,19,13,14,13,12,6,0,3,8,4,6,2,6,0,8,7,1,0,0,0,5,5,6,5,0,1,6,6,0,1,4,2,13,15,13,14,24,21,10,4,10,9,10,25,24,8,16,24,8,15,1,8,4,25,19,11,11,14,9,8,7,12,24,13,14,23,13,13,17,},
    {1,3,2,0,1,0,3,3,0,0,0,0,0,0,0,4,1,1,0,1,1,3,3,2,4,0,0,0,3,3,3,4,0,0,3,0,0,4,3,0,4,4,0,0,0,0,0,0,0,0,0,4,0,0,0,0,3,0,1,1,0,0,0,3,0,2,0,0,0,0,0,1,2,0,1,1,0,0,0,0,0,4,0,0,0,0,0,0,0,0,2,4,0,0,1,},
    {15,5,12,15,14,14,10,14,12,8,12,14,12,15,14,13,15,15,15,12,14,13,12,13,11,15,14,12,12,15,14,12,15,12,12,13,14,13,12,15,13,14,12,14,13,14,10,13,14,13,14,13,12,11,10,15,11,15,15,8,12,12,0,11,15,15,14,15,14,13,15,15,15,13,15,15,15,15,14,14,15,12,15,15,15,15,15,14,15,15,15,15,12,12,7,},
    {18,11,19,14,16,19,16,21,14,14,21,16,19,16,16,21,19,12,13,20,13,21,18,20,20,20,20,21,21,14,18,21,16,16,21,17,19,20,21,17,20,21,16,9,17,12,18,17,16,17,19,20,18,16,15,12,16,16,19,16,16,18,0,17,18,20,18,18,19,20,19,19,20,15,19,19,19,19,19,18,18,21,16,20,20,21,19,19,20,21,19,21,14,19,13,},
    {15,5,12,15,14,14,10,14,12,8,12,14,11,15,14,13,15,15,15,12,14,13,12,13,11,15,14,12,11,15,14,12,15,12,12,13,14,13,12,15,13,14,12,14,13,14,10,13,14,13,14,13,12,11,10,15,11,15,15,8,12,11,0,11,15,15,14,15,14,13,15,15,15,13,15,15,15,15,14,14,15,11,15,15,15,15,15,14,15,15,15,15,12,12,7,},
    {16,14,13,16,15,15,14,15,13,13,13,15,12,16,15,14,16,16,16,12,15,14,14,14,14,16,15,13,13,16,15,13,16,14,13,14,15,14,13,16,14,15,14,15,14,15,14,14,15,14,15,14,14,14,14,16,14,16,16,12,13,12,0,14,16,16,15,16,15,14,16,16,16,14,16,16,16,16,15,15,16,13,16,16,16,16,16,15,16,16,16,16,13,12,13,},
    {15,5,12,15,14,14,10,14,12,8,12,14,12,15,14,13,15,15,15,12,14,13,12,13,11,15,14,12,11,15,14,12,15,12,12,13,14,13,12,15,13,14,12,14,13,14,10,13,14,13,14,13,12,11,10,15,11,15,15,8,12,12,0,11,15,15,14,15,14,13,15,15,15,13,15,15,15,15,14,14,15,11,15,15,15,15,15,14,15,15,15,15,12,12,7,},
    {16,9,17,12,14,17,14,19,12,12,19,14,17,14,14,19,17,10,11,18,11,19,16,18,18,18,18,19,19,12,16,19,14,14,19,15,17,18,19,15,18,19,14,10,15,10,16,15,14,15,17,18,16,14,13,10,14,14,17,14,14,16,2,15,16,18,16,16,17,18,17,17,18,13,17,17,17,17,17,16,16,19,14,18,18,19,17,17,18,19,17,19,12,17,11,},
    {15,5,12,15,14,14,10,14,12,8,12,14,10,15,14,13,15,15,15,11,14,13,12,13,11,15,14,11,11,15,14,12,15,12,12,13,14,13,12,15,13,14,12,14,13,14,10,13,14,13,14,13,12,11,10,15,11,15,15,8,12,10,6,11,15,15,14,15,14,13,15,15,15,13,15,15,15,15,14,14,15,11,15,15,15,15,15,14,15,15,15,15,12,11,7,},
    {17,8,14,17,16,16,12,16,14,10,14,16,13,17,16,15,17,17,17,13,16,15,14,15,13,17,16,13,13,17,16,14,17,14,14,15,16,15,14,17,15,16,14,16,15,16,12,15,16,15,16,15,14,13,12,17,13,17,17,10,14,13,0,13,17,17,16,17,16,15,17,17,17,15,17,17,17,17,16,16,17,13,17,17,17,17,17,16,17,17,17,17,14,13,9,},
    {9,7,6,9,8,8,7,8,6,6,6,8,5,9,8,7,9,9,9,5,8,7,7,7,7,9,8,5,5,9,8,6,9,7,6,7,8,7,6,9,7,8,7,8,7,8,7,7,8,7,8,7,7,7,7,9,7,9,9,5,6,5,0,7,9,9,8,9,8,7,9,9,9,7,9,9,9,9,8,8,9,5,9,9,9,9,9,8,9,9,9,9,6,5,7,},
    {14,12,11,14,13,13,12,13,11,11,11,13,10,14,13,12,14,14,14,10,13,12,12,12,12,14,13,10,10,14,13,11,14,12,11,12,13,12,11,14,12,13,12,13,12,13,12,12,13,12,13,12,12,12,12,14,12,14,14,10,11,10,3,12,14,14,13,14,13,12,14,14,14,12,14,14,14,14,13,13,14,10,14,14,14,14,14,13,14,14,14,14,11,10,12,},
    {17,8,14,17,16,16,12,16,14,10,14,16,13,17,16,15,17,17,17,13,16,15,14,15,13,17,16,13,12,17,16,14,17,14,14,15,16,15,14,17,15,16,14,16,15,16,12,15,16,15,16,15,14,13,12,17,13,17,17,10,14,13,0,13,17,17,16,17,16,15,17,17,17,15,17,17,17,17,16,16,17,13,17,17,17,17,17,16,17,17,17,17,14,13,9,},
    {10,8,7,10,9,9,8,9,7,7,7,9,6,10,9,8,10,10,10,6,9,8,8,8,8,10,9,7,7,10,9,7,10,8,7,8,9,8,7,10,8,9,8,9,8,9,8,8,9,8,9,8,8,8,8,10,8,10,10,6,7,6,0,8,10,10,9,10,9,8,10,10,10,8,10,10,10,10,9,9,10,7,10,10,10,10,10,9,10,10,10,10,7,6,7,},
    {24,14,22,24,23,23,19,23,21,17,22,23,21,24,23,22,24,24,24,22,23,22,21,22,21,24,23,22,22,24,23,22,24,21,22,22,23,22,22,24,22,23,21,23,22,23,19,22,23,22,23,22,21,20,19,24,20,24,24,17,21,21,0,20,24,24,23,24,23,22,24,24,24,22,24,24,24,24,23,23,24,22,24,24,24,24,24,23,24,24,24,24,21,22,16,},
    {17,7,14,17,16,16,12,16,14,10,14,16,13,17,16,15,17,17,17,13,16,15,14,15,13,17,16,13,13,17,16,14,17,14,14,15,16,15,14,17,15,16,14,16,15,16,12,15,16,15,16,15,14,13,12,17,13,17,17,10,14,13,0,13,17,17,16,17,16,15,17,17,17,15,17,17,17,17,16,16,17,13,17,17,17,17,17,16,17,17,17,17,14,13,9,},
    {18,11,19,14,16,19,16,21,14,14,21,16,19,16,16,21,19,12,13,20,13,21,18,20,20,20,20,21,21,14,18,21,16,16,21,17,19,20,21,17,20,21,16,9,17,12,18,17,16,17,19,20,18,16,15,11,16,16,19,16,16,18,0,17,18,20,18,18,19,20,19,19,20,15,19,19,19,19,19,18,18,21,16,20,20,21,19,19,20,21,19,21,14,19,13,},
    {16,6,13,16,15,15,11,15,13,9,13,15,13,16,15,14,16,16,16,13,15,14,13,14,12,16,15,13,12,16,15,13,16,13,13,14,15,14,13,16,14,15,13,15,14,15,11,14,15,14,15,14,13,12,11,16,12,16,16,9,13,13,2,12,16,16,15,16,15,14,16,16,16,14,16,16,16,16,15,15,16,12,16,16,16,16,16,15,16,16,16,16,13,13,8,},
    {15,5,12,15,14,14,10,14,12,8,13,14,12,15,14,13,15,15,15,12,14,13,12,13,12,15,14,13,13,15,14,13,15,12,13,13,14,13,13,15,13,14,12,14,13,14,10,13,14,13,14,13,12,11,10,15,11,15,15,8,12,12,7,11,15,15,14,15,14,13,15,15,15,13,15,15,15,15,14,14,15,13,15,15,15,15,15,14,15,15,15,15,12,12,7,},
    {14,4,11,14,13,13,9,13,11,7,11,13,10,14,13,12,14,14,14,10,13,12,11,12,10,14,13,10,10,14,13,11,14,11,11,12,13,12,11,14,12,13,11,13,12,13,9,12,13,12,13,12,11,10,9,14,10,14,14,7,11,10,0,10,14,14,13,14,13,12,14,14,14,12,14,14,14,14,13,13,14,10,14,14,14,14,14,13,14,14,14,14,11,10,6,},
    {14,9,11,14,13,13,9,13,11,7,11,13,10,14,13,12,14,14,14,10,13,12,11,12,10,14,13,10,10,14,13,11,14,11,11,12,13,12,11,14,12,13,11,13,12,13,9,12,13,12,13,12,11,10,9,14,10,14,14,7,11,10,0,10,14,14,13,14,13,12,14,14,14,12,14,14,14,14,13,13,14,10,14,14,14,14,14,13,14,14,14,14,11,10,6,},
    {11,8,8,11,10,10,8,10,8,4,10,10,8,11,10,10,11,11,11,9,10,10,8,9,9,11,10,10,10,11,10,10,11,8,10,9,10,9,10,11,9,10,8,10,9,10,7,9,10,9,10,9,8,7,6,11,8,11,11,6,8,7,0,8,11,11,10,11,10,9,11,11,11,9,11,11,11,11,10,10,11,10,11,11,11,11,11,10,11,11,11,11,8,8,6,},
    {16,6,13,16,15,15,11,15,13,9,13,15,11,16,15,14,16,16,16,12,15,14,13,14,12,16,15,12,12,16,15,13,16,13,13,14,15,14,13,16,14,15,13,15,14,15,11,14,15,14,15,14,13,12,11,16,12,16,16,9,13,11,0,12,16,16,15,16,15,14,16,16,16,14,16,16,16,16,15,15,16,12,16,16,16,16,16,15,16,16,16,16,13,11,8,},
    {14,7,15,10,12,15,12,17,10,10,17,12,15,12,12,17,15,8,9,16,9,17,14,16,16,16,16,17,17,10,14,17,12,12,17,13,15,16,17,13,16,17,12,5,13,8,14,13,12,13,15,16,14,12,11,8,12,12,15,12,12,14,0,13,14,16,14,14,15,16,15,15,16,11,15,15,15,15,15,14,14,17,12,16,16,17,15,15,16,17,15,17,10,15,9,},
    {17,8,18,18,16,18,13,18,14,11,18,15,18,17,16,18,17,16,18,18,18,18,16,18,17,17,17,18,18,17,16,18,17,14,18,15,18,17,18,17,17,18,14,16,15,16,15,15,16,15,18,17,16,14,13,18,13,17,17,13,14,18,0,14,18,18,18,18,18,17,18,17,18,15,17,17,17,17,18,16,18,18,17,18,18,18,17,16,18,18,17,18,14,18,10,},
    {11,3,11,11,12,11,8,13,10,6,13,11,11,11,12,13,12,12,11,12,11,13,10,12,12,12,12,13,13,11,10,13,12,9,13,10,11,12,13,12,12,13,10,12,10,12,10,10,12,10,11,12,10,8,7,11,9,12,12,8,9,10,0,9,11,12,11,11,11,12,11,12,12,11,12,11,12,12,11,11,11,13,12,12,12,13,11,12,12,13,12,13,9,11,5,},
    {16,6,13,16,15,15,11,15,13,9,13,15,11,16,15,14,16,16,16,11,15,14,13,14,12,16,15,11,11,16,15,13,16,13,13,14,15,14,13,16,14,15,13,15,14,15,11,14,15,14,15,14,13,12,11,16,12,16,16,9,13,11,6,12,16,16,15,16,15,14,16,16,16,14,16,16,16,16,15,15,16,11,16,16,16,16,16,15,16,16,16,16,13,11,8,},
    {12,2,9,12,11,11,7,11,9,5,10,11,8,12,11,10,12,12,12,9,11,10,9,10,9,12,11,10,10,12,11,10,12,9,10,10,11,10,10,12,10,11,9,11,10,11,7,10,11,10,11,10,9,8,7,12,8,12,12,5,9,7,0,8,12,12,11,12,11,10,12,12,12,10,12,12,12,12,11,11,12,10,12,12,12,12,12,11,12,12,12,12,9,8,4,},
    {5,8,6,5,7,5,8,7,6,10,6,6,5,6,4,7,7,7,6,7,5,6,8,6,8,5,5,6,6,6,9,7,5,8,6,8,5,8,6,5,8,8,8,4,8,4,8,8,4,8,6,8,8,8,8,6,9,5,5,11,5,5,0,8,5,5,5,5,5,5,5,5,8,5,5,5,5,5,6,4,5,6,5,6,5,6,5,4,5,6,5,11,5,6,9,},
    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,2,2,2,2,2,2,1,2,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,},
    {8,11,9,9,10,9,11,11,7,12,11,7,9,8,7,11,10,10,9,10,9,11,11,10,11,10,10,11,11,9,12,11,8,11,11,11,9,11,11,8,11,11,11,7,11,7,11,11,7,11,9,11,11,11,11,9,12,8,9,12,6,9,0,11,9,10,9,9,9,10,9,9,11,7,9,9,9,9,9,8,9,11,8,10,10,11,9,9,10,11,9,12,6,9,12,},
    {9,2,10,8,7,10,7,12,5,5,12,7,10,7,7,12,10,4,9,11,8,12,9,11,11,11,11,12,12,5,9,12,8,7,12,8,10,11,12,8,11,12,7,0,8,3,9,8,7,8,10,11,9,7,6,9,7,7,10,7,7,9,0,8,9,11,9,9,10,11,10,10,11,6,10,10,10,10,10,9,9,12,7,11,11,12,10,10,11,12,10,12,5,10,4,},
    {3,7,1,2,6,2,7,4,2,8,0,3,0,3,0,4,6,6,5,6,4,3,7,4,6,2,2,0,0,0,8,4,0,7,3,7,1,6,3,0,6,6,7,0,7,0,7,7,2,7,0,6,7,7,7,5,8,3,3,7,0,0,0,6,0,4,0,0,0,1,0,3,7,2,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,8,0,0,8,},
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

