# Generated from MyLexer.g4 by ANTLR 4.13.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,95,1011,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,
        13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,
        19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,
        26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,
        32,2,33,7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,
        39,7,39,2,40,7,40,2,41,7,41,2,42,7,42,2,43,7,43,2,44,7,44,2,45,7,
        45,2,46,7,46,2,47,7,47,2,48,7,48,2,49,7,49,2,50,7,50,2,51,7,51,2,
        52,7,52,2,53,7,53,2,54,7,54,2,55,7,55,2,56,7,56,2,57,7,57,2,58,7,
        58,2,59,7,59,2,60,7,60,2,61,7,61,2,62,7,62,2,63,7,63,2,64,7,64,2,
        65,7,65,2,66,7,66,2,67,7,67,2,68,7,68,2,69,7,69,2,70,7,70,2,71,7,
        71,2,72,7,72,2,73,7,73,2,74,7,74,2,75,7,75,2,76,7,76,2,77,7,77,2,
        78,7,78,2,79,7,79,2,80,7,80,2,81,7,81,2,82,7,82,2,83,7,83,2,84,7,
        84,2,85,7,85,2,86,7,86,2,87,7,87,2,88,7,88,2,89,7,89,2,90,7,90,2,
        91,7,91,2,92,7,92,2,93,7,93,2,94,7,94,2,95,7,95,2,96,7,96,2,97,7,
        97,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,
        4,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,
        7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,10,1,10,1,10,1,10,
        1,10,1,11,1,11,1,11,1,11,1,11,1,12,1,12,1,12,1,12,1,13,1,13,1,13,
        1,14,1,14,1,14,1,14,1,15,1,15,1,15,1,15,1,15,1,15,1,16,1,16,1,16,
        1,16,1,16,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,18,1,18,1,19,1,19,
        1,19,1,19,1,19,1,19,1,20,1,20,1,20,1,20,1,20,1,20,1,21,1,21,1,21,
        1,21,1,21,1,21,1,21,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,23,1,23,
        1,23,1,23,1,23,1,23,1,23,1,24,1,24,1,24,1,24,1,25,1,25,1,25,1,25,
        1,26,1,26,1,26,1,26,1,26,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,28,
        1,28,1,28,1,28,1,28,1,29,1,29,1,29,1,30,1,30,1,30,1,30,1,30,1,30,
        1,30,1,30,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,32,1,32,
        1,32,1,32,1,32,1,32,1,32,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,34,
        1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,35,1,35,
        1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,36,1,36,1,36,1,36,1,36,1,36,
        1,36,1,36,1,36,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,
        1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,39,1,39,1,39,
        1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,40,1,40,1,40,1,40,1,40,
        1,40,1,40,1,40,1,40,1,40,1,40,1,40,1,41,1,41,1,41,1,41,1,41,1,41,
        1,41,1,41,1,41,1,41,1,41,1,41,1,41,1,42,1,42,1,42,1,42,1,42,1,42,
        1,42,1,42,1,42,1,42,1,42,1,43,1,43,1,43,1,43,1,43,1,43,1,43,1,43,
        1,43,1,43,1,43,1,44,1,44,1,44,1,44,1,44,1,44,1,44,1,44,1,44,1,44,
        1,44,1,44,1,45,1,45,1,45,1,45,1,45,1,45,1,45,1,46,1,46,1,46,1,46,
        1,46,1,46,1,47,1,47,1,47,1,47,1,47,1,47,1,47,1,47,1,47,1,47,1,47,
        1,47,1,47,1,47,1,48,1,48,1,48,1,48,1,48,1,48,1,48,1,48,1,48,1,48,
        1,48,1,48,1,48,1,48,1,48,1,48,1,48,1,48,1,48,1,48,1,49,1,49,1,49,
        1,49,1,49,1,49,1,49,1,49,1,49,1,49,1,49,1,50,1,50,1,50,1,50,1,50,
        1,50,1,50,1,50,1,50,1,50,1,50,1,51,1,51,1,51,1,51,1,51,1,51,1,51,
        1,51,1,51,1,51,1,51,1,51,1,51,1,51,1,51,1,52,1,52,1,52,1,52,1,52,
        1,52,1,52,1,52,1,52,1,52,1,52,1,52,1,52,1,53,1,53,1,53,1,53,1,53,
        1,53,1,53,1,53,1,53,1,53,1,53,1,53,1,53,1,54,1,54,1,54,1,54,1,54,
        1,54,1,54,1,54,1,54,1,54,1,54,1,54,1,54,1,55,1,55,1,55,1,55,1,55,
        1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,56,1,56,1,56,1,56,1,56,
        1,57,1,57,1,57,1,57,1,57,1,57,1,57,1,58,1,58,1,58,1,58,1,58,1,58,
        1,58,1,58,1,59,1,59,1,59,1,59,1,59,1,59,1,59,1,59,1,60,1,60,1,60,
        1,60,1,60,1,60,1,60,1,60,1,61,1,61,1,61,1,61,1,61,1,61,1,61,1,61,
        1,61,1,61,1,61,1,61,1,61,1,61,1,61,1,62,1,62,1,62,1,62,1,62,1,62,
        1,62,1,62,1,62,1,62,1,62,1,62,1,62,1,62,1,62,1,62,1,62,1,62,1,62,
        1,62,1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,63,
        1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,64,1,64,
        1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,64,
        1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,65,1,65,1,65,1,65,1,65,1,65,
        1,65,1,65,1,65,1,65,1,65,1,65,1,66,1,66,1,66,1,66,1,66,1,66,1,66,
        1,66,1,66,1,66,1,66,1,66,1,66,1,67,1,67,1,68,1,68,1,69,1,69,1,70,
        1,70,1,71,1,71,1,72,1,72,1,73,1,73,1,74,1,74,1,75,1,75,1,76,1,76,
        1,77,1,77,1,77,1,78,1,78,1,79,1,79,1,79,1,80,1,80,1,81,1,81,1,81,
        1,82,1,82,1,82,1,82,1,83,1,83,4,83,826,8,83,11,83,12,83,827,1,84,
        1,84,1,84,1,84,4,84,834,8,84,11,84,12,84,835,1,85,1,85,1,85,5,85,
        841,8,85,10,85,12,85,844,9,85,1,85,1,85,1,86,1,86,1,86,3,86,851,
        8,86,1,86,5,86,854,8,86,10,86,12,86,857,9,86,1,86,1,86,1,87,1,87,
        1,87,1,87,1,87,5,87,866,8,87,10,87,12,87,869,9,87,1,87,1,87,1,87,
        1,87,1,87,1,87,1,88,1,88,3,88,879,8,88,1,88,1,88,3,88,883,8,88,1,
        88,1,88,3,88,887,8,88,3,88,889,8,88,1,89,1,89,1,89,1,89,3,89,895,
        8,89,1,89,5,89,898,8,89,10,89,12,89,901,9,89,1,89,1,89,1,90,1,90,
        1,90,1,90,1,90,5,90,910,8,90,10,90,12,90,913,9,90,1,90,1,90,1,90,
        3,90,918,8,90,1,90,1,90,1,90,1,90,5,90,924,8,90,10,90,12,90,927,
        9,90,1,90,1,90,1,91,1,91,1,91,1,91,1,91,3,91,936,8,91,1,91,1,91,
        1,91,1,91,3,91,942,8,91,1,91,1,91,1,91,1,91,3,91,948,8,91,1,91,1,
        91,4,91,952,8,91,11,91,12,91,953,1,92,1,92,1,92,1,92,1,92,1,92,3,
        92,962,8,92,1,92,1,92,1,92,1,92,1,92,3,92,969,8,92,1,92,1,92,1,92,
        1,92,1,92,3,92,976,8,92,1,92,1,92,4,92,980,8,92,11,92,12,92,981,
        1,93,1,93,1,93,1,93,1,93,1,93,1,93,5,93,991,8,93,10,93,12,93,994,
        9,93,1,93,1,93,1,94,4,94,999,8,94,11,94,12,94,1000,1,94,1,94,1,95,
        1,95,1,95,1,96,1,96,1,97,1,97,1,867,0,98,1,1,3,2,5,3,7,4,9,5,11,
        6,13,7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,33,17,
        35,18,37,19,39,20,41,21,43,22,45,23,47,24,49,25,51,26,53,27,55,28,
        57,29,59,30,61,31,63,32,65,33,67,34,69,35,71,36,73,37,75,38,77,39,
        79,40,81,41,83,42,85,43,87,44,89,45,91,46,93,47,95,48,97,49,99,50,
        101,51,103,52,105,53,107,54,109,55,111,56,113,57,115,58,117,59,119,
        60,121,61,123,62,125,63,127,64,129,65,131,66,133,67,135,68,137,69,
        139,70,141,71,143,72,145,73,147,74,149,75,151,76,153,77,155,78,157,
        79,159,80,161,81,163,82,165,83,167,84,169,85,171,86,173,87,175,88,
        177,89,179,90,181,91,183,92,185,93,187,94,189,95,191,0,193,0,195,
        0,1,0,6,2,0,34,34,92,92,2,0,10,10,13,13,3,0,9,10,13,13,32,32,9,0,
        34,34,39,39,48,48,92,92,98,98,102,102,110,110,114,114,116,116,2,
        0,65,90,97,122,1,0,48,57,1058,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,
        0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,
        0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,
        0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,1,0,0,0,
        0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,45,1,0,0,0,
        0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,53,1,0,0,0,0,55,1,0,0,0,
        0,57,1,0,0,0,0,59,1,0,0,0,0,61,1,0,0,0,0,63,1,0,0,0,0,65,1,0,0,0,
        0,67,1,0,0,0,0,69,1,0,0,0,0,71,1,0,0,0,0,73,1,0,0,0,0,75,1,0,0,0,
        0,77,1,0,0,0,0,79,1,0,0,0,0,81,1,0,0,0,0,83,1,0,0,0,0,85,1,0,0,0,
        0,87,1,0,0,0,0,89,1,0,0,0,0,91,1,0,0,0,0,93,1,0,0,0,0,95,1,0,0,0,
        0,97,1,0,0,0,0,99,1,0,0,0,0,101,1,0,0,0,0,103,1,0,0,0,0,105,1,0,
        0,0,0,107,1,0,0,0,0,109,1,0,0,0,0,111,1,0,0,0,0,113,1,0,0,0,0,115,
        1,0,0,0,0,117,1,0,0,0,0,119,1,0,0,0,0,121,1,0,0,0,0,123,1,0,0,0,
        0,125,1,0,0,0,0,127,1,0,0,0,0,129,1,0,0,0,0,131,1,0,0,0,0,133,1,
        0,0,0,0,135,1,0,0,0,0,137,1,0,0,0,0,139,1,0,0,0,0,141,1,0,0,0,0,
        143,1,0,0,0,0,145,1,0,0,0,0,147,1,0,0,0,0,149,1,0,0,0,0,151,1,0,
        0,0,0,153,1,0,0,0,0,155,1,0,0,0,0,157,1,0,0,0,0,159,1,0,0,0,0,161,
        1,0,0,0,0,163,1,0,0,0,0,165,1,0,0,0,0,167,1,0,0,0,0,169,1,0,0,0,
        0,171,1,0,0,0,0,173,1,0,0,0,0,175,1,0,0,0,0,177,1,0,0,0,0,179,1,
        0,0,0,0,181,1,0,0,0,0,183,1,0,0,0,0,185,1,0,0,0,0,187,1,0,0,0,0,
        189,1,0,0,0,1,197,1,0,0,0,3,199,1,0,0,0,5,205,1,0,0,0,7,216,1,0,
        0,0,9,222,1,0,0,0,11,229,1,0,0,0,13,234,1,0,0,0,15,239,1,0,0,0,17,
        247,1,0,0,0,19,253,1,0,0,0,21,256,1,0,0,0,23,261,1,0,0,0,25,266,
        1,0,0,0,27,270,1,0,0,0,29,273,1,0,0,0,31,277,1,0,0,0,33,283,1,0,
        0,0,35,288,1,0,0,0,37,291,1,0,0,0,39,297,1,0,0,0,41,303,1,0,0,0,
        43,309,1,0,0,0,45,316,1,0,0,0,47,323,1,0,0,0,49,330,1,0,0,0,51,334,
        1,0,0,0,53,338,1,0,0,0,55,343,1,0,0,0,57,350,1,0,0,0,59,355,1,0,
        0,0,61,358,1,0,0,0,63,366,1,0,0,0,65,375,1,0,0,0,67,382,1,0,0,0,
        69,389,1,0,0,0,71,401,1,0,0,0,73,410,1,0,0,0,75,419,1,0,0,0,77,429,
        1,0,0,0,79,439,1,0,0,0,81,450,1,0,0,0,83,462,1,0,0,0,85,475,1,0,
        0,0,87,486,1,0,0,0,89,497,1,0,0,0,91,509,1,0,0,0,93,516,1,0,0,0,
        95,522,1,0,0,0,97,536,1,0,0,0,99,556,1,0,0,0,101,567,1,0,0,0,103,
        578,1,0,0,0,105,593,1,0,0,0,107,606,1,0,0,0,109,619,1,0,0,0,111,
        632,1,0,0,0,113,645,1,0,0,0,115,650,1,0,0,0,117,657,1,0,0,0,119,
        665,1,0,0,0,121,673,1,0,0,0,123,681,1,0,0,0,125,696,1,0,0,0,127,
        716,1,0,0,0,129,739,1,0,0,0,131,761,1,0,0,0,133,773,1,0,0,0,135,
        786,1,0,0,0,137,788,1,0,0,0,139,790,1,0,0,0,141,792,1,0,0,0,143,
        794,1,0,0,0,145,796,1,0,0,0,147,798,1,0,0,0,149,800,1,0,0,0,151,
        802,1,0,0,0,153,804,1,0,0,0,155,806,1,0,0,0,157,809,1,0,0,0,159,
        811,1,0,0,0,161,814,1,0,0,0,163,816,1,0,0,0,165,819,1,0,0,0,167,
        825,1,0,0,0,169,829,1,0,0,0,171,837,1,0,0,0,173,850,1,0,0,0,175,
        860,1,0,0,0,177,888,1,0,0,0,179,890,1,0,0,0,181,904,1,0,0,0,183,
        935,1,0,0,0,185,961,1,0,0,0,187,983,1,0,0,0,189,998,1,0,0,0,191,
        1004,1,0,0,0,193,1007,1,0,0,0,195,1009,1,0,0,0,197,198,5,116,0,0,
        198,2,1,0,0,0,199,200,5,119,0,0,200,201,5,114,0,0,201,202,5,105,
        0,0,202,203,5,116,0,0,203,204,5,101,0,0,204,4,1,0,0,0,205,206,5,
        119,0,0,206,207,5,114,0,0,207,208,5,105,0,0,208,209,5,116,0,0,209,
        210,5,101,0,0,210,211,5,45,0,0,211,212,5,108,0,0,212,213,5,105,0,
        0,213,214,5,110,0,0,214,215,5,101,0,0,215,6,1,0,0,0,216,217,5,112,
        0,0,217,218,5,114,0,0,218,219,5,105,0,0,219,220,5,110,0,0,220,221,
        5,116,0,0,221,8,1,0,0,0,222,223,5,100,0,0,223,224,5,101,0,0,224,
        225,5,102,0,0,225,226,5,118,0,0,226,227,5,97,0,0,227,228,5,114,0,
        0,228,10,1,0,0,0,229,230,5,115,0,0,230,231,5,101,0,0,231,232,5,116,
        0,0,232,233,5,113,0,0,233,12,1,0,0,0,234,235,5,116,0,0,235,236,5,
        121,0,0,236,237,5,112,0,0,237,238,5,101,0,0,238,14,1,0,0,0,239,240,
        5,116,0,0,240,241,5,121,0,0,241,242,5,112,0,0,242,243,5,101,0,0,
        243,244,5,45,0,0,244,245,5,111,0,0,245,246,5,102,0,0,246,16,1,0,
        0,0,247,248,5,100,0,0,248,249,5,101,0,0,249,250,5,102,0,0,250,251,
        5,117,0,0,251,252,5,110,0,0,252,18,1,0,0,0,253,254,5,105,0,0,254,
        255,5,102,0,0,255,20,1,0,0,0,256,257,5,99,0,0,257,258,5,111,0,0,
        258,259,5,110,0,0,259,260,5,100,0,0,260,22,1,0,0,0,261,262,5,108,
        0,0,262,263,5,111,0,0,263,264,5,111,0,0,264,265,5,112,0,0,265,24,
        1,0,0,0,266,267,5,97,0,0,267,268,5,110,0,0,268,269,5,100,0,0,269,
        26,1,0,0,0,270,271,5,111,0,0,271,272,5,114,0,0,272,28,1,0,0,0,273,
        274,5,110,0,0,274,275,5,111,0,0,275,276,5,116,0,0,276,30,1,0,0,0,
        277,278,5,99,0,0,278,279,5,108,0,0,279,280,5,97,0,0,280,281,5,115,
        0,0,281,282,5,115,0,0,282,32,1,0,0,0,283,284,5,99,0,0,284,285,5,
        97,0,0,285,286,5,115,0,0,286,287,5,101,0,0,287,34,1,0,0,0,288,289,
        5,100,0,0,289,290,5,111,0,0,290,36,1,0,0,0,291,292,5,116,0,0,292,
        293,5,104,0,0,293,294,5,114,0,0,294,295,5,111,0,0,295,296,5,119,
        0,0,296,38,1,0,0,0,297,298,5,99,0,0,298,299,5,97,0,0,299,300,5,116,
        0,0,300,301,5,99,0,0,301,302,5,104,0,0,302,40,1,0,0,0,303,304,5,
        98,0,0,304,305,5,108,0,0,305,306,5,111,0,0,306,307,5,99,0,0,307,
        308,5,107,0,0,308,42,1,0,0,0,309,310,5,105,0,0,310,311,5,109,0,0,
        311,312,5,112,0,0,312,313,5,111,0,0,313,314,5,114,0,0,314,315,5,
        116,0,0,315,44,1,0,0,0,316,317,5,101,0,0,317,318,5,120,0,0,318,319,
        5,112,0,0,319,320,5,111,0,0,320,321,5,114,0,0,321,322,5,116,0,0,
        322,46,1,0,0,0,323,324,5,108,0,0,324,325,5,97,0,0,325,326,5,109,
        0,0,326,327,5,98,0,0,327,328,5,100,0,0,328,329,5,97,0,0,329,48,1,
        0,0,0,330,331,5,110,0,0,331,332,5,105,0,0,332,333,5,108,0,0,333,
        50,1,0,0,0,334,335,5,108,0,0,335,336,5,101,0,0,336,337,5,116,0,0,
        337,52,1,0,0,0,338,339,5,108,0,0,339,340,5,101,0,0,340,341,5,116,
        0,0,341,342,5,42,0,0,342,54,1,0,0,0,343,344,5,117,0,0,344,345,5,
        110,0,0,345,346,5,108,0,0,346,347,5,101,0,0,347,348,5,115,0,0,348,
        349,5,115,0,0,349,56,1,0,0,0,350,351,5,119,0,0,351,352,5,104,0,0,
        352,353,5,101,0,0,353,354,5,110,0,0,354,58,1,0,0,0,355,356,5,103,
        0,0,356,357,5,111,0,0,357,60,1,0,0,0,358,359,5,100,0,0,359,360,5,
        101,0,0,360,361,5,99,0,0,361,362,5,108,0,0,362,363,5,97,0,0,363,
        364,5,114,0,0,364,365,5,101,0,0,365,62,1,0,0,0,366,367,5,102,0,0,
        367,368,5,117,0,0,368,369,5,110,0,0,369,370,5,99,0,0,370,371,5,116,
        0,0,371,372,5,105,0,0,372,373,5,111,0,0,373,374,5,110,0,0,374,64,
        1,0,0,0,375,376,5,102,0,0,376,377,5,111,0,0,377,378,5,114,0,0,378,
        379,5,109,0,0,379,380,5,97,0,0,380,381,5,116,0,0,381,66,1,0,0,0,
        382,383,5,114,0,0,383,384,5,101,0,0,384,385,5,116,0,0,385,386,5,
        117,0,0,386,387,5,114,0,0,387,388,5,110,0,0,388,68,1,0,0,0,389,390,
        5,114,0,0,390,391,5,101,0,0,391,392,5,116,0,0,392,393,5,117,0,0,
        393,394,5,114,0,0,394,395,5,110,0,0,395,396,5,45,0,0,396,397,5,102,
        0,0,397,398,5,114,0,0,398,399,5,111,0,0,399,400,5,109,0,0,400,70,
        1,0,0,0,401,402,5,100,0,0,402,403,5,101,0,0,403,404,5,102,0,0,404,
        405,5,109,0,0,405,406,5,97,0,0,406,407,5,99,0,0,407,408,5,114,0,
        0,408,409,5,111,0,0,409,72,1,0,0,0,410,411,5,100,0,0,411,412,5,101,
        0,0,412,413,5,102,0,0,413,414,5,99,0,0,414,415,5,108,0,0,415,416,
        5,97,0,0,416,417,5,115,0,0,417,418,5,115,0,0,418,74,1,0,0,0,419,
        420,5,100,0,0,420,421,5,101,0,0,421,422,5,102,0,0,422,423,5,109,
        0,0,423,424,5,101,0,0,424,425,5,116,0,0,425,426,5,104,0,0,426,427,
        5,111,0,0,427,428,5,100,0,0,428,76,1,0,0,0,429,430,5,100,0,0,430,
        431,5,101,0,0,431,432,5,102,0,0,432,433,5,115,0,0,433,434,5,116,
        0,0,434,435,5,114,0,0,435,436,5,117,0,0,436,437,5,99,0,0,437,438,
        5,116,0,0,438,78,1,0,0,0,439,440,5,100,0,0,440,441,5,101,0,0,441,
        442,5,102,0,0,442,443,5,103,0,0,443,444,5,101,0,0,444,445,5,110,
        0,0,445,446,5,101,0,0,446,447,5,114,0,0,447,448,5,105,0,0,448,449,
        5,99,0,0,449,80,1,0,0,0,450,451,5,100,0,0,451,452,5,101,0,0,452,
        453,5,102,0,0,453,454,5,99,0,0,454,455,5,111,0,0,455,456,5,110,0,
        0,456,457,5,115,0,0,457,458,5,116,0,0,458,459,5,97,0,0,459,460,5,
        110,0,0,460,461,5,116,0,0,461,82,1,0,0,0,462,463,5,100,0,0,463,464,
        5,101,0,0,464,465,5,102,0,0,465,466,5,112,0,0,466,467,5,97,0,0,467,
        468,5,114,0,0,468,469,5,97,0,0,469,470,5,109,0,0,470,471,5,101,0,
        0,471,472,5,116,0,0,472,473,5,101,0,0,473,474,5,114,0,0,474,84,1,
        0,0,0,475,476,5,100,0,0,476,477,5,101,0,0,477,478,5,102,0,0,478,
        479,5,112,0,0,479,480,5,97,0,0,480,481,5,99,0,0,481,482,5,107,0,
        0,482,483,5,97,0,0,483,484,5,103,0,0,484,485,5,101,0,0,485,86,1,
        0,0,0,486,487,5,105,0,0,487,488,5,110,0,0,488,489,5,45,0,0,489,490,
        5,112,0,0,490,491,5,97,0,0,491,492,5,99,0,0,492,493,5,107,0,0,493,
        494,5,97,0,0,494,495,5,103,0,0,495,496,5,101,0,0,496,88,1,0,0,0,
        497,498,5,117,0,0,498,499,5,115,0,0,499,500,5,101,0,0,500,501,5,
        45,0,0,501,502,5,112,0,0,502,503,5,97,0,0,503,504,5,99,0,0,504,505,
        5,107,0,0,505,506,5,97,0,0,506,507,5,103,0,0,507,508,5,101,0,0,508,
        90,1,0,0,0,509,510,5,118,0,0,510,511,5,97,0,0,511,512,5,108,0,0,
        512,513,5,117,0,0,513,514,5,101,0,0,514,515,5,115,0,0,515,92,1,0,
        0,0,516,517,5,112,0,0,517,518,5,114,0,0,518,519,5,111,0,0,519,520,
        5,103,0,0,520,521,5,110,0,0,521,94,1,0,0,0,522,523,5,109,0,0,523,
        524,5,97,0,0,524,525,5,107,0,0,525,526,5,101,0,0,526,527,5,45,0,
        0,527,528,5,105,0,0,528,529,5,110,0,0,529,530,5,115,0,0,530,531,
        5,116,0,0,531,532,5,97,0,0,532,533,5,110,0,0,533,534,5,99,0,0,534,
        535,5,101,0,0,535,96,1,0,0,0,536,537,5,105,0,0,537,538,5,110,0,0,
        538,539,5,105,0,0,539,540,5,116,0,0,540,541,5,105,0,0,541,542,5,
        97,0,0,542,543,5,108,0,0,543,544,5,105,0,0,544,545,5,122,0,0,545,
        546,5,101,0,0,546,547,5,45,0,0,547,548,5,105,0,0,548,549,5,110,0,
        0,549,550,5,115,0,0,550,551,5,116,0,0,551,552,5,97,0,0,552,553,5,
        110,0,0,553,554,5,99,0,0,554,555,5,101,0,0,555,98,1,0,0,0,556,557,
        5,115,0,0,557,558,5,108,0,0,558,559,5,111,0,0,559,560,5,116,0,0,
        560,561,5,45,0,0,561,562,5,118,0,0,562,563,5,97,0,0,563,564,5,108,
        0,0,564,565,5,117,0,0,565,566,5,101,0,0,566,100,1,0,0,0,567,568,
        5,119,0,0,568,569,5,105,0,0,569,570,5,116,0,0,570,571,5,104,0,0,
        571,572,5,45,0,0,572,573,5,115,0,0,573,574,5,108,0,0,574,575,5,111,
        0,0,575,576,5,116,0,0,576,577,5,115,0,0,577,102,1,0,0,0,578,579,
        5,119,0,0,579,580,5,105,0,0,580,581,5,116,0,0,581,582,5,104,0,0,
        582,583,5,45,0,0,583,584,5,97,0,0,584,585,5,99,0,0,585,586,5,99,
        0,0,586,587,5,101,0,0,587,588,5,115,0,0,588,589,5,115,0,0,589,590,
        5,111,0,0,590,591,5,114,0,0,591,592,5,115,0,0,592,104,1,0,0,0,593,
        594,5,114,0,0,594,595,5,101,0,0,595,596,5,115,0,0,596,597,5,116,
        0,0,597,598,5,97,0,0,598,599,5,114,0,0,599,600,5,116,0,0,600,601,
        5,45,0,0,601,602,5,99,0,0,602,603,5,97,0,0,603,604,5,115,0,0,604,
        605,5,101,0,0,605,106,1,0,0,0,606,607,5,104,0,0,607,608,5,97,0,0,
        608,609,5,110,0,0,609,610,5,100,0,0,610,611,5,108,0,0,611,612,5,
        101,0,0,612,613,5,114,0,0,613,614,5,45,0,0,614,615,5,99,0,0,615,
        616,5,97,0,0,616,617,5,115,0,0,617,618,5,101,0,0,618,108,1,0,0,0,
        619,620,5,114,0,0,620,621,5,101,0,0,621,622,5,115,0,0,622,623,5,
        116,0,0,623,624,5,97,0,0,624,625,5,114,0,0,625,626,5,116,0,0,626,
        627,5,45,0,0,627,628,5,98,0,0,628,629,5,105,0,0,629,630,5,110,0,
        0,630,631,5,100,0,0,631,110,1,0,0,0,632,633,5,104,0,0,633,634,5,
        97,0,0,634,635,5,110,0,0,635,636,5,100,0,0,636,637,5,108,0,0,637,
        638,5,101,0,0,638,639,5,114,0,0,639,640,5,45,0,0,640,641,5,98,0,
        0,641,642,5,105,0,0,642,643,5,110,0,0,643,644,5,100,0,0,644,112,
        1,0,0,0,645,646,5,108,0,0,646,647,5,101,0,0,647,648,5,116,0,0,648,
        649,5,102,0,0,649,114,1,0,0,0,650,651,5,108,0,0,651,652,5,101,0,
        0,652,653,5,116,0,0,653,654,5,114,0,0,654,655,5,101,0,0,655,656,
        5,99,0,0,656,116,1,0,0,0,657,658,5,116,0,0,658,659,5,97,0,0,659,
        660,5,103,0,0,660,661,5,98,0,0,661,662,5,111,0,0,662,663,5,100,0,
        0,663,664,5,121,0,0,664,118,1,0,0,0,665,666,5,100,0,0,666,667,5,
        101,0,0,667,668,5,99,0,0,668,669,5,108,0,0,669,670,5,97,0,0,670,
        671,5,105,0,0,671,672,5,109,0,0,672,120,1,0,0,0,673,674,5,100,0,
        0,674,675,5,101,0,0,675,676,5,102,0,0,676,677,5,116,0,0,677,678,
        5,121,0,0,678,679,5,112,0,0,679,680,5,101,0,0,680,122,1,0,0,0,681,
        682,5,119,0,0,682,683,5,105,0,0,683,684,5,116,0,0,684,685,5,104,
        0,0,685,686,5,45,0,0,686,687,5,111,0,0,687,688,5,112,0,0,688,689,
        5,101,0,0,689,690,5,110,0,0,690,691,5,45,0,0,691,692,5,102,0,0,692,
        693,5,105,0,0,693,694,5,108,0,0,694,695,5,101,0,0,695,124,1,0,0,
        0,696,697,5,119,0,0,697,698,5,105,0,0,698,699,5,116,0,0,699,700,
        5,104,0,0,700,701,5,45,0,0,701,702,5,111,0,0,702,703,5,117,0,0,703,
        704,5,116,0,0,704,705,5,112,0,0,705,706,5,117,0,0,706,707,5,116,
        0,0,707,708,5,45,0,0,708,709,5,116,0,0,709,710,5,111,0,0,710,711,
        5,45,0,0,711,712,5,102,0,0,712,713,5,105,0,0,713,714,5,108,0,0,714,
        715,5,101,0,0,715,126,1,0,0,0,716,717,5,119,0,0,717,718,5,105,0,
        0,718,719,5,116,0,0,719,720,5,104,0,0,720,721,5,45,0,0,721,722,5,
        105,0,0,722,723,5,110,0,0,723,724,5,112,0,0,724,725,5,117,0,0,725,
        726,5,116,0,0,726,727,5,45,0,0,727,728,5,102,0,0,728,729,5,114,0,
        0,729,730,5,111,0,0,730,731,5,109,0,0,731,732,5,45,0,0,732,733,5,
        115,0,0,733,734,5,116,0,0,734,735,5,114,0,0,735,736,5,105,0,0,736,
        737,5,110,0,0,737,738,5,103,0,0,738,128,1,0,0,0,739,740,5,119,0,
        0,740,741,5,105,0,0,741,742,5,116,0,0,742,743,5,104,0,0,743,744,
        5,45,0,0,744,745,5,111,0,0,745,746,5,117,0,0,746,747,5,116,0,0,747,
        748,5,112,0,0,748,749,5,117,0,0,749,750,5,116,0,0,750,751,5,45,0,
        0,751,752,5,116,0,0,752,753,5,111,0,0,753,754,5,45,0,0,754,755,5,
        115,0,0,755,756,5,116,0,0,756,757,5,114,0,0,757,758,5,105,0,0,758,
        759,5,110,0,0,759,760,5,103,0,0,760,130,1,0,0,0,761,762,5,119,0,
        0,762,763,5,105,0,0,763,764,5,116,0,0,764,765,5,104,0,0,765,766,
        5,45,0,0,766,767,5,115,0,0,767,768,5,116,0,0,768,769,5,114,0,0,769,
        770,5,101,0,0,770,771,5,97,0,0,771,772,5,109,0,0,772,132,1,0,0,0,
        773,774,5,119,0,0,774,775,5,105,0,0,775,776,5,116,0,0,776,777,5,
        104,0,0,777,778,5,45,0,0,778,779,5,116,0,0,779,780,5,105,0,0,780,
        781,5,109,0,0,781,782,5,101,0,0,782,783,5,111,0,0,783,784,5,117,
        0,0,784,785,5,116,0,0,785,134,1,0,0,0,786,787,5,40,0,0,787,136,1,
        0,0,0,788,789,5,41,0,0,789,138,1,0,0,0,790,791,5,39,0,0,791,140,
        1,0,0,0,792,793,5,34,0,0,793,142,1,0,0,0,794,795,5,43,0,0,795,144,
        1,0,0,0,796,797,5,45,0,0,797,146,1,0,0,0,798,799,5,42,0,0,799,148,
        1,0,0,0,800,801,5,47,0,0,801,150,1,0,0,0,802,803,5,37,0,0,803,152,
        1,0,0,0,804,805,5,61,0,0,805,154,1,0,0,0,806,807,5,47,0,0,807,808,
        5,61,0,0,808,156,1,0,0,0,809,810,5,60,0,0,810,158,1,0,0,0,811,812,
        5,60,0,0,812,813,5,61,0,0,813,160,1,0,0,0,814,815,5,62,0,0,815,162,
        1,0,0,0,816,817,5,62,0,0,817,818,5,61,0,0,818,164,1,0,0,0,819,820,
        3,147,73,0,820,821,3,169,84,0,821,822,3,147,73,0,822,166,1,0,0,0,
        823,826,3,193,96,0,824,826,3,195,97,0,825,823,1,0,0,0,825,824,1,
        0,0,0,826,827,1,0,0,0,827,825,1,0,0,0,827,828,1,0,0,0,828,168,1,
        0,0,0,829,833,3,193,96,0,830,834,3,193,96,0,831,834,3,195,97,0,832,
        834,5,45,0,0,833,830,1,0,0,0,833,831,1,0,0,0,833,832,1,0,0,0,834,
        835,1,0,0,0,835,833,1,0,0,0,835,836,1,0,0,0,836,170,1,0,0,0,837,
        842,3,141,70,0,838,841,8,0,0,0,839,841,3,191,95,0,840,838,1,0,0,
        0,840,839,1,0,0,0,841,844,1,0,0,0,842,840,1,0,0,0,842,843,1,0,0,
        0,843,845,1,0,0,0,844,842,1,0,0,0,845,846,3,141,70,0,846,172,1,0,
        0,0,847,851,5,59,0,0,848,849,5,59,0,0,849,851,5,59,0,0,850,847,1,
        0,0,0,850,848,1,0,0,0,851,855,1,0,0,0,852,854,8,1,0,0,853,852,1,
        0,0,0,854,857,1,0,0,0,855,853,1,0,0,0,855,856,1,0,0,0,856,858,1,
        0,0,0,857,855,1,0,0,0,858,859,6,86,0,0,859,174,1,0,0,0,860,861,5,
        124,0,0,861,862,5,124,0,0,862,863,5,35,0,0,863,867,1,0,0,0,864,866,
        9,0,0,0,865,864,1,0,0,0,866,869,1,0,0,0,867,868,1,0,0,0,867,865,
        1,0,0,0,868,870,1,0,0,0,869,867,1,0,0,0,870,871,5,35,0,0,871,872,
        5,124,0,0,872,873,5,124,0,0,873,874,1,0,0,0,874,875,6,87,0,0,875,
        176,1,0,0,0,876,878,3,139,69,0,877,879,3,167,83,0,878,877,1,0,0,
        0,878,879,1,0,0,0,879,889,1,0,0,0,880,882,3,139,69,0,881,883,3,187,
        93,0,882,881,1,0,0,0,882,883,1,0,0,0,883,889,1,0,0,0,884,886,3,139,
        69,0,885,887,3,183,91,0,886,885,1,0,0,0,886,887,1,0,0,0,887,889,
        1,0,0,0,888,876,1,0,0,0,888,880,1,0,0,0,888,884,1,0,0,0,889,178,
        1,0,0,0,890,891,3,135,67,0,891,894,3,19,9,0,892,895,3,169,84,0,893,
        895,3,185,92,0,894,892,1,0,0,0,894,893,1,0,0,0,895,899,1,0,0,0,896,
        898,3,187,93,0,897,896,1,0,0,0,898,901,1,0,0,0,899,897,1,0,0,0,899,
        900,1,0,0,0,900,902,1,0,0,0,901,899,1,0,0,0,902,903,3,137,68,0,903,
        180,1,0,0,0,904,905,3,135,67,0,905,906,3,17,8,0,906,917,3,169,84,
        0,907,911,3,135,67,0,908,910,3,169,84,0,909,908,1,0,0,0,910,913,
        1,0,0,0,911,909,1,0,0,0,911,912,1,0,0,0,912,914,1,0,0,0,913,911,
        1,0,0,0,914,915,3,137,68,0,915,918,1,0,0,0,916,918,3,187,93,0,917,
        907,1,0,0,0,917,916,1,0,0,0,918,925,1,0,0,0,919,924,3,167,83,0,920,
        924,3,187,93,0,921,924,3,171,85,0,922,924,3,181,90,0,923,919,1,0,
        0,0,923,920,1,0,0,0,923,921,1,0,0,0,923,922,1,0,0,0,924,927,1,0,
        0,0,925,923,1,0,0,0,925,926,1,0,0,0,926,928,1,0,0,0,927,925,1,0,
        0,0,928,929,3,137,68,0,929,182,1,0,0,0,930,936,3,143,71,0,931,936,
        3,145,72,0,932,936,3,147,73,0,933,936,3,149,74,0,934,936,3,151,75,
        0,935,930,1,0,0,0,935,931,1,0,0,0,935,932,1,0,0,0,935,933,1,0,0,
        0,935,934,1,0,0,0,936,937,1,0,0,0,937,941,5,32,0,0,938,942,3,195,
        97,0,939,942,3,169,84,0,940,942,3,183,91,0,941,938,1,0,0,0,941,939,
        1,0,0,0,941,940,1,0,0,0,942,943,1,0,0,0,943,951,5,32,0,0,944,948,
        3,195,97,0,945,948,3,169,84,0,946,948,3,183,91,0,947,944,1,0,0,0,
        947,945,1,0,0,0,947,946,1,0,0,0,948,949,1,0,0,0,949,950,5,32,0,0,
        950,952,1,0,0,0,951,947,1,0,0,0,952,953,1,0,0,0,953,951,1,0,0,0,
        953,954,1,0,0,0,954,184,1,0,0,0,955,962,3,153,76,0,956,962,3,155,
        77,0,957,962,3,161,80,0,958,962,3,163,81,0,959,962,3,157,78,0,960,
        962,3,159,79,0,961,955,1,0,0,0,961,956,1,0,0,0,961,957,1,0,0,0,961,
        958,1,0,0,0,961,959,1,0,0,0,961,960,1,0,0,0,962,963,1,0,0,0,963,
        968,5,32,0,0,964,969,3,195,97,0,965,969,3,169,84,0,966,969,3,183,
        91,0,967,969,3,185,92,0,968,964,1,0,0,0,968,965,1,0,0,0,968,966,
        1,0,0,0,968,967,1,0,0,0,969,970,1,0,0,0,970,979,5,32,0,0,971,976,
        3,195,97,0,972,976,3,169,84,0,973,976,3,183,91,0,974,976,3,185,92,
        0,975,971,1,0,0,0,975,972,1,0,0,0,975,973,1,0,0,0,975,974,1,0,0,
        0,976,977,1,0,0,0,977,978,5,32,0,0,978,980,1,0,0,0,979,975,1,0,0,
        0,980,981,1,0,0,0,981,979,1,0,0,0,981,982,1,0,0,0,982,186,1,0,0,
        0,983,992,3,135,67,0,984,991,3,167,83,0,985,991,3,187,93,0,986,991,
        3,169,84,0,987,991,3,171,85,0,988,991,3,183,91,0,989,991,3,185,92,
        0,990,984,1,0,0,0,990,985,1,0,0,0,990,986,1,0,0,0,990,987,1,0,0,
        0,990,988,1,0,0,0,990,989,1,0,0,0,991,994,1,0,0,0,992,990,1,0,0,
        0,992,993,1,0,0,0,993,995,1,0,0,0,994,992,1,0,0,0,995,996,3,137,
        68,0,996,188,1,0,0,0,997,999,7,2,0,0,998,997,1,0,0,0,999,1000,1,
        0,0,0,1000,998,1,0,0,0,1000,1001,1,0,0,0,1001,1002,1,0,0,0,1002,
        1003,6,94,0,0,1003,190,1,0,0,0,1004,1005,5,92,0,0,1005,1006,7,3,
        0,0,1006,192,1,0,0,0,1007,1008,7,4,0,0,1008,194,1,0,0,0,1009,1010,
        7,5,0,0,1010,196,1,0,0,0,31,0,825,827,833,835,840,842,850,855,867,
        878,882,886,888,894,899,911,917,923,925,935,941,947,953,961,968,
        975,981,990,992,1000,1,6,0,0
    ]

class MyLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T = 1
    WRITE = 2
    WRITE_LINE = 3
    PRINT = 4
    DEFVAR = 5
    SETQ = 6
    TYPE = 7
    TYPE_OF = 8
    DEFUN = 9
    IF = 10
    COND = 11
    LOOP = 12
    AND = 13
    OR = 14
    NOT = 15
    CLASS = 16
    CASE = 17
    DO = 18
    THROW = 19
    CATCH = 20
    BLOCK = 21
    IMPORT = 22
    EXPORT = 23
    LAMBDA = 24
    NIL = 25
    LET = 26
    LET_STAR = 27
    UNLESS = 28
    WHEN = 29
    GO = 30
    DECLARE = 31
    FUNCTION = 32
    FORMAT = 33
    RETURN = 34
    RETURN_FROM = 35
    DEFMACRO = 36
    DEFCLASS = 37
    DEFMETHOD = 38
    DEFSTRUCT = 39
    DEFGENERIC = 40
    DEFCONSTANT = 41
    DEFPARAMETER = 42
    DEFPACKAGE = 43
    IN_PACKAGE = 44
    USE_PACKAGE = 45
    VALUES = 46
    PROGN = 47
    MAKE_INSTANCE = 48
    INITIALIZE_INSTANCE = 49
    SLOT_VALUE = 50
    WITH_SLOTS = 51
    WITH_ACCESSORS = 52
    RESTART_CASE = 53
    HANDLER_CASE = 54
    RESTART_BIND = 55
    HANDLER_BIND = 56
    LETF = 57
    LETREC = 58
    TAGBODY = 59
    DECLAIM = 60
    DEFTYPE = 61
    WITH_OPEN_FILE = 62
    WITH_OUTPUT_TO_FILE = 63
    WITH_INPUT_FROM_STRING = 64
    WITH_OUTPUT_TO_STRING = 65
    WITH_STREAM = 66
    WITH_TIMEOUT = 67
    LPAR = 68
    RPAR = 69
    SQ = 70
    DQ = 71
    PLUS = 72
    MINUS = 73
    MULT = 74
    DIV = 75
    PERC = 76
    EQUALS = 77
    NOT_EQUALS = 78
    LESS_THAN = 79
    LESS_OR_EQUAL_THAN = 80
    GREATER_THAN = 81
    GREATER_OR_EQUAL_THAN = 82
    VAR = 83
    ATOM = 84
    SYMBOL = 85
    STRING = 86
    COMMENT = 87
    MULTIPLE_COMMENT = 88
    LITERAL = 89
    IF_CONDITION = 90
    DEFINE_FUNCTION = 91
    EQUATION = 92
    CONDITIONAL_EQUATION = 93
    LIST = 94
    WS = 95

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'t'", "'write'", "'write-line'", "'print'", "'defvar'", "'setq'", 
            "'type'", "'type-of'", "'defun'", "'if'", "'cond'", "'loop'", 
            "'and'", "'or'", "'not'", "'class'", "'case'", "'do'", "'throw'", 
            "'catch'", "'block'", "'import'", "'export'", "'lambda'", "'nil'", 
            "'let'", "'let*'", "'unless'", "'when'", "'go'", "'declare'", 
            "'function'", "'format'", "'return'", "'return-from'", "'defmacro'", 
            "'defclass'", "'defmethod'", "'defstruct'", "'defgeneric'", 
            "'defconstant'", "'defparameter'", "'defpackage'", "'in-package'", 
            "'use-package'", "'values'", "'progn'", "'make-instance'", "'initialize-instance'", 
            "'slot-value'", "'with-slots'", "'with-accessors'", "'restart-case'", 
            "'handler-case'", "'restart-bind'", "'handler-bind'", "'letf'", 
            "'letrec'", "'tagbody'", "'declaim'", "'deftype'", "'with-open-file'", 
            "'with-output-to-file'", "'with-input-from-string'", "'with-output-to-string'", 
            "'with-stream'", "'with-timeout'", "'('", "')'", "'''", "'\"'", 
            "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'/='", "'<'", "'<='", 
            "'>'", "'>='" ]

    symbolicNames = [ "<INVALID>",
            "T", "WRITE", "WRITE_LINE", "PRINT", "DEFVAR", "SETQ", "TYPE", 
            "TYPE_OF", "DEFUN", "IF", "COND", "LOOP", "AND", "OR", "NOT", 
            "CLASS", "CASE", "DO", "THROW", "CATCH", "BLOCK", "IMPORT", 
            "EXPORT", "LAMBDA", "NIL", "LET", "LET_STAR", "UNLESS", "WHEN", 
            "GO", "DECLARE", "FUNCTION", "FORMAT", "RETURN", "RETURN_FROM", 
            "DEFMACRO", "DEFCLASS", "DEFMETHOD", "DEFSTRUCT", "DEFGENERIC", 
            "DEFCONSTANT", "DEFPARAMETER", "DEFPACKAGE", "IN_PACKAGE", "USE_PACKAGE", 
            "VALUES", "PROGN", "MAKE_INSTANCE", "INITIALIZE_INSTANCE", "SLOT_VALUE", 
            "WITH_SLOTS", "WITH_ACCESSORS", "RESTART_CASE", "HANDLER_CASE", 
            "RESTART_BIND", "HANDLER_BIND", "LETF", "LETREC", "TAGBODY", 
            "DECLAIM", "DEFTYPE", "WITH_OPEN_FILE", "WITH_OUTPUT_TO_FILE", 
            "WITH_INPUT_FROM_STRING", "WITH_OUTPUT_TO_STRING", "WITH_STREAM", 
            "WITH_TIMEOUT", "LPAR", "RPAR", "SQ", "DQ", "PLUS", "MINUS", 
            "MULT", "DIV", "PERC", "EQUALS", "NOT_EQUALS", "LESS_THAN", 
            "LESS_OR_EQUAL_THAN", "GREATER_THAN", "GREATER_OR_EQUAL_THAN", 
            "VAR", "ATOM", "SYMBOL", "STRING", "COMMENT", "MULTIPLE_COMMENT", 
            "LITERAL", "IF_CONDITION", "DEFINE_FUNCTION", "EQUATION", "CONDITIONAL_EQUATION", 
            "LIST", "WS" ]

    ruleNames = [ "T", "WRITE", "WRITE_LINE", "PRINT", "DEFVAR", "SETQ", 
                  "TYPE", "TYPE_OF", "DEFUN", "IF", "COND", "LOOP", "AND", 
                  "OR", "NOT", "CLASS", "CASE", "DO", "THROW", "CATCH", 
                  "BLOCK", "IMPORT", "EXPORT", "LAMBDA", "NIL", "LET", "LET_STAR", 
                  "UNLESS", "WHEN", "GO", "DECLARE", "FUNCTION", "FORMAT", 
                  "RETURN", "RETURN_FROM", "DEFMACRO", "DEFCLASS", "DEFMETHOD", 
                  "DEFSTRUCT", "DEFGENERIC", "DEFCONSTANT", "DEFPARAMETER", 
                  "DEFPACKAGE", "IN_PACKAGE", "USE_PACKAGE", "VALUES", "PROGN", 
                  "MAKE_INSTANCE", "INITIALIZE_INSTANCE", "SLOT_VALUE", 
                  "WITH_SLOTS", "WITH_ACCESSORS", "RESTART_CASE", "HANDLER_CASE", 
                  "RESTART_BIND", "HANDLER_BIND", "LETF", "LETREC", "TAGBODY", 
                  "DECLAIM", "DEFTYPE", "WITH_OPEN_FILE", "WITH_OUTPUT_TO_FILE", 
                  "WITH_INPUT_FROM_STRING", "WITH_OUTPUT_TO_STRING", "WITH_STREAM", 
                  "WITH_TIMEOUT", "LPAR", "RPAR", "SQ", "DQ", "PLUS", "MINUS", 
                  "MULT", "DIV", "PERC", "EQUALS", "NOT_EQUALS", "LESS_THAN", 
                  "LESS_OR_EQUAL_THAN", "GREATER_THAN", "GREATER_OR_EQUAL_THAN", 
                  "VAR", "ATOM", "SYMBOL", "STRING", "COMMENT", "MULTIPLE_COMMENT", 
                  "LITERAL", "IF_CONDITION", "DEFINE_FUNCTION", "EQUATION", 
                  "CONDITIONAL_EQUATION", "LIST", "WS", "ESCAPE_CHAR", "LETTER", 
                  "NUMBER" ]

    grammarFileName = "MyLexer.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


