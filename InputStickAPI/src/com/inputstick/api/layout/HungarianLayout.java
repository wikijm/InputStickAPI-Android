package com.inputstick.api.layout;

public class HungarianLayout extends KeyboardLayout {
	
	public static final String LOCALE_NAME = 			"hu-HU";
	public static final String LAYOUT_NAME_NATIVE = 	"Magyar";
	public static final String LAYOUT_NAME_ENGLISH = 	"Hungarian";
	public static final String LAYOUT_VARIANT = 		"HU";
	
	//{char (16b unicode), modifier, key, deadkey_modifier, deadkey}
	//hu-HU
	private static final int[][] FAST_LUT = {
		{	 0,	    0,	    0,	    0,	    0	},	// empty	
		{	10,	    0,	   40,	    0,	    0	},	// enter
		{	 9,	    0,	   43,	    0,	    0	},	// tab			
		{   32,	    0,	   44,	    0,	    0	},	// space
		{   33,	    2,	   33,	    0,	    0	},	// !
		{   34,	    2,	   31,	    0,	    0	},	// "
		{   35,	   64,	   27,	    0,	    0	},	// #
		{   36,	   64,	   51,	    0,	    0	},	// $
		{   37,	    2,	   34,	    0,	    0	},	// %
		{   38,	   64,	    6,	    0,	    0	},	// &
		{   39,	    2,	   30,	    0,	    0	},	// '
		{   40,	    2,	   37,	    0,	    0	},	// (
		{   41,	    2,	   38,	    0,	    0	},	// )
		{   42,	   64,	   56,	    0,	    0	},	// *
		{   43,	    2,	   32,	    0,	    0	},	// +
		{   44,	    0,	   54,	    0,	    0	},	// ,
		{   45,	    0,	   56,	    0,	    0	},	// -
		{   46,	    0,	   55,	    0,	    0	},	// .
		{   47,	    2,	   35,	    0,	    0	},	// /
		{   48,	    0,	   53,	    0,	    0	},	// 0
		{   49,	    0,	   30,	    0,	    0	},	// 1
		{   50,	    0,	   31,	    0,	    0	},	// 2
		{   51,	    0,	   32,	    0,	    0	},	// 3
		{   52,	    0,	   33,	    0,	    0	},	// 4
		{   53,	    0,	   34,	    0,	    0	},	// 5
		{   54,	    0,	   35,	    0,	    0	},	// 6
		{   55,	    0,	   36,	    0,	    0	},	// 7
		{   56,	    0,	   37,	    0,	    0	},	// 8
		{   57,	    0,	   38,	    0,	    0	},	// 9
		{   58,	    2,	   55,	    0,	    0	},	// :
		{   59,	   64,	   54,	    0,	    0	},	// ;
		{   60,	   64,	   16,	    0,	    0	},	// <
		{   61,	    2,	   36,	    0,	    0	},	// =
		{   62,	   64,	   29,	    0,	    0	},	// >
		{   63,	    2,	   54,	    0,	    0	},	// ?
		{   64,	   64,	   25,	    0,	    0	},	// @
		{   65,	    2,	    4,	    0,	    0	},	// A
		{   66,	    2,	    5,	    0,	    0	},	// B
		{   67,	    2,	    6,	    0,	    0	},	// C
		{   68,	    2,	    7,	    0,	    0	},	// D
		{   69,	    2,	    8,	    0,	    0	},	// E
		{   70,	    2,	    9,	    0,	    0	},	// F
		{   71,	    2,	   10,	    0,	    0	},	// G
		{   72,	    2,	   11,	    0,	    0	},	// H
		{   73,	    2,	   12,	    0,	    0	},	// I
		{   74,	    2,	   13,	    0,	    0	},	// J
		{   75,	    2,	   14,	    0,	    0	},	// K
		{   76,	    2,	   15,	    0,	    0	},	// L
		{   77,	    2,	   16,	    0,	    0	},	// M
		{   78,	    2,	   17,	    0,	    0	},	// N
		{   79,	    2,	   18,	    0,	    0	},	// O
		{   80,	    2,	   19,	    0,	    0	},	// P
		{   81,	    2,	   20,	    0,	    0	},	// Q
		{   82,	    2,	   21,	    0,	    0	},	// R
		{   83,	    2,	   22,	    0,	    0	},	// S
		{   84,	    2,	   23,	    0,	    0	},	// T
		{   85,	    2,	   24,	    0,	    0	},	// U
		{   86,	    2,	   25,	    0,	    0	},	// V
		{   87,	    2,	   26,	    0,	    0	},	// W
		{   88,	    2,	   27,	    0,	    0	},	// X
		{   89,	    2,	   29,	    0,	    0	},	// Y
		{   90,	    2,	   28,	    0,	    0	},	// Z
		{   91,	   64,	    9,	    0,	    0	},	// [
		{   92,	   64,	   20,	    0,	    0	},	// backslash
		{   93,	   64,	   10,	    0,	    0	},	// ]
		{   94,	    0,	   44,	   64,	   32	},	// ^
		{   95,	    2,	   56,	    0,	    0	},	// _
		{   96,	   64,	   36,	    0,	    0	},	// `
		{   97,	    0,	    4,	    0,	    0	},	// a
		{   98,	    0,	    5,	    0,	    0	},	// b
		{   99,	    0,	    6,	    0,	    0	},	// c
		{  100,	    0,	    7,	    0,	    0	},	// d
		{  101,	    0,	    8,	    0,	    0	},	// e
		{  102,	    0,	    9,	    0,	    0	},	// f
		{  103,	    0,	   10,	    0,	    0	},	// g
		{  104,	    0,	   11,	    0,	    0	},	// h
		{  105,	    0,	   12,	    0,	    0	},	// i
		{  106,	    0,	   13,	    0,	    0	},	// j
		{  107,	    0,	   14,	    0,	    0	},	// k
		{  108,	    0,	   15,	    0,	    0	},	// l
		{  109,	    0,	   16,	    0,	    0	},	// m
		{  110,	    0,	   17,	    0,	    0	},	// n
		{  111,	    0,	   18,	    0,	    0	},	// o
		{  112,	    0,	   19,	    0,	    0	},	// p
		{  113,	    0,	   20,	    0,	    0	},	// q
		{  114,	    0,	   21,	    0,	    0	},	// r
		{  115,	    0,	   22,	    0,	    0	},	// s
		{  116,	    0,	   23,	    0,	    0	},	// t
		{  117,	    0,	   24,	    0,	    0	},	// u
		{  118,	    0,	   25,	    0,	    0	},	// v
		{  119,	    0,	   26,	    0,	    0	},	// w
		{  120,	    0,	   27,	    0,	    0	},	// x
		{  121,	    0,	   29,	    0,	    0	},	// y
		{  122,	    0,	   28,	    0,	    0	},	// z
		{  123,	   64,	    5,	    0,	    0	},	// {
		{  124,	   64,	   26,	    0,	    0	},	// |
		{  125,	   64,	   17,	    0,	    0	},	// }
		{  126,	   64,	   30,	    0,	    0	},	// ~
		{  164,	   64,	   49,	    0,	    0	},	//
		{  167,	    2,	   53,	    0,	    0	},	// �
		{  168,	    0,	   44,	   64,	   45	},	// �
		{  176,	    0,	   44,	   64,	   34	},	// �
		{  180,	    0,	   44,	   64,	   38	},	// �
		{  184,	    0,	   44,	   64,	   46	},	// �
		{  193,	    2,	   52,	    0,	    0	},	// �
		{  194,	    2,	    4,	   64,	   32	},	// �
		{  196,	   64,	    8,	    0,	    0	},	// �
		{  199,	    2,	    6,	   64,	   46	},	// �
		{  201,	    2,	   51,	    0,	    0	},	// �
		{  203,	    2,	    8,	   64,	   45	},	// �
		{  205,	   64,	   12,	    0,	    0	},	// �
		{  206,	    2,	   12,	   64,	   32	},	// �
		{  211,	    2,	   46,	    0,	    0	},	// �
		{  212,	    2,	   18,	   64,	   32	},	// �
		{  214,	    2,	   39,	    0,	    0	},	// �
		{  215,	   64,	   48,	    0,	    0	},	// �
		{  218,	    2,	   48,	    0,	    0	},	// �
		{  220,	    2,	   45,	    0,	    0	},	// �
		{  221,	    2,	   29,	   64,	   38	},	// �
		{  223,	   64,	   52,	    0,	    0	},	// �
		{  225,	    0,	   52,	    0,	    0	},	// �
		{  226,	    0,	    4,	   64,	   32	},	// �
		{  228,	   64,	    4,	    0,	    0	},	// �
		{  231,	    0,	    6,	   64,	   46	},	// �
		{  233,	    0,	   51,	    0,	    0	},	// �
		{  235,	    0,	    8,	   64,	   45	},	// �
		{  237,	   64,	   13,	    0,	    0	},	// �
		{  238,	    0,	   12,	   64,	   32	},	// �
		{  243,	    0,	   46,	    0,	    0	},	// �
		{  244,	    0,	   18,	   64,	   32	},	// �
		{  246,	    0,	   39,	    0,	    0	},	// �
		{  247,	   64,	   47,	    0,	    0	},	// �
		{  250,	    0,	   48,	    0,	    0	},	// �
		{  252,	    0,	   45,	    0,	    0	},	// �
		{  253,	    0,	   29,	   64,	   38	},	// �
		{  258,	    2,	    4,	   64,	   33	},	// �
		{  259,	    0,	    4,	   64,	   33	},	// �
		{  260,	    2,	    4,	   64,	   35	},	// �
		{  261,	    0,	    4,	   64,	   35	},	// �
		{  262,	    2,	    6,	   64,	   38	},	// �
		{  263,	    0,	    6,	   64,	   38	},	// �
		{  268,	    2,	    6,	   64,	   31	},	// �
		{  269,	    0,	    6,	   64,	   31	},	// �
		{  270,	    2,	    7,	   64,	   31	},	// �
		{  271,	    0,	    7,	   64,	   31	},	// �
		{  272,	   64,	    7,	    0,	    0	},	// �
		{  273,	   64,	   22,	    0,	    0	},	// �
		{  280,	    2,	    8,	   64,	   35	},	// �
		{  281,	    0,	    8,	   64,	   35	},	// �
		{  282,	    2,	    8,	   64,	   31	},	// �
		{  283,	    0,	    8,	   64,	   31	},	// �
		{  313,	    2,	   15,	   64,	   38	},	// �
		{  314,	    0,	   15,	   64,	   38	},	// �
		{  321,	   64,	   15,	    0,	    0	},	// �
		{  322,	   64,	   14,	    0,	    0	},	// �
		{  323,	    2,	   17,	   64,	   38	},	// �
		{  324,	    0,	   17,	   64,	   38	},	// �
		{  327,	    2,	   17,	   64,	   31	},	// �
		{  328,	    0,	   17,	   64,	   31	},	// �
		{  336,	    2,	   47,	    0,	    0	},	// �
		{  337,	    0,	   47,	    0,	    0	},	// �
		{  340,	    2,	   21,	   64,	   38	},	// �
		{  341,	    0,	   21,	   64,	   38	},	// �
		{  344,	    2,	   21,	   64,	   31	},	// �
		{  345,	    0,	   21,	   64,	   31	},	// �
		{  346,	    2,	   22,	   64,	   38	},	// �
		{  347,	    0,	   22,	   64,	   38	},	// �
		{  350,	    2,	   22,	   64,	   46	},	// �
		{  351,	    0,	   22,	   64,	   46	},	// �
		{  352,	    2,	   22,	   64,	   31	},	// �
		{  353,	    0,	   22,	   64,	   31	},	// �
		{  354,	    2,	   23,	   64,	   46	},	// �
		{  355,	    0,	   23,	   64,	   46	},	// �
		{  356,	    2,	   23,	   64,	   31	},	// �
		{  357,	    0,	   23,	   64,	   31	},	// �
		{  366,	    2,	   24,	   64,	   34	},	// �
		{  367,	    0,	   24,	   64,	   34	},	// �
		{  368,	    2,	   49,	    0,	    0	},	// �
		{  369,	    0,	   49,	    0,	    0	},	// �
		{  377,	    2,	   28,	   64,	   38	},	// �
		{  378,	    0,	   28,	   64,	   38	},	// �
		{  379,	    2,	   28,	   64,	   37	},	// �
		{  380,	    0,	   28,	   64,	   37	},	// �
		{  381,	    2,	   28,	   64,	   31	},	// �
		{  382,	    0,	   28,	   64,	   31	},	// �
		{  711,	    0,	   44,	   64,	   31	},	// �
		{  728,	    0,	   44,	   64,	   33	},	// �
		{  729,	    0,	   44,	   64,	   37	},	// �
		{  731,	    0,	   44,	   64,	   35	},	// �
		{  733,	    0,	   44,	   64,	   39	},	// �
		{ 8364,	   64,	   24,	    0,	    0	},	// �
	};	
	
