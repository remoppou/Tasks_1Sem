package com.company.Task7_var19;

import com.company.util.ArrayUtils;

import java.util.Scanner;

public class Task7_num19 {

    public static void tests() {
        int[] arr1 = {1, 10, 27, 28, 29, 30, 31, 32, 33};
        System.out.println("FIRST TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr1, "%3d"));
        Answer answer1 = solution(arr1, 0, Long(arr1) - 1 , Long(arr1), arr1.length, 0, Long(arr1) - 1, Long(arr1), arr1.length);
        System.out.println("nums >= Max : " + answer1.ch1 + "; nums >= min : " + answer1.ch2);
        System.out.println();

        int[] arr2 = {1, 3, 2, 5, 4, 6, 0};
        System.out.println("SECOND TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr2, "%3d"));
        Answer answer2 = solution(arr2, 0, Long(arr2) - 1 , Long(arr2), arr2.length, 0, Long(arr2) - 1, Long(arr2), arr2.length);
        System.out.println("nums >= Max : " + answer2.ch1 + "; nums >= min : " + answer2.ch2);
        System.out.println();

        int[] arr3 = {10, 20, 30, 31, 32, 33, 100, 1, 10, 27, 28, 29, 30, 31, 32, 33};
        System.out.println("THIRD TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr3, "%3d"));
        Answer answer3 = solution(arr3, 0, Long(arr3) - 1 , Long(arr3), arr3.length, 0, Long(arr3) - 1, Long(arr3), arr3.length);
        System.out.println("nums >= Max : " + answer3.ch1 + "; nums >= min : " + answer3.ch2);
        System.out.println();

        int[] arr4 = {10, 20, 30, 31, 32, 33, 100, 1, 10, 27, 28, 29, 30, 31, 32, 33, 0, 27, 28, 29, 30, 31,
                32, 33, 0, 27, 28, 29, 30, 31, 32, 33, 0, 27, 28, 29, 30, 31, 32, 33};
        System.out.println("FOURTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr4, "%3d"));
        Answer answer4 = solution(arr4, 0, Long(arr4) - 1 , Long(arr4), arr4.length, 0, Long(arr4) - 1, Long(arr4), arr4.length);
        System.out.println("nums >= Max : " + answer4.ch1 + "; nums >= min : " + answer4.ch2);
        System.out.println();

        int[] arr5 = {1, 1, 2, 1, 1};
        System.out.println("FIFTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr5, "%3d"));
        Answer answer5 = solution(arr5, 0, Long(arr5) - 1 , Long(arr5), arr5.length, 0, Long(arr5) - 1, Long(arr5), arr5.length);
        System.out.println("nums >= Max : " + answer5.ch1 + "; nums >= min : " + answer5.ch2);
        System.out.println();

        int[] arr6 = {1, 2, 3, 4, 5, 6};
        System.out.println("SIXTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr6, "%3d"));
        Answer answer6 = solution(arr6, 0, Long(arr6) - 1 , Long(arr6), arr6.length, 0, Long(arr6) - 1, Long(arr6), arr6.length);
        System.out.println("nums >= Max : " + answer6.ch1 + "; nums >= min : " + answer6.ch2);
        System.out.println();

        int[] arr7 = {1, 5, 10, 15, 18};
        System.out.println("SEVENTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr7, "%3d"));
        Answer answer7 = solution(arr7, 0, Long(arr7) - 1 , Long(arr7), arr7.length, 0, Long(arr7) - 1, Long(arr7), arr7.length);
        System.out.println("nums >= Max : " + answer7.ch1 + "; nums >= min : " + answer7.ch2);
        System.out.println();

        int[] arr8 = {1727, -5177, 8767, -432, 2097, 8666, -538, 5737, 7077, 2469, 4772, -2887, 956};
        System.out.println("EIGHTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr8, "%3d"));
        Answer answer8 = solution(arr8, 0, Long(arr8) - 1 , Long(arr8), arr8.length, 0, Long(arr8) - 1, Long(arr8), arr8.length);
        System.out.println("nums >= Max : " + answer8.ch1 + "; nums >= min : " + answer8.ch2);
        System.out.println();

        int[] arr9 = {4623, 3606, 3457, 4797, 6836, 7864, 9279};
        System.out.println("NINTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr9, "%3d"));
        Answer answer9 = solution(arr9, 0, Long(arr9) - 1 , Long(arr9), arr9.length, 0, Long(arr9) - 1, Long(arr9), arr9.length);
        System.out.println("nums >= Max : " + answer9.ch1 + "; nums >= min : " + answer9.ch2);
        System.out.println();

        int[] arr10 = {16, 779, 876, -280, 304, 862, -462};
        System.out.println("TENTH TEST");
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr10, "%3d"));
        Answer answer10 = solution(arr10, 0, Long(arr10) - 1 , Long(arr10), arr10.length, 0, Long(arr10) - 1, Long(arr10), arr10.length);
        System.out.println("nums >= Max : " + answer10.ch1 + "; nums >= min : " + answer10.ch2);
        System.out.println();
    }

    public static int Long (int[] arr) {
        int Leftlength = 0;
        if(arr.length % 2 != 0){
            Leftlength = arr.length / 2 + 1;
        }else {
            Leftlength = arr.length / 2;
        }
        return Leftlength;
    }

    public static int max(int [] arr, int startFindMax, int endFindMax) {
        int max = arr[startFindMax];
        for (int i = startFindMax; i <= endFindMax; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int [] arr, int startFindMin, int endFindMin) {
        int min = arr[startFindMin];
        for (int i = startFindMin; i <= endFindMin; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int bigger (int[] arr, int startIndex, int endIndex, int min) {
        int ch = 0;
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] >= min) {
                ch++;
            }
        }
        return ch;
    }

    public static Answer solution(int[] arr, int startFindMin, int endFindMin, int startCalkMin, int endCalkMin, int startFindMax, int endFindMax, int startCalkMax, int endCalkMax) {
        int min = min(arr, startFindMin, endFindMin);
        int max = max(arr, startFindMax, endFindMax);
        int ch2 = bigger(arr, startCalkMin, endCalkMin, min);
        int ch1 = bigger(arr, startCalkMax, endCalkMax, max);
        return new Answer(ch1,ch2);
    }

    public static int[] calculate () {
        int[] arr = ArrayUtils.readIntArrayFromConsole();
        System.out.printf("Массив:%n%s%n", ArrayUtils.toString(arr, "%3d"));
        return  arr;
    }

    public static void main(String[] args) {
        int arr[] = calculate();
        int average = Long(arr) - 1;
        System.out.println("Index of the central element: " + average);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter indexes start and end for find min: ");
        int startFindMin = scanner.nextInt();
        int endFindMin = scanner.nextInt();
        System.out.print("Enter indexes start and end for find max: ");
        int startFindMax = scanner.nextInt();
        int endFindMax = scanner.nextInt();
        System.out.print("Enter indexes start and end for calk more min: ");
        int startCalkMin = scanner.nextInt();
        int endCalkMin = scanner.nextInt();
        System.out.print("Enter indexes start and end for calk more max: ");
        int startCalkMax = scanner.nextInt();
        int endCalkMax = scanner.nextInt();
        System.out.println();
        Answer result = solution(arr, startFindMin, endFindMin, startCalkMin, endCalkMin, startFindMax, endFindMax, startCalkMax, endCalkMax);
        System.out.println("nums >= Max : " + result.ch1 + "; nums >= min : " + result.ch2);
        tests();
    }
}
