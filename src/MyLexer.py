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
        4,0,63,554,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,
        13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,
        19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,
        26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,
        32,2,33,7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,
        39,7,39,2,40,7,40,2,41,7,41,2,42,7,42,2,43,7,43,2,44,7,44,2,45,7,
        45,2,46,7,46,2,47,7,47,2,48,7,48,2,49,7,49,2,50,7,50,2,51,7,51,2,
        52,7,52,2,53,7,53,2,54,7,54,2,55,7,55,2,56,7,56,2,57,7,57,2,58,7,
        58,2,59,7,59,2,60,7,60,2,61,7,61,2,62,7,62,2,63,7,63,2,64,7,64,2,
        65,7,65,1,0,1,0,1,1,1,1,1,2,1,2,1,3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,
        1,7,1,7,1,8,1,8,1,9,1,9,1,10,1,10,1,11,1,11,1,11,1,12,1,12,1,13,
        1,13,1,13,1,14,1,14,1,15,1,15,1,15,1,16,1,16,1,16,1,16,1,17,1,17,
        1,17,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,
        1,18,1,18,1,19,1,19,1,19,1,19,1,19,1,19,1,20,1,20,1,20,1,20,1,20,
        1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,21,1,21,1,21,1,21,1,21,
        1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,22,1,22,1,22,1,22,1,22,1,22,
        1,22,1,22,1,22,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,24,1,24,
        1,24,1,24,1,24,1,24,1,24,1,25,1,25,1,25,1,25,1,25,1,25,1,26,1,26,
        1,26,1,26,1,26,1,27,1,27,1,27,1,27,1,27,1,28,1,28,1,28,1,28,1,29,
        1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,30,1,30,1,30,1,30,1,30,
        1,30,1,31,1,31,1,31,1,31,1,31,1,32,1,32,1,32,1,33,1,33,1,33,1,33,
        1,33,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,35,1,35,1,35,1,35,1,35,
        1,36,1,36,1,36,1,36,1,36,1,37,1,37,1,37,1,38,1,38,1,38,1,38,1,39,
        1,39,1,39,1,40,1,40,1,40,1,40,1,41,1,41,1,41,1,41,1,41,1,41,1,42,
        1,42,1,42,1,42,1,42,1,42,1,43,1,43,1,43,1,43,1,43,1,43,1,43,1,44,
        1,44,1,45,1,45,1,45,1,45,1,46,1,46,1,46,1,46,1,46,1,47,1,47,1,47,
        1,47,1,47,1,47,1,47,1,47,1,48,1,48,1,48,1,48,1,48,1,48,1,48,1,48,
        1,49,1,49,1,49,1,49,1,50,1,50,1,50,1,50,1,50,1,51,1,51,1,51,1,51,
        1,51,1,51,1,51,1,52,1,52,1,52,1,52,1,52,1,52,1,52,1,52,1,52,1,53,
        1,53,1,53,1,53,1,53,1,53,1,53,1,54,1,54,1,54,1,54,1,54,1,54,1,54,
        1,54,1,54,1,54,1,54,1,54,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,
        1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,
        1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,
        1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,
        1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,
        1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,1,55,
        3,55,487,8,55,1,56,1,56,1,56,1,56,1,57,1,57,4,57,495,8,57,11,57,
        12,57,496,1,58,1,58,1,58,1,58,4,58,503,8,58,11,58,12,58,504,1,59,
        1,59,1,59,5,59,510,8,59,10,59,12,59,513,9,59,1,59,1,59,1,60,1,60,
        1,60,3,60,520,8,60,1,60,5,60,523,8,60,10,60,12,60,526,9,60,1,60,
        1,60,1,61,1,61,5,61,532,8,61,10,61,12,61,535,9,61,1,61,1,61,1,61,
        1,61,1,62,4,62,542,8,62,11,62,12,62,543,1,62,1,62,1,63,1,63,1,63,
        1,64,1,64,1,65,1,65,1,533,0,66,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,
        8,17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,33,17,35,18,37,
        19,39,20,41,21,43,22,45,23,47,24,49,25,51,26,53,27,55,28,57,29,59,
        30,61,31,63,32,65,33,67,34,69,35,71,36,73,37,75,38,77,39,79,40,81,
        41,83,42,85,43,87,44,89,45,91,46,93,47,95,48,97,49,99,50,101,51,
        103,52,105,53,107,54,109,55,111,56,113,57,115,58,117,59,119,60,121,
        61,123,62,125,63,127,0,129,0,131,0,1,0,6,2,0,34,34,92,92,2,0,10,
        10,13,13,3,0,9,10,13,13,32,32,9,0,34,34,39,39,48,48,92,92,98,98,
        102,102,110,110,114,114,116,116,2,0,65,90,97,122,1,0,48,57,571,0,
        1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,
        0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,
        0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,
        0,0,0,0,33,1,0,0,0,0,35,1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,
        0,0,0,0,43,1,0,0,0,0,45,1,0,0,0,0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,
        0,0,0,0,53,1,0,0,0,0,55,1,0,0,0,0,57,1,0,0,0,0,59,1,0,0,0,0,61,1,
        0,0,0,0,63,1,0,0,0,0,65,1,0,0,0,0,67,1,0,0,0,0,69,1,0,0,0,0,71,1,
        0,0,0,0,73,1,0,0,0,0,75,1,0,0,0,0,77,1,0,0,0,0,79,1,0,0,0,0,81,1,
        0,0,0,0,83,1,0,0,0,0,85,1,0,0,0,0,87,1,0,0,0,0,89,1,0,0,0,0,91,1,
        0,0,0,0,93,1,0,0,0,0,95,1,0,0,0,0,97,1,0,0,0,0,99,1,0,0,0,0,101,
        1,0,0,0,0,103,1,0,0,0,0,105,1,0,0,0,0,107,1,0,0,0,0,109,1,0,0,0,
        0,111,1,0,0,0,0,113,1,0,0,0,0,115,1,0,0,0,0,117,1,0,0,0,0,119,1,
        0,0,0,0,121,1,0,0,0,0,123,1,0,0,0,0,125,1,0,0,0,1,133,1,0,0,0,3,
        135,1,0,0,0,5,137,1,0,0,0,7,139,1,0,0,0,9,141,1,0,0,0,11,143,1,0,
        0,0,13,145,1,0,0,0,15,147,1,0,0,0,17,149,1,0,0,0,19,151,1,0,0,0,
        21,153,1,0,0,0,23,155,1,0,0,0,25,158,1,0,0,0,27,160,1,0,0,0,29,163,
        1,0,0,0,31,165,1,0,0,0,33,168,1,0,0,0,35,172,1,0,0,0,37,178,1,0,
        0,0,39,189,1,0,0,0,41,195,1,0,0,0,43,208,1,0,0,0,45,220,1,0,0,0,
        47,229,1,0,0,0,49,237,1,0,0,0,51,244,1,0,0,0,53,250,1,0,0,0,55,255,
        1,0,0,0,57,260,1,0,0,0,59,264,1,0,0,0,61,273,1,0,0,0,63,279,1,0,
        0,0,65,284,1,0,0,0,67,287,1,0,0,0,69,292,1,0,0,0,71,299,1,0,0,0,
        73,304,1,0,0,0,75,309,1,0,0,0,77,312,1,0,0,0,79,316,1,0,0,0,81,319,
        1,0,0,0,83,323,1,0,0,0,85,329,1,0,0,0,87,335,1,0,0,0,89,342,1,0,
        0,0,91,344,1,0,0,0,93,348,1,0,0,0,95,353,1,0,0,0,97,361,1,0,0,0,
        99,369,1,0,0,0,101,373,1,0,0,0,103,378,1,0,0,0,105,385,1,0,0,0,107,
        394,1,0,0,0,109,401,1,0,0,0,111,486,1,0,0,0,113,488,1,0,0,0,115,
        494,1,0,0,0,117,498,1,0,0,0,119,506,1,0,0,0,121,519,1,0,0,0,123,
        529,1,0,0,0,125,541,1,0,0,0,127,547,1,0,0,0,129,550,1,0,0,0,131,
        552,1,0,0,0,133,134,5,40,0,0,134,2,1,0,0,0,135,136,5,41,0,0,136,
        4,1,0,0,0,137,138,5,39,0,0,138,6,1,0,0,0,139,140,5,34,0,0,140,8,
        1,0,0,0,141,142,5,43,0,0,142,10,1,0,0,0,143,144,5,45,0,0,144,12,
        1,0,0,0,145,146,5,42,0,0,146,14,1,0,0,0,147,148,5,47,0,0,148,16,
        1,0,0,0,149,150,5,37,0,0,150,18,1,0,0,0,151,152,5,58,0,0,152,20,
        1,0,0,0,153,154,5,61,0,0,154,22,1,0,0,0,155,156,5,47,0,0,156,157,
        5,61,0,0,157,24,1,0,0,0,158,159,5,60,0,0,159,26,1,0,0,0,160,161,
        5,60,0,0,161,162,5,61,0,0,162,28,1,0,0,0,163,164,5,62,0,0,164,30,
        1,0,0,0,165,166,5,62,0,0,166,167,5,61,0,0,167,32,1,0,0,0,168,169,
        5,117,0,0,169,170,5,115,0,0,170,171,5,101,0,0,171,34,1,0,0,0,172,
        173,5,119,0,0,173,174,5,114,0,0,174,175,5,105,0,0,175,176,5,116,
        0,0,176,177,5,101,0,0,177,36,1,0,0,0,178,179,5,119,0,0,179,180,5,
        114,0,0,180,181,5,105,0,0,181,182,5,116,0,0,182,183,5,101,0,0,183,
        184,5,45,0,0,184,185,5,108,0,0,185,186,5,105,0,0,186,187,5,110,0,
        0,187,188,5,101,0,0,188,38,1,0,0,0,189,190,5,112,0,0,190,191,5,114,
        0,0,191,192,5,105,0,0,192,193,5,110,0,0,193,194,5,116,0,0,194,40,
        1,0,0,0,195,196,5,100,0,0,196,197,5,101,0,0,197,198,5,102,0,0,198,
        199,5,112,0,0,199,200,5,97,0,0,200,201,5,114,0,0,201,202,5,97,0,
        0,202,203,5,109,0,0,203,204,5,101,0,0,204,205,5,116,0,0,205,206,
        5,101,0,0,206,207,5,114,0,0,207,42,1,0,0,0,208,209,5,100,0,0,209,
        210,5,101,0,0,210,211,5,102,0,0,211,212,5,99,0,0,212,213,5,111,0,
        0,213,214,5,110,0,0,214,215,5,115,0,0,215,216,5,116,0,0,216,217,
        5,97,0,0,217,218,5,110,0,0,218,219,5,116,0,0,219,44,1,0,0,0,220,
        221,5,100,0,0,221,222,5,101,0,0,222,223,5,102,0,0,223,224,5,109,
        0,0,224,225,5,97,0,0,225,226,5,99,0,0,226,227,5,114,0,0,227,228,
        5,111,0,0,228,46,1,0,0,0,229,230,5,100,0,0,230,231,5,101,0,0,231,
        232,5,102,0,0,232,233,5,116,0,0,233,234,5,121,0,0,234,235,5,112,
        0,0,235,236,5,101,0,0,236,48,1,0,0,0,237,238,5,100,0,0,238,239,5,
        101,0,0,239,240,5,102,0,0,240,241,5,118,0,0,241,242,5,97,0,0,242,
        243,5,114,0,0,243,50,1,0,0,0,244,245,5,100,0,0,245,246,5,101,0,0,
        246,247,5,102,0,0,247,248,5,117,0,0,248,249,5,110,0,0,249,52,1,0,
        0,0,250,251,5,115,0,0,251,252,5,101,0,0,252,253,5,116,0,0,253,254,
        5,113,0,0,254,54,1,0,0,0,255,256,5,115,0,0,256,257,5,101,0,0,257,
        258,5,116,0,0,258,259,5,102,0,0,259,56,1,0,0,0,260,261,5,115,0,0,
        261,262,5,101,0,0,262,263,5,116,0,0,263,58,1,0,0,0,264,265,5,100,
        0,0,265,266,5,101,0,0,266,267,5,102,0,0,267,268,5,99,0,0,268,269,
        5,108,0,0,269,270,5,97,0,0,270,271,5,115,0,0,271,272,5,115,0,0,272,
        60,1,0,0,0,273,274,5,99,0,0,274,275,5,108,0,0,275,276,5,97,0,0,276,
        277,5,115,0,0,277,278,5,115,0,0,278,62,1,0,0,0,279,280,5,99,0,0,
        280,281,5,97,0,0,281,282,5,115,0,0,282,283,5,101,0,0,283,64,1,0,
        0,0,284,285,5,105,0,0,285,286,5,102,0,0,286,66,1,0,0,0,287,288,5,
        119,0,0,288,289,5,104,0,0,289,290,5,101,0,0,290,291,5,110,0,0,291,
        68,1,0,0,0,292,293,5,117,0,0,293,294,5,110,0,0,294,295,5,108,0,0,
        295,296,5,101,0,0,296,297,5,115,0,0,297,298,5,115,0,0,298,70,1,0,
        0,0,299,300,5,99,0,0,300,301,5,111,0,0,301,302,5,110,0,0,302,303,
        5,100,0,0,303,72,1,0,0,0,304,305,5,108,0,0,305,306,5,111,0,0,306,
        307,5,111,0,0,307,308,5,112,0,0,308,74,1,0,0,0,309,310,5,100,0,0,
        310,311,5,111,0,0,311,76,1,0,0,0,312,313,5,97,0,0,313,314,5,110,
        0,0,314,315,5,100,0,0,315,78,1,0,0,0,316,317,5,111,0,0,317,318,5,
        114,0,0,318,80,1,0,0,0,319,320,5,110,0,0,320,321,5,111,0,0,321,322,
        5,116,0,0,322,82,1,0,0,0,323,324,5,116,0,0,324,325,5,104,0,0,325,
        326,5,114,0,0,326,327,5,111,0,0,327,328,5,119,0,0,328,84,1,0,0,0,
        329,330,5,99,0,0,330,331,5,97,0,0,331,332,5,116,0,0,332,333,5,99,
        0,0,333,334,5,104,0,0,334,86,1,0,0,0,335,336,5,102,0,0,336,337,5,
        111,0,0,337,338,5,114,0,0,338,339,5,109,0,0,339,340,5,97,0,0,340,
        341,5,116,0,0,341,88,1,0,0,0,342,343,5,116,0,0,343,90,1,0,0,0,344,
        345,5,110,0,0,345,346,5,105,0,0,346,347,5,108,0,0,347,92,1,0,0,0,
        348,349,5,116,0,0,349,350,5,121,0,0,350,351,5,112,0,0,351,352,5,
        101,0,0,352,94,1,0,0,0,353,354,5,116,0,0,354,355,5,121,0,0,355,356,
        5,112,0,0,356,357,5,101,0,0,357,358,5,45,0,0,358,359,5,111,0,0,359,
        360,5,102,0,0,360,96,1,0,0,0,361,362,5,100,0,0,362,363,5,101,0,0,
        363,364,5,99,0,0,364,365,5,108,0,0,365,366,5,97,0,0,366,367,5,105,
        0,0,367,368,5,109,0,0,368,98,1,0,0,0,369,370,5,108,0,0,370,371,5,
        101,0,0,371,372,5,116,0,0,372,100,1,0,0,0,373,374,5,108,0,0,374,
        375,5,101,0,0,375,376,5,116,0,0,376,377,5,42,0,0,377,102,1,0,0,0,
        378,379,5,108,0,0,379,380,5,97,0,0,380,381,5,109,0,0,381,382,5,98,
        0,0,382,383,5,100,0,0,383,384,5,97,0,0,384,104,1,0,0,0,385,386,5,
        102,0,0,386,387,5,117,0,0,387,388,5,110,0,0,388,389,5,99,0,0,389,
        390,5,116,0,0,390,391,5,105,0,0,391,392,5,111,0,0,392,393,5,110,
        0,0,393,106,1,0,0,0,394,395,5,114,0,0,395,396,5,101,0,0,396,397,
        5,116,0,0,397,398,5,117,0,0,398,399,5,114,0,0,399,400,5,110,0,0,
        400,108,1,0,0,0,401,402,5,114,0,0,402,403,5,101,0,0,403,404,5,116,
        0,0,404,405,5,117,0,0,405,406,5,114,0,0,406,407,5,110,0,0,407,408,
        5,45,0,0,408,409,5,102,0,0,409,410,5,114,0,0,410,411,5,111,0,0,411,
        412,5,109,0,0,412,110,1,0,0,0,413,414,5,105,0,0,414,415,5,110,0,
        0,415,416,5,116,0,0,416,417,5,101,0,0,417,418,5,103,0,0,418,419,
        5,101,0,0,419,487,5,114,0,0,420,421,5,102,0,0,421,422,5,108,0,0,
        422,423,5,111,0,0,423,424,5,97,0,0,424,487,5,116,0,0,425,426,5,100,
        0,0,426,427,5,111,0,0,427,428,5,117,0,0,428,429,5,98,0,0,429,430,
        5,108,0,0,430,431,5,101,0,0,431,432,5,45,0,0,432,433,5,102,0,0,433,
        434,5,108,0,0,434,435,5,111,0,0,435,436,5,97,0,0,436,487,5,116,0,
        0,437,438,5,115,0,0,438,439,5,104,0,0,439,440,5,111,0,0,440,441,
        5,114,0,0,441,442,5,116,0,0,442,443,5,45,0,0,443,444,5,102,0,0,444,
        445,5,108,0,0,445,446,5,111,0,0,446,447,5,97,0,0,447,487,5,116,0,
        0,448,449,5,99,0,0,449,450,5,104,0,0,450,451,5,97,0,0,451,452,5,
        114,0,0,452,453,5,97,0,0,453,454,5,99,0,0,454,455,5,116,0,0,455,
        456,5,101,0,0,456,487,5,114,0,0,457,458,5,115,0,0,458,459,5,116,
        0,0,459,460,5,114,0,0,460,461,5,105,0,0,461,462,5,110,0,0,462,487,
        5,103,0,0,463,464,5,115,0,0,464,465,5,121,0,0,465,466,5,109,0,0,
        466,467,5,98,0,0,467,468,5,111,0,0,468,487,5,108,0,0,469,470,5,108,
        0,0,470,471,5,105,0,0,471,472,5,115,0,0,472,487,5,116,0,0,473,474,
        5,97,0,0,474,475,5,114,0,0,475,476,5,114,0,0,476,477,5,97,0,0,477,
        487,5,121,0,0,478,479,5,99,0,0,479,480,5,111,0,0,480,481,5,110,0,
        0,481,487,5,115,0,0,482,483,5,110,0,0,483,484,5,117,0,0,484,485,
        5,108,0,0,485,487,5,108,0,0,486,413,1,0,0,0,486,420,1,0,0,0,486,
        425,1,0,0,0,486,437,1,0,0,0,486,448,1,0,0,0,486,457,1,0,0,0,486,
        463,1,0,0,0,486,469,1,0,0,0,486,473,1,0,0,0,486,478,1,0,0,0,486,
        482,1,0,0,0,487,112,1,0,0,0,488,489,3,13,6,0,489,490,3,117,58,0,
        490,491,3,13,6,0,491,114,1,0,0,0,492,495,3,129,64,0,493,495,3,131,
        65,0,494,492,1,0,0,0,494,493,1,0,0,0,495,496,1,0,0,0,496,494,1,0,
        0,0,496,497,1,0,0,0,497,116,1,0,0,0,498,502,3,129,64,0,499,503,3,
        129,64,0,500,503,3,131,65,0,501,503,5,45,0,0,502,499,1,0,0,0,502,
        500,1,0,0,0,502,501,1,0,0,0,503,504,1,0,0,0,504,502,1,0,0,0,504,
        505,1,0,0,0,505,118,1,0,0,0,506,511,3,7,3,0,507,510,8,0,0,0,508,
        510,3,127,63,0,509,507,1,0,0,0,509,508,1,0,0,0,510,513,1,0,0,0,511,
        509,1,0,0,0,511,512,1,0,0,0,512,514,1,0,0,0,513,511,1,0,0,0,514,
        515,3,7,3,0,515,120,1,0,0,0,516,520,5,59,0,0,517,518,5,59,0,0,518,
        520,5,59,0,0,519,516,1,0,0,0,519,517,1,0,0,0,520,524,1,0,0,0,521,
        523,8,1,0,0,522,521,1,0,0,0,523,526,1,0,0,0,524,522,1,0,0,0,524,
        525,1,0,0,0,525,527,1,0,0,0,526,524,1,0,0,0,527,528,6,60,0,0,528,
        122,1,0,0,0,529,533,5,35,0,0,530,532,9,0,0,0,531,530,1,0,0,0,532,
        535,1,0,0,0,533,534,1,0,0,0,533,531,1,0,0,0,534,536,1,0,0,0,535,
        533,1,0,0,0,536,537,5,35,0,0,537,538,1,0,0,0,538,539,6,61,0,0,539,
        124,1,0,0,0,540,542,7,2,0,0,541,540,1,0,0,0,542,543,1,0,0,0,543,
        541,1,0,0,0,543,544,1,0,0,0,544,545,1,0,0,0,545,546,6,62,0,0,546,
        126,1,0,0,0,547,548,5,92,0,0,548,549,7,3,0,0,549,128,1,0,0,0,550,
        551,7,4,0,0,551,130,1,0,0,0,552,553,7,5,0,0,553,132,1,0,0,0,12,0,
        486,494,496,502,504,509,511,519,524,533,543,1,6,0,0
    ]

class MyLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    LPAREN = 1
    RPAREN = 2
    SQ = 3
    DQ = 4
    PLUS = 5
    MINUS = 6
    MULT = 7
    DIV = 8
    PERC = 9
    COLON = 10
    EQUALS = 11
    NOT_EQUALS = 12
    LESS_THAN = 13
    LESS_OR_EQUAL_THAN = 14
    GREATER_THAN = 15
    GREATER_OR_EQUAL_THAN = 16
    USE = 17
    WRITE = 18
    WRITE_LINE = 19
    PRINT = 20
    DEFPARAMETER = 21
    DEFCONSTANT = 22
    DEFMACRO = 23
    DEFTYPE = 24
    DEFVAR = 25
    DEFUN = 26
    SETQ = 27
    SETF = 28
    SET = 29
    DEFCLASS = 30
    CLASS = 31
    CASE = 32
    IF = 33
    WHEN = 34
    UNLESS = 35
    COND = 36
    LOOP = 37
    DO = 38
    AND = 39
    OR = 40
    NOT = 41
    THROW = 42
    CATCH = 43
    FORMAT = 44
    T = 45
    NIL = 46
    TYPE = 47
    TYPE_OF = 48
    DECLAIM = 49
    LET = 50
    LET_STAR = 51
    LAMBDA = 52
    FUNCTION = 53
    RETURN = 54
    RETURN_FROM = 55
    DATATYPES = 56
    VAR = 57
    ATOM = 58
    SYMBOL = 59
    STRING = 60
    COMMENT = 61
    MULTIPLE_COMMENT = 62
    WS = 63

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'('", "')'", "'''", "'\"'", "'+'", "'-'", "'*'", "'/'", "'%'", 
            "':'", "'='", "'/='", "'<'", "'<='", "'>'", "'>='", "'use'", 
            "'write'", "'write-line'", "'print'", "'defparameter'", "'defconstant'", 
            "'defmacro'", "'deftype'", "'defvar'", "'defun'", "'setq'", 
            "'setf'", "'set'", "'defclass'", "'class'", "'case'", "'if'", 
            "'when'", "'unless'", "'cond'", "'loop'", "'do'", "'and'", "'or'", 
            "'not'", "'throw'", "'catch'", "'format'", "'t'", "'nil'", "'type'", 
            "'type-of'", "'declaim'", "'let'", "'let*'", "'lambda'", "'function'", 
            "'return'", "'return-from'" ]

    symbolicNames = [ "<INVALID>",
            "LPAREN", "RPAREN", "SQ", "DQ", "PLUS", "MINUS", "MULT", "DIV", 
            "PERC", "COLON", "EQUALS", "NOT_EQUALS", "LESS_THAN", "LESS_OR_EQUAL_THAN", 
            "GREATER_THAN", "GREATER_OR_EQUAL_THAN", "USE", "WRITE", "WRITE_LINE", 
            "PRINT", "DEFPARAMETER", "DEFCONSTANT", "DEFMACRO", "DEFTYPE", 
            "DEFVAR", "DEFUN", "SETQ", "SETF", "SET", "DEFCLASS", "CLASS", 
            "CASE", "IF", "WHEN", "UNLESS", "COND", "LOOP", "DO", "AND", 
            "OR", "NOT", "THROW", "CATCH", "FORMAT", "T", "NIL", "TYPE", 
            "TYPE_OF", "DECLAIM", "LET", "LET_STAR", "LAMBDA", "FUNCTION", 
            "RETURN", "RETURN_FROM", "DATATYPES", "VAR", "ATOM", "SYMBOL", 
            "STRING", "COMMENT", "MULTIPLE_COMMENT", "WS" ]

    ruleNames = [ "LPAREN", "RPAREN", "SQ", "DQ", "PLUS", "MINUS", "MULT", 
                  "DIV", "PERC", "COLON", "EQUALS", "NOT_EQUALS", "LESS_THAN", 
                  "LESS_OR_EQUAL_THAN", "GREATER_THAN", "GREATER_OR_EQUAL_THAN", 
                  "USE", "WRITE", "WRITE_LINE", "PRINT", "DEFPARAMETER", 
                  "DEFCONSTANT", "DEFMACRO", "DEFTYPE", "DEFVAR", "DEFUN", 
                  "SETQ", "SETF", "SET", "DEFCLASS", "CLASS", "CASE", "IF", 
                  "WHEN", "UNLESS", "COND", "LOOP", "DO", "AND", "OR", "NOT", 
                  "THROW", "CATCH", "FORMAT", "T", "NIL", "TYPE", "TYPE_OF", 
                  "DECLAIM", "LET", "LET_STAR", "LAMBDA", "FUNCTION", "RETURN", 
                  "RETURN_FROM", "DATATYPES", "VAR", "ATOM", "SYMBOL", "STRING", 
                  "COMMENT", "MULTIPLE_COMMENT", "WS", "ESCAPE_CHAR", "LETTER", 
                  "NUMBER" ]

    grammarFileName = "MyLexer.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