	public static final int LUT[][] = {
		/*	0	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	1	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
		/*	02	*/	{	0	,	(int)'1'	,	0x0027		,	-1		,	0x007e	,	-1		}	,
		/*	03	*/	{	0	,	(int)'2'	,	0x0022		,	-1		,	0x02c7	,	-1		}	,
		/*	04	*/	{	0	,	(int)'3'	,	0x002b		,	-1		,	0x005e	,	-1		}	,
		/*	05	*/	{	0	,	(int)'4'	,	0x0021		,	-1		,	0x02d8	,	-1		}	,
		/*	06	*/	{	0	,	(int)'5'	,	0x0025		,	-1		,	0x00b0	,	-1		}	,
		/*	07	*/	{	0	,	(int)'6'	,	0x002f		,	-1		,	0x02db	,	-1		}	,
		/*	08	*/	{	0	,	(int)'7'	,	0x003d		,	-1		,	0x0060	,	-1		}	,
		/*	09	*/	{	0	,	(int)'8'	,	0x0028		,	-1		,	0x02d9	,	-1		}	,
		/*	0a	*/	{	0	,	(int)'9'	,	0x0029		,	-1		,	0x00b4	,	-1		}	,
		/*	0b	*/	{	1	,	0x00f6		,	0x00d6		,	-1		,	0x02dd	,	-1		}	,
		/*	0c	*/	{	1	,	0x00fc		,	0x00dc		,	-1		,	0x00a8	,	-1		}	,
		/*	0d	*/	{	1	,	0x00f3		,	0x00d3		,	-1		,	0x00b8	,	-1		}	,
		/*	0e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	0f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
				
		/*	10	*/	{	1	,	(int)'q'	,	(int)'Q'	,	-1		,	0x005c	,	-1		}	,
		/*	11	*/	{	1	,	(int)'w'	,	(int)'W'	,	-1		,	0x007c	,	-1		}	,
		/*	12	*/	{	1	,	(int)'e'	,	(int)'E'	,	-1		,	0x00c4	,	-1		}	,
		/*	13	*/	{	1	,	(int)'r'	,	(int)'R'	,	-1		,	-1		,	-1		}	,
		/*	14	*/	{	1	,	(int)'t'	,	(int)'T'	,	-1		,	-1		,	-1		}	,
		/*	15	*/	{	1	,	(int)'z'	,	(int)'Z'	,	-1		,	-1		,	-1		}	,
		/*	16	*/	{	1	,	(int)'u'	,	(int)'U'	,	-1		,	0x20ac	,	-1		}	,
		/*	17	*/	{	1	,	(int)'i'	,	(int)'I'	,	-1		,	0x00cd	,	-1		}	,
		/*	18	*/	{	1	,	(int)'o'	,	(int)'O'	,	-1		,	-1		,	-1		}	,
		/*	19	*/	{	1	,	(int)'p'	,	(int)'P'	,	-1		,	-1		,	-1		}	,
		/*	1a	*/	{	1	,	0x0151		,	0x0150		,	0x001b	,	0x00f7	,	-1		}	,
		/*	1b	*/	{	1	,	0x00fa		,	0x00da		,	0x001d	,	0x00d7	,	-1		}	,
		/*	1c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	1d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
		/*	1e	*/	{	1	,	(int)'a'	,	(int)'A'	,	-1		,	0x00e4	,	-1		}	,
		/*	1f	*/	{	1	,	(int)'s'	,	(int)'S'	,	-1		,	0x0111	,	-1		}	,		
		
		/*	20	*/	{	1	,	(int)'d'	,	(int)'D'	,	-1		,	0x0110	,	-1		}	,
		/*	21	*/	{	1	,	(int)'f'	,	(int)'F'	,	-1		,	0x005b	,	-1		}	,
		/*	22	*/	{	1	,	(int)'g'	,	(int)'G'	,	-1		,	0x005d	,	-1		}	,
		/*	23	*/	{	1	,	(int)'h'	,	(int)'H'	,	-1		,	-1		,	-1		}	,
		/*	24	*/	{	1	,	(int)'j'	,	(int)'J'	,	-1		,	0x00ed	,	-1		}	,
		/*	25	*/	{	1	,	(int)'k'	,	(int)'K'	,	-1		,	0x0142	,	-1		}	,
		/*	26	*/	{	1	,	(int)'l'	,	(int)'L'	,	-1		,	0x0141	,	-1		}	,
		/*	27	*/	{	1	,	0x00e9		,	0x00c9		,	-1		,	0x0024	,	-1		}	,
		/*	28	*/	{	1	,	0x00e1		,	0x00c1		,	-1		,	0x00df	,	-1		}	,
		/*	29	*/	{	0	,	(int)'0' /*0*/			,	0x00a7		,	-1		,	-1		,	-1		}	,
		/*	2a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	2b	*/	{	1	,	0x0171		,	0x0170		,	0x001c	,	0x00a4	,	-1		}	,
		/*	2c	*/	{	1	,	(int)'y'	,	(int)'Y'	,	-1		,	0x003e	,	-1		}	,
		/*	2d	*/	{	1	,	(int)'x'	,	(int)'X'	,	-1		,	0x0023	,	-1		}	,
		/*	2e	*/	{	1	,	(int)'c'	,	(int)'C'	,	-1		,	0x0026	,	-1		}	,
		/*	2f	*/	{	1	,	(int)'v'	,	(int)'V'	,	-1		,	0x0040	,	-1		}	,
				
		/*	30	*/	{	1	,	(int)'b'	,	(int)'B'	,	-1		,	0x007b	,	-1		}	,
		/*	31	*/	{	1	,	(int)'n'	,	(int)'N'	,	-1		,	0x007d	,	-1		}	,
		/*	32	*/	{	1	,	(int)'m'	,	(int)'M'	,	-1		,	0x003c	,	-1		}	,
		/*	33	*/	{	0	,	0x002c		,	0x003f		,	-1		,	0x003b	,	-1		}	,
		/*	34	*/	{	0	,	0x002e		,	0x003a		,	-1		,	0x003e	,	-1		}	,
		/*	35	*/	{	0	,	0x002d		,	0x005f		,	-1		,	0x002a	,	-1		}	,
		/*	36	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	37	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	38	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
		/*	39	*/	{	0	,	0x0020		,	0x0020		,	0x0020	,	-1		,	-1		}	,
		/*	3a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3b	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	3f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
		
		/*	40	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	41	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	42	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	43	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	44	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	45	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	46	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	47	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,	
		/*	48	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	49	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4b	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	4f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
		
		/*	50	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	51	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,	
		/*	52	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	53	*/	{	0	,	0x002c		,	0x002c		,	-1		,	-1		,	-1		}	,
		/*	54	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	55	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
		/*	56	*/	{	1	,	0x00ed		,	0x00cd		,	0x001c	,	0x003c	,	-1		}	,
		/*	57	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,	
		/*	58	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	59	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5a	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5b	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5c	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5d	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5e	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		/*	5f	*/	{	-1	,	0			,	0			,	0		,	0		,	0		}	,						
	};
	
