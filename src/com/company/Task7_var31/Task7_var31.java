package com.company.Task7_var31;

//31.	(*) Вводится массив целых чисел. Найти наиболее длинную подпоследовательность подряд идущих элементов такую,
// что любые два элемента данной подпоследовательности отличаются друг от друга не более, чем на величину a
// (а – задается; реализовать функцию, которая будет возвращать позицию первого элемента такой подпоследовательности и
// кол-во элементов). В существования нескольких таких последовательностей вывести вторую по счету слева.

import com.company.util.ArrayUtils;

import java.util.Locale;
import java.util.Scanner;

public class Task7_var31 {

    public static int[] consoleInputOutputArrayDemo() {
        int[] arr = ArrayUtils.readIntArrayFromConsole();

        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr, "%3d"));
        return arr;
    }
//а = 6.   1 10 27 28 29 30 31 32 33
// a = 5.  1 3 2 5 4 6 0
// a= 6. 10 20 30 31 32 33 100 1 10 27 28 29 30 31 32 33
// a = 6. 10,  20,  30,  31,  32,  33, 100,   1,  10,  27,  28,  29,  30,  31,  32,  33,   0,  27,  28,  29,  30,  31,
//          32,  33,   0,  27,  28,  29,  30,  31,  32,  33,   0,  27,  28,  29,  30,  31,  32,  33

    public static int[] solution(int a, int[] arr) {
        int under = arr[0];
        int up = arr[0];
        int index = 0;
        int length = 1;
        int flag = 0;//счётчик для вспомогательного массива
        int lengthMax = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            lengthMax = 1;
            int min = arr[i], max = arr[i];
            up = max + a;
            under = min - a;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] <= up && arr[j] >= under && arr[i] <= up && arr[i] >= under) {
                    lengthMax++;
                    if (arr[j] < min) {
                        min = arr[j];
                        up = min + a;
                    } else if (arr[j] > max) {
                        max = arr[j];
                        under = max - a;
                    }
                } else {
                    break;
                }
            }
            if (lengthMax == length && flag != 1) {
                flag = 1;
                length = lengthMax;
                index = i;
            }
            if (lengthMax > length) {
                flag = 0;
                length = lengthMax;
                index = i;
            }
        }
        int[] answer = new int[2];
        answer[0] = length;
        answer[1] = index;
        return answer;
    }

    public static void tests() {

        int[] arr1 = {1, 10, 27, 28, 29, 30, 31, 32, 33};
        System.out.println("FIRST TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr1, "%3d"));
        int[] answer1 = solution(6, arr1);
        System.out.println("a = 6; Length = " + answer1[0] + "; Index = " + answer1[1]);
        System.out.println();

        int[] arr2 = {1, 3, 2, 5, 4, 6, 0};
        System.out.println("SECOND TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr2, "%3d"));
        int[] answer2 = solution(5, arr2);
        System.out.println("a = 5; Length = " + answer2[0] + "; Index = " + answer2[1]);
        System.out.println();

        int[] arr3 = {10, 20, 30, 31, 32, 33, 100, 1, 10, 27, 28, 29, 30, 31, 32, 33};
        System.out.println("THIRD TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr3, "%3d"));
        int[] answer3 = solution(6, arr3);
        System.out.println("a = 6; Length = " + answer3[0] + "; Index = " + answer3[1]);
        System.out.println();

        int[] arr4 = {10, 20, 30, 31, 32, 33, 100, 1, 10, 27, 28, 29, 30, 31, 32, 33, 0, 27, 28, 29, 30, 31,
                32, 33, 0, 27, 28, 29, 30, 31, 32, 33, 0, 27, 28, 29, 30, 31, 32, 33};
        System.out.println("FOURTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr4, "%3d"));
        int[] answer4 = solution(6, arr4);
        System.out.println("a = 6; Length = " + answer4[0] + "; Index = " + answer4[1]);
        System.out.println();

        int[] arr5 = {1, 1, 2, 1, 1};
        System.out.println("FIFTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr5, "%3d"));
        int[] answer5 = solution(1, arr5);
        System.out.println("a = 1; Length = " + answer5[0] + "; Index = " + answer5[1]);
        System.out.println();

        int[] arr6 = {1, 2, 3, 4, 5, 6};
        System.out.println("SIXTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr6, "%3d"));
        int[] answer6 = solution(1, arr6);
        System.out.println("a = 1; Length = " + answer6[0] + "; Index = " + answer6[1]);
        System.out.println();

        int[] arr7 = {1, 5, 10, 15, 18};
        System.out.println("SEVENTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr7, "%3d"));
        int[] answer7 = solution(1, arr7);
        System.out.println("a = 1; Length = " + answer7[0] + "; Index = " + answer7[1]);
        System.out.println();

        int[] arr8 = {1727, -5177, 8767, -432, 2097, 8666, -538, 5737, 7077, 2469, 4772, -2887, 956};
        System.out.println("EIGHTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr8, "%3d"));
        int[] answer8 = solution(0, arr8);
        System.out.println("a = 0; Length = " + answer8[0] + "; Index = " + answer8[1]);
        System.out.println();

        int[] arr9 = {4623, 3606, 3457, 4797, 6836, 7864, 9279};
        System.out.println("NINTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr9, "%3d"));
        int[] answer9 = solution(1000, arr9);
        System.out.println("a = 1000; Length = " + answer9[0] + "; Index = " + answer9[1]);
        System.out.println();

        int[] arr10 = {16, 779, 876, -280, 304, 862, -462};
        System.out.println("TENTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr10, "%3d"));
        int[] answer10 = solution(500, arr10);
        System.out.println("a = 500; Length = " + answer10[0] + "; Index = " + answer10[1]);
        System.out.println();
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = consoleInputOutputArrayDemo();
        int[] answer = solution(a, arr);

        System.out.println("Длина последовательности = " + answer[0] + "; индекс = " + answer[1]);
        tests();
    }
}
