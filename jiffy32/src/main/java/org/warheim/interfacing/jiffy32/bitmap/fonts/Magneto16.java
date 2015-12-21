package org.warheim.interfacing.jiffy32.bitmap.fonts;
// coding=utf-8
// Module magneto_bold_16
// generated from Magneto 11.25pt

public class Magneto16 extends Font {
	public Magneto16() {
		super("Magneto 16", '!', (char)127, 16, 8, 2, "Magneto16.bin");
	}


	private static final int[][] descriptors = {
    {6,0},// !
    {6,16},// "
    {11,32},// #
    {12,64},// $
    {9,96},// %
    {11,128},// &
    {3,160},// '
    {6,176},// {
    {6,192},// }
    {5,208},// *
    {9,224},// +
    {3,256},// ,
    {6,272},// -
    {3,288},// .
    {7,304},// /
    {10,320},// 0
    {5,352},// 1
    {10,368},// 2
    {9,400},// 3
    {10,432},// 4
    {9,464},// 5
    {9,496},// 6
    {8,528},// 7
    {9,544},// 8
    {8,576},// 9
    {4,592},// :
    {4,608},// ;
    {8,624},// <
    {7,640},// =
    {8,656},// >
    {8,672},// ?
    {11,688},// @
    {21,720},// A
    {13,768},// B
    {10,800},// C
    {13,832},// D
    {11,864},// E
    {14,896},// F
    {11,928},// G
    {21,960},// H
    {11,1008},// I
    {12,1040},// J
    {13,1072},// K
    {16,1104},// L
    {17,1136},// M
    {16,1184},// N
    {13,1216},// O
    {12,1248},// P
    {12,1280},// Q
    {13,1312},// R
    {15,1344},// S
    {15,1376},// T
    {12,1408},// U
    {13,1440},// V
    {17,1472},// W
    {14,1520},// X
    {14,1552},// Y
    {15,1584},// Z
    {7,1616},// [
    {6,1632},// \
    {7,1648},// ]
    {6,1664},// ^
    {17,1680},// _
    {3,1728},// `
    {9,1744},// a
    {13,1776},// b
    {9,1808},// c
    {10,1840},// d
    {9,1872},// e
    {12,1904},// f
    {9,1936},// g
    {10,1968},// h
    {6,2000},// i
    {8,2016},// j
    {10,2032},// k
    {6,2064},// l
    {14,2080},// m
    {10,2112},// n
    {13,2144},// o
    {11,2176},// p
    {9,2208},// q
    {9,2240},// r
    {9,2272},// s
    {7,2304},// t
    {10,2320},// u
    {11,2352},// v
    {11,2384},// w
    {7,2416},// x
    {10,2432},// y
    {8,2464},// z
    {7,2480},// {
    {1,2496},// |
    {7,2512},// }
    {9,2528},// ~
    {4,2560},// °
};