	public static final int DEADKEYS[] = {
		0x005e, 0x00a8, 0x00b0, 0x00b4, 0x00b8, 0x02c7, 0x02d8, 0x02d9, 0x02db, 0x02dd
	};
	
	public static final int DEADKEY_LUT[][] = {
		{	0x005e	,	0x0061	,	0x00e2	}	,
		{	0x005e	,	0x0069	,	0x00ee	}	,
		{	0x005e	,	0x006f	,	0x00f4	}	,
		{	0x005e	,	0x0041	,	0x00c2	}	,
		{	0x005e	,	0x0049	,	0x00ce	}	,
		{	0x005e	,	0x004f	,	0x00d4	}	,
		{	0x005e	,	0x0020	,	0x005e	}	,		
		
		{	0x00a8	,	0x0061	,	0x00e4	}	,
		{	0x00a8	,	0x0065	,	0x00eb	}	,
		{	0x00a8	,	0x0075	,	0x00fc	}	,
		{	0x00a8	,	0x006f	,	0x00f6	}	,
		{	0x00a8	,	0x0041	,	0x00c4	}	,
		{	0x00a8	,	0x0045	,	0x00cb	}	,
		{	0x00a8	,	0x0055	,	0x00dc	}	,
		{	0x00a8	,	0x004f	,	0x00d6	}	,
		{	0x00a8	,	0x0020	,	0x00a8	}	,
		
		{	0x00b0	,	0x0075	,	0x016f	}	,
		{	0x00b0	,	0x0055	,	0x016e	}	,
		{	0x00b0	,	0x0020	,	0x00b0	}	,
		
		{	0x00b4	,	0x006e	,	0x0144	}	,
		{	0x00b4	,	0x0063	,	0x0107	}	,
		{	0x00b4	,	0x0079	,	0x00fd	}	,
		{	0x00b4	,	0x0061	,	0x00e1	}	,
		{	0x00b4	,	0x0073	,	0x015b	}	,
		{	0x00b4	,	0x006c	,	0x013a	}	,
		{	0x00b4	,	0x0065	,	0x00e9	}	,
		{	0x00b4	,	0x0072	,	0x0155	}	,
		{	0x00b4	,	0x0075	,	0x00fa	}	,
		{	0x00b4	,	0x0069	,	0x00ed	}	,
		{	0x00b4	,	0x007a	,	0x017a	}	,
		{	0x00b4	,	0x006f	,	0x00f3	}	,
		{	0x00b4	,	0x004e	,	0x0143	}	,
		{	0x00b4	,	0x0043	,	0x0106	}	,
		{	0x00b4	,	0x0059	,	0x00dd	}	,
		{	0x00b4	,	0x0041	,	0x00c1	}	,
		{	0x00b4	,	0x0053	,	0x015a	}	,
		{	0x00b4	,	0x004c	,	0x0139	}	,
		{	0x00b4	,	0x0045	,	0x00c9	}	,
		{	0x00b4	,	0x0052	,	0x0154	}	,
		{	0x00b4	,	0x0055	,	0x00da	}	,
		{	0x00b4	,	0x0049	,	0x00cd	}	,
		{	0x00b4	,	0x005a	,	0x0179	}	,
		{	0x00b4	,	0x004f	,	0x00d3	}	,
		{	0x00b4	,	0x0020	,	0x00b4	}	,				
		
		{	0x00b8	,	0x0063	,	0x00e7	}	,
		{	0x00b8	,	0x0073	,	0x015f	}	,
		{	0x00b8	,	0x0074	,	0x0163	}	,
		{	0x00b8	,	0x0043	,	0x00c7	}	,
		{	0x00b8	,	0x0053	,	0x015e	}	,
		{	0x00b8	,	0x0054	,	0x0162	}	,
		{	0x00b8	,	0x0020	,	0x00b8	}	,						
		
		{	0x02c7	,	0x006e	,	0x0148	}	,
		{	0x02c7	,	0x0063	,	0x010d	}	,
		{	0x02c7	,	0x0064	,	0x010f	}	,
		{	0x02c7	,	0x0073	,	0x0161	}	,
		{	0x02c7	,	0x0065	,	0x011b	}	,
		{	0x02c7	,	0x0072	,	0x0159	}	,
		{	0x02c7	,	0x0074	,	0x0165	}	,
		{	0x02c7	,	0x007a	,	0x017e	}	,
		{	0x02c7	,	0x004e	,	0x0147	}	,
		{	0x02c7	,	0x0043	,	0x010c	}	,
		{	0x02c7	,	0x0044	,	0x010e	}	,
		{	0x02c7	,	0x0053	,	0x0160	}	,
		{	0x02c7	,	0x0045	,	0x011a	}	,
		{	0x02c7	,	0x0052	,	0x0158	}	,
		{	0x02c7	,	0x0054	,	0x0164	}	,
		{	0x02c7	,	0x005a	,	0x017d	}	,
		{	0x02c7	,	0x0020	,	0x02c7	}	,
		
		{	0x02d8	,	0x0061	,	0x0103	}	,
		{	0x02d8	,	0x0041	,	0x0102	}	,
		{	0x02d8	,	0x0020	,	0x02d8	}	,
		
		{	0x02d9	,	0x007a	,	0x017c	}	,
		{	0x02d9	,	0x005a	,	0x017b	}	,
		{	0x02d9	,	0x0020	,	0x02d9	}	,
		
		{	0x02db	,	0x0061	,	0x0105	}	,
		{	0x02db	,	0x0065	,	0x0119	}	,
		{	0x02db	,	0x0041	,	0x0104	}	,
		{	0x02db	,	0x0045	,	0x0118	}	,
		{	0x02db	,	0x0020	,	0x02db	}	,
		
		{	0x02dd	,	0x0075	,	0x0171	}	,
		{	0x02dd	,	0x006f	,	0x0151	}	,
		{	0x02dd	,	0x0055	,	0x0170	}	,
		{	0x02dd	,	0x004f	,	0x0150	}	,
		{	0x02dd	,	0x0020	,	0x02dd	}	,				
	};
	
