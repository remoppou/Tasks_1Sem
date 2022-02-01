package ru.vsu.cs.course1;


import java.util.ArrayList;
import java.util.List;

public class Task {
    public static ArrayList<Integer> arrToList(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int cur : arr){
            list.add(cur);
        }
        return list;
    }

    public static int[] listToArr(ArrayList<Integer> list){
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int findMin(List<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static int findD(List<Integer> list, int max, int min) {
        int d = (max - min) / (list.size() - 1);
        return d;
    }

    public static int check(List<Integer> list, int min, int d) {
        int flag = 0;
        for (int n = 0; n < list.size(); n++) {
            int i = 0;
            while (i < list.size()) {
                if (list.get(i) != min + d * n) {
                    i++;
                } else {
                    flag++;
                    break;
                }
            }
        }
        return flag;
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> list, int max, int d, int size) {
        list.removeAll(list);
        for (int n = size - 1; n > -1; n--) {
            list.add(max - n * d);
        }
        return list;
    }

    public static void process(ArrayList<Integer> list) {
        int max = findMax(list);
        int min = findMin(list);
        int d = findD(list,max,min);
        if (check(list, min, d) == list.size()) {
            sort(list, max, d, list.size());
        }
    }
}