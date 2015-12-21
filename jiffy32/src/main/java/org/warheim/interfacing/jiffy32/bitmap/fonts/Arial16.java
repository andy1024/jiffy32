package org.warheim.interfacing.jiffy32.bitmap.fonts;
// coding=utf-8
// Module arial_16
// generated from Arial 12pt

public class Arial16 extends Font {
	public Arial16() {
		super("Arial 16", '!', (char)127, 16, 8, 2, "Arial16.bin");
	}


	private static final int[][] descriptors = {
    {1,0},// !
    {4,16},// "
    {9,32},// #
    {7,64},// $
    {12,80},// %
    {9,112},// &
    {1,144},// '
    {3,160},// {
    {3,176},// }
    {5,192},// *
    {7,208},// +
    {1,224},// ,
    {4,240},// -
    {1,256},// .
    {4,272},// /
    {7,288},// 0
    {4,304},// 1
    {7,320},// 2
    {7,336},// 3
    {8,352},// 4
    {7,368},// 5
    {7,384},// 6
    {7,400},// 7
    {7,416},// 8
    {7,432},// 9
    {1,448},// :
    {1,464},// ;
    {7,480},// <
    {7,496},// =
    {7,512},// >
    {7,528},// ?
    {15,544},// @
    {9,576},// A
    {9,608},// B
    {10,640},// C
    {10,672},// D
    {9,704},// E
    {8,736},// F
    {10,752},// G
    {9,784},// H
    {1,816},// I
    {6,832},// J
    {9,848},// K
    {7,880},// L
    {11,896},// M
    {9,928},// N
    {10,960},// O
    {9,992},// P
    {10,1024},// Q
    {9,1056},// R
    {9,1088},// S
    {9,1120},// T
    {9,1152},// U
    {9,1184},// V
    {15,1216},// W
    {11,1248},// X
    {9,1280},// Y
    {9,1312},// Z
    {3,1344},// [
    {4,1360},// \
    {3,1376},// ]
    {7,1392},// ^
    {9,1408},// _
    {2,1440},// `
    {7,1456},// a
    {7,1472},// b
    {6,1488},// c
    {7,1504},// d
    {7,1520},// e
    {4,1536},// f
    {7,1552},// g
    {6,1568},// h
    {1,1584},// i
    {3,1600},// j
    {7,1616},// k
    {1,1632},// l
    {11,1648},// m
    {6,1680},// n
    {7,1696},// o
    {7,1712},// p
    {7,1728},// q
    {4,1744},// r
    {6,1760},// s
    {4,1776},// t
    {6,1792},// u
    {7,1808},// v
    {11,1824},// w
    {7,1856},// x
    {7,1872},// y
    {7,1888},// z
    {5,1904},// {
    {1,1920},// |
    {5,1936},// }
    {8,1952},// ~
    {4,1968},// °
};

