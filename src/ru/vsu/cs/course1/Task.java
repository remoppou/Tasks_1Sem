package ru.vsu.cs.course1;


public class Task {

    public static boolean conditionold (int[][] arr){
        int rowCount = arr.length;
        int colCount = arr[rowCount-1].length;

        for (int c = 0; c < colCount; c++) {
            if (c % 2 == 0) { //
                for (int r = rowCount - 1; r > 0; r--) {
                    if (arr[r][c] >= arr[r - 1][c]) {
                        return false;
                    }
                }
            } else {
                for (int r = 0; r < rowCount - 1; r++) {
                    if (arr[r][c] >= arr[r + 1][c]) {
                        return false;
                    }
                }
            }
            if (c + 1 < colCount && arr[0][c] >= arr[0][c + 1] && arr[rowCount - 1][c] >= arr[rowCount-1][c+1]) {  ///
                return false;
            }
        }
        return true;
    }

    public static boolean conditionnewold (int[][] arr){
        int rowCount = arr.length;
        int colCount = arr[rowCount-1].length;
        char col;
        if (arr[rowCount - 1][0] > arr[rowCount - 2][0]) {
            col = '-';
        } else if (arr[rowCount - 1][0] < arr[rowCount - 2][0]) {
            col = '+';
        } else return false;
        if (col == '+') {
            for (int c = 0; c < colCount; c++) {
                if (c % 2 == 0) {
                    for (int r = rowCount - 1; r > 0; r--) {
                        if (arr[r][c] >= arr[r - 1][c]) {
                            return false;                   //
                        }
                    }
                } else {
                    for (int r = 0; r < rowCount - 1; r++) {
                        if (arr[0][c] <= arr[0][c - 1] || arr[r][c] >= arr[r + 1][c]) {
                            return false;
                        }
                    }
                }
            }
        } else {
            for (int c = 0; c < colCount; c++) {
                if (c % 2 == 0) {
                    for (int r = rowCount - 1; r > 0; r--) {
                        if (arr[r][c] <= arr[r - 1][c]) {
                            return false;
                        }
                    }
                } else {
                    for (int r = 0; r < rowCount - 1; r++) {
                        if (arr[0][c] >= arr[0][c - 1] || arr[r][c] <= arr[r + 1][c]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean conditionneochnormal (int[][] arr) {
        int rowCount = arr.length;
        int colCount = arr[rowCount - 1].length;
        char col = '=';
        for (int c = 0; c < colCount; c++) {
            for (int r = rowCount - 1; r > 0; r--) {
                if (col == '=') {
                    if (arr[r][c] > arr[r - 1][c]) {
                        col = '-';
                    } else if (arr[r][c] < arr[r - 1][c]) {
                        col = '+';
                    }
                }
//                if (col == '=' && arr[r][c] > arr[r - 1][c]) {
//                    if (flag < 1) {
//                        col = '-';
//                        flag++;
//                    }
//                    continue;
//                } else if (col == '=' && arr[r][c] < arr[r - 1][c]) {
//                    if (flag < 1) {
//                        col = '+';
//                        flag++;
//                    }
//                    continue;
//                } else if (col == '=' && arr[r][c] == arr[r - 1][c]) {
//                    continue;
//                }
                if (col == '-' && arr[r][c] < arr[r - 1][c]) {
                    return false;
                }
                if (col == '+' && arr[r][c] > arr[r - 1][c]) {
                    return false;
                }
            }
            c++;
            for (int r = 1; r < rowCount - 1; r--) {
                if (col == '=') {
                    if (arr[r][c] > arr[r - 1][c] && arr[0][c] < arr[0][c - 1]) {
                        col = '-';
                        continue;
                    } else if (arr[r][c] < arr[r - 1][c] && arr[0][c] > arr[0][c - 1]) {
                        col = '+';
                        continue;
                    }
                    continue;
                }
//                if (col == '=' && arr[r][c] > arr[r - 1][c]) {
//                    if (flag < 1) {
//                        col = '-';
//                        flag++;
//                    }
//                    continue;
//                } else if (col == '=' && arr[r][c] < arr[r - 1][c]) {
//                    if (flag < 1) {
//                        col = '+';
//                        flag++;
//                    }
//                    continue;
//                } else if (col == '=' && arr[r][c] == arr[r - 1][c]) {
//                    continue;
//                }
                if (col == '-') {
                    if (arr[0][c] > arr[0][c - 1]) {
                        return false;
                    } else if (arr[r][c] > arr[r + 1][c]) {
                        return false;
                    } else continue;
                }

                if (col == '+') {
                    if (arr[0][c] < arr[0][c - 1]) {
                        return false;
                    } else if (arr[r][c] > arr[r + 1][c]) {
                        return false;
                    }
                }

//                if (r == rowCount - 2 && c != colCount - 1) {
//                    if (col == '=') {
//                        if (arr[r + 1][c] < arr[r + 1][c + 1]) {
//                            col = '+';
//                        } else if (arr[r + 1][c] > arr[r + 1][c + 1]) {
//                            col = '-';
//                        }
//                    }
//                    if (col == '-') {
//                        if (arr[r + 1][c] < arr[r + 1][c + 1]) {
//                            return false;
//                        }
//                    }
//                    if (col == '+') {
//                        if (arr[r + 1][c] > arr[r + 1][c + 1]) {
//                            return false;
//                        }
//                    }
//                }
            }
        }
        return true;
    }


    public static boolean condition(int[][] arr) {
        int rowCount = arr.length;
        int colCount = arr[rowCount - 1].length;
        char col = '=';
//        if (col == '+') {
//            for (int c = 0; c < colCount; c++) {
//                if (c % 2 == 0) {
//                    for (int r = rowCount - 1; r > 0; r--) {
//                        if (arr[r][c] >= arr[r - 1][c]) {
//                            return false;                   //
//                        }
//                    }
//                } else {
//                    for (int r = 0; r < rowCount - 1; r++) {
//                        if (arr[0][c] <= arr[0][c - 1] || arr[r][c] >= arr[r + 1][c]) {
//                            return false;
//                        }
//                    }
//                }
//            }
//        } else {
//            for (int c = 0; c < colCount; c++) {
//                if (c % 2 == 0) {
//                    for (int r = rowCount - 1; r > 0; r--) {
//                        if (arr[r][c] <= arr[r - 1][c]) {
//                            return false;
//                        }
//                    }
//                } else {
//                    for (int r = 0; r < rowCount - 1; r++) {
//                        if (arr[0][c] >= arr[0][c - 1] || arr[r][c] <= arr[r + 1][c]) {
//                            return false;
//                        }
//                    }
//                }
//            }
//        }
        for (int c = 0; c < colCount; c++) {
            if (c % 2 == 0) {
                for (int r = rowCount - 1; r > 0; r--) {
                    if (r == rowCount - 1 && c != 0) {
                        if (col == '=') {
                            if (arr[r][c] > arr [r][c - 1]) {
                                col = '+';
                            } else {
                                col = '-';
                            }
                        }
                        if (col == '-') {
                            if (arr[r][c] > arr[r][c - 1]) {
                                return false;
                            }
                        }
                        if (col == '+') {
                            if (arr[r][c] < arr[r][c - 1]) {
                                return false;
                            }
                        }
                    }
                    if (col == '=') {
                        if (arr[r][c] > arr[r - 1][c]) {
                            col = '-';
                        } else if (arr[r][c] < arr[r - 1][c]) {
                            col = '+';
                        } else continue;
                    }
                    if (col == '-') {
                        if (arr[r][c] < arr[r - 1][c]) {
                            return false;
                        }
                        continue;
                    }
                    if (col == '+') {
                        if (arr[r][c] > arr[r - 1][c]) {
                            return false;
                        }
                        continue;
                    }
                }
            } else {
                for (int r = 0; r < rowCount - 1; r++) {
                    if (r == 0) {
                        if (col == '=') {
                            if (arr[r][c] > arr[r][c - 1]) {
                                col = '+';
                            }
                            if (arr[r][c] < arr[r][c - 1]) {
                                col = '-';
                            }
                        }
                        if (col == '-') {
                            if (arr[r][c] > arr[r][c - 1]) {
                                return false;
                            }
                        }
                        if (col == '+') {
                            if (arr[r][c] < arr[r][c - 1]) {
                                return false;
                            }
                        }
                    }
                    if (col == '=') {
                        if (arr[r][c] > arr[r + 1][c]) {
                            col = '-';
                        } else if (arr[r][c] < arr[r + 1][c]) {
                            col = '+';
                        } else continue;
                    }
                    if (col == '-') {
                        if (arr[r][c] < arr[r + 1][c]) {
                            return false;
                        }
                        continue;
                    }
                    if (col == '+') {
                        if (arr[r][c] > arr[r + 1][c]) {
                            return false;
                        }
                        continue;
                    }
                }
            }
        }
        return true;
    }


    public static void Process(int[][] arr2) {
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
