package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BestDayToBuyStock {
    public static int[] prices = new int[] { 897, 265, 201, 86, 56, 657, 273, 25, 843, 625, 641, 332, 509, 463, 496, 97,
            779, 241,
            970, 665, 87, 765, 276, 442, 25, 311, 10, 765, 224, 465, 296, 415, 968, 40, 494, 151, 493, 159, 274, 444,
            10, 792, 104, 200, 694, 193, 616, 126, 754, 3, 489, 415, 863, 589, 646, 264, 88, 733, 132, 922, 794, 149,
            496, 135, 727, 355, 890, 102, 3, 668, 517, 852, 488, 445, 980, 964, 933, 754, 815, 496, 550, 2, 33, 191,
            516, 455, 436, 41, 618, 596, 334, 10, 708, 348, 511, 752, 767, 129, 470, 698, 647, 604, 104, 811, 574, 52,
            750, 319, 97, 45, 391, 42, 822, 712, 92, 664, 318, 702, 5, 303, 778, 799, 638, 430, 66, 944, 78, 40, 632,
            919, 828, 851, 589, 75, 328, 774, 991, 305, 126, 996, 505, 463, 428, 972, 781, 697, 244, 98, 148, 670, 30,
            328, 457, 673, 766, 69, 461, 44, 804, 986, 133, 169, 786, 950, 745, 63, 362, 857, 411, 12, 680, 9, 586, 827,
            932, 54, 538, 509, 120, 287, 534, 866, 926, 351, 634, 842, 188, 57, 443, 296, 134, 254, 447, 350, 558, 418,
            917, 492, 683, 702, 504, 964, 319, 717, 178, 400, 226, 66, 969, 183, 703, 231, 38, 684, 197, 245, 600, 97,
            126, 536, 612, 54, 414, 827, 598, 4, 368, 412, 248, 293, 270, 937, 847, 265, 801, 278, 64, 600, 254, 54,
            791, 608, 782, 532, 719, 76, 224, 981, 695, 727, 987, 567, 230, 149, 807, 721, 0, 301, 881, 713, 514, 196,
            672, 444, 12, 559, 927, 791, 228, 215, 552, 50, 409, 660, 356, 402, 45, 989, 859, 224, 90, 219, 371, 241,
            568, 177, 486, 920, 28, 549, 538, 537, 232, 168, 792, 367, 415, 517, 817, 471, 800, 278, 848, 173, 441, 420,
            789, 456, 338, 681, 490, 610, 171, 691, 423, 510, 952, 152, 120, 872, 603, 922, 51, 419, 391, 555, 155, 945,
            231, 411, 406, 233, 591, 704, 217, 721, 305, 168, 914, 219, 607, 162, 723, 654, 690, 613, 468, 510, 589,
            896, 792, 52, 926, 857, 654, 565, 137, 807, 998, 761, 347, 99, 800, 412, 260, 521, 584, 609, 662, 548, 549,
            300, 64, 52, 429, 352, 337, 490, 427, 946, 545, 355, 51, 832, 215, 755, 37, 761, 56, 492, 374, 99, 194, 220,
            514, 894, 253, 351, 730, 87, 504, 769, 462, 517, 141, 504, 917, 967, 257, 170, 234, 513, 601, 581, 3, 515,
            77, 928, 970, 635, 317, 208, 104, 856, 575, 805, 631, 433, 187, 700, 997, 896, 222, 193, 794, 508, 951, 18,
            463, 700, 528, 660, 788, 602, 397, 777, 466, 1, 160, 687, 611, 271, 30, 848, 640, 514, 634, 830, 407, 294,
            147, 734, 310, 619, 280, 160, 615, 187, 675, 400, 535, 357, 214, 769, 776, 454, 738, 740, 481, 119, 977,
            877, 660, 923, 639, 555, 272, 675, 812, 228, 853, 80, 447, 495, 779, 246, 634, 109, 890, 189, 907, 736, 647,
            678, 124, 576, 505, 40, 137, 716, 771, 972, 944, 863, 967, 645, 277, 523, 845, 36, 214, 975, 25, 684, 149,
            90, 784, 756, 480, 195, 10, 704, 732, 212, 43, 900, 346, 521, 1, 273, 96, 328, 592, 399, 479, 759, 853, 426,
            97, 512, 257, 28, 237, 250, 298, 147, 175, 44, 198, 989, 459, 896, 828, 614, 887, 198, 54, 865, 332, 521,
            362, 624, 350, 666, 176, 679, 703, 170, 758, 341, 794, 826, 669, 627, 676, 444, 441, 79, 689, 823, 648, 548,
            484, 30, 324, 875, 69, 880, 382, 891, 882, 701, 36, 979, 196, 750, 528, 882, 584, 151, 198, 812, 974, 541,
            337, 682, 683, 828, 291, 496, 535, 344, 728, 566, 302, 392, 159, 728, 804, 309, 284, 618, 30, 95, 244, 649,
            928, 317, 726, 754, 271, 56, 11, 984, 373, 853, 677, 486, 975, 746, 732, 268, 762, 87, 810, 115, 867, 762,
            130, 402, 803, 564, 468, 863, 291, 962, 24, 185, 359, 801, 701, 432, 4, 525, 918, 449, 248, 141, 459, 463,
            822, 129, 266, 326, 622, 404, 902, 190, 300, 776, 487, 90, 964, 114, 201, 63, 99, 741, 227, 656, 393, 573,
            700, 440, 263, 155, 154, 622, 595, 806, 432, 194, 374, 156, 436, 659, 585, 168, 734, 358, 446, 247, 425, 88,
            787, 196, 214, 488, 280, 350, 757, 709, 613, 857, 391, 840, 303, 328, 631, 433, 971, 409, 953, 343, 920,
            726, 658, 257, 202, 102, 571, 895, 704, 298, 571, 466, 72, 487, 698, 438, 837, 992, 538, 642, 741, 279, 723,
            734, 562, 865, 797, 754, 321, 801, 174, 764, 255, 924, 727, 449, 507, 314, 314, 184, 794, 896, 818, 111,
            916, 553, 909, 807, 729, 909, 650, 685, 428, 420, 371, 253, 346, 647, 900, 957, 907, 872, 777, 7, 483, 306,
            12, 852, 163, 854, 654, 754, 256, 10, 378, 958, 234, 671, 273, 289, 132, 232, 990, 140, 805, 965, 750, 520,
            522, 594, 703, 7, 276, 424, 629, 225, 660, 154, 448, 309, 528, 457, 448, 560, 485, 64, 755, 919, 419, 143,
            551, 944, 339, 744, 891, 774, 392, 922, 125, 384, 745, 157, 599, 807, 910, 227, 602, 395, 704, 468, 663,
            136, 458, 439, 509, 794, 223, 53, 890, 19, 702, 54, 277, 279, 971, 544, 172, 658, 304, 490, 795, 443, 389,
            355, 529, 929, 140, 268, 450, 410, 151, 158, 4, 802, 202, 63, 843, 278, 452, 680, 551, 243, 922, 253, 325,
            785, 893, 379, 510, 92, 492, 794, 554, 38, 711, 911, 400, 375, 327, 949, 806, 443, 901, 979, 227, 820, 854,
            976, 979, 289, 832, 884, 448, 643, 734, 670, 855, 91, 443, 726, 435, 28, 94, 14, 694, 345, 95, 105, 476,
            889, 372, 734, 851, 890, 699, 730, 48, 881, 612, 143, 803, 34, 40, 995, 448, 310, 601, 701, 533, 149, 757,
            349, 555, 941, 760, 937, 93, 195, 754, 98, 194, 856, 393, 333, 702, 909, 741, 6, 244, 827, 134, 729, 879,
            378, 445, 860, 925, 472, 485, 990, 661, 225, 938, 818, 724, 19, 639, 980, 923, 369, 929, 345, 799, 239, 362,
            728, 679, 94, 148, 939, 888, 35, 79, 121, 947, 920, 315, 576, 93, 473, 939, 428, 219, 819, 560, 798, 60,
            181, 973, 423, 283, 803, 960, 927, 369, 266, 120, 164, 717, 151, 951, 398, 735, 329, 346, 411, 59, 749, 877,
            185, 137, 562, 100, 571, 913, 362, 256, 11, 457, 975, 544, 947, 106, 382, 847, 606, 506, 238, 920, 950, 984,
            756, 598, 969, 567, 743, 372, 408, 7, 761, 124, 472, 730, 721, 432, 599, 869, 515, 711, 869, 572, 995, 151,
            546, 8, 830, 512, 616, 565, 62, 467, 153, 379, 596, 94, 357, 727, 664, 304, 508, 730, 116, 98, 335, 325,
            245, 902, 167, 372, 876, 788, 253, 507, 133, 872, 505, 887, 798, 645, 830, 342, 191, 51, 140, 906, 271, 504,
            689, 450, 234, 373, 505, 969, 562, 287, 395, 313, 745, 958, 510, 0, 923, 680, 860, 364, 325, 517, 748, 28,
            867, 185, 396, 193, 880, 764, 828, 500, 460, 160, 138, 948, 668, 784, 653, 33, 787, 278, 564, 538, 670, 635,
            575, 951, 260, 619, 314, 794, 428, 705, 495, 672, 894, 994, 897, 399, 0, 977, 581, 466, 668, 512, 10, 524,
            667, 251, 641, 196, 567, 729, 18, 511, 728, 62, 63, 786, 202, 138, 584, 293, 255, 377, 960, 891, 977, 442,
            799, 993, 414, 883, 433, 242, 779, 653, 375, 241, 954, 643, 218, 802, 192, 913, 647, 738, 750, 916, 52, 157,
            393, 158, 100, 252, 107, 118, 612, 222, 325, 168, 257, 840, 110, 490, 358, 839, 918, 354, 645, 433, 733,
            813, 337, 535, 258, 117, 227, 600, 730, 209, 941, 432, 294, 156, 224, 67, 748, 537, 112, 37, 707, 886, 8,
            766, 180, 930, 194, 496, 340, 327, 773, 237, 132, 241, 626, 865, 471, 197, 372, 897, 234, 265, 907, 533,
            637, 973, 717, 925, 439, 474, 620, 778, 604, 633, 183, 842, 856, 952, 287, 102, 352, 800, 489, 752, 680,
            325, 268, 630, 999, 566, 645, 713, 524, 930, 282, 850, 994, 810, 350, 545, 373, 212, 106, 897, 274, 254,
            833, 15, 11, 124, 1, 283, 21, 478, 208, 296, 514, 942, 884, 965, 179, 857, 138, 672, 474, 669, 142, 235,
            505, 409, 477, 485, 123, 79, 781, 47, 168, 469, 709, 437, 584, 591, 474, 272, 753, 12, 969, 246, 795, 781,
            980, 418, 104, 433, 225, 518, 370, 941, 92, 459, 499, 337, 936, 536, 9, 27, 894, 523, 815, 332, 723, 311,
            515, 966, 948, 849, 227, 708, 633, 394, 916, 971, 8, 180, 486, 887, 87, 671, 589, 361, 929, 836, 924, 886,
            312, 471, 816, 433, 134, 775, 311, 894, 71, 818, 55, 465, 883, 343, 186, 363, 210, 932, 357, 602, 689, 778,
            988, 766, 947, 937, 760, 145, 171, 19, 771, 411, 928, 942, 406, 407, 762, 882, 362, 319, 609, 569, 690, 48,
            717, 826, 92, 283, 398, 572, 835, 492, 132, 340, 900, 164, 364, 754, 847, 895, 775, 481, 6, 509, 909, 410,
            413, 653, 643, 850, 17, 431, 254, 538, 362, 294, 27, 39, 741, 778, 429, 193, 540, 678, 908, 690, 780, 320,
            871, 888, 703, 86, 943, 340, 590, 753, 108, 952, 720, 298, 5, 103, 483, 501, 522, 876, 584, 272, 883, 662,
            644, 563, 322, 718, 436, 975, 33, 692, 986, 945, 232, 810, 504, 189, 990, 100, 697, 560, 690, 453, 62, 127,
            77, 176, 495, 899, 313, 395, 960, 293, 601, 986, 109, 736, 315, 954, 136, 19, 223, 883, 525, 68, 18, 502,
            108, 410, 247, 363, 738, 388, 511, 275, 783, 645, 542, 610, 477, 533, 806, 317, 576, 635, 242, 587, 157,
            147, 789, 117, 996, 713, 623, 697, 297, 919, 46, 739, 969, 373, 877, 205, 945, 131, 317, 358, 227, 611, 629,
            780, 143, 914, 360, 521, 437, 793, 617, 534, 990, 770, 294, 323, 601, 700, 724, 814, 433, 422, 165, 53, 430,
            168, 654, 222, 291, 854, 639, 803, 821, 784, 265, 479, 881, 287, 835, 82, 913, 63, 699, 973, 619, 49, 199,
            6, 691, 50, 536, 222, 511, 427, 816, 105, 636, 237, 804, 831, 127, 413, 296, 77, 214, 359, 624, 500, 692,
            146, 578, 22, 974, 796, 858, 826, 125, 132, 766, 682, 893, 945, 13, 725, 544, 567, 253, 653, 146, 59, 397,
            551, 883, 871, 816, 695, 357, 317, 222, 801, 435, 185, 150, 875, 977, 39, 125, 365, 658, 911, 762, 536, 407,
            446, 386, 563, 930, 274, 623, 82, 23, 461, 998, 647, 882, 654, 387, 922, 832, 89, 708, 689, 898, 389, 157,
            304, 169, 93, 373, 478, 268, 454, 905, 124, 972, 207, 868, 161, 583, 710, 841, 901, 198, 164, 253, 683, 743,
            318, 195, 312, 870, 61, 514, 314, 251, 743, 269, 981, 995, 313, 978, 693, 11, 50, 402, 253, 440, 604, 287,
            111, 77, 182, 772, 411, 323, 138, 892, 322, 952, 143, 674, 766, 83, 849, 917, 672, 581, 528, 179, 384, 207,
            907, 90, 16, 36, 233, 434, 251, 383, 989, 91, 367, 334, 789, 486, 739, 279, 344, 777, 162, 257, 143, 342,
            692, 994, 457, 745, 880, 386, 559, 117, 339, 771, 243, 736, 219, 529, 63, 769, 88, 322, 320, 561, 485, 562,
            930, 359, 961, 854, 480, 207, 237, 91, 668, 981, 460, 668, 480, 706, 605, 937, 499, 101, 586, 802, 538, 248,
            997, 206, 541, 25, 718, 783, 137, 688, 902, 456, 617, 22, 182, 119, 704, 688, 673, 466, 128, 575, 466, 260,
            436, 470, 111, 132, 777, 312, 289, 366, 560, 81, 282, 578, 421, 17, 226, 448, 747, 157, 548, 457, 786, 712,
            22, 265, 0, 111, 781, 528, 426, 366, 971, 712, 880, 754, 517, 519, 550, 128, 862, 249, 879, 57, 957, 672,
            667, 815, 418, 274, 314, 250, 351, 176, 397, 707, 177, 457, 60, 254, 411, 586, 523, 799, 552, 674, 456, 167,
            872, 192, 461, 692, 861, 589, 106, 88, 953, 257, 680, 140, 906, 235, 311, 586, 436, 1, 452, 182, 404, 986,
            921, 202, 97, 895, 653, 195, 4, 918, 132, 931, 213, 144, 887, 635, 632, 575, 669, 974, 426, 228, 738, 370,
            84, 807, 587, 671, 74, 920, 913, 252, 754, 376, 694, 781, 736, 397, 138, 217, 425, 454, 894, 58, 539, 43,
            288, 123, 398, 984, 298, 944, 989, 351, 90, 823, 819, 393, 564, 543, 586, 65, 463, 81, 377, 587, 112, 753,
            854, 880, 450, 954, 546, 924, 956, 464, 31, 631, 627, 240, 653, 586, 802, 619, 353, 412, 64, 912, 419, 7,
            646, 47, 176, 246, 439, 853, 394, 826, 556, 91, 808, 401, 575, 349, 995, 68, 252, 368, 710, 523, 49, 160,
            178, 958, 310, 708, 456, 479, 209, 533, 713, 956, 146, 355, 409, 177, 66, 500, 45, 293, 754, 87, 342, 776,
            587, 380, 797, 880, 141, 652, 952, 122, 129, 973, 111, 829, 635, 286, 989, 733, 231, 719, 249, 377, 424,
            211, 624, 118, 105, 690, 137, 9, 390, 115, 505, 34, 326, 453, 571, 395, 49, 690, 69, 319, 217, 730, 515, 81,
            797, 911, 219, 139, 692, 166, 354, 549, 771, 355, 230, 386, 259, 998, 836, 447, 581, 208, 334, 159, 25, 340,
            920, 247, 27, 128, 342, 27, 718, 214, 820, 335, 307, 541, 166, 1, 318, 860, 808, 978, 531, 58, 109, 366,
            614, 438, 225, 928, 853, 59, 904, 194, 851, 950, 135, 245, 534, 749, 724, 411, 29, 60, 142, 342, 241, 326,
            80, 305, 800, 681, 931, 785, 76, 160, 520, 241, 265, 300, 11, 256, 568, 173, 484, 401, 425, 732, 348, 228,
            399, 333, 217, 388, 149, 744, 681, 64, 658, 417, 210, 159, 351, 206, 244, 6, 532, 772, 623, 297, 661, 244,
            638, 545, 410, 440, 80, 808, 328, 651, 121, 235, 722, 572, 311, 34, 451, 463, 347, 322, 224, 964, 489, 741,
            768, 652, 509, 824, 718, 991, 554, 98, 318, 400, 551, 403, 416, 746, 660, 691, 841, 910, 610, 555, 661, 901,
            816, 874, 691, 37, 750, 537, 991, 393, 354, 487, 757, 423, 15, 377, 486, 594, 986, 254, 580, 723, 465, 436,
            924, 87, 803, 47, 298, 994, 344, 688, 585, 766, 355, 109, 790, 448, 867, 71, 173, 893, 572, 598, 575, 624,
            757, 510, 943, 363, 57, 797, 685, 96, 849, 303, 622, 322, 471, 23, 261, 56, 437, 224, 586, 611, 963, 496,
            19, 503, 705, 488, 526, 544, 79, 290, 379, 564, 712, 560, 676, 517, 129, 866, 801, 391, 455, 266, 974, 70,
            377, 72, 752, 122, 469, 841, 12, 850, 849, 789, 882, 126, 621, 996, 135, 364, 573, 774, 298, 165, 220, 196,
            682, 498, 696, 942, 84, 532, 677, 999, 166, 326, 931, 884, 511, 379, 818, 557, 162, 487, 30, 240, 508, 905,
            944, 453, 562, 249, 237, 15, 727, 562, 647, 504, 206, 992, 800, 651, 425, 128, 354, 364, 126, 379, 971, 443,
            32, 506, 240, 943, 261, 736, 425, 345, 343, 341, 309, 306, 286, 718, 875, 414, 432, 930, 955, 658, 560, 881,
            367, 424, 410, 888, 868, 74, 491, 734, 282, 964, 887, 432, 192, 374, 480, 904, 833, 565, 941, 224 };

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > prices[min]) {
                max = Math.max(max, prices[i] - prices[min]);
            } else {
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > prices[min]) {
                max = Math.max(max, prices[i] - prices[min]);
            } else {
                min = i;
            }
        }
        return max;
    }
}