	private static final byte[][] kerning = {
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
    {4,4,2,4,4,3,4,3,4,4,1,3,0,3,2,4,4,4,4,1,4,4,4,4,4,4,4,0,0,4,4,3,1,4,4,4,4,4,4,4,4,0,4,4,4,4,4,4,4,4,4,4,4,4,4,3,4,3,4,4,4,3,0,4,2,4,2,2,2,4,2,4,4,2,4,4,4,4,2,4,2,4,3,4,4,4,4,4,4,4,2,4,4,0,4,},
    {9,8,9,9,9,9,8,9,8,8,7,8,9,8,8,9,7,8,8,9,9,9,8,9,9,8,8,7,9,8,8,9,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,8,9,8,8,7,8,7,9,8,8,8,0,8,9,9,9,9,9,8,9,9,9,7,9,9,9,9,9,9,9,9,9,8,9,9,9,8,9,7,7,9,8,7,8,},
    {7,7,7,7,7,7,7,7,6,7,6,6,7,6,6,7,6,7,7,7,7,7,6,7,7,6,6,6,7,7,7,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,6,7,7,7,5,6,5,7,7,6,5,0,6,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,6,6,7,5,6,5,6,5,7,7,6,6,7,},
    {12,9,12,12,9,12,11,12,10,8,11,11,12,11,12,12,9,11,12,12,12,12,10,12,12,11,11,11,12,12,9,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,9,12,10,10,11,9,11,12,10,10,7,3,10,12,12,12,12,12,11,12,12,12,10,12,12,12,12,12,12,12,12,12,11,12,10,11,11,11,11,12,12,10,11,8,},
    {9,6,8,7,6,9,8,9,8,6,6,9,8,9,9,9,6,9,8,9,7,9,7,9,7,9,9,8,8,7,6,9,9,9,9,9,9,9,9,9,9,8,9,9,9,9,9,9,9,9,7,5,9,7,7,9,5,9,9,7,7,5,0,7,8,9,9,9,9,8,9,9,9,7,9,9,9,9,9,9,9,9,8,8,9,7,8,9,8,9,9,9,7,4,6,},
    {1,1,0,1,1,0,1,0,1,1,0,0,0,0,0,1,1,1,1,0,1,1,1,1,1,1,1,0,0,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,0,0,1,0,1,0,0,0,1,0,1,1,0,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,1,0,1,},
    {3,3,1,2,2,1,3,1,3,2,1,2,1,2,2,2,2,2,2,1,2,2,3,2,2,2,2,1,1,2,2,1,2,3,2,3,3,3,2,3,3,1,3,3,3,3,2,3,2,3,2,3,3,3,3,2,3,2,3,3,3,1,3,3,1,3,1,1,1,2,2,3,3,3,3,3,2,2,1,3,1,2,1,2,2,2,2,2,2,2,1,3,3,1,2,},
    {3,2,3,3,3,3,2,3,1,2,3,2,3,2,3,3,2,2,3,3,3,3,1,3,3,2,2,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,2,2,2,1,2,3,2,1,3,1,1,3,3,3,3,3,2,3,3,3,1,3,3,3,3,3,3,3,3,3,2,3,3,3,2,3,2,3,3,1,3,2,},
    {5,5,4,4,5,4,5,4,4,5,1,4,1,4,2,4,4,4,4,1,4,4,3,4,4,4,4,1,4,4,4,3,2,5,4,5,5,5,4,5,5,0,5,5,5,5,4,5,4,5,4,3,5,5,5,3,4,2,5,5,3,3,0,4,3,5,3,3,3,4,3,5,4,2,5,5,4,4,3,4,3,4,4,4,4,4,4,4,4,4,3,5,3,0,5,},
    {7,4,5,4,4,6,6,7,5,3,7,6,4,6,6,7,4,2,4,6,4,7,4,6,6,6,6,7,4,4,4,7,5,7,7,7,7,7,7,7,7,4,7,7,7,7,7,7,7,7,4,3,7,5,5,3,3,3,7,5,5,4,0,5,4,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,6,6,5,6,4,5,7,5,7,3,},
    {1,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,1,1,1,0,1,1,0,1,1,1,1,0,1,0,1,0,0,0,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,0,1,1,1,0,1,1,1,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,},
    {4,0,4,1,0,4,3,4,2,0,1,3,4,3,3,4,1,1,0,4,0,4,1,4,0,3,3,1,4,3,1,4,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,4,1,2,1,0,2,4,2,2,0,0,2,4,4,4,4,4,3,4,4,4,2,4,4,4,4,4,4,4,4,0,3,4,2,3,2,2,2,2,4,2,0,0,},
    {1,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,1,1,1,0,1,1,0,1,1,1,1,0,1,0,1,0,0,0,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,1,1,1,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,},
    {4,4,3,3,4,3,4,3,4,4,2,3,2,3,1,3,3,3,3,2,3,3,4,3,3,3,3,2,3,3,3,3,1,4,3,4,4,4,3,4,4,2,4,4,4,4,3,4,3,4,3,4,4,4,4,3,4,3,4,4,4,3,0,4,3,4,3,3,3,3,3,4,4,2,4,4,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,4,4,2,4,},
    {7,7,7,7,7,7,7,7,6,6,7,6,7,6,6,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,7,6,6,5,6,5,7,6,5,7,0,5,7,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,7,7,},
    {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0,4,4,4,4,4,4,4,4,4,4,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,},
    {7,7,7,7,7,6,7,7,6,6,6,7,4,7,7,7,7,7,7,5,7,7,6,7,7,7,7,6,7,7,7,6,7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,6,7,6,6,7,6,7,7,6,6,6,0,6,6,7,6,6,6,7,6,7,7,5,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,5,7,6,6,7,},
    {7,6,7,7,6,7,6,7,5,6,6,6,7,6,6,7,6,6,7,7,7,7,5,7,7,6,6,6,7,7,6,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,7,6,6,5,5,5,7,6,5,5,0,5,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,6,6,7,6,6,6,6,6,7,7,5,6,6,},
    {8,7,8,7,7,8,7,8,7,7,7,7,8,7,7,8,7,7,7,8,7,8,7,8,7,7,7,7,8,7,7,8,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,7,8,7,7,7,7,7,8,7,7,7,0,7,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,7,7,8,7,7,7,7,7,7,8,7,7,7,},
    {7,7,7,7,6,7,7,7,7,5,7,6,7,6,6,7,4,5,7,7,7,7,7,7,7,6,6,7,7,7,5,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,6,7,6,7,7,7,6,0,7,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,6,6,5,6,5,7,7,7,7,6,},
    {7,7,7,7,7,7,7,7,6,6,7,6,7,6,6,7,6,7,7,7,7,7,5,7,7,6,6,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,7,6,6,5,6,5,7,6,5,6,0,5,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,6,6,5,6,5,7,7,5,7,7,},
    {7,7,5,6,6,5,7,5,7,6,4,6,4,6,4,6,5,6,6,4,6,6,7,6,6,6,6,4,5,5,6,4,3,7,5,7,7,7,5,7,7,4,7,7,7,7,5,7,5,7,6,7,7,7,7,6,7,6,7,7,7,4,0,7,4,7,4,4,4,5,4,7,7,5,7,7,5,5,4,5,4,5,5,5,5,5,5,5,5,5,4,7,7,4,6,},
    {7,7,7,7,7,7,7,7,6,6,6,6,7,6,6,7,7,7,7,7,7,7,5,7,7,7,7,6,7,7,7,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,7,6,6,5,6,5,7,6,5,6,0,5,7,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,5,6,7,},
    {7,7,7,7,7,7,7,7,6,6,7,6,7,6,6,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,7,6,6,5,6,5,7,6,5,7,0,5,7,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,7,7,},
    {1,1,0,1,1,0,1,0,0,0,0,1,0,1,1,1,1,1,0,0,1,1,0,1,1,1,1,0,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,1,0,1,1,0,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,0,0,0,},
    {1,1,0,1,1,0,1,0,0,0,0,1,0,1,1,1,1,1,0,0,1,1,0,1,1,1,1,0,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,0,0,0,},
    {7,7,6,7,7,7,7,7,6,6,4,6,6,6,6,7,7,5,7,6,7,7,5,7,7,7,7,3,6,7,7,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,6,6,5,5,5,7,6,5,6,0,5,7,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,5,7,5,2,6,},
    {7,3,7,7,7,7,6,7,5,6,4,6,7,6,6,7,4,4,3,7,7,7,4,7,7,6,6,4,7,6,4,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,6,3,7,6,6,4,4,5,7,6,5,6,0,5,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,7,7,6,7,5,5,7,5,0,3,},
    {7,3,5,5,5,6,6,7,5,3,7,6,4,6,6,7,4,2,4,6,6,7,4,6,6,6,6,7,4,3,3,7,5,7,7,7,7,7,7,7,7,4,7,7,7,7,7,7,7,7,4,3,7,5,5,3,3,3,7,5,5,6,0,5,6,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,6,6,5,6,3,6,7,5,7,3,},
    {7,7,7,7,7,6,7,7,6,6,5,6,4,6,5,7,7,7,7,4,7,7,5,7,7,7,7,5,7,7,7,6,5,7,7,7,7,7,7,7,7,4,7,7,7,7,7,7,7,7,7,5,7,6,6,4,6,4,7,6,5,6,0,5,6,7,6,6,6,7,6,7,7,5,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,5,7,5,5,7,},
    {15,14,15,15,15,15,14,15,14,14,15,15,15,14,14,15,14,14,14,15,15,15,12,15,15,14,15,15,15,14,14,15,14,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,14,11,15,14,14,12,13,13,15,14,13,15,12,13,15,15,15,15,15,14,15,15,15,13,15,15,15,15,15,15,15,15,15,14,15,15,15,14,15,14,15,15,13,15,14,},
    {9,6,8,8,7,8,8,9,8,6,7,9,8,9,9,8,6,9,9,8,8,8,7,8,8,9,9,7,8,8,6,9,9,9,8,9,9,9,8,9,9,9,9,9,9,9,8,9,8,9,8,5,8,6,6,9,5,9,9,6,7,7,0,7,9,9,8,8,8,8,8,9,9,7,9,9,9,9,8,9,8,9,9,8,9,7,7,9,7,9,8,9,7,7,6,},
    {9,9,9,9,9,9,9,9,8,8,8,8,9,8,8,9,9,9,9,9,9,9,8,9,9,9,9,8,9,9,9,9,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,9,8,8,7,8,7,9,8,8,8,0,8,9,9,9,9,9,9,9,9,9,7,9,9,9,9,9,9,9,9,8,9,9,9,9,9,9,9,9,9,8,8,9,},
    {10,10,9,10,10,10,10,10,9,9,7,9,6,9,9,10,9,10,10,6,10,10,8,10,10,9,9,4,3,10,10,10,9,10,9,10,10,10,9,10,10,10,10,10,10,10,9,10,9,10,10,8,10,9,9,8,9,8,10,9,8,8,1,8,10,10,10,10,10,9,10,10,10,8,10,10,10,10,10,10,10,10,9,9,10,8,9,8,8,8,8,10,8,2,10,},
    {10,10,10,10,10,10,10,10,9,9,10,9,10,9,9,10,10,9,9,10,10,10,7,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,9,9,7,8,8,10,9,8,10,1,8,10,10,10,10,10,10,10,10,10,8,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,8,10,9,},
    {9,9,8,7,8,7,9,8,9,7,5,9,5,9,9,8,6,9,7,6,8,8,9,7,8,9,9,7,2,4,7,8,9,9,8,9,9,9,8,9,9,8,9,9,9,9,8,9,8,9,7,9,9,9,9,9,9,9,9,9,9,8,0,9,8,9,8,8,8,8,8,9,9,7,9,9,9,9,8,9,8,9,8,8,8,7,7,9,8,9,7,9,9,7,8,},
    {8,8,5,6,7,6,8,7,8,6,7,7,4,7,6,7,5,6,6,6,7,7,8,6,6,7,7,7,1,1,6,7,5,8,7,8,8,8,7,8,8,3,8,8,8,8,7,8,7,8,6,8,8,8,8,7,8,7,8,8,8,5,0,8,3,8,7,7,7,6,7,8,8,6,8,8,7,7,7,7,7,7,7,6,7,6,6,5,6,3,5,8,8,7,7,},
    {10,9,10,9,9,10,9,10,8,8,10,9,10,9,9,10,8,9,9,10,9,10,7,10,9,9,9,10,10,9,9,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,9,7,10,8,8,7,8,8,10,8,8,7,1,8,10,10,10,10,10,9,10,10,10,8,10,10,10,10,10,10,10,10,10,9,10,9,9,8,9,8,10,10,8,10,9,},
    {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,0,9,9,9,9,9,9,9,9,9,9,7,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
    {6,6,6,6,6,6,6,6,6,6,6,5,6,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,5,6,5,6,6,6,6,0,6,6,6,6,6,6,6,6,6,6,4,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,},
    {9,9,8,7,8,7,9,8,9,8,5,9,7,9,9,7,6,9,8,7,8,7,9,7,7,9,9,5,7,7,7,8,9,9,7,9,9,9,7,9,9,8,9,9,9,9,7,9,7,9,7,9,9,9,9,9,9,9,9,9,9,6,0,9,8,9,7,7,7,8,7,9,9,7,9,9,9,9,7,9,7,9,8,8,8,6,7,9,6,9,7,9,9,5,8,},
    {7,3,6,5,4,5,6,6,6,2,1,7,3,7,7,5,4,7,5,1,5,5,5,5,5,7,7,1,1,1,4,6,7,7,4,7,7,7,4,7,7,6,7,7,7,7,4,7,4,7,5,3,5,3,4,7,3,7,7,4,5,1,0,5,6,7,5,5,5,6,5,7,7,5,7,7,7,7,5,7,5,7,6,6,6,4,5,7,4,7,5,7,5,1,3,},
    {11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,2,11,11,11,11,11,11,11,11,11,11,9,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,},
    {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,0,9,9,9,9,9,9,9,9,9,9,7,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,},
    {10,10,10,10,10,10,10,10,9,9,10,9,10,9,9,10,10,9,9,10,10,10,7,10,10,10,10,10,10,10,10,10,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,9,9,7,8,8,10,9,8,10,1,8,10,10,10,10,10,10,10,10,10,8,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,8,10,9,},
    {9,9,9,9,9,8,9,9,8,8,7,8,5,8,7,9,9,9,9,6,9,9,7,9,9,9,9,7,9,9,9,8,7,9,9,9,9,9,9,9,9,4,9,9,9,9,9,9,9,9,9,7,9,8,8,6,8,6,9,8,7,8,0,7,8,9,8,8,8,9,8,9,9,7,9,9,9,9,8,9,8,9,9,9,9,9,9,9,9,9,7,9,7,7,9,},
    {10,10,10,10,10,10,10,10,9,9,10,10,10,10,10,10,10,10,10,10,10,10,8,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,7,10,9,9,10,8,10,10,9,8,10,1,8,10,10,10,10,10,10,10,10,10,8,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,8,10,9,},
    {9,9,9,9,9,8,9,9,8,8,7,9,7,9,9,9,9,9,9,7,9,9,7,9,9,9,9,7,9,9,9,8,9,9,9,9,9,9,9,9,9,8,9,9,9,9,9,9,9,9,9,7,9,8,8,9,8,9,9,8,7,8,0,7,8,9,8,8,8,9,8,9,9,7,9,9,9,9,8,9,8,9,9,9,9,9,9,9,9,9,7,9,7,7,9,},
    {9,9,9,9,9,9,9,9,8,8,8,8,9,8,8,9,8,9,9,9,9,9,7,9,9,8,8,8,9,9,9,9,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,7,9,8,8,7,8,7,9,8,7,7,0,7,9,9,9,9,9,8,9,9,9,7,9,9,9,9,9,9,9,9,8,8,9,7,8,7,8,7,9,9,7,8,9,},
    {9,9,6,7,8,7,9,7,9,7,5,8,5,8,6,7,6,7,7,5,8,7,9,7,7,8,8,5,5,5,7,5,5,9,6,9,9,9,6,9,9,5,9,9,9,9,6,9,6,9,7,9,9,9,9,8,9,8,9,9,9,6,0,9,5,9,5,5,5,7,5,9,9,7,9,9,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6,9,9,5,8,},
    {9,9,9,9,9,9,9,9,9,9,9,8,9,8,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,8,9,8,9,9,9,9,0,9,9,9,9,9,9,9,9,9,9,7,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,},
    {9,9,8,8,9,8,9,8,9,9,7,8,6,8,6,8,8,8,8,7,8,8,9,8,8,8,8,7,8,8,8,7,6,9,8,9,9,9,8,9,9,6,9,9,9,9,8,9,8,9,8,9,9,9,9,8,9,8,9,9,9,7,0,9,7,9,7,7,7,8,7,9,9,7,9,9,8,8,7,8,7,8,8,8,8,8,8,8,8,8,7,9,9,7,9,},
    {15,15,14,14,15,14,15,14,15,15,13,14,13,14,12,14,14,14,14,13,14,14,15,14,14,14,14,13,14,14,14,14,12,15,14,15,15,15,14,15,15,13,15,15,15,15,14,15,14,15,14,15,15,15,15,14,15,14,15,15,15,14,6,15,14,15,14,14,14,14,14,15,15,13,15,15,14,14,14,14,14,14,14,14,14,14,14,14,14,14,13,15,15,13,15,},
    {11,10,10,9,9,9,10,10,10,9,7,11,8,11,11,9,8,11,10,8,9,9,10,9,9,11,11,7,8,9,8,10,11,11,8,11,11,11,8,11,11,10,11,11,11,11,8,11,8,11,9,10,10,10,10,11,10,11,11,10,10,7,2,10,10,11,9,9,9,10,9,11,11,9,11,11,11,11,9,11,9,11,10,10,10,8,9,11,8,11,9,11,10,7,9,},
    {9,9,6,8,8,7,9,7,9,8,5,8,5,8,6,8,7,8,8,5,8,8,9,8,8,8,8,5,6,7,8,6,5,9,7,9,9,9,7,9,9,5,9,9,9,9,7,9,7,9,8,9,9,9,9,8,9,8,9,9,9,6,0,9,6,9,6,6,6,7,6,9,9,7,9,9,7,7,6,7,6,7,6,7,7,7,7,7,7,7,6,9,9,5,8,},
    {9,9,8,7,8,7,9,8,9,8,5,9,5,9,9,7,7,9,7,4,8,7,9,7,7,9,9,5,6,7,7,8,9,9,7,9,9,9,7,9,9,8,9,9,9,9,7,9,7,9,7,9,9,9,9,9,9,9,9,9,9,6,0,9,8,9,7,7,7,8,7,9,9,7,9,9,9,9,7,9,7,9,8,8,8,7,7,9,7,9,7,9,9,5,8,},
    {3,3,1,1,2,1,3,1,3,1,1,2,1,2,1,1,1,1,1,1,2,1,3,1,1,2,2,1,1,1,1,1,1,3,1,3,3,3,1,3,3,1,3,3,3,3,1,3,1,3,1,3,3,3,3,2,3,2,3,3,3,1,3,3,1,3,1,1,1,1,2,3,3,3,3,3,1,1,1,3,1,1,1,1,1,1,1,1,2,1,1,3,3,1,2,},
    {4,2,3,3,2,3,3,4,3,1,3,4,3,4,4,3,2,4,4,3,3,3,2,3,3,4,4,3,3,3,2,4,4,4,3,4,4,4,3,4,4,4,4,4,4,4,3,4,3,4,3,1,3,1,1,4,1,4,4,1,2,2,0,2,4,4,3,3,3,3,3,4,4,2,4,4,4,4,3,4,3,4,4,3,4,2,2,4,2,4,3,4,2,3,2,},
    {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,},
    {7,6,6,6,6,5,6,7,5,5,4,6,3,6,5,7,6,5,5,5,7,7,4,6,7,6,6,6,6,6,6,7,5,7,7,7,7,7,7,7,7,2,7,7,7,7,7,7,7,7,6,4,7,5,6,3,4,3,7,6,5,7,0,5,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,6,6,6,7,6,5,7,5,6,5,},
    {8,5,0,2,0,0,8,7,9,4,2,8,5,8,5,2,5,2,2,1,2,2,2,2,2,8,8,2,2,2,2,4,0,0,0,0,0,1,0,0,8,3,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,5,9,2,9,7,2,2,3,2,2,5,8,3,8,9,2,8,0,3,2,9,3,5,3,5,3,2,0,2,8,2,6,9,9,1,5,},
    {2,2,0,1,2,1,2,1,1,2,0,1,0,1,0,1,0,1,1,0,1,1,1,1,1,1,1,0,0,0,1,0,0,2,0,2,2,2,0,2,2,0,2,2,2,2,0,2,0,2,1,1,2,2,2,0,1,0,2,2,1,0,0,1,0,2,0,0,0,1,0,2,1,0,2,2,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,2,1,0,2,},
    {7,6,7,7,7,7,6,7,6,6,7,7,7,7,7,7,6,7,7,7,7,7,5,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,6,6,7,4,7,7,6,5,7,0,5,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,5,7,5,},
    {7,5,7,7,6,7,6,7,5,5,7,6,7,6,6,7,5,5,7,7,7,7,5,7,7,6,6,7,7,7,5,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,5,6,5,4,5,7,6,5,7,0,5,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,6,6,5,7,5,7,7,5,7,4,},
    {6,5,6,6,6,5,5,6,4,5,3,5,2,5,6,6,5,5,6,3,6,6,4,5,6,5,5,3,6,5,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,5,2,6,5,5,5,3,5,6,5,4,5,0,4,6,6,5,5,5,5,5,6,6,4,6,6,6,6,5,6,5,6,6,5,6,6,6,5,6,5,4,6,4,1,4,},
    {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0,7,7,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,},
    {7,5,6,7,6,7,6,7,5,5,7,6,3,6,6,7,5,5,7,7,7,7,5,7,7,6,6,7,6,7,5,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,5,6,5,4,5,7,6,5,7,0,5,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,6,6,5,7,5,7,7,5,7,4,},
    {4,4,2,4,4,3,4,3,4,3,2,3,2,3,2,4,4,2,2,2,4,4,4,4,4,4,4,2,2,4,4,3,2,4,4,4,4,4,4,4,4,2,4,4,4,4,4,4,4,4,4,4,4,4,4,3,4,3,4,4,4,3,0,4,2,4,2,2,2,4,2,4,4,2,4,4,4,4,2,4,2,4,3,4,4,4,4,4,4,4,2,4,4,2,3,},
    {7,7,7,7,7,7,7,7,6,6,7,7,7,7,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,6,6,7,5,7,7,6,5,7,5,5,7,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,7,6,},
    {6,5,6,6,6,6,5,6,5,5,6,6,6,6,6,6,5,6,6,6,6,6,4,6,6,6,6,6,6,6,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,2,6,5,5,6,3,6,6,5,4,6,0,4,6,6,6,6,6,5,6,6,6,4,6,6,6,6,6,6,6,6,6,5,6,6,6,6,6,6,6,6,4,6,4,},
    {1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,},
    {3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,},
    {7,7,6,7,7,6,7,6,6,6,4,7,5,7,7,7,7,7,6,5,7,7,5,7,7,7,7,4,6,7,7,6,7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,3,7,6,6,7,5,7,7,6,5,6,0,5,6,7,5,5,5,7,5,7,7,5,7,7,7,7,5,7,5,7,6,7,7,7,7,7,7,7,5,7,5,4,6,},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
    {11,10,11,11,11,11,10,11,10,10,11,11,11,11,11,11,10,11,11,11,11,11,9,11,11,11,11,11,11,11,10,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,7,11,10,10,11,8,11,11,10,9,11,2,9,11,11,11,11,11,10,11,11,11,9,11,11,11,11,11,11,11,11,11,10,11,11,11,11,11,11,11,11,9,11,9,},
    {6,5,6,6,6,6,5,6,5,5,6,6,6,6,6,6,5,6,6,6,6,6,4,6,6,6,6,6,6,6,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,2,6,5,5,6,3,6,6,5,4,6,0,4,6,6,6,6,6,5,6,6,6,4,6,6,6,6,6,6,6,6,6,5,6,6,6,6,6,6,6,6,4,6,4,},
    {7,5,7,7,6,7,6,7,5,5,7,6,7,6,6,7,5,5,7,7,7,7,5,7,7,6,6,7,7,7,5,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,5,6,5,4,5,7,6,5,7,0,5,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,6,6,5,7,5,7,7,5,7,4,},
    {7,5,7,7,6,7,6,7,5,5,7,6,7,6,6,7,5,5,7,7,7,7,5,7,7,6,6,7,7,7,5,7,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,5,6,5,4,5,7,6,5,7,1,5,7,7,7,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,6,7,6,6,5,7,5,7,7,5,7,4,},
    {7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,6,6,7,5,7,7,6,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,6,},
    {4,4,2,4,4,3,4,3,3,3,1,3,1,3,2,4,4,1,1,1,4,4,0,4,4,4,4,1,2,4,4,3,1,4,4,4,4,4,4,4,4,1,4,4,4,4,4,4,4,4,4,0,4,3,3,1,2,1,4,3,2,3,0,2,2,4,2,2,2,4,2,4,4,2,4,4,4,4,2,4,2,4,3,4,4,4,4,4,4,4,2,4,2,1,3,},
    {6,5,6,6,6,6,5,6,4,5,3,5,6,5,6,6,5,5,6,6,6,6,4,6,6,5,5,4,6,6,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,2,6,5,5,5,3,5,6,5,4,5,0,4,6,6,6,6,6,5,6,6,6,4,6,6,6,6,6,6,6,6,6,5,6,6,6,5,6,5,5,6,4,1,4,},
    {4,4,3,4,4,3,4,3,3,3,2,4,2,4,4,4,4,4,2,2,4,4,2,4,4,4,4,2,2,4,4,3,4,4,4,4,4,4,4,4,4,3,4,4,4,4,4,4,4,4,4,0,4,3,3,4,2,4,4,3,2,3,0,2,3,4,2,2,2,4,2,4,4,2,4,4,4,4,2,4,2,4,3,4,4,4,4,4,4,4,2,4,2,2,3,},
    {6,6,6,6,6,6,6,6,5,5,6,6,6,6,6,6,6,6,6,6,6,6,4,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,2,6,5,5,6,4,6,6,5,4,6,0,4,6,6,6,6,6,6,6,6,6,4,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,4,6,5,},
    {7,7,7,7,7,6,7,7,6,6,6,6,5,6,5,7,7,4,5,5,7,7,3,7,7,7,7,6,7,7,7,6,5,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,3,7,6,6,4,5,4,7,6,5,6,0,5,6,7,6,6,6,7,6,7,7,5,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,5,7,5,6,6,},
    {11,11,11,11,11,10,11,11,10,10,10,10,10,10,9,11,11,9,10,10,11,11,8,11,11,11,11,10,11,11,11,10,9,11,11,11,11,11,11,11,11,10,11,11,11,11,11,11,11,11,11,7,11,10,10,9,9,9,11,10,9,10,2,9,10,11,10,10,10,11,10,11,11,9,11,11,11,11,10,11,10,11,11,11,11,11,11,11,11,11,10,11,9,10,10,},
    {7,7,6,7,7,6,7,6,6,6,5,7,5,7,7,7,7,7,6,5,7,7,5,7,7,7,7,5,6,7,7,6,7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,3,7,6,6,7,5,7,7,6,5,6,0,5,6,7,5,5,5,7,5,7,7,5,7,7,7,7,5,7,5,7,6,7,7,7,7,7,7,7,5,7,5,5,6,},
    {7,7,7,7,7,6,7,7,6,6,6,6,5,6,5,7,7,4,5,6,7,7,3,7,7,7,7,6,7,7,7,6,5,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,3,7,6,6,4,5,4,7,6,5,6,3,5,6,7,6,6,6,7,6,7,7,5,7,7,7,7,6,7,6,7,7,7,7,7,7,7,7,7,6,7,5,6,6,},
    {7,7,6,7,7,6,7,6,6,6,5,7,3,7,7,7,7,7,5,4,7,7,5,7,7,7,7,5,6,7,7,6,7,7,7,7,7,7,7,7,7,6,7,7,7,7,7,7,7,7,7,3,7,6,6,7,5,7,7,6,5,6,0,5,6,7,5,5,5,7,5,7,7,5,7,7,7,7,5,7,5,7,6,7,7,7,7,7,7,7,5,7,5,5,6,},
    {5,5,3,3,4,3,5,3,5,3,3,4,3,4,3,3,3,3,3,3,4,3,5,3,3,4,4,3,3,3,3,3,3,5,3,5,5,5,3,5,5,3,5,5,5,5,3,5,3,5,3,5,5,5,5,4,5,4,5,5,5,3,5,5,3,5,3,3,3,3,4,5,5,5,5,5,3,3,3,5,3,3,3,3,3,3,3,3,4,3,2,5,5,3,4,},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
    {5,3,3,3,3,5,4,5,3,3,3,4,3,4,4,5,3,3,3,5,3,5,2,5,3,4,4,4,3,3,3,5,4,5,5,5,5,5,5,5,5,3,5,5,5,5,5,5,5,5,3,2,5,3,3,3,2,3,5,3,3,3,2,3,4,5,5,5,5,4,5,5,5,3,5,5,5,5,5,5,5,5,4,4,5,3,4,3,4,3,5,5,2,3,3,},
    {8,4,6,7,7,6,7,8,6,3,7,7,4,7,6,8,5,3,6,6,8,8,5,6,8,7,7,7,1,4,3,8,6,8,8,8,8,8,8,8,8,3,8,8,8,8,8,8,8,8,6,4,8,6,7,3,5,4,8,7,6,8,0,6,8,8,8,8,8,7,8,8,8,6,8,8,8,8,8,8,8,8,8,7,8,7,7,6,8,4,6,8,6,7,4,},
    {4,4,1,4,4,3,4,3,3,4,0,3,0,3,2,4,3,4,4,0,3,4,3,4,4,3,3,0,0,3,4,2,1,4,3,4,4,4,3,4,4,0,4,4,4,4,3,4,3,4,4,3,4,4,4,2,3,2,4,4,3,2,0,3,1,4,1,1,1,3,1,4,3,1,4,4,3,3,1,3,1,3,2,3,3,3,3,3,3,3,2,4,3,0,4,},
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

