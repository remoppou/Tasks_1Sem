package ru.vsu.cs.course1;


public class Task {

    public static int[][] process(int[][] arr) {
        int[][] ans = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                ans[i][j] = 1;
                int count = 1;
                int row1 = 0;
                for (int k = j - i; k < arr[0].length; k++) {
                    if (k >= 0 && row1 < arr.length && row1 != i && k != j) {
                        if (arr[i][j] == arr[row1][k]) {
                            count++;
                            ans[i][j] = count;
                        }
                    }
                    row1++;
                }
                int row2 = 0;
                for (int k = j + i; k >= 0; k--) {
                    if (k < arr[0].length && row2 < arr.length && row2 != i && k != j) {
                        if (arr[i][j] == arr[row2][k]) {
                            count++;
                            ans[i][j] = count;
                        }
                    }
                    row2++;
                }
            }
        }
        return ans;
    }

    public static void Process1(int[][] arr2) {
        for (int r = 0; r < arr2.length; r++) {
            for (int c = 0; c < arr2[r].length; c++) {
                arr2[r][c]++;
            }
        }
    }

    public static int[][] Process2(int[][] arr2) {
        int[][] res = new int[2][2];
        for (int r = 0; r < Math.min(arr2.length, 2); r++) {
            for (int c = 0; c < Math.min(arr2[0].length, 2); c++) {
                res[r][c] = arr2[r][c];
            }
        }
        return res;
    }


    public static void reverseRows(int[][] arr2) {
        for (int r = 0; r < arr2.length / 2; r++) {
            int[] temp = arr2[r];
            arr2[r] = arr2[arr2.length - r - 1];
            arr2[arr2.length - r - 1] = temp;
        }
    }

    public static void reverseColumns(int[][] arr2) {
        int colsCount = arr2[0].length;
        for (int c = 0; c < colsCount / 2; c++) {
            swapColumns(arr2,  c, colsCount - c - 1);
        }
    }

    public static void swapColumns(int[][] arr2, int c1, int c2) {
        for (int[] row : arr2) {
            int temp = row[c1];
            row[c1] = row[c2];
            row[c2] = temp;
        }
    }
}