	private static final byte[][] kerning = {
    {3,5,3,3,5,3,5,4,2,5,4,3,3,3,3,4,5,4,4,4,3,4,5,3,5,3,2,4,4,3,6,4,3,5,4,5,3,5,4,3,5,5,5,3,5,3,5,5,3,5,3,5,5,5,5,4,6,3,3,5,1,2,0,5,3,3,3,3,3,2,3,3,3,2,3,3,3,3,3,2,3,4,3,3,3,3,3,3,3,3,3,6,1,3,6,},
    {3,5,2,2,5,2,5,4,2,5,1,3,0,3,1,4,5,4,4,4,3,3,5,3,5,2,2,1,0,3,6,4,0,5,3,5,2,5,3,0,5,5,5,0,5,0,5,5,3,5,0,5,5,5,5,4,6,2,3,5,1,0,0,5,0,3,0,0,0,2,0,3,3,0,3,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,3,6,1,0,6,},
    {9,10,10,8,9,10,10,10,7,11,9,8,9,8,8,11,9,9,9,10,9,10,10,10,11,9,9,10,9,8,10,10,8,10,10,10,10,11,10,9,11,11,10,7,10,7,10,10,9,10,10,11,10,10,10,9,10,8,9,9,7,10,0,10,10,9,10,10,10,8,10,9,9,6,9,9,9,9,10,8,10,10,7,9,9,10,9,8,9,8,9,11,7,9,10,},
    {10,12,9,9,11,9,12,10,8,12,9,9,9,9,8,10,11,11,11,10,10,9,12,10,11,9,8,9,9,10,12,10,9,12,9,12,9,11,9,9,11,11,12,8,12,8,12,12,9,12,9,11,12,12,12,11,12,9,9,11,7,9,0,11,9,9,9,9,9,8,9,9,10,7,9,9,9,9,9,8,9,9,9,9,9,9,9,8,9,9,9,12,7,9,12,},
    {8,8,7,8,8,8,8,8,7,8,6,7,8,8,8,8,8,8,8,7,8,8,8,8,7,8,7,6,8,8,9,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,9,8,8,8,6,4,0,7,8,8,8,8,8,7,8,8,8,7,8,8,8,8,8,7,8,8,8,8,8,8,8,8,8,8,8,9,6,8,9,},
    {11,10,10,10,11,10,10,10,10,10,6,10,7,11,11,9,11,11,10,8,10,9,10,9,10,11,10,7,7,11,10,9,11,10,9,10,10,11,8,11,11,11,10,11,10,11,10,10,11,10,9,11,10,10,10,11,10,11,11,9,9,6,0,10,10,11,10,11,10,10,10,11,11,10,11,11,11,11,10,10,11,9,11,11,11,11,11,11,11,11,11,11,9,7,10,},
    {0,2,0,0,2,0,2,1,0,2,0,0,0,0,0,1,2,1,1,1,0,0,2,0,2,0,0,0,0,0,3,1,0,2,0,2,0,2,0,0,2,2,2,0,2,0,2,2,0,2,0,2,2,2,2,1,3,0,0,2,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0,0,3,},
    {2,4,2,2,4,2,4,2,3,6,2,3,2,3,2,3,4,3,3,3,2,2,4,2,3,2,3,2,2,2,5,2,2,4,2,4,2,3,2,2,3,3,4,2,4,2,4,4,2,4,2,3,4,4,4,3,5,3,3,6,3,2,0,3,2,2,2,2,2,3,2,2,2,3,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,6,3,2,5,},
    {5,6,5,4,5,5,6,6,2,6,6,3,5,5,4,6,5,5,5,6,5,6,6,6,6,5,5,6,6,4,6,6,4,6,6,6,5,6,6,5,6,6,6,3,6,3,6,6,4,6,5,6,6,6,6,5,6,4,5,5,3,5,0,6,5,5,5,5,5,5,5,5,5,2,5,5,5,5,5,4,5,6,4,6,5,6,5,5,5,6,5,6,2,5,6,},
    {3,5,4,2,4,2,5,4,2,5,1,2,0,2,1,5,4,4,4,3,3,4,5,3,5,1,1,3,0,3,5,4,0,5,4,5,2,5,4,0,5,5,5,0,5,0,5,5,3,5,0,5,5,5,5,4,5,2,3,5,1,2,0,4,0,3,0,0,0,2,0,3,3,0,3,3,0,0,0,2,0,4,1,3,0,0,0,0,0,0,3,5,1,0,5,},
    {8,7,6,5,6,7,7,9,5,7,9,6,5,6,6,9,7,6,6,8,8,9,7,8,9,7,7,9,9,5,7,9,4,7,9,7,7,9,9,5,9,9,7,3,7,4,7,7,7,7,7,9,7,7,7,6,7,4,7,7,5,7,0,6,7,7,7,6,7,7,6,7,7,4,7,7,7,7,7,6,7,9,6,8,7,8,7,7,7,8,8,9,5,6,7,},
    {3,0,2,3,2,3,0,3,1,0,1,2,0,3,2,2,3,2,3,0,3,2,1,3,0,3,2,0,3,2,2,2,3,1,2,2,3,2,2,3,2,2,1,2,2,2,0,2,2,1,2,2,1,0,0,3,0,3,3,0,1,0,0,0,3,3,3,3,3,2,3,3,3,1,3,3,3,3,3,2,3,3,3,3,3,3,3,2,3,3,3,3,1,0,0,},
    {5,0,6,4,3,6,3,6,3,1,3,3,5,5,4,6,5,3,5,6,5,6,3,6,4,5,5,6,5,3,4,6,4,4,6,4,6,0,6,5,0,0,4,0,4,2,4,4,0,3,6,0,4,3,3,5,2,4,5,3,3,6,0,3,6,5,6,6,6,4,6,5,5,2,5,5,5,5,6,4,6,5,3,5,5,6,5,4,5,3,5,6,3,5,2,},
    {3,0,2,3,3,3,0,3,2,0,1,2,3,3,3,3,3,3,3,0,3,3,2,3,1,3,2,1,3,3,2,3,3,2,3,2,3,3,3,3,3,3,2,3,2,3,1,2,3,1,3,3,1,0,0,3,0,3,3,0,1,0,0,0,3,3,3,3,3,2,3,3,3,2,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,1,3,0,},
    {4,6,4,3,6,3,6,4,3,6,4,4,2,4,1,5,6,5,5,5,4,4,6,4,5,3,3,4,4,4,7,4,2,6,4,6,3,5,4,2,5,5,6,1,6,1,6,6,3,6,3,5,6,6,6,5,7,3,4,6,2,3,0,5,3,3,3,3,3,3,3,3,4,1,3,3,3,3,3,2,3,4,2,4,3,4,3,3,3,4,4,7,2,2,7,},
    {9,10,10,8,9,10,10,10,7,10,10,7,9,9,8,10,9,9,9,10,9,10,10,10,10,9,9,10,10,8,10,10,8,9,10,9,10,10,10,9,10,10,9,7,9,7,9,9,8,9,10,10,9,9,9,9,10,8,9,9,7,10,0,10,10,9,10,10,10,9,10,9,9,6,9,9,9,9,10,8,10,10,8,10,9,10,9,9,9,10,9,10,7,9,9,},
    {3,5,3,3,4,3,5,4,1,5,4,2,3,3,2,4,4,4,4,3,3,4,5,3,4,3,2,4,4,3,5,4,3,5,4,5,3,4,4,3,4,4,5,2,5,2,5,5,2,5,3,4,5,5,5,4,5,3,3,4,1,3,0,4,3,3,3,3,3,2,3,3,3,1,3,3,3,3,3,2,3,4,3,3,3,3,3,2,3,3,3,5,1,3,5,},
    {10,10,9,10,9,10,10,10,8,10,9,9,6,10,9,10,10,9,10,9,10,9,10,10,10,10,9,9,10,9,10,9,10,10,9,10,10,10,9,10,10,10,10,9,10,9,10,10,9,10,9,10,10,10,10,10,10,10,10,9,8,8,0,10,10,10,10,10,10,9,10,10,10,8,10,10,10,10,10,9,10,10,10,10,10,10,10,9,10,10,10,10,8,7,10,},
    {9,8,9,8,8,9,8,9,6,8,9,7,9,9,8,9,8,7,9,9,9,9,8,9,8,8,8,9,9,7,9,9,8,8,9,8,9,8,9,9,8,8,8,7,8,7,8,8,7,8,9,8,8,8,8,9,9,8,8,8,6,9,0,7,9,8,9,9,9,8,9,8,8,5,8,8,8,8,9,7,9,9,8,9,8,9,8,8,8,9,8,9,6,9,9,},
    {9,9,9,7,9,9,9,10,6,9,10,7,8,7,7,10,9,8,8,10,7,10,9,10,9,9,9,10,10,7,10,10,7,9,10,9,9,9,10,8,9,9,9,6,9,6,9,9,7,9,9,9,9,9,9,8,10,7,9,9,7,9,0,9,9,9,9,9,9,9,9,9,9,6,9,9,9,9,9,8,9,10,7,10,9,10,9,9,9,10,9,10,6,8,10,},
    {9,8,9,8,8,9,8,9,6,8,9,7,9,9,8,9,8,7,9,9,9,9,8,9,8,8,8,9,9,7,9,9,8,8,9,8,9,8,9,9,8,8,8,7,8,7,8,8,7,8,9,8,8,8,8,9,9,8,8,8,6,9,0,6,9,8,9,9,9,8,9,8,8,5,8,8,8,8,9,7,9,9,8,9,8,9,8,8,8,9,8,9,6,9,9,},
    {9,5,9,8,7,9,6,9,6,5,9,7,9,9,8,9,8,7,9,9,9,9,8,9,8,8,8,9,9,7,8,9,8,7,9,7,9,8,9,9,8,8,7,7,7,7,7,7,7,6,9,8,7,6,6,9,6,8,8,7,6,9,0,6,9,8,9,9,9,8,9,8,8,6,8,8,8,8,9,7,9,9,8,9,8,9,8,8,8,9,8,9,6,9,6,},
    {6,7,5,4,7,6,7,7,4,7,7,5,4,5,4,7,7,6,6,7,5,7,7,7,7,6,6,7,7,5,8,7,4,7,7,7,6,7,7,4,7,7,7,3,7,3,7,7,5,7,6,7,7,7,7,6,8,4,6,7,4,6,0,7,6,6,6,5,6,6,5,6,6,3,6,6,6,6,6,5,6,7,4,7,6,7,6,6,6,7,6,8,3,5,8,},
    {8,9,8,7,8,8,9,8,5,9,8,6,8,8,7,9,8,8,8,8,8,8,9,8,9,7,7,8,8,7,9,8,7,9,8,9,8,9,8,8,9,9,9,6,9,6,9,9,7,9,8,9,9,9,9,8,9,7,7,8,5,8,0,9,8,7,8,8,8,7,8,7,7,5,7,7,7,7,8,6,8,8,7,8,7,8,7,7,7,8,7,9,5,8,9,},
    {7,8,7,5,7,7,8,8,4,8,8,5,6,6,5,8,7,7,6,8,7,8,8,8,8,7,7,8,8,6,8,8,5,7,8,7,7,8,8,6,8,8,7,4,7,4,7,7,6,7,7,8,7,7,7,6,8,5,7,7,5,7,0,8,7,7,7,7,7,7,7,7,7,4,7,7,7,7,7,6,7,8,5,8,7,8,7,7,7,8,7,8,4,6,7,},
    {3,0,4,3,3,4,1,4,2,0,4,2,3,3,3,4,3,3,3,4,3,4,3,4,3,3,3,4,4,3,3,4,3,2,4,2,4,3,4,3,3,3,2,3,2,3,2,2,3,1,4,3,2,1,1,3,0,3,3,2,1,4,0,1,4,3,4,4,4,3,4,3,3,2,3,3,3,3,4,2,4,4,3,4,3,4,3,3,3,4,3,4,1,3,0,},
    {3,0,4,3,2,4,1,4,1,0,4,2,3,3,2,4,3,2,3,4,3,4,3,4,3,3,3,4,4,2,3,4,3,2,4,2,4,3,4,3,3,3,2,2,2,2,2,2,2,1,4,3,2,1,1,3,0,3,3,2,1,4,0,1,4,3,4,4,4,3,4,3,3,1,3,3,3,3,4,2,4,4,3,4,3,4,3,3,3,4,3,4,1,3,0,},
    {6,8,5,6,7,6,8,6,5,8,4,5,5,6,6,6,7,7,7,6,6,5,8,6,7,6,5,4,6,6,8,6,6,8,5,8,6,7,5,6,7,7,8,6,8,6,8,8,6,8,5,7,8,8,8,7,8,6,6,7,4,4,0,7,6,6,6,6,6,5,6,6,6,5,6,6,6,6,6,5,6,6,6,6,6,6,6,6,6,6,6,8,4,5,8,},
    {6,1,5,6,5,6,4,7,4,2,7,5,6,6,5,7,6,5,6,6,6,7,5,6,7,6,5,7,7,5,5,7,6,4,7,5,6,7,7,6,7,7,4,5,5,5,5,5,5,4,6,7,4,4,3,6,2,6,6,5,4,5,0,4,6,6,6,6,6,5,6,6,6,3,6,6,6,6,6,5,6,7,6,6,6,6,6,5,6,6,6,7,4,6,3,},
    {7,5,8,5,5,8,5,8,5,6,8,5,7,6,6,8,7,4,6,8,7,8,7,8,8,7,7,8,8,4,7,8,6,6,8,6,8,8,8,7,8,8,6,3,6,4,6,6,6,5,8,8,6,5,5,6,5,6,7,6,5,8,0,5,8,7,8,8,8,7,8,7,7,4,7,7,7,7,8,6,8,8,5,8,7,8,7,7,7,8,7,8,5,7,4,},
    {6,8,7,5,7,5,8,7,4,8,6,5,4,5,4,8,7,7,7,6,6,7,8,6,8,4,4,6,6,6,8,7,4,8,7,8,5,8,7,4,8,8,8,4,8,4,8,8,6,8,4,8,8,8,8,7,8,5,6,7,4,5,0,8,4,6,4,4,4,5,4,6,6,3,6,6,4,4,4,5,4,7,4,6,4,4,4,4,4,4,6,8,4,4,8,},
    {10,11,10,9,10,10,11,11,7,11,11,8,9,9,8,11,10,10,9,11,10,11,11,11,11,10,10,11,11,9,11,11,9,10,11,10,10,11,11,9,11,11,10,8,10,8,10,10,9,10,10,11,10,10,10,9,11,9,10,10,8,10,0,11,10,10,10,10,10,10,10,10,10,7,10,10,10,10,10,9,10,11,9,11,10,11,10,10,10,11,10,11,7,9,10,},
    {20,16,19,17,18,20,18,21,17,16,21,18,15,18,18,21,20,15,15,21,15,21,20,21,20,20,20,21,21,15,20,21,17,18,21,19,20,20,21,18,20,20,18,13,19,16,19,19,18,18,20,20,19,18,17,15,17,17,20,19,18,20,4,18,20,20,20,19,20,20,19,20,20,17,20,20,20,20,20,19,20,21,18,21,20,21,20,20,20,21,20,21,17,19,17,},
    {11,13,11,10,12,10,13,12,9,13,11,10,10,10,9,12,12,12,12,11,11,11,13,11,13,9,9,11,11,11,13,12,9,13,11,13,10,13,11,10,13,13,13,8,13,8,13,13,11,13,10,13,13,13,13,12,13,10,11,12,9,10,0,13,10,11,10,10,10,10,10,11,11,8,11,11,9,9,10,9,10,11,9,10,9,10,9,9,9,10,11,13,9,10,13,},
    {10,10,9,9,10,9,10,9,9,10,6,9,4,10,10,9,10,10,9,8,9,8,10,8,10,10,9,6,3,10,10,9,10,10,8,10,9,10,8,10,10,10,10,10,10,10,10,10,10,10,8,10,10,10,10,10,10,10,10,9,8,4,0,10,9,10,9,10,9,9,9,10,10,9,10,10,10,10,9,9,10,8,10,10,10,10,10,10,10,10,10,10,8,2,10,},
    {12,13,12,10,12,12,13,13,9,13,13,10,11,11,10,13,11,12,11,12,12,13,13,12,13,11,11,13,13,11,13,13,10,12,13,12,12,13,13,11,13,13,12,8,12,8,12,12,11,12,12,13,12,12,12,11,13,10,11,12,9,12,0,13,12,11,12,12,12,11,12,11,11,8,11,11,11,11,12,10,12,13,10,12,11,12,11,11,11,12,12,13,9,11,12,},
    {11,11,10,10,11,10,11,10,10,11,7,10,5,11,11,10,11,11,10,9,10,9,11,9,11,11,10,7,6,11,11,10,11,11,9,11,10,11,9,11,11,11,11,11,11,11,11,11,11,11,9,11,11,11,11,11,11,11,11,10,9,5,0,11,10,11,10,11,10,10,10,11,11,10,11,11,11,11,10,10,11,9,11,11,11,11,11,11,11,11,11,11,9,2,11,},
    {11,13,10,10,13,11,13,12,10,13,12,11,9,11,9,12,13,12,12,12,11,12,13,12,12,11,11,12,12,11,14,12,8,13,12,13,11,12,12,9,12,12,13,7,13,8,13,13,10,13,11,12,13,13,13,12,14,10,11,13,9,11,0,11,11,11,11,10,11,11,10,11,11,8,11,11,11,11,11,10,11,12,9,12,11,12,11,11,11,12,11,14,9,10,14,},
    {10,11,10,9,10,10,11,10,9,11,10,9,10,10,9,10,10,10,10,10,10,10,11,10,11,9,9,10,10,9,11,10,9,11,10,11,10,11,10,10,11,11,11,9,11,9,11,11,9,11,10,11,11,11,11,10,11,9,9,10,9,10,0,11,10,9,10,10,10,9,10,9,9,9,9,9,9,9,10,8,10,10,9,10,9,10,9,9,9,10,9,11,9,10,11,},
    {20,16,19,17,18,20,18,21,17,16,21,18,15,18,18,21,20,15,15,21,15,21,20,21,20,20,20,21,21,15,20,21,17,18,21,19,20,20,21,18,20,20,18,13,19,16,19,19,18,18,20,20,19,18,17,15,17,17,20,19,18,20,4,18,20,20,20,19,20,20,19,20,20,17,20,20,20,20,20,19,20,21,18,21,20,21,20,20,20,21,20,21,17,19,17,},
    {9,11,9,8,10,9,11,10,7,11,10,8,9,9,8,10,10,10,10,9,9,10,11,9,10,8,8,10,10,9,11,10,8,11,10,11,9,10,10,9,10,10,11,7,11,7,11,11,8,11,9,10,11,11,11,10,11,8,8,10,6,9,0,10,9,8,9,9,9,8,9,8,9,6,8,8,8,8,9,7,9,10,8,9,8,9,8,8,8,9,9,11,6,9,11,},
    {9,11,9,8,11,9,11,10,8,11,10,9,9,9,8,10,11,10,10,10,9,10,11,9,11,8,8,10,10,9,12,10,8,11,10,11,9,11,10,9,11,11,11,7,11,7,11,11,9,11,9,11,11,11,11,10,12,8,9,11,7,9,0,11,9,9,9,9,9,8,9,9,9,6,9,9,8,8,9,7,9,10,8,9,8,9,8,8,8,9,9,12,7,9,12,},
    {12,12,11,11,12,11,12,11,11,12,10,11,10,12,12,10,12,12,11,11,11,10,12,10,11,12,11,10,10,12,13,10,12,12,10,12,11,12,10,12,12,12,12,12,12,12,12,12,12,12,10,12,12,12,12,12,13,12,12,12,10,10,0,11,11,12,11,12,11,11,11,12,12,11,12,12,12,12,11,11,12,10,12,12,12,12,12,12,12,12,12,13,10,10,13,},
    {15,16,14,14,15,14,16,15,14,16,12,14,10,15,15,15,15,15,15,14,14,14,16,14,16,15,14,12,10,15,16,15,15,16,14,16,14,16,14,15,16,16,16,15,16,15,16,16,15,16,13,16,16,16,16,15,16,15,15,15,13,10,0,16,14,15,14,15,14,14,14,15,15,14,15,15,15,15,14,14,15,13,15,15,15,15,15,15,15,15,15,16,13,9,16,},
    {17,11,16,16,17,16,14,16,16,15,14,16,14,17,17,15,17,17,16,14,16,15,16,15,15,17,16,14,14,17,16,14,17,16,15,16,16,17,14,17,17,17,16,17,16,17,13,16,17,15,15,17,14,14,14,17,14,17,17,13,15,14,0,14,16,17,16,17,16,16,16,17,17,16,17,17,17,17,16,16,17,15,17,17,17,17,17,17,17,17,17,17,15,14,13,},
    {14,16,13,13,15,13,16,15,12,16,13,13,12,13,12,15,15,15,15,14,14,14,16,14,16,12,12,13,13,14,16,15,12,16,14,16,13,16,14,12,16,16,16,12,16,12,16,16,14,16,13,16,16,16,16,15,16,13,14,15,12,13,0,16,13,14,13,13,13,13,13,14,14,11,14,14,12,12,13,11,13,13,12,13,12,13,12,12,12,13,14,16,12,12,16,},
    {12,13,12,10,12,12,13,13,9,13,13,10,11,11,10,13,12,12,11,13,12,13,13,13,13,12,12,13,13,11,13,13,10,12,13,12,12,13,13,11,13,13,12,9,12,9,12,12,11,12,12,13,12,12,12,11,13,10,12,12,10,12,0,13,12,12,12,12,12,12,12,12,12,9,12,12,12,12,12,11,12,13,10,13,12,13,12,12,12,13,12,13,9,11,12,},
    {10,12,11,9,11,9,12,11,8,12,11,9,7,9,8,12,11,11,11,10,10,11,12,10,12,9,9,11,11,10,12,11,6,12,11,12,9,12,11,7,12,12,12,4,12,7,12,12,10,12,9,12,12,12,12,11,12,9,10,11,8,9,0,12,9,10,9,8,9,9,8,10,10,7,10,10,9,9,9,9,9,11,8,10,9,10,9,9,9,10,10,12,8,8,12,},
    {12,12,11,11,12,11,12,12,11,12,12,11,10,12,12,12,12,12,11,12,11,12,12,12,12,12,11,12,12,12,12,12,12,11,12,11,11,12,12,12,12,12,11,12,11,12,11,11,12,11,11,12,11,11,11,12,12,12,12,11,10,11,0,12,11,12,11,12,11,11,11,12,12,11,12,12,12,12,11,11,12,12,12,12,12,12,12,12,12,12,12,12,10,10,11,},
    {13,13,12,12,13,12,13,12,12,13,12,12,9,13,13,13,13,13,12,11,12,12,13,11,13,13,12,12,12,13,13,12,13,13,12,13,12,13,12,13,13,13,13,13,13,13,13,13,13,13,11,13,13,13,13,13,13,13,13,12,11,10,0,13,12,13,12,13,12,12,12,13,13,12,13,13,13,13,12,12,13,12,13,13,13,13,13,13,13,13,13,13,11,9,13,},
    {13,15,12,12,14,12,15,14,11,15,12,12,12,12,11,14,14,14,14,13,13,13,15,13,15,11,11,12,12,13,15,14,11,15,13,15,12,15,13,12,15,15,15,10,15,10,15,15,13,15,12,15,15,15,15,14,15,12,13,14,11,12,0,15,12,13,12,12,12,12,12,13,13,10,13,13,11,11,12,10,12,12,11,12,11,12,11,11,11,12,13,15,11,12,15,},
    {12,14,11,11,14,11,14,12,11,14,10,12,9,12,9,12,14,13,13,13,12,11,14,12,13,11,11,10,10,12,15,12,9,14,11,14,11,13,11,9,13,13,14,8,14,9,14,14,11,14,10,13,14,14,14,13,15,11,12,14,10,10,0,12,10,11,10,10,10,10,10,11,12,9,11,11,9,9,10,8,10,10,9,10,9,10,9,9,9,10,12,15,10,9,15,},
    {10,12,11,9,11,10,12,11,8,12,11,9,10,10,9,12,11,11,11,11,10,11,12,11,12,10,10,11,11,10,12,11,9,12,11,12,10,12,11,10,12,12,12,8,12,8,12,12,10,12,10,12,12,12,12,11,12,9,10,11,8,10,0,12,10,10,10,10,10,10,10,10,10,7,10,10,10,10,10,9,10,11,9,11,10,11,10,10,10,11,10,12,8,10,12,},
    {11,13,11,10,12,10,13,12,9,13,11,10,8,10,9,12,12,12,12,11,11,11,13,11,13,9,9,11,11,11,13,12,7,13,11,13,10,13,11,8,13,13,13,6,13,7,13,13,11,13,9,13,13,13,13,12,13,10,11,12,9,9,0,13,9,11,9,9,9,10,9,11,11,8,11,11,9,9,9,9,9,11,8,10,9,10,9,9,9,10,11,13,9,8,13,},
    {14,16,14,13,16,13,16,15,13,16,14,14,12,14,12,15,16,15,15,15,14,14,16,14,16,13,13,14,14,14,17,15,12,16,14,16,13,16,14,12,16,16,16,11,16,11,16,16,14,16,13,16,16,16,16,15,17,13,14,16,12,13,0,16,13,14,13,13,13,13,13,14,14,11,14,14,13,13,13,12,13,14,12,14,13,14,13,13,13,14,14,17,12,12,17,},
    {13,14,12,12,13,12,14,13,12,14,10,12,9,13,13,13,13,13,13,12,12,12,14,12,14,13,12,10,9,13,14,13,13,14,12,14,12,14,12,13,14,14,14,13,14,13,14,14,13,14,11,14,14,14,14,13,14,13,13,13,11,9,0,14,12,13,12,13,12,12,12,13,13,12,13,13,13,13,12,12,13,11,13,13,13,13,13,13,13,13,13,14,11,9,14,},
    {12,14,12,11,13,12,14,13,10,14,13,11,12,12,11,13,13,13,13,12,12,13,14,12,13,11,11,13,13,12,14,13,11,14,13,14,12,13,13,12,13,13,14,11,14,11,14,14,11,14,12,13,14,14,14,13,14,11,11,13,9,12,0,13,12,11,12,12,12,11,12,11,12,10,11,11,11,11,12,10,12,13,11,12,11,12,11,11,11,12,12,14,9,12,14,},
    {14,12,13,11,12,14,12,15,11,12,15,12,9,12,12,15,14,11,11,15,10,15,14,15,14,14,14,15,15,10,14,15,11,12,15,13,14,14,15,12,14,14,12,8,13,10,13,13,12,12,14,14,13,12,12,11,12,11,14,13,12,14,0,12,14,14,14,13,14,14,13,14,14,11,14,14,14,14,14,13,14,15,12,15,14,15,14,14,14,15,14,15,11,13,12,},
    {3,5,3,3,4,3,5,4,4,7,4,4,3,4,2,4,4,4,4,3,3,4,5,3,4,3,3,4,4,3,5,4,3,5,4,5,3,4,4,3,4,4,5,2,5,2,5,5,2,5,3,4,5,5,5,4,5,3,3,7,3,3,0,4,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,4,3,3,3,3,3,2,3,3,3,7,3,3,6,},
    {6,3,5,5,6,5,3,5,5,4,4,5,5,6,6,5,6,6,5,5,5,5,5,5,4,6,5,5,5,6,5,5,6,5,5,5,5,6,5,6,6,6,5,6,5,6,3,5,6,4,5,6,3,3,3,6,3,6,6,2,4,5,0,3,5,6,5,6,5,5,5,6,6,5,6,6,6,6,5,5,6,5,6,6,6,6,6,6,6,6,6,6,4,5,3,},
    {5,7,5,5,6,5,7,6,4,7,6,4,5,5,4,6,6,6,6,5,5,6,7,5,6,5,4,6,6,5,7,6,5,7,6,7,5,6,6,5,6,6,7,4,7,4,7,7,4,7,5,6,7,7,7,6,7,5,5,7,4,5,0,6,5,5,5,5,5,4,5,5,5,4,5,5,5,5,5,4,5,6,5,5,5,5,5,4,5,5,5,7,4,5,7,},
    {4,0,6,2,3,6,3,6,3,5,5,3,5,3,4,6,5,1,2,6,4,6,4,6,5,5,5,6,5,2,4,6,4,4,6,4,6,5,6,5,5,5,4,0,4,2,4,4,3,3,6,5,4,3,3,1,2,4,5,3,3,6,0,4,6,5,6,6,6,4,6,5,5,2,5,5,5,5,6,4,6,5,3,5,5,6,5,4,5,5,5,6,3,5,2,},
    {11,11,6,5,8,6,14,11,11,12,8,14,11,14,10,7,12,7,8,7,8,8,9,8,9,13,13,9,10,9,9,6,0,4,7,4,6,3,6,0,6,5,4,1,0,1,4,5,5,4,2,2,5,4,0,3,3,2,10,11,10,11,16,14,8,4,8,7,8,5,16,7,11,9,7,11,3,7,4,6,8,8,8,10,7,6,6,10,16,9,10,16,10,8,13,},
    {1,2,2,0,1,0,2,2,0,3,0,0,0,0,0,3,1,1,0,0,1,2,2,1,3,0,0,1,0,0,2,2,0,0,2,0,0,3,2,0,3,3,0,0,0,0,0,0,1,0,0,3,0,0,0,0,2,0,1,1,0,0,0,2,0,1,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0,2,0,1,0,0,0,0,0,0,1,3,0,0,1,},
    {9,3,8,8,9,8,6,8,8,4,6,8,6,9,9,7,9,9,8,6,8,7,8,7,7,9,8,6,6,9,8,6,9,8,7,8,8,9,6,9,9,9,8,9,8,9,5,8,9,7,7,9,6,6,6,9,6,9,9,5,7,6,0,6,8,9,8,9,8,8,8,9,9,8,9,9,9,9,8,8,9,7,9,9,9,9,9,9,9,9,9,9,7,6,5,},
    {12,7,11,9,10,12,10,13,9,8,13,10,7,10,10,13,12,7,7,13,7,13,12,13,12,12,12,13,13,7,12,13,9,10,13,11,12,12,13,10,12,12,10,5,11,8,11,11,10,10,12,12,11,10,9,7,9,9,12,11,10,12,0,10,12,12,12,11,12,12,11,12,12,9,12,12,12,12,12,11,12,13,10,13,12,13,12,12,12,13,12,13,9,11,9,},
    {9,3,8,8,9,8,6,8,8,4,7,8,6,9,9,7,9,9,8,7,8,7,8,7,7,9,8,7,7,9,8,7,9,8,7,8,8,9,7,9,9,9,8,9,8,9,5,8,9,7,7,9,6,6,6,9,6,9,9,5,7,7,0,6,8,9,8,9,8,8,8,9,9,8,9,9,9,9,8,8,9,7,9,9,9,9,9,9,9,9,9,9,7,6,5,},
    {10,8,9,9,10,9,8,9,9,8,7,9,6,10,10,8,10,10,9,6,9,8,9,8,8,10,9,7,7,10,9,7,10,9,8,9,9,10,7,10,10,10,9,10,9,10,8,9,10,8,8,10,8,8,8,10,8,10,10,7,8,6,0,7,9,10,9,10,9,9,9,10,10,9,10,10,10,10,9,9,10,8,10,10,10,10,10,10,10,10,10,10,8,6,8,},
    {9,3,8,8,9,8,6,8,8,4,6,8,7,9,9,7,9,9,8,7,8,7,8,7,7,9,8,7,7,9,8,7,9,8,7,8,8,9,7,9,9,9,8,9,8,9,5,8,9,7,7,9,6,6,6,9,6,9,9,5,7,7,0,6,8,9,8,9,8,8,8,9,9,8,9,9,9,9,8,8,9,7,9,9,9,9,9,9,9,9,9,9,7,7,5,},
    {11,6,10,8,9,11,9,12,8,7,12,9,6,9,9,12,11,6,6,12,6,12,11,12,11,11,11,12,12,6,11,12,8,9,12,10,11,11,12,9,11,11,9,6,10,7,10,10,9,9,11,11,10,9,8,6,8,8,11,10,9,11,0,9,11,11,11,10,11,11,10,11,11,8,11,11,11,11,11,10,11,12,9,12,11,12,11,11,11,12,11,12,8,10,8,},
    {9,3,8,8,9,8,6,8,8,4,7,8,7,9,9,7,9,9,8,7,8,7,8,7,7,9,8,7,7,9,8,7,9,8,7,8,8,9,7,9,9,9,8,9,8,9,5,8,9,7,7,9,6,6,6,9,6,9,9,5,7,7,3,6,8,9,8,9,8,8,8,9,9,8,9,9,9,9,8,8,9,7,9,9,9,9,9,9,9,9,9,9,7,7,5,},
    {10,5,9,9,10,9,7,9,9,5,7,9,7,10,10,8,10,10,9,7,9,8,9,8,8,10,9,7,7,10,9,7,10,9,8,9,9,10,7,10,10,10,9,10,9,10,6,9,10,8,8,10,7,7,7,10,7,10,10,6,8,7,0,7,9,10,9,10,9,9,9,10,10,9,10,10,10,10,9,9,10,8,10,10,10,10,10,10,10,10,10,10,8,7,6,},
    {6,5,5,5,6,5,5,5,5,5,3,5,3,6,6,5,6,6,5,3,5,4,5,4,5,6,5,3,3,6,5,4,6,5,4,5,5,6,4,6,6,6,5,6,5,6,5,5,6,5,4,6,5,5,5,6,5,6,6,4,4,3,0,5,5,6,5,6,5,5,5,6,6,5,6,6,6,6,5,5,6,4,6,6,6,6,6,6,6,6,6,6,4,3,5,},
    {8,8,7,7,8,7,8,7,7,8,6,7,6,8,8,8,8,8,7,6,7,7,8,6,8,8,7,6,6,8,8,7,8,8,7,8,7,8,7,8,8,8,8,8,8,8,8,8,8,8,6,8,8,8,8,8,8,8,8,7,6,6,0,8,7,8,7,8,7,7,7,8,8,7,8,8,8,8,7,7,8,7,8,8,8,8,8,8,8,8,8,8,6,6,8,},
    {10,5,9,9,10,9,7,9,9,5,7,9,7,10,10,8,10,10,9,7,9,8,9,8,8,10,9,7,7,10,9,7,10,9,8,9,9,10,7,10,10,10,9,10,9,10,6,9,10,8,8,10,7,7,7,10,7,10,10,6,8,7,0,7,9,10,9,10,9,9,9,10,10,9,10,10,10,10,9,9,10,8,10,10,10,10,10,10,10,10,10,10,8,7,6,},
    {6,5,5,5,6,5,5,5,5,5,4,5,3,6,6,4,6,6,5,3,5,4,5,4,4,6,5,4,4,6,5,4,6,5,4,5,5,6,4,6,6,6,5,6,5,6,5,5,6,5,4,6,5,5,5,6,5,6,6,4,4,3,0,4,5,6,5,6,5,5,5,6,6,5,6,6,6,6,5,5,6,4,6,6,6,6,6,6,6,6,6,6,4,3,5,},
    {14,8,13,13,14,13,11,13,13,9,10,13,10,14,14,12,14,14,13,10,13,12,13,12,12,14,13,10,10,14,13,11,14,13,12,13,13,14,11,14,14,14,13,14,13,14,10,13,14,12,12,14,11,11,11,14,11,14,14,10,12,10,0,11,13,14,13,14,13,13,13,14,14,13,14,14,14,14,13,13,14,12,14,14,14,14,14,14,14,14,14,14,12,10,10,},
    {10,4,9,9,10,9,7,9,9,5,7,9,7,10,10,8,10,10,9,7,9,8,9,8,8,10,9,7,7,10,9,7,10,9,8,9,9,10,7,10,10,10,9,10,9,10,6,9,10,8,8,10,7,7,7,10,7,10,10,6,8,7,0,7,9,10,9,10,9,9,9,10,10,9,10,10,10,10,9,9,10,8,10,10,10,10,10,10,10,10,10,10,8,7,6,},
    {12,7,11,9,10,12,10,13,9,8,13,10,7,10,10,13,12,7,7,13,7,13,12,13,12,12,12,13,13,7,12,13,9,10,13,11,12,12,13,10,12,12,10,6,11,8,11,11,10,10,12,12,11,10,9,7,9,9,12,11,10,12,0,10,12,12,12,11,12,12,11,12,12,9,12,12,12,12,12,11,12,13,10,13,12,13,12,12,12,13,12,13,9,11,9,},
    {11,5,10,10,11,10,8,10,10,6,8,10,9,11,11,9,11,11,10,9,10,9,10,9,9,11,10,9,9,11,10,9,11,10,9,10,10,11,9,11,11,11,10,11,10,11,7,10,11,9,9,11,8,8,8,11,8,11,11,7,9,9,0,8,10,11,10,11,10,10,10,11,11,10,11,11,11,11,10,10,11,9,11,11,11,11,11,11,11,11,11,11,9,9,7,},
    {9,3,8,8,9,8,6,8,8,4,6,8,6,9,9,7,9,9,8,6,8,7,8,7,7,9,8,6,6,9,8,6,9,8,7,8,8,9,6,9,9,9,8,9,8,9,5,8,9,7,7,9,6,6,6,9,6,9,9,5,7,6,0,6,8,9,8,9,8,8,8,9,9,8,9,9,9,9,8,8,9,7,9,9,9,9,9,9,9,9,9,9,7,6,5,},
    {9,3,8,8,9,8,6,8,8,4,5,8,5,9,9,7,9,9,8,5,8,7,8,7,7,9,8,5,5,9,8,6,9,8,7,8,8,9,6,9,9,9,8,9,8,9,5,8,9,7,7,9,6,6,6,9,6,9,9,5,7,5,0,6,8,9,8,9,8,8,8,9,9,8,9,9,9,9,8,8,9,7,9,9,9,9,9,9,9,9,9,9,7,5,5,},
    {9,3,8,8,9,8,6,8,8,5,5,8,6,9,9,7,9,9,8,6,8,7,8,7,7,9,8,6,6,9,8,6,9,8,7,8,8,9,6,9,9,9,8,9,8,9,5,8,9,7,7,9,6,6,6,9,6,9,9,5,7,6,0,6,8,9,8,9,8,8,8,9,9,8,9,9,9,9,8,8,9,7,9,9,9,9,9,9,9,9,9,9,7,6,5,},
    {7,4,6,6,7,6,4,6,6,4,5,6,3,7,7,5,7,7,6,5,6,5,6,5,5,7,6,5,5,7,6,5,7,6,5,6,6,7,5,7,7,7,6,7,6,7,3,6,7,5,5,7,4,4,4,7,4,7,7,3,5,4,0,4,6,7,6,7,6,6,6,7,7,6,7,7,7,7,6,6,7,5,7,7,7,7,7,7,7,7,7,7,5,3,3,},
    {10,4,9,9,10,9,7,9,9,5,7,9,7,10,10,8,10,10,9,7,9,8,9,8,8,10,9,7,7,10,9,7,10,9,8,9,9,10,7,10,10,10,9,10,9,10,6,9,10,8,8,10,7,7,7,10,7,10,10,6,8,7,0,7,9,10,9,10,9,9,9,10,10,9,10,10,10,10,9,9,10,8,10,10,10,10,10,10,10,10,10,10,8,7,6,},
    {10,5,9,7,8,10,8,11,7,6,11,8,5,8,8,11,10,5,5,11,5,11,10,11,10,10,10,11,11,5,10,11,7,8,11,9,10,10,11,8,10,10,8,3,9,6,9,9,8,8,10,10,9,8,7,5,7,7,10,9,8,10,0,8,10,10,10,9,10,10,9,10,10,7,10,10,10,10,10,9,10,11,8,11,10,11,10,10,10,11,10,11,7,9,7,},
    {11,5,11,10,10,11,8,11,9,6,11,9,11,11,10,11,10,10,11,11,11,11,10,11,10,10,10,11,11,10,10,11,10,9,11,9,11,10,11,11,10,10,9,10,9,10,9,9,10,8,11,10,9,8,8,11,7,10,10,9,8,11,0,8,11,10,11,11,11,10,11,10,10,9,10,10,10,10,11,9,11,11,10,11,10,11,10,10,10,11,10,11,8,11,7,},
    {7,1,6,6,7,6,4,7,6,2,7,6,5,7,7,7,7,7,6,7,6,7,6,7,6,7,6,7,7,7,6,7,7,6,7,6,6,7,7,7,7,7,6,7,6,7,5,6,7,5,6,7,5,4,4,7,4,7,7,5,5,6,0,4,6,7,6,7,6,6,6,7,7,6,7,7,7,7,6,6,7,7,7,7,7,7,7,7,7,7,7,7,5,5,3,},
    {10,4,9,9,10,9,7,9,9,5,7,9,7,10,10,8,10,10,9,7,9,8,9,8,8,10,9,7,7,10,9,7,10,9,8,9,9,10,7,10,10,10,9,10,9,10,6,9,10,8,8,10,7,7,7,10,7,10,10,6,8,7,3,7,9,10,9,10,9,9,9,10,10,9,10,10,10,10,9,9,10,8,10,10,10,10,10,10,10,10,10,10,8,7,6,},
    {8,2,7,7,8,7,5,7,7,3,6,7,4,8,8,6,8,8,7,6,7,6,7,6,6,8,7,6,6,8,7,6,8,7,6,7,7,8,6,8,8,8,7,8,7,8,4,7,8,6,6,8,5,5,5,8,5,8,8,4,6,5,0,5,7,8,7,8,7,7,7,8,8,7,8,8,8,8,7,7,8,6,8,8,8,8,8,8,8,8,8,8,6,4,4,},
    {3,5,3,2,4,3,5,3,4,7,3,4,3,4,2,4,4,4,4,3,3,3,5,3,4,3,3,3,3,3,5,3,2,5,3,5,3,4,3,3,4,4,5,2,5,2,5,5,2,5,3,4,5,5,5,4,5,3,3,7,3,3,0,4,3,2,3,3,3,3,3,2,3,3,2,2,2,2,3,2,3,3,2,3,2,3,2,2,2,3,3,7,3,3,6,},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
    {5,7,5,5,6,5,7,6,4,7,6,4,5,5,4,6,6,6,6,6,5,6,7,6,6,5,5,6,6,5,7,6,5,7,6,7,5,6,6,5,6,6,7,4,7,4,7,7,4,7,5,6,7,7,7,6,7,5,5,7,3,5,0,6,5,5,5,5,5,5,5,5,5,3,5,5,5,5,5,4,5,6,5,6,5,6,5,5,5,6,5,7,3,5,7,},
    {8,3,8,6,6,8,6,9,5,4,9,6,7,7,6,9,8,5,7,9,7,9,8,9,8,8,8,9,9,5,8,9,6,6,9,7,8,8,9,7,8,8,6,1,7,4,7,7,6,6,8,8,7,6,5,7,5,6,8,7,6,8,0,6,8,8,8,8,8,8,8,8,8,5,8,8,8,8,8,7,8,9,6,9,8,9,8,8,8,9,8,9,5,7,5,},
    {2,4,1,1,3,1,4,2,0,4,0,1,0,1,0,2,3,3,3,2,2,1,4,2,3,0,0,0,0,2,4,2,0,4,1,4,1,3,1,0,3,3,4,0,4,0,4,4,1,4,0,3,4,4,4,3,4,1,1,3,0,0,0,3,0,1,0,0,0,0,0,1,2,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,4,0,0,4,},
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

