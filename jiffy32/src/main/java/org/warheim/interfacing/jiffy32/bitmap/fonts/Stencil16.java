package org.warheim.interfacing.jiffy32.bitmap.fonts;
// coding=utf-8
// Module stencil_16
// generated from Stencil 11.25pt

public class Stencil16 extends BitmapFont {
	public Stencil16() {
		super("Stencil 16", '!', (char)127, 16, 8, 2, "Stencil16.bin");
	}


	private static final int[][] descriptors = {
    {3,0},// !
    {5,16},// "
    {9,32},// #
    {7,64},// $
    {11,80},// %
    {10,112},// &
    {2,144},// '
    {4,160},// {
    {4,176},// }
    {5,192},// *
    {7,208},// +
    {3,224},// ,
    {4,240},// -
    {3,256},// .
    {6,272},// /
    {8,288},// 0
    {5,304},// 1
    {8,320},// 2
    {8,336},// 3
    {8,352},// 4
    {7,368},// 5
    {7,384},// 6
    {7,400},// 7
    {7,416},// 8
    {8,432},// 9
    {3,448},// :
    {3,464},// ;
    {6,480},// <
    {7,496},// =
    {6,512},// >
    {7,528},// ?
    {10,544},// @
    {9,576},// A
    {10,608},// B
    {8,640},// C
    {9,656},// D
    {8,688},// E
    {8,704},// F
    {8,720},// G
    {10,736},// H
    {5,768},// I
    {8,784},// J
    {10,800},// K
    {8,832},// L
    {10,848},// M
    {9,880},// N
    {9,912},// O
    {9,944},// P
    {9,976},// Q
    {10,1008},// R
    {8,1040},// S
    {9,1056},// T
    {10,1088},// U
    {9,1120},// V
    {12,1152},// W
    {9,1184},// X
    {9,1216},// Y
    {8,1248},// Z
    {5,1264},// [
    {6,1280},// \
    {5,1296},// ]
    {8,1312},// ^
    {7,1328},// _
    {4,1344},// `
    {9,1360},// a
    {10,1392},// b
    {8,1424},// c
    {9,1440},// d
    {8,1472},// e
    {8,1488},// f
    {8,1504},// g
    {10,1520},// h
    {5,1552},// i
    {8,1568},// j
    {10,1584},// k
    {8,1616},// l
    {10,1632},// m
    {9,1664},// n
    {9,1696},// o
    {9,1728},// p
    {9,1760},// q
    {10,1792},// r
    {8,1824},// s
    {9,1840},// t
    {10,1872},// u
    {9,1904},// v
    {12,1936},// w
    {9,1968},// x
    {9,2000},// y
    {8,2032},// z
    {5,2048},// {
    {2,2064},// |
    {5,2080},// }
    {6,2096},// ~
    {4,2112},// °
};

