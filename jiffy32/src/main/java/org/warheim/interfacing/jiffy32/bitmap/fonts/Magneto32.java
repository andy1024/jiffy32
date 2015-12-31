package org.warheim.interfacing.jiffy32.bitmap.fonts;
// coding=utf-8
// Module magneto_bold_32
// generated from Magneto 23.25pt

public class Magneto32 extends BitmapFont {
	public Magneto32() {
		super("Magneto 32", '!', (char)127, 32, 16, 4, "Magneto32.bin");
	}


	private static final int[][] descriptors = {
    {12,0},// !
    {12,64},// "
    {24,128},// #
    {23,224},// $
    {17,320},// %
    {23,416},// &
    {6,512},// '
    {13,544},// {
    {13,608},// }
    {9,672},// *
    {19,736},// +
    {6,832},// ,
    {12,864},// -
    {6,928},// .
    {14,960},// /
    {21,1024},// 0
    {12,1120},// 1
    {19,1184},// 2
    {19,1280},// 3
    {21,1376},// 4
    {20,1472},// 5
    {20,1568},// 6
    {18,1664},// 7
    {20,1760},// 8
    {17,1856},// 9
    {7,1952},// :
    {8,1984},// ;
    {17,2016},// <
    {15,2112},// =
    {16,2176},// >
    {17,2240},// ?
    {25,2336},// @
    {43,2464},// A
    {28,2656},// B
    {23,2784},// C
    {26,2880},// D
    {24,3008},// E
    {29,3104},// F
    {24,3232},// G
    {43,3328},// H
    {24,3520},// I
    {24,3616},// J
    {30,3712},// K
    {33,3840},// L
    {35,4000},// M
    {36,4160},// N
    {26,4320},// O
    {25,4448},// P
    {25,4576},// Q
    {26,4704},// R
    {33,4832},// S
    {31,4992},// T
    {26,5120},// U
    {25,5248},// V
    {35,5376},// W
    {31,5536},// X
    {28,5664},// Y
    {30,5792},// Z
    {15,5920},// [
    {13,5984},// \
    {16,6048},// ]
    {14,6112},// ^
    {35,6176},// _
    {5,6336},// `
    {20,6368},// a
    {27,6464},// b
    {19,6592},// c
    {20,6688},// d
    {20,6784},// e
    {25,6880},// f
    {19,7008},// g
    {22,7104},// h
    {12,7200},// i
    {18,7264},// j
    {22,7360},// k
    {12,7456},// l
    {31,7520},// m
    {22,7648},// n
    {27,7744},// o
    {23,7872},// p
    {20,7968},// q
    {18,8064},// r
    {18,8160},// s
    {13,8256},// t
    {20,8320},// u
    {23,8416},// v
    {25,8512},// w
    {16,8640},// x
    {20,8704},// y
    {16,8800},// z
    {15,8864},// {
    {2,8928},// |
    {15,8960},// }
    {15,9024},// ~
    {9,9088},// °
};