	private static HungarianLayout instance = new HungarianLayout();
	
	private HungarianLayout() {
	}
	
	public static HungarianLayout getInstance() {
		return instance;
	}	
	
	@Override
	public int[][] getLUT() {
		return LUT;
	}

	@Override
	public int[][] getFastLUT() {
		return FAST_LUT;
	}

	@Override
	public void type(String text) {
		super.type(FAST_LUT, text, (byte)0);
	}	
	
	@Override
	public void type(String text, int typingSpeed) {
		super.type(FAST_LUT, text, (byte)0, typingSpeed);
	}
	
	@Override
	public void type(String text, byte modifiers) {
		super.type(FAST_LUT, text, modifiers);
	}
	
	@Override
	public void type(String text, byte modifiers, int typingSpeed) {
		super.type(FAST_LUT, text, modifiers, typingSpeed);
	}
	
	@Override
	public char getChar(int scanCode, boolean capsLock, boolean shift, boolean altGr) {
		return super.getChar(LUT, scanCode, capsLock, shift, altGr);
	}	
	
	@Override
	public String getLocaleName() {		
		return LOCALE_NAME;
	}	
	
	@Override
	public String getNativeName() {
		return LAYOUT_NAME_NATIVE; 
	}
	
	@Override
	public String getEnglishName() {
		return LAYOUT_NAME_ENGLISH;
	}
	
	@Override
	public String getVariant() {
		return LAYOUT_VARIANT;
	}
	
	@Override
	public int[][] getDeadkeyLUT() {		
		return DEADKEY_LUT;
	}

	@Override
	public int[] getDeadkeys() {
		return DEADKEYS;
	}

}