	private static final byte[][] kerning = {
    {3,3,3,3,3,3,3,3,3,3,2,3,2,3,2,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,},
    {5,5,3,4,4,1,5,3,5,4,2,2,1,2,1,4,5,4,3,2,4,4,5,4,4,4,4,3,4,5,4,4,2,5,4,5,5,5,4,5,5,2,5,5,5,5,4,5,4,5,4,5,5,5,5,5,5,4,5,5,5,2,0,1,2,5,4,5,5,5,4,5,5,2,5,5,5,5,4,5,4,5,4,5,5,5,5,5,5,4,4,5,5,5,4,},
    {9,9,8,9,9,8,9,8,8,9,7,6,7,8,6,9,8,9,8,8,9,9,9,9,9,8,7,7,7,9,9,8,7,8,8,8,8,8,9,8,8,8,8,8,8,8,9,8,8,8,9,9,8,8,8,8,8,8,9,8,8,7,2,5,7,8,8,8,8,8,9,8,8,8,8,8,8,8,9,8,8,8,9,9,8,8,8,8,8,8,8,9,8,8,9,},
    {7,7,7,7,7,7,7,7,7,7,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,7,6,7,7,7,7,6,6,7,6,6,6,7,6,6,7,6,6,6,7,7,6,7,6,7,7,6,6,6,6,6,7,7,7,6,7,0,3,6,6,7,6,6,6,7,6,6,7,6,6,6,7,7,6,7,6,7,7,6,6,6,6,6,7,7,7,6,6,7,},
    {11,8,11,11,8,11,9,11,10,8,9,11,7,11,10,10,10,10,11,11,11,11,9,11,10,11,11,8,10,11,10,10,10,10,11,10,10,10,11,10,10,11,10,10,10,10,11,10,10,10,11,8,10,8,8,10,8,11,11,8,9,6,4,7,10,10,11,10,10,10,11,10,10,11,10,10,10,10,11,10,10,10,11,8,10,8,8,10,8,11,10,11,9,8,8,},
    {10,8,9,10,9,9,8,10,9,10,10,10,10,10,9,10,10,9,9,9,9,10,8,9,10,10,10,10,10,9,9,10,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,8,9,8,8,10,8,10,10,9,8,10,3,6,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,8,9,8,8,10,8,10,9,10,8,8,9,},
    {2,2,1,2,2,0,2,1,2,2,0,0,0,0,0,2,2,2,1,0,2,2,2,2,2,1,1,0,1,2,2,1,0,2,1,2,2,2,2,2,2,0,2,2,2,2,2,2,1,2,2,2,2,2,2,2,2,1,2,2,2,0,0,0,0,2,1,2,2,2,2,2,2,0,2,2,2,2,2,2,1,2,2,2,2,2,2,2,2,1,1,2,2,2,2,},
    {4,4,3,4,4,3,4,3,4,4,3,4,3,3,4,3,4,4,3,3,3,3,4,4,3,3,4,3,3,4,4,3,3,4,3,4,4,4,3,4,4,3,4,4,4,4,3,4,3,4,4,4,4,4,4,4,4,3,4,4,4,3,0,0,3,4,3,4,4,4,3,4,4,3,4,4,4,4,3,4,3,4,4,4,4,4,4,4,4,3,3,4,4,4,4,},
    {4,3,4,4,3,4,3,4,3,4,4,3,4,4,2,4,3,3,4,4,4,4,3,4,4,4,4,4,4,3,3,4,3,3,4,3,3,3,4,3,3,4,3,3,4,3,4,3,4,3,4,3,3,2,2,3,2,3,4,3,2,4,0,0,3,3,4,3,3,3,4,3,3,4,3,3,4,3,4,3,4,3,4,3,3,2,2,3,2,3,4,4,2,1,3,},
    {5,5,4,5,5,2,5,5,5,5,5,2,5,2,2,5,4,5,4,3,5,5,5,5,5,5,5,5,5,5,5,5,3,4,5,4,4,4,5,4,4,1,4,4,5,4,5,4,5,4,5,5,4,4,4,4,4,4,5,5,3,4,0,1,3,4,5,4,4,4,5,4,4,1,4,4,5,4,5,4,5,4,5,5,4,4,4,4,4,4,4,5,3,3,5,},
    {6,4,5,7,6,6,5,7,6,7,7,4,7,4,5,7,6,4,4,6,6,7,4,6,7,7,7,7,7,5,5,7,5,6,7,6,6,6,7,6,6,4,6,6,7,6,7,6,7,6,7,4,6,5,5,4,5,5,7,6,5,7,0,3,5,6,7,6,6,6,7,6,6,4,6,6,7,6,7,6,7,6,7,4,6,5,5,4,5,5,6,7,5,1,6,},
    {3,0,2,3,0,3,1,2,3,0,1,3,0,3,2,2,3,2,3,0,3,2,1,3,2,3,3,0,0,3,2,2,3,3,2,3,3,3,2,3,3,3,3,3,3,3,2,3,2,3,3,1,2,0,0,3,1,3,3,0,2,0,0,0,3,3,2,3,3,3,2,3,3,3,3,3,3,3,2,3,2,3,3,1,2,0,0,3,1,3,2,3,2,0,0,},
    {3,0,2,4,3,3,2,4,3,4,4,1,4,1,2,4,3,0,0,3,3,4,1,3,4,4,4,4,4,2,2,4,2,3,4,3,3,3,4,3,3,0,3,3,4,3,4,3,4,3,4,1,3,2,2,1,2,2,4,3,2,4,0,0,2,3,4,3,3,3,4,3,3,0,3,3,4,3,4,3,4,3,4,1,3,2,2,1,2,2,3,4,2,0,3,},
    {3,0,3,3,0,3,1,3,2,0,1,3,0,3,2,2,3,2,3,3,3,3,1,3,2,3,3,0,0,3,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,1,2,0,0,3,1,3,3,0,1,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,1,2,0,0,3,1,3,2,3,1,0,0,},
    {6,6,4,6,6,4,6,5,6,6,5,3,5,3,2,5,6,6,5,4,5,5,6,6,5,5,5,5,5,6,6,5,3,6,5,6,6,6,5,6,6,3,6,6,6,6,5,6,5,6,6,6,6,6,6,6,6,5,6,6,6,4,0,2,3,6,5,6,6,6,5,6,6,3,6,6,6,6,5,6,5,6,6,6,6,6,6,6,6,5,5,6,6,6,6,},
    {8,8,8,8,8,8,8,8,7,8,8,7,8,8,6,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,7,8,7,7,7,8,7,7,8,7,7,8,8,8,7,8,7,8,8,7,7,7,7,7,7,8,7,6,8,1,4,7,7,8,7,7,7,8,7,7,8,7,7,8,8,8,7,8,7,8,8,7,7,7,7,7,7,8,8,6,6,8,},
    {5,4,4,4,4,4,4,4,4,4,4,5,4,5,4,4,5,4,4,4,4,4,4,4,4,5,5,4,4,4,4,4,5,5,4,5,5,5,4,5,5,4,5,5,5,5,4,5,4,5,5,4,4,4,4,5,4,5,5,4,4,4,0,1,5,5,4,5,5,5,4,5,5,4,5,5,5,5,4,5,4,5,5,4,4,4,4,5,4,5,4,5,4,4,4,},
    {8,8,8,8,8,8,8,8,8,8,7,8,7,8,7,8,7,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,7,7,8,7,7,7,8,7,7,8,7,7,7,8,8,7,8,7,8,8,7,7,7,7,7,8,8,8,6,6,1,4,7,7,8,7,7,7,8,7,7,8,7,7,7,8,8,7,8,7,8,8,7,7,7,7,7,8,7,8,6,6,8,},
    {8,8,8,8,8,8,8,8,8,8,7,8,7,8,7,8,7,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,7,7,8,7,7,7,8,7,7,8,7,7,7,8,8,7,8,7,8,8,7,7,7,7,7,8,8,8,7,7,1,4,7,7,8,7,7,7,8,7,7,8,7,7,7,8,8,7,8,7,8,8,7,7,7,7,7,8,8,8,7,7,8,},
    {8,7,8,8,7,8,7,8,7,7,7,8,7,8,7,7,8,7,8,8,8,8,7,8,7,8,8,7,7,7,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,7,7,7,7,8,7,8,8,7,7,7,1,4,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,7,7,7,7,8,7,8,7,8,7,7,7,},
    {7,6,7,7,6,7,6,7,6,6,7,7,7,7,6,7,6,6,7,7,7,7,6,7,6,7,7,6,7,7,6,7,6,6,7,6,6,6,7,6,6,7,6,6,6,6,7,6,7,6,7,6,6,6,6,6,6,7,7,6,6,7,0,3,6,6,7,6,6,6,7,6,6,7,6,6,6,6,7,6,7,6,7,6,6,6,6,6,6,7,7,7,6,6,6,},
    {7,7,7,7,7,7,7,7,7,7,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,7,6,7,7,7,7,6,6,7,6,6,6,7,6,6,7,6,6,6,7,7,6,7,6,7,7,6,6,6,6,6,7,7,7,6,7,0,3,6,6,7,6,6,6,7,6,6,7,6,6,6,7,7,6,7,6,7,7,6,6,6,6,6,7,7,7,6,6,7,},
    {7,7,5,7,7,5,7,5,7,7,5,5,5,5,4,6,7,7,6,5,6,6,7,7,6,5,5,5,5,7,7,5,5,7,6,7,7,7,6,7,7,5,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,6,7,7,7,5,0,3,5,7,6,7,7,7,6,7,7,5,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,6,6,7,7,7,7,},
    {7,7,7,7,7,7,7,7,7,7,6,7,6,7,6,7,6,7,7,7,7,7,7,7,7,7,7,6,7,7,7,7,6,6,7,6,6,6,7,6,6,7,6,6,6,7,7,6,7,6,7,7,6,6,6,6,6,7,7,7,6,6,0,3,6,6,7,6,6,6,7,6,6,7,6,6,6,7,7,6,7,6,7,7,6,6,6,6,6,7,7,7,6,6,7,},
    {8,8,8,8,8,8,8,8,7,8,8,7,8,8,6,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,7,8,7,7,7,8,7,7,8,7,7,8,8,8,7,8,7,8,8,7,7,7,7,7,7,8,7,6,8,1,4,7,7,8,7,7,7,8,7,7,8,7,7,8,8,8,7,8,7,8,8,7,7,7,7,7,7,8,8,6,6,8,},
    {3,3,3,3,3,3,3,3,2,3,3,3,3,3,2,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,2,2,2,3,1,3,3,2,1,3,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,2,2,2,3,1,3,2,3,1,0,3,},
    {3,3,2,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,2,3,3,1,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,2,2,2,3,1,3,3,2,2,3,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,2,2,2,3,1,3,2,3,2,0,3,},
    {6,6,6,6,6,6,6,6,6,6,5,6,5,6,5,6,6,6,6,6,6,6,6,6,5,6,6,4,6,6,6,6,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,5,0,2,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,},
    {7,7,5,7,7,7,7,7,6,7,7,4,7,4,5,7,6,7,6,7,6,7,5,7,7,7,7,7,7,7,5,7,5,6,7,6,6,6,7,6,6,6,6,6,7,7,7,6,7,6,7,4,6,6,6,5,5,6,7,6,5,7,0,3,5,6,7,6,6,6,7,6,6,6,6,6,7,7,7,6,7,6,7,4,6,6,6,5,5,6,7,7,5,1,7,},
    {5,4,4,6,5,5,4,6,5,6,6,3,6,3,4,6,5,4,3,5,5,6,3,5,6,6,6,6,6,4,4,6,4,5,6,5,5,5,6,5,5,3,5,5,6,5,6,5,6,5,6,3,5,4,4,3,4,4,6,5,4,6,0,2,4,5,6,5,5,5,6,5,5,3,5,5,6,5,6,5,6,5,6,3,5,4,4,3,4,4,5,6,4,1,5,},
    {7,7,6,7,7,4,7,6,7,7,6,4,6,4,4,7,6,7,6,5,7,7,7,7,7,7,7,6,7,7,7,7,5,6,7,6,6,6,7,6,6,4,6,6,6,7,7,6,7,6,7,7,6,6,6,6,6,6,7,7,6,5,0,3,5,6,7,6,6,6,7,6,6,4,6,6,6,7,7,6,7,6,7,7,6,6,6,6,6,6,6,7,6,6,7,},
    {10,10,9,10,10,9,10,10,9,10,10,9,10,9,8,10,9,10,9,9,10,10,10,10,10,10,10,10,10,10,10,10,9,9,10,9,9,9,10,9,9,8,9,9,10,10,10,9,10,9,10,10,9,9,9,9,9,9,10,9,8,10,3,6,9,9,10,9,9,9,10,9,9,8,9,9,10,10,10,9,10,9,10,10,9,9,9,9,9,9,9,10,8,8,10,},
    {9,7,8,8,7,8,7,8,8,7,8,9,8,9,8,8,9,8,8,8,8,8,7,8,7,9,9,7,8,8,8,8,9,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,8,9,9,7,7,7,7,9,7,9,9,7,7,8,2,5,9,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,8,9,9,7,7,7,7,9,7,9,8,9,7,7,7,},
    {10,9,10,10,9,10,9,10,9,9,9,10,9,10,9,10,9,9,10,10,10,10,9,10,9,10,10,8,10,10,9,10,9,9,10,9,9,9,10,9,9,10,9,9,9,9,10,9,10,9,10,9,9,8,8,9,8,10,10,9,8,9,3,6,9,9,10,9,9,9,10,9,9,10,9,9,9,9,10,9,10,9,10,9,9,8,8,9,8,10,10,10,8,8,9,},
    {8,8,8,8,8,8,8,8,8,8,6,8,4,8,7,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,6,1,4,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,},
    {9,9,9,9,9,9,9,9,8,9,9,8,9,9,7,9,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,8,9,8,8,8,9,8,8,9,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,9,8,7,9,2,5,8,8,9,8,8,8,9,8,8,9,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,9,9,7,7,9,},
    {8,8,8,8,8,8,8,8,8,8,7,8,7,8,7,8,8,8,8,8,8,8,8,8,8,8,8,7,7,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,7,1,4,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,7,8,8,8,8,},
    {8,8,7,8,8,7,8,7,8,8,7,5,7,5,5,8,8,8,7,7,8,8,8,8,8,7,7,7,7,8,8,7,6,8,7,8,8,8,8,8,8,6,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,7,8,8,8,7,1,4,6,8,7,8,8,8,8,8,8,6,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,7,7,8,8,8,8,},
    {8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,1,4,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,},
    {10,10,9,9,9,9,10,9,10,9,9,10,9,10,9,9,10,9,9,9,9,9,10,9,9,10,10,9,9,10,9,9,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,10,10,10,10,10,10,10,10,10,10,10,9,3,6,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,10,10,10,10,10,10,10,10,9,10,10,10,9,},
    {5,5,4,4,4,4,5,4,5,4,4,5,4,5,4,4,5,4,4,4,4,4,5,4,4,5,5,4,4,5,4,4,5,5,4,5,5,5,4,5,5,4,5,5,5,5,4,5,4,5,5,5,5,5,5,5,5,5,5,5,5,4,0,1,5,5,4,5,5,5,4,5,5,4,5,5,5,5,4,5,4,5,5,5,5,5,5,5,5,5,4,5,5,5,4,},
    {8,8,7,7,7,7,8,7,8,7,7,7,7,7,6,7,8,7,7,7,7,7,8,7,7,7,7,7,7,8,7,7,6,8,7,8,8,8,7,8,8,7,8,8,8,8,7,8,7,8,7,8,8,8,8,8,8,7,8,8,8,7,1,4,6,8,7,8,8,8,7,8,8,7,8,8,8,8,7,8,7,8,7,8,8,8,8,8,8,7,7,8,8,8,7,},
    {10,9,9,9,8,9,9,9,9,8,8,10,8,10,9,8,10,9,9,9,9,9,9,9,8,10,10,7,8,9,9,8,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,8,10,10,9,9,9,9,10,9,10,10,9,9,8,3,6,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,8,10,10,9,9,9,9,10,9,10,9,10,9,9,8,},
    {8,5,8,8,5,8,6,8,7,4,6,8,4,8,7,7,8,7,8,8,8,8,6,8,7,8,8,4,4,8,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,6,7,5,5,8,6,8,8,5,6,4,1,4,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,6,7,5,5,8,6,8,7,8,6,5,4,},
    {10,10,9,9,9,9,10,9,10,9,9,10,9,10,9,9,10,9,9,9,9,9,10,9,9,10,10,9,9,10,9,9,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,10,10,10,10,10,10,10,10,10,10,10,9,3,6,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,10,10,10,10,10,10,10,10,9,10,10,10,9,},
    {9,9,8,8,8,8,9,8,9,8,8,8,8,8,7,8,9,8,8,8,8,8,9,8,8,8,8,8,8,9,8,8,8,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,8,9,8,9,9,9,9,9,9,8,9,9,9,8,2,5,8,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,8,9,8,9,9,9,9,9,9,8,8,9,9,9,8,},
    {9,9,9,9,9,9,9,9,8,9,9,8,9,9,7,9,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,8,9,8,8,8,9,8,8,9,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,9,8,7,9,2,5,8,8,9,8,8,8,9,8,8,9,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,9,9,7,7,9,},
    {9,9,8,9,9,7,9,9,9,9,9,6,9,6,6,9,8,9,8,7,9,9,9,9,9,9,9,9,9,9,9,9,7,8,9,8,8,8,9,8,8,5,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,9,9,8,8,2,5,7,8,9,8,8,8,9,8,8,5,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,8,9,8,8,9,},
    {9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,8,8,9,8,9,9,8,7,9,2,5,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,8,8,9,8,9,9,9,7,7,9,},
    {10,9,9,10,9,10,9,9,9,9,8,10,8,10,9,9,9,9,10,9,10,9,9,10,9,10,10,8,9,10,9,9,9,9,9,9,9,9,9,9,9,10,9,9,9,9,9,9,9,9,10,9,9,8,8,9,8,10,10,9,8,8,3,6,9,9,9,9,9,9,9,9,9,10,9,9,9,9,9,9,9,9,10,9,9,8,8,9,8,10,9,10,8,8,9,},
    {8,7,8,8,7,8,7,8,7,7,8,7,8,8,6,8,7,7,8,8,8,8,7,8,7,8,8,7,8,7,7,8,7,7,8,7,7,7,8,7,7,8,7,7,7,7,8,7,8,7,8,7,7,7,7,7,7,7,8,7,7,8,1,4,7,7,8,7,7,7,8,7,7,8,7,7,7,7,8,7,8,7,8,7,7,7,7,7,7,7,8,8,7,7,7,},
    {9,9,8,9,9,6,9,8,9,9,7,7,6,7,6,9,9,9,8,6,9,9,9,9,9,7,7,6,6,9,9,8,7,9,8,9,9,9,9,9,9,6,9,9,9,9,9,9,8,9,9,9,9,9,9,9,9,8,9,9,9,7,2,5,7,9,8,9,9,9,9,9,9,6,9,9,9,9,9,9,8,9,9,9,9,9,9,9,9,8,8,9,9,9,9,},
    {10,10,9,9,9,9,10,9,10,9,9,9,9,9,8,9,10,9,9,9,9,9,10,9,9,9,9,9,9,10,9,9,8,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,9,10,10,10,10,10,10,9,10,10,10,9,3,6,8,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,9,10,10,10,10,10,10,9,9,10,10,10,9,},
    {9,9,6,8,8,6,9,7,9,8,7,6,7,6,5,7,9,8,7,6,8,7,9,8,7,7,7,7,7,9,8,7,6,9,7,9,9,9,7,9,9,6,9,9,9,9,7,9,7,9,8,9,9,9,9,9,9,8,9,9,9,7,2,5,6,9,7,9,9,9,7,9,9,6,9,9,9,9,7,9,7,9,8,9,9,9,9,9,9,8,8,9,9,9,8,},
    {12,12,10,11,11,10,12,10,12,11,10,9,10,9,8,11,12,11,10,10,11,11,12,11,11,10,10,10,10,12,11,10,9,12,10,12,12,12,11,12,12,9,12,12,12,12,11,12,10,12,11,12,12,12,12,12,12,11,12,12,12,10,5,8,9,12,10,12,12,12,11,12,12,9,12,12,12,12,11,12,10,12,11,12,12,12,12,12,12,11,11,12,12,12,11,},
    {9,9,8,8,8,8,9,8,9,8,7,9,7,9,8,7,9,8,8,8,8,8,9,8,7,9,9,6,7,9,8,7,9,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,7,9,9,9,9,9,9,9,9,9,9,9,9,7,2,5,9,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,7,9,9,9,9,9,9,9,9,9,8,9,9,9,8,},
    {9,9,6,8,8,6,9,7,9,8,7,7,7,7,6,7,9,8,7,6,8,7,9,8,7,7,7,7,7,9,8,7,7,9,7,9,9,9,7,9,9,6,9,9,9,9,7,9,7,9,8,9,9,9,9,9,9,8,9,9,9,6,2,5,7,9,7,9,9,9,7,9,9,6,9,9,9,9,7,9,7,9,8,9,9,9,9,9,9,8,8,9,9,9,8,},
    {8,8,8,8,8,8,8,8,8,8,6,8,6,8,7,7,8,8,8,8,8,8,8,8,7,8,8,6,7,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,6,1,4,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,7,8,8,8,8,},
    {5,5,3,3,4,3,5,3,5,4,3,5,3,3,5,3,5,4,3,3,4,3,5,4,3,3,5,3,3,5,4,3,3,5,3,5,5,5,3,5,5,3,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,4,5,5,5,3,0,1,3,5,3,5,5,5,3,5,5,3,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,4,4,5,5,5,4,},
    {5,3,4,5,3,5,4,4,6,3,4,6,4,5,6,4,5,4,5,4,5,4,3,5,4,5,6,3,4,5,4,4,5,5,4,5,5,5,4,5,5,5,5,5,5,5,4,5,4,5,5,3,4,2,2,5,3,5,6,2,6,4,0,2,5,5,4,5,5,5,4,5,5,5,5,5,5,5,4,5,4,5,5,3,4,2,2,5,3,5,5,6,6,2,3,},
    {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0,1,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,},
    {7,7,6,7,7,7,7,8,7,7,8,5,8,5,6,8,7,7,6,7,7,8,6,7,7,8,8,7,8,7,6,8,6,7,8,7,7,7,8,7,7,4,7,7,7,7,8,7,8,7,7,6,7,6,6,5,5,6,8,6,6,8,1,4,6,7,8,7,7,7,8,7,7,4,7,7,7,7,8,7,8,7,7,6,7,6,6,5,5,6,7,8,6,5,7,},
    {4,2,0,0,0,0,5,3,3,2,0,4,3,4,1,0,2,0,0,0,0,0,0,0,0,4,4,1,0,1,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1,2,0,7,3,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,7,2,1,3,},
    {1,0,0,0,0,0,2,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,},
    {9,7,8,8,7,8,7,8,8,7,8,9,8,9,8,8,9,8,8,8,8,8,7,8,7,9,9,7,8,8,8,8,9,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,8,9,9,7,7,7,7,9,7,9,9,7,7,8,2,5,9,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,8,9,9,7,7,7,7,9,7,9,8,9,7,7,7,},
    {10,9,10,10,9,10,9,10,9,9,9,10,9,10,9,10,9,9,10,10,10,10,9,10,9,10,10,8,10,10,9,10,9,9,10,9,9,9,10,9,9,10,9,9,9,9,10,9,10,9,10,9,9,8,8,9,8,10,10,9,8,9,3,6,9,9,10,9,9,9,10,9,9,10,9,9,9,9,10,9,10,9,10,9,9,8,8,9,8,10,10,10,8,8,9,},
    {8,8,8,8,8,8,8,8,8,8,6,8,4,8,7,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,6,1,4,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,},
    {9,9,9,9,9,9,9,9,8,9,9,8,9,9,7,9,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,8,9,8,8,8,9,8,8,9,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,9,8,7,9,2,5,8,8,9,8,8,8,9,8,8,9,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,9,9,7,7,9,},
    {8,8,8,8,8,8,8,8,8,8,7,8,7,8,7,8,8,8,8,8,8,8,8,8,8,8,8,7,7,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,7,1,4,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,7,8,8,8,8,},
    {8,8,7,8,8,7,8,7,8,8,7,5,7,5,5,8,8,8,7,7,8,8,8,8,8,7,7,7,7,8,8,7,6,8,7,8,8,8,8,8,8,6,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,7,8,8,8,7,1,4,6,8,7,8,8,8,8,8,8,6,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,7,7,8,8,8,8,},
    {8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,1,4,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,},
    {10,10,9,9,9,9,10,9,10,9,9,10,9,10,9,9,10,9,9,9,9,9,10,9,9,10,10,9,9,10,9,9,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,10,10,10,10,10,10,10,10,10,10,10,9,3,6,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,10,10,10,10,10,10,10,10,9,10,10,10,9,},
    {5,5,4,4,4,4,5,4,5,4,4,5,4,5,4,4,5,4,4,4,4,4,5,4,4,5,5,4,4,5,4,4,5,5,4,5,5,5,4,5,5,4,5,5,5,5,4,5,4,5,5,5,5,5,5,5,5,5,5,5,5,4,0,1,5,5,4,5,5,5,4,5,5,4,5,5,5,5,4,5,4,5,5,5,5,5,5,5,5,5,4,5,5,5,4,},
    {8,8,7,7,7,7,8,7,8,7,7,7,7,7,6,7,8,7,7,7,7,7,8,7,7,7,7,7,7,8,7,7,6,8,7,8,8,8,7,8,8,7,8,8,8,8,7,8,7,8,7,8,8,8,8,8,8,7,8,8,8,7,1,4,6,8,7,8,8,8,7,8,8,7,8,8,8,8,7,8,7,8,7,8,8,8,8,8,8,7,7,8,8,8,7,},
    {10,9,9,9,8,9,9,9,9,8,8,10,8,10,9,8,10,9,9,9,9,9,9,9,8,10,10,7,8,9,9,8,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,8,10,10,9,9,9,9,10,9,10,10,9,9,8,3,6,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,8,10,10,9,9,9,9,10,9,10,9,10,9,9,8,},
    {8,5,8,8,5,8,6,8,7,4,6,8,4,8,7,7,8,7,8,8,8,8,6,8,7,8,8,4,4,8,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,6,7,5,5,8,6,8,8,5,6,4,1,4,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,6,7,5,5,8,6,8,7,8,6,5,4,},
    {10,10,9,9,9,9,10,9,10,9,9,10,9,10,9,9,10,9,9,9,9,9,10,9,9,10,10,9,9,10,9,9,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,10,10,10,10,10,10,10,10,10,10,10,9,3,6,10,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,10,10,10,10,10,10,10,10,9,10,10,10,9,},
    {9,9,8,8,8,8,9,8,9,8,8,8,8,8,7,8,9,8,8,8,8,8,9,8,8,8,8,8,8,9,8,8,8,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,8,9,8,9,9,9,9,9,9,8,9,9,9,8,2,5,8,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,8,9,8,9,9,9,9,9,9,8,8,9,9,9,8,},
    {9,9,9,9,9,9,9,9,8,9,9,8,9,9,7,9,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,8,9,8,8,8,9,8,8,9,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,9,8,7,9,2,5,8,8,9,8,8,8,9,8,8,9,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,9,9,7,7,9,},
    {9,9,8,9,9,7,9,9,9,9,9,6,9,6,6,9,8,9,8,7,9,9,9,9,9,9,9,9,9,9,9,9,7,8,9,8,8,8,9,8,8,5,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,9,9,8,8,2,5,7,8,9,8,8,8,9,8,8,5,8,8,9,9,9,8,9,8,9,9,8,8,8,8,8,8,8,9,8,8,9,},
    {9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,8,8,9,8,9,9,8,7,9,2,5,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,8,8,9,8,9,9,9,7,7,9,},
    {10,9,9,10,9,10,9,9,9,9,8,10,8,10,9,9,9,9,10,9,10,9,9,10,9,10,10,8,9,10,9,9,9,9,9,9,9,9,9,9,9,10,9,9,9,9,9,9,9,9,10,9,9,8,8,9,8,10,10,9,8,8,3,6,9,9,9,9,9,9,9,9,9,10,9,9,9,9,9,9,9,9,10,9,9,8,8,9,8,10,9,10,8,8,9,},
    {8,7,8,8,7,8,7,8,7,7,8,7,8,8,6,8,7,7,8,8,8,8,7,8,7,8,8,7,8,7,7,8,7,7,8,7,7,7,8,7,7,8,7,7,7,7,8,7,8,7,8,7,7,7,7,7,7,7,8,7,7,8,1,4,7,7,8,7,7,7,8,7,7,8,7,7,7,7,8,7,8,7,8,7,7,7,7,7,7,7,8,8,7,7,7,},
    {9,9,8,9,9,6,9,8,9,9,7,7,6,7,6,9,9,9,8,6,9,9,9,9,9,7,7,6,6,9,9,8,7,9,8,9,9,9,9,9,9,6,9,9,9,9,9,9,8,9,9,9,9,9,9,9,9,8,9,9,9,7,2,5,7,9,8,9,9,9,9,9,9,6,9,9,9,9,9,9,8,9,9,9,9,9,9,9,9,8,8,9,9,9,9,},
    {10,10,9,9,9,9,10,9,10,9,9,9,9,9,8,9,10,9,9,9,9,9,10,9,9,9,9,9,9,10,9,9,8,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,9,10,10,10,10,10,10,9,10,10,10,9,3,6,8,10,9,10,10,10,9,10,10,9,10,10,10,10,9,10,9,10,9,10,10,10,10,10,10,9,9,10,10,10,9,},
    {9,9,6,8,8,6,9,7,9,8,7,6,7,6,5,7,9,8,7,6,8,7,9,8,7,7,7,7,7,9,8,7,6,9,7,9,9,9,7,9,9,6,9,9,9,9,7,9,7,9,8,9,9,9,9,9,9,8,9,9,9,7,2,5,6,9,7,9,9,9,7,9,9,6,9,9,9,9,7,9,7,9,8,9,9,9,9,9,9,8,8,9,9,9,8,},
    {12,12,10,11,11,10,12,10,12,11,10,9,10,9,8,11,12,11,10,10,11,11,12,11,11,10,10,10,10,12,11,10,9,12,10,12,12,12,11,12,12,9,12,12,12,12,11,12,10,12,11,12,12,12,12,12,12,11,12,12,12,10,5,8,9,12,10,12,12,12,11,12,12,9,12,12,12,12,11,12,10,12,11,12,12,12,12,12,12,11,11,12,12,12,11,},
    {9,9,8,8,8,8,9,8,9,8,7,9,7,9,8,7,9,8,8,8,8,8,9,8,7,9,9,6,7,9,8,7,9,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,7,9,9,9,9,9,9,9,9,9,9,9,9,7,2,5,9,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,7,9,9,9,9,9,9,9,9,9,8,9,9,9,8,},
    {9,9,6,8,8,6,9,7,9,8,7,7,7,7,6,7,9,8,7,6,8,7,9,8,7,7,7,7,7,9,8,7,7,9,7,9,9,9,7,9,9,6,9,9,9,9,7,9,7,9,8,9,9,9,9,9,9,8,9,9,9,6,2,5,7,9,7,9,9,9,7,9,9,6,9,9,9,9,7,9,7,9,8,9,9,9,9,9,9,8,8,9,9,9,8,},
    {8,8,8,8,8,8,8,8,8,8,6,8,6,8,7,7,8,8,8,8,8,8,8,8,7,8,8,6,7,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,8,6,1,4,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,7,8,8,8,8,},
    {5,5,3,3,4,3,5,3,5,4,3,5,3,3,5,3,5,4,3,3,4,3,5,4,3,3,5,3,3,5,4,3,3,5,3,5,5,5,3,5,5,3,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,4,5,5,5,3,0,1,3,5,3,5,5,5,3,5,5,3,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,4,4,5,5,5,4,},
    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,},
    {4,4,4,4,4,5,4,5,4,4,4,4,4,4,4,5,4,4,4,5,4,5,4,5,4,4,4,4,5,4,4,5,4,4,5,4,4,4,5,4,4,4,4,4,4,4,5,4,5,4,5,4,4,4,4,4,4,4,5,4,4,4,0,1,4,4,5,4,4,4,5,4,4,4,4,4,4,4,5,4,5,4,5,4,4,4,4,4,4,4,5,5,4,4,4,},
    {5,5,2,3,4,1,5,2,5,4,0,3,2,3,1,3,5,4,3,0,4,3,5,4,3,3,3,0,0,5,4,2,2,5,2,5,5,5,3,5,5,2,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,4,5,5,5,3,0,2,2,5,2,5,5,5,3,5,5,2,5,5,5,5,3,5,3,5,4,5,5,5,5,5,5,4,4,5,5,5,4,},
    {4,4,3,4,4,1,4,3,4,4,3,1,3,1,1,4,3,4,3,2,4,4,4,4,4,4,4,3,4,4,4,4,2,3,4,3,3,3,4,3,3,0,3,3,3,4,4,3,4,3,4,4,3,3,3,3,3,3,4,4,3,2,0,0,2,3,4,3,3,3,4,3,3,0,3,3,3,4,4,3,4,3,4,4,3,3,3,3,3,3,3,4,3,3,4,},
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