	private static final byte[][] kerning = {
    {6,10,7,6,8,6,10,8,4,11,7,6,6,6,5,8,10,9,9,8,6,8,10,7,10,7,5,6,7,7,11,8,6,11,8,11,6,10,8,6,10,10,11,5,11,5,11,11,5,11,6,10,11,11,11,8,11,6,6,11,1,4,0,10,6,6,6,6,6,5,6,6,8,4,6,6,6,6,6,4,6,8,6,7,6,7,6,5,6,7,6,12,3,5,12,},
    {6,10,6,5,8,3,10,7,4,11,0,6,0,6,1,8,9,9,9,8,5,6,10,7,9,5,4,0,0,6,11,8,0,10,7,10,3,9,7,0,9,9,10,0,10,0,10,10,4,10,0,9,10,10,10,7,11,5,5,11,1,0,0,10,0,6,0,0,0,3,0,5,7,1,5,5,0,0,0,0,0,0,0,2,0,0,0,0,0,0,5,12,2,0,12,},
    {20,24,21,19,18,21,24,22,15,21,18,18,21,18,18,23,20,20,19,22,19,22,20,22,24,20,20,22,20,21,22,23,19,21,22,21,21,24,22,19,24,24,21,14,21,14,21,21,19,21,21,24,21,21,21,19,22,18,20,21,15,20,0,22,21,21,21,21,21,19,21,20,21,14,20,20,20,20,21,18,21,21,17,20,20,22,20,18,21,18,20,24,17,21,22,},
    {18,22,18,18,20,18,22,20,14,23,17,17,18,18,16,21,22,21,21,20,18,18,23,20,22,18,16,17,18,19,23,20,18,23,19,23,18,22,19,18,22,22,23,15,23,16,23,23,17,23,18,22,23,23,23,20,23,18,18,21,13,18,0,23,18,19,18,18,18,16,18,18,20,14,18,18,17,17,18,15,18,18,17,18,18,18,18,15,18,17,17,23,15,18,23,},
    {15,15,11,15,14,15,15,15,11,16,11,14,14,15,14,14,14,15,15,12,15,14,15,15,14,15,14,10,14,15,15,13,15,15,14,15,15,13,14,15,13,13,15,14,15,14,15,15,14,15,15,13,15,15,15,15,15,15,15,16,10,14,0,14,15,15,15,15,15,13,15,15,15,13,15,15,15,15,15,13,15,15,15,15,15,15,15,14,15,15,15,17,12,14,17,},
    {23,21,19,22,22,22,21,22,19,21,19,22,17,23,22,20,22,23,22,18,23,19,21,20,21,23,22,16,17,23,21,20,23,21,19,21,21,21,19,23,21,21,21,22,21,22,21,21,22,21,21,21,21,21,21,22,21,23,23,19,18,17,0,21,22,23,22,22,22,21,22,23,23,21,23,23,23,23,22,21,22,18,23,23,23,23,23,22,23,23,23,23,20,17,21,},
    {0,4,0,0,2,0,4,1,0,5,0,0,0,0,0,2,3,3,3,2,0,0,4,1,3,0,0,0,0,0,5,2,0,4,1,4,0,3,1,0,3,3,4,0,4,0,4,4,0,4,0,3,4,4,4,1,5,0,0,5,0,0,0,4,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,6,},
    {5,9,4,4,7,4,9,5,6,11,4,7,4,7,5,5,8,7,8,6,4,5,9,5,7,6,5,4,4,4,9,5,4,9,5,9,4,7,5,5,7,7,9,5,9,5,9,9,5,9,4,7,9,9,9,6,9,5,6,13,6,4,0,8,4,4,4,4,4,5,4,5,5,6,5,5,5,5,4,5,4,5,4,5,5,5,5,5,5,5,6,13,6,4,11,},
    {10,13,12,11,10,11,13,13,5,12,12,8,11,11,9,13,11,11,11,12,10,13,13,12,13,12,11,12,12,10,13,13,10,12,13,12,12,13,13,10,13,13,12,7,12,8,12,12,8,12,12,13,12,12,12,11,13,10,10,10,6,11,0,13,11,11,11,11,12,11,11,10,11,6,10,11,10,10,12,8,11,13,9,12,11,13,11,10,11,12,11,13,7,11,13,},
    {4,8,0,3,6,1,8,5,1,9,0,3,0,3,0,5,7,7,6,6,3,3,8,5,7,2,1,0,0,4,9,5,0,8,4,8,1,7,4,0,7,7,8,0,8,0,8,8,2,8,0,7,8,8,8,5,9,3,3,7,0,0,0,7,0,3,0,0,0,0,0,2,5,0,2,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,9,0,0,9,},
    {16,14,12,12,12,16,14,18,10,15,18,13,17,13,13,19,15,13,13,18,15,18,15,18,19,17,16,17,18,13,15,19,12,14,18,14,16,19,18,14,19,19,14,7,14,8,14,14,14,14,16,19,14,14,14,11,15,12,15,14,11,15,0,14,15,16,15,15,16,16,15,15,16,10,15,16,15,15,16,13,16,19,13,18,16,18,16,15,16,18,16,19,12,16,15,},
    {6,0,2,6,4,6,0,6,2,0,1,4,0,6,4,4,5,5,6,0,6,5,1,5,1,6,4,0,0,5,4,4,6,2,4,3,6,3,5,6,3,3,3,4,3,4,1,3,4,2,6,3,1,0,0,6,0,5,5,0,3,0,0,1,6,6,6,6,6,3,6,5,6,3,5,6,5,5,6,3,6,6,5,6,6,6,6,4,6,5,5,6,3,0,0,},
    {10,0,11,10,7,11,6,12,4,3,12,6,11,10,8,12,9,7,10,12,9,12,9,12,9,11,10,11,11,7,8,12,10,6,12,7,11,10,12,10,10,10,7,0,7,1,8,7,4,6,11,10,6,6,5,10,4,9,9,6,5,11,0,7,11,10,11,11,11,10,11,9,10,4,9,10,9,9,11,7,11,11,8,12,10,12,10,8,10,12,9,12,6,11,3,},
    {6,0,2,6,5,6,0,6,2,0,2,5,5,6,5,5,5,6,6,0,6,5,2,6,2,6,5,1,5,6,4,4,6,3,5,3,6,4,5,6,4,4,3,5,3,5,1,3,5,3,6,4,1,1,0,6,0,6,6,0,1,5,0,1,6,6,6,6,6,4,6,6,6,4,6,6,6,6,6,4,6,6,6,6,6,6,6,5,6,6,6,6,3,5,0,},
    {8,12,8,7,10,6,12,9,6,13,8,8,6,8,3,10,11,11,11,10,7,9,12,9,11,8,6,7,8,8,13,10,5,12,9,12,6,11,9,5,11,11,12,3,12,3,12,12,6,12,6,11,12,12,12,9,13,7,7,13,3,6,0,12,6,8,6,6,6,6,6,7,9,3,7,7,5,5,6,4,6,9,4,7,6,8,6,5,6,7,7,14,4,6,14,},
    {19,21,20,19,17,19,21,21,13,19,21,16,20,19,17,21,18,18,19,21,18,21,20,21,21,20,19,20,20,18,20,21,18,19,21,19,20,21,21,18,21,21,19,15,19,16,19,19,16,19,20,21,19,19,19,19,20,18,18,17,14,19,0,20,19,19,19,19,20,19,19,18,19,13,18,19,18,18,20,16,19,21,17,21,19,21,19,18,19,21,19,21,15,19,20,},
    {7,11,9,8,9,8,11,10,4,12,9,6,8,8,6,10,11,10,10,9,7,10,12,9,11,9,7,9,9,8,12,10,7,12,10,12,8,11,10,7,11,11,12,6,12,6,12,12,6,12,8,11,12,12,12,9,12,7,7,10,2,8,0,12,8,8,8,8,8,7,8,7,9,5,7,7,7,7,8,5,8,10,7,9,8,9,7,6,8,9,8,12,4,8,12,},
    {18,19,17,18,16,18,19,18,13,18,17,16,14,18,16,18,18,17,18,16,18,17,19,17,19,18,16,15,17,17,19,18,18,19,17,19,18,19,17,18,19,19,19,16,19,16,19,19,16,19,18,19,19,19,19,18,19,17,17,17,13,13,0,19,18,18,18,18,18,15,18,17,18,15,17,18,17,17,18,15,18,18,17,18,18,18,18,16,18,17,17,19,14,13,19,},
    {16,17,18,17,15,18,17,18,11,18,18,14,18,17,15,18,16,15,17,18,16,18,17,18,17,17,16,18,18,15,17,18,17,17,18,17,18,17,18,17,17,17,17,13,17,14,17,17,13,17,18,17,17,17,17,17,17,16,16,18,12,18,0,16,18,17,18,18,18,16,18,16,17,11,16,17,16,16,18,14,18,18,15,18,17,18,17,15,17,18,16,19,13,18,19,},
    {18,19,20,18,17,19,19,21,13,20,20,15,19,15,17,21,19,18,18,20,15,21,19,20,19,20,19,20,19,16,20,21,18,20,21,20,20,20,21,18,20,20,20,13,20,13,20,20,14,20,20,20,20,20,20,18,20,17,18,20,14,19,0,19,19,19,19,19,20,19,19,18,19,13,18,19,18,18,20,16,19,21,16,20,19,21,19,18,19,20,18,21,15,19,21,},
    {17,18,18,17,17,18,18,18,12,20,18,15,18,17,15,18,18,17,17,18,17,18,19,18,18,17,16,18,18,16,19,18,17,19,18,19,18,17,18,17,17,17,19,14,19,15,19,19,14,19,18,17,19,19,19,17,19,16,16,19,12,18,0,15,18,17,18,18,18,16,18,16,17,12,16,17,16,16,18,14,18,18,16,18,17,18,17,15,17,18,16,20,13,18,20,},
    {18,13,20,19,16,20,14,20,13,14,20,16,20,19,17,20,18,17,19,20,18,20,17,20,19,19,18,20,20,17,17,20,19,15,20,16,20,19,20,19,19,19,16,15,16,16,16,16,15,15,20,19,15,14,13,19,13,18,18,14,14,20,0,15,20,19,20,20,20,18,20,18,19,13,18,19,18,18,20,16,20,20,17,20,19,20,19,17,19,20,18,20,15,20,15,},
    {13,16,13,11,14,13,16,16,10,17,15,12,14,12,11,16,15,15,15,15,11,16,16,15,16,15,14,15,13,13,17,16,10,16,16,16,13,16,16,11,16,16,16,9,16,9,16,16,11,16,13,16,16,16,16,13,17,11,13,17,9,12,0,16,12,14,12,12,13,14,12,13,14,8,13,14,13,13,13,11,13,16,10,15,14,16,14,13,14,15,13,18,8,13,18,},
    {18,20,19,18,17,19,20,19,12,19,19,16,19,18,16,19,19,18,18,19,18,19,20,19,20,18,17,19,19,17,20,19,18,20,19,20,19,20,19,18,20,20,20,15,20,16,20,20,15,20,19,20,20,20,20,18,20,17,17,18,13,19,0,20,19,18,19,19,19,17,19,17,18,12,17,18,17,17,19,15,19,19,17,19,18,19,18,15,18,19,17,20,14,19,20,},
    {14,17,15,13,14,14,17,17,8,16,16,11,15,13,12,17,15,15,14,16,14,17,17,16,17,16,14,15,16,14,17,17,13,16,17,16,15,17,17,13,17,17,16,9,16,10,16,16,12,16,15,17,16,16,16,13,17,12,14,14,9,14,0,17,14,15,14,14,15,14,14,14,14,8,14,14,13,13,15,12,14,17,11,16,14,16,14,13,14,16,15,17,10,14,17,},
    {6,0,5,6,5,6,1,7,2,0,7,5,6,6,5,7,5,6,6,7,6,7,4,7,6,6,5,6,6,6,4,7,6,3,7,3,6,7,7,6,7,7,3,5,3,5,3,3,5,3,6,6,1,1,0,6,0,6,6,2,1,4,0,2,6,6,6,6,6,5,6,6,6,4,6,6,6,6,6,4,6,7,6,7,6,7,6,5,6,7,6,7,3,5,0,},
    {6,0,7,6,4,7,2,8,2,0,8,4,7,6,4,8,5,5,6,8,6,8,5,8,6,7,6,8,6,5,5,8,6,3,8,3,7,7,8,6,7,7,3,4,3,4,4,3,4,3,7,7,3,2,1,6,0,5,6,2,3,6,0,3,7,7,7,7,7,6,7,6,7,3,6,6,6,6,7,4,7,8,5,8,6,8,6,5,7,8,6,8,3,7,0,},
    {14,17,14,14,13,14,17,15,9,16,11,12,11,14,13,15,13,14,14,14,14,14,17,14,17,14,12,8,13,14,16,15,14,10,14,11,14,17,14,14,17,17,11,12,11,13,10,11,12,10,14,17,9,10,9,14,16,14,13,14,9,11,0,16,14,14,14,14,14,12,14,13,14,10,13,14,13,13,14,11,14,14,14,14,14,14,14,12,14,14,13,17,10,11,16,},
    {12,3,14,12,10,13,9,14,7,6,13,9,13,12,11,15,12,9,12,14,11,14,8,14,15,12,12,14,13,11,11,15,12,9,14,10,14,15,14,12,15,15,9,1,10,3,10,10,10,9,14,15,9,8,8,12,6,11,12,10,8,13,0,12,13,13,13,13,14,11,13,12,13,7,12,13,12,12,14,10,13,14,10,13,13,14,13,10,13,10,12,15,9,13,6,},
    {14,6,15,13,11,15,10,16,8,7,16,10,15,11,12,16,13,9,13,16,12,16,13,16,14,15,14,16,14,8,13,16,13,11,16,11,15,15,16,13,15,15,11,3,11,5,12,11,9,11,15,15,11,10,9,13,8,12,14,10,9,14,0,11,15,15,15,15,15,14,15,14,15,8,14,14,14,14,15,12,15,16,11,16,14,16,14,13,15,16,14,16,11,15,7,},
    {13,17,14,11,14,10,17,15,8,16,13,11,9,11,9,16,16,15,15,14,12,15,17,14,17,12,9,10,14,14,17,16,8,17,15,17,10,17,15,8,17,17,17,7,17,7,17,17,12,17,8,17,17,17,17,14,17,12,12,15,8,10,0,17,8,13,8,8,8,10,8,12,14,8,12,13,8,8,8,10,8,15,8,10,8,10,8,7,8,10,12,17,9,8,17,},
    {22,25,23,21,22,21,25,24,16,24,24,19,22,21,20,25,23,23,22,23,21,24,25,23,25,23,22,23,24,22,25,25,21,24,24,24,21,25,24,21,25,25,24,19,24,20,24,24,20,24,21,25,24,24,24,21,25,21,21,22,17,20,0,25,21,22,21,21,21,22,21,21,22,16,21,22,21,21,21,19,21,25,21,23,22,24,22,21,22,23,22,25,18,21,25,},
    {40,33,36,35,37,40,37,43,34,34,42,37,41,37,38,43,40,34,32,42,33,43,39,42,41,42,41,42,31,33,39,43,36,37,43,38,40,42,43,38,42,42,37,30,38,31,39,38,36,37,40,42,37,37,36,31,35,36,40,37,36,39,8,38,39,41,39,39,40,41,39,40,41,35,40,41,40,40,40,38,40,43,37,42,41,43,41,40,41,42,40,43,35,40,35,},
    {24,28,25,23,25,23,28,26,19,27,24,22,23,23,21,27,27,26,26,25,23,25,28,25,28,23,21,23,24,25,28,27,22,28,26,28,23,28,26,22,28,28,28,19,28,20,28,28,23,28,23,28,28,28,28,25,28,23,23,26,19,23,0,28,23,24,23,23,23,21,23,23,25,19,23,24,22,22,23,21,23,25,21,23,23,23,22,19,23,23,23,28,20,23,28,},
    {22,22,18,21,21,21,22,21,18,23,18,21,11,22,21,21,22,22,21,20,22,18,23,20,22,22,21,10,8,22,23,20,22,23,19,23,20,22,19,22,22,22,23,21,23,21,23,23,21,23,20,22,23,23,23,21,23,22,22,21,17,9,0,23,21,22,21,21,21,20,21,22,22,20,22,22,22,22,21,20,21,16,22,22,22,22,22,21,22,22,22,23,19,8,23,},
    {23,26,24,21,23,23,26,25,17,25,25,20,23,21,20,26,24,24,23,24,22,25,26,24,26,24,23,24,25,23,26,26,21,25,25,25,23,26,25,21,26,26,25,16,25,17,25,25,21,25,23,26,25,25,25,22,26,20,22,23,18,22,0,26,23,23,23,23,23,23,23,22,23,17,22,23,22,22,23,20,23,26,20,24,23,25,23,22,23,24,23,26,19,23,26,},
    {23,23,19,22,22,22,23,22,19,24,19,22,12,23,22,22,23,23,22,21,23,19,24,21,23,23,22,11,13,23,24,21,23,24,20,24,21,23,20,23,23,23,24,22,24,22,24,24,22,24,21,23,24,24,24,22,24,23,23,22,18,10,0,24,22,23,22,22,22,21,22,23,23,21,23,23,23,23,22,21,22,17,23,23,23,23,23,22,23,23,23,24,20,9,24,},
    {23,27,19,22,25,21,27,24,21,28,23,23,22,23,19,24,26,26,26,25,22,24,27,24,26,23,22,23,19,18,28,24,17,27,24,27,21,26,24,19,25,25,27,15,27,16,27,27,21,27,21,25,27,27,27,24,28,22,22,28,18,20,0,24,20,22,20,20,21,22,20,21,24,18,21,22,21,21,21,19,21,24,18,23,22,24,22,21,22,23,22,29,19,21,29,},
    {20,23,21,20,21,20,23,22,17,24,21,18,20,20,18,22,23,22,22,21,20,22,24,21,23,21,20,21,20,20,24,22,20,24,22,24,21,23,22,20,23,23,24,18,24,18,24,24,18,24,21,23,24,24,24,21,24,19,19,22,17,20,0,24,20,20,20,20,21,20,20,19,21,18,19,20,19,19,21,17,20,22,19,21,20,22,20,19,20,21,19,24,17,20,24,},
    {40,33,36,35,37,40,37,43,34,34,42,37,41,37,38,43,40,34,32,42,33,43,39,42,41,42,41,42,30,33,39,43,36,37,43,38,40,42,43,38,42,42,37,30,38,31,39,38,36,37,40,42,37,37,36,31,35,36,40,37,36,39,8,38,39,41,39,39,40,41,39,40,41,35,40,41,40,40,40,38,40,43,37,42,41,43,41,40,41,42,40,43,35,40,35,},
    {18,22,20,19,21,19,22,21,16,24,20,18,19,19,17,21,22,21,21,20,18,21,23,20,22,20,18,20,20,19,23,21,18,23,21,23,19,22,21,18,22,22,23,16,23,16,23,23,17,23,19,22,23,23,23,20,23,18,18,23,13,19,0,23,19,19,19,19,19,18,19,18,20,14,18,18,18,18,19,16,19,21,17,20,19,20,18,17,19,20,19,24,15,19,24,},
    {18,22,20,18,21,19,22,21,16,24,20,18,19,18,16,21,22,21,21,20,18,21,23,20,22,20,18,20,20,19,23,21,18,23,21,23,19,22,21,18,22,22,23,16,23,16,23,23,17,23,19,22,23,23,23,20,23,18,18,23,14,19,0,23,19,19,19,19,19,18,19,18,20,15,18,18,18,18,19,16,19,21,17,20,18,20,18,17,19,20,19,24,15,19,24,},
    {26,28,23,25,26,25,28,25,22,29,23,25,22,26,25,24,27,26,27,25,26,23,28,24,26,26,25,23,22,26,28,24,26,28,23,28,24,26,23,26,25,25,28,25,28,25,28,28,25,28,24,25,28,28,28,25,28,26,26,29,21,22,0,26,25,26,25,25,25,24,25,26,26,24,26,26,26,26,25,24,25,22,26,26,26,26,26,25,26,26,26,30,23,22,30,},
    {32,32,28,31,31,31,32,31,28,33,28,31,21,32,31,31,32,32,31,30,32,28,33,30,32,32,31,20,19,32,33,30,32,33,29,33,30,32,29,32,32,32,33,31,33,31,33,33,31,33,30,32,33,33,33,31,33,32,32,31,27,19,0,33,31,32,31,31,31,30,31,32,32,30,32,32,32,32,31,30,31,26,32,32,32,32,32,31,32,32,32,33,29,18,33,},
    {35,33,31,34,34,34,33,34,31,26,32,34,31,35,34,33,34,35,34,32,35,33,31,32,33,35,34,32,32,35,33,33,35,32,33,32,33,33,33,35,33,33,32,34,32,34,28,32,34,32,33,33,29,30,29,34,31,35,35,29,30,31,0,31,34,35,34,34,34,33,34,35,35,33,35,35,35,35,34,33,34,33,35,35,35,35,35,34,35,35,35,35,32,31,31,},
    {31,35,31,30,33,29,35,33,27,36,28,30,27,30,27,34,35,34,34,33,31,31,36,33,35,29,28,27,28,32,36,33,26,36,32,36,29,35,32,26,35,35,36,24,36,24,36,36,30,36,27,35,36,36,36,33,36,31,31,34,26,26,1,36,26,32,26,26,27,29,26,31,33,27,31,31,25,25,27,23,26,29,25,28,26,28,26,25,26,28,30,36,28,26,36,},
    {23,26,24,22,22,24,26,26,17,25,25,20,24,22,21,26,24,23,23,25,23,26,26,25,26,25,23,25,25,23,25,26,22,25,26,25,24,26,26,22,26,26,25,18,25,19,25,25,21,25,24,26,25,25,25,22,25,21,23,23,18,23,0,25,24,24,24,24,24,23,24,23,24,17,23,23,23,23,24,21,24,26,20,25,23,25,23,22,24,25,24,26,20,24,25,},
    {21,25,22,19,22,18,25,23,16,24,22,19,18,19,17,24,24,23,23,22,20,23,25,22,25,21,19,20,22,22,25,24,13,25,23,25,18,25,23,15,25,25,25,10,25,11,25,25,20,25,17,25,25,25,25,22,25,20,20,23,16,18,0,25,16,21,16,16,17,19,16,20,22,16,20,21,18,18,17,18,17,23,17,20,19,21,19,18,19,20,20,25,17,18,25,},
    {25,24,22,24,24,24,24,24,21,23,23,24,22,25,24,24,24,25,24,23,25,24,24,23,24,25,24,22,23,25,23,24,25,23,24,23,23,24,24,25,24,24,23,24,23,24,23,23,24,23,23,24,23,23,23,24,23,25,25,21,20,20,0,23,24,25,24,24,24,23,24,25,25,23,25,25,25,25,24,23,24,24,25,25,25,25,25,24,25,25,25,25,22,21,23,},
    {26,26,23,25,25,25,26,25,22,25,22,25,20,26,25,25,25,26,25,23,26,23,26,23,26,26,25,20,22,26,26,25,26,26,24,26,24,26,24,26,26,26,26,25,26,25,26,26,25,26,24,26,26,26,26,25,26,26,26,24,21,20,0,26,25,26,25,25,25,24,25,26,26,24,26,26,26,26,25,24,25,23,26,26,26,26,26,25,26,26,26,26,23,20,26,},
    {28,32,28,27,30,26,32,30,24,33,25,27,25,27,24,31,32,31,31,30,28,28,33,30,32,26,25,25,25,29,33,30,24,33,29,33,26,32,29,24,32,32,33,21,33,22,33,33,27,33,25,32,33,33,33,30,33,28,28,31,23,25,0,33,25,29,25,25,25,26,25,28,30,24,28,28,24,24,25,22,25,25,23,25,25,25,24,21,25,25,27,33,25,25,33,},
    {25,29,20,24,27,22,29,25,23,30,20,25,19,25,20,26,28,28,28,27,24,23,29,26,28,24,23,19,20,19,30,26,18,29,24,29,22,28,24,18,27,27,29,15,29,16,29,29,23,29,19,27,29,29,29,26,30,24,24,30,20,19,0,26,19,24,19,19,19,21,19,23,26,20,23,24,17,17,19,16,19,21,17,20,18,20,18,17,18,20,24,31,21,19,31,},
    {22,26,23,21,23,22,26,24,17,26,24,20,22,21,19,25,25,24,24,23,21,24,26,23,26,23,22,23,24,23,26,25,21,26,24,26,22,26,24,21,26,26,26,17,26,18,26,26,21,26,22,26,26,26,26,23,26,21,21,24,17,22,0,26,22,22,22,22,22,22,22,21,23,17,21,22,21,21,22,19,22,25,19,23,22,24,22,21,22,23,22,26,18,22,26,},
    {21,25,21,19,22,18,25,23,16,25,21,19,18,19,17,23,24,23,23,22,20,21,25,22,25,20,18,19,21,22,25,23,16,25,22,25,18,25,22,16,25,25,25,12,25,13,25,25,20,25,18,25,25,25,25,22,25,20,20,23,16,17,0,25,17,21,17,17,18,18,17,20,22,16,20,21,17,17,18,17,17,22,16,19,18,20,18,17,18,19,20,25,17,17,25,},
    {29,33,29,28,32,27,33,30,27,35,29,29,28,29,25,31,33,32,32,31,29,30,34,30,33,29,27,28,29,29,34,31,26,34,30,34,28,32,30,26,32,32,34,24,34,25,34,34,28,34,28,32,34,34,34,31,34,29,29,34,24,27,0,33,27,29,27,27,28,27,27,28,31,25,28,29,26,26,28,25,27,30,26,29,27,29,27,26,27,29,28,35,25,27,35,},
    {28,30,26,27,28,27,30,28,24,31,24,27,19,28,27,29,30,29,29,28,28,26,31,28,30,28,27,19,19,28,31,28,28,31,27,31,26,30,27,28,30,30,31,27,31,27,31,31,27,31,26,30,31,31,31,28,31,28,28,29,23,19,0,31,27,28,27,27,27,26,27,28,28,26,28,28,28,28,27,26,27,22,28,28,28,28,28,27,28,28,28,31,25,19,31,},
    {22,26,23,22,24,23,26,24,20,27,24,22,23,22,21,25,26,25,25,24,22,24,26,24,26,23,22,23,24,23,27,25,22,27,24,27,23,26,24,22,26,26,27,20,27,21,27,27,21,27,23,26,27,27,27,24,27,22,21,27,17,23,0,26,23,22,23,23,23,22,23,21,24,19,21,22,21,21,23,19,23,25,22,24,22,24,22,21,22,24,22,28,18,23,28,},
    {27,22,23,22,24,27,24,30,21,23,29,24,28,24,25,30,27,21,20,29,20,30,26,29,28,29,28,29,18,20,26,30,23,24,30,25,27,29,30,25,29,29,24,17,25,18,26,25,23,24,27,29,24,24,23,19,23,23,27,24,23,26,0,25,26,28,26,26,27,28,26,27,28,22,27,28,27,27,27,25,27,30,24,29,28,30,28,27,28,29,27,30,22,27,23,},
    {6,10,8,7,9,7,10,9,8,14,8,9,7,9,5,9,10,9,9,8,6,9,11,8,10,8,7,8,8,7,11,9,6,11,9,11,7,10,9,6,10,10,11,5,11,5,11,11,5,11,7,10,11,11,11,8,11,7,7,15,7,7,0,11,7,7,7,7,7,6,7,6,8,7,6,6,6,6,7,6,7,9,6,8,7,8,6,5,7,8,7,15,7,7,14,},
    {12,7,10,12,13,12,7,12,10,5,9,12,11,12,13,10,13,13,12,10,12,11,10,11,10,12,12,10,11,12,10,10,12,10,11,11,11,12,11,13,12,12,11,13,11,13,7,11,13,10,11,12,7,8,7,12,7,13,13,3,9,11,0,8,12,12,12,12,12,11,12,13,13,12,13,13,13,13,11,11,12,12,12,13,13,13,13,13,13,13,13,13,10,11,6,},
    {10,14,12,11,13,11,14,13,8,16,12,10,11,11,9,13,14,13,13,12,10,13,15,12,14,12,10,12,12,11,15,13,10,15,13,15,11,14,13,10,14,14,15,9,15,9,15,15,9,15,11,14,15,15,15,12,15,10,10,15,8,11,0,15,11,11,11,11,11,10,11,10,12,9,10,10,10,10,11,8,11,13,10,12,11,12,10,9,11,12,11,16,8,11,16,},
    {11,2,13,13,10,14,8,14,7,5,13,8,14,13,11,13,12,10,13,13,12,14,10,14,12,12,11,13,14,10,10,13,13,9,14,10,14,12,14,13,12,12,10,2,10,4,10,10,7,9,14,12,9,8,7,13,5,12,12,7,8,14,0,9,14,13,14,14,14,11,14,12,13,7,12,13,12,12,14,10,14,14,11,13,13,14,13,9,13,13,12,14,9,14,5,},
    {23,23,11,12,18,12,29,22,22,26,16,29,23,29,21,14,23,16,16,14,15,15,17,15,18,28,27,18,20,19,18,10,0,7,12,9,11,6,11,0,11,11,5,2,0,0,9,10,10,9,2,4,9,10,0,4,7,5,20,22,19,21,32,30,15,8,16,15,15,35,33,13,23,33,13,23,4,13,8,35,27,17,17,22,15,12,10,19,34,19,20,33,20,20,26,},
    {1,4,3,0,1,0,4,4,0,3,0,0,0,0,0,5,1,2,0,1,1,4,4,2,5,0,0,0,3,2,4,5,0,0,4,0,0,5,4,0,5,5,0,0,0,0,0,0,0,0,0,5,0,0,0,0,4,0,1,1,0,0,0,4,0,2,0,0,0,0,0,1,1,0,1,2,0,0,0,0,0,4,0,0,0,0,0,0,0,0,1,5,0,0,4,},
    {20,8,16,19,19,19,14,19,16,11,17,19,16,20,19,17,19,20,19,17,20,17,16,17,16,20,19,17,16,20,18,17,20,17,17,17,18,18,17,20,18,18,17,19,17,19,13,17,19,17,18,18,14,15,14,19,13,20,20,11,15,16,0,15,19,20,19,19,19,18,19,20,20,18,20,20,20,20,19,18,19,17,20,20,20,20,20,19,20,20,20,20,17,16,11,},
    {24,15,20,19,21,24,21,27,18,18,26,21,25,21,22,27,24,18,16,26,17,27,23,26,25,26,25,26,15,17,23,27,20,21,27,22,24,26,27,22,26,26,21,14,22,15,23,22,20,21,24,26,21,21,20,15,19,20,24,21,20,23,0,22,23,25,23,23,24,25,23,24,25,19,24,25,24,24,24,22,24,27,21,26,25,27,25,24,25,26,24,27,19,24,18,},
    {19,7,15,18,18,18,13,18,15,10,15,18,14,19,18,15,18,19,18,15,19,15,15,16,15,19,18,15,14,19,17,15,19,16,15,16,17,17,15,19,17,17,16,18,16,18,12,16,18,16,17,17,13,14,13,18,12,19,19,10,14,14,0,14,18,19,18,18,18,17,18,19,19,17,19,19,19,19,18,17,18,14,19,19,19,19,19,18,19,19,19,19,16,14,10,},
    {20,19,17,19,19,19,19,19,16,19,17,19,16,20,19,18,19,20,19,17,20,18,20,17,19,20,19,17,17,20,20,18,20,20,18,20,18,19,18,20,19,19,20,19,20,19,20,20,19,20,18,19,20,20,20,19,20,20,20,18,15,16,0,20,19,20,19,19,19,18,19,20,20,18,20,20,20,20,19,18,19,18,20,20,20,20,20,19,20,20,20,20,17,16,20,},
    {20,8,16,19,19,19,14,19,16,11,16,19,15,20,19,16,19,20,19,15,20,16,16,17,16,20,19,15,15,20,18,15,20,17,16,17,18,18,16,20,18,18,17,19,17,19,13,17,19,17,18,18,14,15,14,19,13,20,20,11,15,15,0,15,19,20,19,19,19,18,19,20,20,18,20,20,20,20,19,18,19,15,20,20,20,20,20,19,20,20,20,20,17,15,11,},
    {22,13,18,17,19,22,19,25,16,16,24,19,23,19,20,25,22,16,14,24,15,25,21,24,23,24,23,24,12,15,21,25,18,19,25,20,22,24,25,20,24,24,19,12,20,13,21,20,18,19,22,24,19,19,18,13,17,18,22,19,18,21,0,20,21,23,21,21,22,23,21,22,23,17,22,23,22,22,22,20,22,25,19,24,23,25,23,22,23,24,22,25,17,22,16,},
    {19,7,16,18,18,18,13,18,15,10,17,18,16,19,18,17,18,19,18,17,19,17,15,17,15,19,18,17,16,19,17,17,19,16,17,16,17,17,17,19,17,17,16,18,16,18,13,16,18,16,17,17,13,14,13,18,12,19,19,11,14,16,8,14,18,19,18,18,18,17,18,19,19,17,19,19,19,19,18,17,18,17,19,19,19,19,19,18,19,19,19,19,16,16,10,},
    {22,12,18,21,21,21,16,21,18,13,18,21,17,22,21,18,21,22,21,18,22,18,18,19,18,22,21,18,17,22,20,18,22,19,18,19,20,20,18,22,20,20,19,21,19,21,15,19,21,19,20,20,16,17,16,21,15,22,22,13,17,17,0,17,21,22,21,21,21,20,21,22,22,20,22,22,22,22,21,20,21,18,22,22,22,22,22,21,22,22,22,22,19,17,13,},
    {12,11,8,11,11,11,11,11,8,10,8,11,7,12,11,9,11,12,11,8,12,9,11,9,11,12,11,8,7,12,11,9,12,11,9,11,10,11,9,12,11,11,11,11,11,11,11,11,11,11,10,11,11,11,11,11,11,12,12,9,7,7,0,11,11,12,11,11,11,10,11,12,12,10,12,12,12,12,11,10,11,9,12,12,12,12,12,11,12,12,12,12,9,7,11,},
    {18,17,14,17,17,17,17,17,14,16,14,17,13,18,17,15,17,18,17,14,18,15,17,15,17,18,17,14,13,18,17,15,18,17,15,17,16,17,15,18,17,17,17,17,17,17,17,17,17,17,16,17,17,17,17,17,17,18,18,15,13,13,3,17,17,18,17,17,17,16,17,18,18,16,18,18,18,18,17,16,17,15,18,18,18,18,18,17,18,18,18,18,15,13,17,},
    {22,11,18,21,21,21,16,21,18,13,18,21,17,22,21,18,21,22,21,18,22,18,18,19,18,22,21,18,17,22,20,18,22,19,18,19,20,20,18,22,20,20,19,21,19,21,15,19,21,19,20,20,16,17,16,21,15,22,22,13,17,17,0,17,21,22,21,21,21,20,21,22,22,19,22,22,22,22,21,20,21,17,22,22,22,22,22,21,22,22,22,22,19,17,13,},
    {12,10,8,11,11,11,10,11,8,10,8,11,7,12,11,9,11,12,11,8,12,9,11,9,10,12,11,8,8,12,11,9,12,11,9,11,10,10,9,12,10,10,11,11,11,11,11,11,11,11,10,10,11,11,11,11,11,12,12,9,7,7,0,11,11,12,11,11,11,10,11,12,12,9,12,12,12,12,11,10,11,9,12,12,12,12,12,11,12,12,12,12,9,7,11,},
    {31,19,27,30,30,30,25,30,27,22,27,30,26,31,30,27,30,31,30,27,31,27,27,28,27,31,30,27,26,31,29,27,31,28,27,28,29,29,27,31,29,29,28,30,28,30,24,28,30,28,29,29,25,26,25,30,24,31,31,22,26,26,0,26,30,31,30,30,30,29,30,31,31,29,31,31,31,31,30,29,30,27,31,31,31,31,31,30,31,31,31,31,28,26,22,},
    {22,10,18,21,21,21,16,21,18,13,18,21,17,22,21,18,21,22,21,18,22,18,18,19,18,22,21,18,17,22,20,18,22,19,18,19,20,20,18,22,20,20,19,21,19,21,15,19,21,19,20,20,16,17,16,21,15,22,22,13,17,17,0,17,21,22,21,21,21,20,21,22,22,20,22,22,22,22,21,20,21,18,22,22,22,22,22,21,22,22,22,22,19,17,13,},
    {24,15,20,19,21,24,21,27,18,18,26,21,25,21,22,27,24,18,16,26,17,27,23,26,25,26,25,26,14,17,23,27,20,21,27,22,24,26,27,22,26,26,21,14,22,15,23,22,20,21,24,26,21,21,20,15,19,20,24,21,20,23,0,22,23,25,23,23,24,25,23,24,25,19,24,25,24,24,24,22,24,27,21,26,25,27,25,24,25,26,24,27,19,24,18,},
    {23,11,19,22,22,22,17,22,19,14,19,22,18,23,22,19,22,23,22,18,23,19,19,20,19,23,22,18,18,23,21,18,23,20,19,20,21,21,19,23,21,21,20,22,20,22,16,20,22,20,21,21,17,18,17,22,16,23,23,14,18,18,2,18,22,23,22,22,22,21,22,23,23,21,23,23,23,23,22,21,22,18,23,23,23,23,23,22,23,23,23,23,20,18,14,},
    {20,8,16,19,19,19,14,19,16,11,16,19,15,20,19,16,19,20,19,16,20,16,16,17,16,20,19,16,15,20,18,16,20,17,16,17,18,18,16,20,18,18,17,19,17,19,13,17,19,17,18,18,14,15,14,19,13,20,20,11,15,15,7,15,19,20,19,19,19,18,19,20,20,18,20,20,20,20,19,18,19,16,20,20,20,20,20,19,20,20,20,20,17,15,11,},
    {18,6,14,17,17,17,12,17,14,9,14,17,13,18,17,14,17,18,17,14,18,14,14,15,14,18,17,14,13,18,16,14,18,15,14,15,16,16,14,18,16,16,15,17,15,17,11,15,17,15,16,16,12,13,12,17,11,18,18,9,13,13,0,13,17,18,17,17,17,16,17,18,18,16,18,18,18,18,17,16,17,14,18,18,18,18,18,17,18,18,18,18,15,13,9,},
    {18,12,14,17,17,17,12,17,14,9,14,17,14,18,17,14,17,18,17,14,18,14,14,15,14,18,17,13,14,18,16,14,18,15,14,15,16,16,14,18,16,16,15,17,15,17,11,15,17,15,16,16,12,13,12,17,11,18,18,9,13,14,0,13,17,18,17,17,17,16,17,18,18,16,18,18,18,18,17,16,17,14,18,18,18,18,18,17,18,18,18,18,15,14,10,},
    {13,11,9,12,12,12,11,12,9,10,11,12,10,13,12,12,12,13,12,11,13,12,11,11,11,13,12,11,8,13,11,12,13,10,12,10,11,11,12,13,11,11,10,12,10,12,8,10,12,10,11,11,7,8,7,12,10,13,13,8,8,8,0,10,12,13,12,12,12,11,12,13,13,11,13,13,13,13,12,11,12,12,13,13,13,13,13,12,13,13,13,13,10,9,10,},
    {20,8,16,19,19,19,14,19,16,11,17,19,16,20,19,17,19,20,19,17,20,17,16,17,16,20,19,17,16,20,18,17,20,17,17,17,18,18,17,20,18,18,17,19,17,19,13,17,19,17,18,18,14,15,14,19,13,20,20,11,15,16,0,15,19,20,19,19,19,18,19,20,20,18,20,20,20,20,19,18,19,17,20,20,20,20,20,19,20,20,20,20,17,16,11,},
    {20,11,16,15,17,20,17,23,14,14,22,17,21,17,18,23,20,14,12,22,13,23,19,22,21,22,21,22,11,13,19,23,16,17,23,18,20,22,23,18,22,22,17,10,18,11,19,18,16,17,20,22,17,17,16,11,15,16,20,17,16,19,0,18,19,21,19,19,20,21,19,20,21,15,20,21,20,20,20,18,20,23,17,22,21,23,21,20,21,22,20,23,15,20,14,},
    {22,13,23,23,21,23,19,25,18,16,24,21,23,23,21,25,22,22,23,24,22,25,21,24,23,24,23,24,23,22,21,25,22,19,25,20,23,24,25,22,24,24,19,21,20,21,21,20,21,19,23,24,19,19,18,23,17,22,22,19,18,23,0,20,23,23,23,23,23,23,23,22,23,19,22,23,22,22,23,20,23,25,22,24,23,25,23,22,23,24,22,25,19,23,16,},
    {14,4,13,14,15,14,10,16,12,7,15,14,14,14,15,16,15,15,14,15,14,16,12,15,14,15,14,15,12,14,12,16,14,12,16,13,13,15,16,15,15,15,13,15,13,15,12,13,15,12,13,15,10,10,9,14,9,15,15,10,11,12,0,11,14,14,14,14,14,14,14,15,15,14,15,15,15,15,13,13,14,16,14,15,15,16,15,15,15,15,15,16,12,13,7,},
    {20,8,16,19,19,19,14,19,16,11,16,19,15,20,19,17,19,20,19,16,20,17,16,17,16,20,19,16,15,20,18,17,20,17,17,17,18,18,17,20,18,18,17,19,17,19,13,17,19,17,18,18,14,15,14,19,13,20,20,11,15,15,7,15,19,20,19,19,19,18,19,20,20,18,20,20,20,20,19,18,19,17,20,20,20,20,20,19,20,20,20,20,17,15,11,},
    {16,4,12,15,15,15,10,15,12,7,13,15,12,16,15,14,15,16,15,13,16,14,12,13,12,16,15,13,10,16,14,14,16,13,14,13,14,14,14,16,14,14,13,15,13,15,10,13,15,13,14,14,10,11,10,15,9,16,16,8,11,10,0,11,15,16,15,15,15,14,15,16,16,14,16,16,16,16,15,14,15,14,16,16,16,16,16,15,16,16,16,16,13,11,7,},
    {7,11,8,7,9,7,11,9,8,14,8,9,7,9,5,9,10,10,10,9,6,8,11,8,10,8,7,7,7,7,12,9,6,11,8,11,7,10,8,6,10,10,11,5,11,5,11,11,5,11,7,10,11,11,11,8,12,7,7,15,7,7,0,11,7,7,7,7,7,6,7,6,8,7,6,6,6,6,7,5,7,8,6,8,7,8,6,5,7,8,7,15,7,7,14,},
    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,2,2,2,2,2,2,1,2,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,},
    {10,13,11,10,12,10,13,13,7,15,12,9,11,10,8,13,13,12,12,12,9,13,14,12,13,12,11,12,11,10,14,13,9,14,13,14,10,13,13,9,13,13,14,8,14,8,14,14,8,14,10,13,14,14,14,11,14,9,10,14,7,10,0,14,10,11,10,10,10,11,10,10,11,8,10,11,10,10,10,8,10,13,9,12,11,13,11,10,11,12,10,15,7,10,15,},
    {12,3,13,11,9,13,9,15,6,6,14,9,13,11,10,15,12,8,11,14,10,15,11,14,13,14,13,14,12,8,11,15,11,9,15,10,13,14,15,11,14,14,9,2,10,3,11,10,8,9,13,14,9,9,8,11,7,10,12,9,8,12,0,10,13,13,13,13,13,13,13,12,13,7,12,13,12,12,13,10,13,15,9,14,13,15,13,12,13,14,12,15,9,13,6,},
    {4,8,4,3,6,2,8,6,1,9,0,3,0,3,0,7,8,7,7,6,4,4,9,6,8,2,1,0,0,5,9,6,0,9,5,9,2,8,5,0,8,8,9,0,9,0,9,9,3,9,0,8,9,9,9,6,9,4,4,8,0,0,0,9,0,5,0,0,0,2,0,4,6,0,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,9,1,0,9,},
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

