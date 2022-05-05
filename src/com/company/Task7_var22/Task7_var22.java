package com.company.Task7_var22;

import com.company.util.ArrayUtils;

public class Task7_var22 {

    /**
     * 22.	(*) Вводится массив целых чисел. Найти самую длинную подпоследовательность подряд идущих элементов массива,
     * такую что в данной подпоследовательности четные и нечетные (по модулю) элементы чередуются (реализовать функцию,
     * которая будет возвращать позицию первого элемента такой подпоследовательности и кол-во элементов). Будем считать,
     * что один любой элемент массива является последовательностью чередующихся четных и нечетных элементов. В случае
     * нескольких таких подпоследовательностей найти последнюю. Например, для массиве
     * { 1, 2, -2, 1, 10, 3, 105, 4, -5, 4, 10, 1, 1, 3, 4, 7, 12, 10 } правильным ответом
     * будет {3, 4, 7, 12 } (также существуют еще две таких последовательности длиной 4 – { -2, 1, 10, 3 }
     * и { 105, 4, -5, 4 }).
     */


    public static void Tests() {

        int[] arr1 = {2, 3, 8, -15, 25, 30, -50, -11, 15, -20};
        System.out.println("FIRST TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr1, "%3d"));
        System.out.println("Length = " + solution(arr1).length + "; Index = " + solution(arr1).index);
        System.out.println();

        int[] arr2 = {1, 2, -2, 1, 10, 3, 105, 4, -5, 4, 10, 1, 1, -3, 4, 7, 12, -10};
        System.out.println("SECOND TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr2, "%3d"));
        System.out.println("Length = " + solution(arr2).length + "; Index = " + solution(arr2).index);
        System.out.println();

        int[] arr3 = {1, -1, 2, 3, -5, 5, 7, -9, 2, 3, 4, -5, 6};
        System.out.println("THIRD TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr3, "%3d"));
        System.out.println("Length = " + solution(arr3).length + "; Index = " + solution(arr3).index);
        System.out.println();

        int[] arr4 = {6, -3, 2, -1, 7, 8};
        System.out.println("FOURTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr4, "%3d"));
        System.out.println("Length = " + solution(arr4).length + "; Index = " + solution(arr4).index);
        System.out.println();

        int[] arr5 = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        System.out.println("FIFTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr5, "%3d"));
        System.out.println("Length = " + solution(arr5).length + "; Index = " + solution(arr5).index);
        System.out.println();

        int[] arr6 = {-1681, 2116, -5436, 323454, -923423, 61211, -717673, 74676, 218, 41};
        System.out.println("SIXTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr6, "%3d"));
        System.out.println("Length = " + solution(arr6).length + "; Index = " + solution(arr6).index);
        System.out.println();

        int[] arr7 = {8642, 7863, -7658, 5009, -5701, -1256, 8775, 5006, 4687, -6663, 2081, 594, 6129, -6917, 2198, 8960, -24, 3865, 8183, 1235};
        System.out.println("SEVENTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr7, "%3d"));
        System.out.println("Length = " + solution(arr7).length + "; Index = " + solution(arr7).index);
        System.out.println();

        int[] arr8 = {1727, -5177, 8767, -432, 2097, 8666, -538, 5737, 7077, 2469, 4772, -2887, 956};
        System.out.println("EIGHTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr8, "%3d"));
        System.out.println("Length = " + solution(arr8).length + "; Index = " + solution(arr8).index);
        System.out.println();

        int[] arr9 = {4623, 3606, 3457, 4797, 6836, 7864, 9279};
        System.out.println("NINTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr9, "%3d"));
        System.out.println("Length = " + solution(arr9).length + "; Index = " + solution(arr9).index);
        System.out.println();

        int[] arr10 = {16, 779, 876, -280, 304, 862, -462};
        System.out.println("TENTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr10, "%3d"));
        System.out.println("Length = " + solution(arr10).length + "; Index = " + solution(arr10).index);
        System.out.println();

        int[] arr11 = {};
        System.out.println("Eleventh TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr11, "%3d"));
        System.out.println("Length = " + solution(arr11).length + "; Index = " + solution(arr11).index);
        System.out.println();

        int[] arr12 = {2};
        System.out.println("Twelve TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr12, "%3d"));
        System.out.println("Length = " + solution(arr12).length + "; Index = " + solution(arr12).index);
        System.out.println();
    }

    public static int[] consoleInputOutputArrayDemo() {
        int[] arr = ArrayUtils.readIntArrayFromConsole();

        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr, "%3d"));

        return arr;
    }

    public static Answer solution(int[] arr) {
        int index = 0;
        int help;
        int length = 0;
        int lengthMax = 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            help = i;
            while (i < arr.length - 1 && (arr[i] + arr[i + 1]) % 2 != 0) {
                i++;
                lengthMax++;
            }
            if (lengthMax >= length) {
                length = lengthMax;
                index = help;
            }
            lengthMax = 1;
            if (length >= arr.length / 2 + 1 || i > arr.length - length) {
                break;
            }
        }
        return new Answer(index, length);
    }

    public static void main(String[] args) {
        Tests();
        int arr[] = consoleInputOutputArrayDemo();
        Answer result = solution(arr);
        System.out.println("Length = " + result.length + "; Index = " + result.index);
    }
}
