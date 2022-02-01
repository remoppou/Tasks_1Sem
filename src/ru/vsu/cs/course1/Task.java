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

    public static List<Integer> process(List<Integer> list) {
//        int index = 0;
//        for (int i = 0; i < list.size() - 2; i++) {
//            int min = Integer.MAX_VALUE;
//            if (list.get(i) > 0) {
//                for (int j = i + 1; j < list.size(); j++) {
//                    if (list.get(j) > 0 && list.get(j) < min) {
//                        min = list.get(j);
//                        index = j;
//                    }
//                }
//                if (list.get(i) > min) {
//                    int value = list.get(i);
//                    list.set(i, min);
//                    list.set(index, value);
//                }
//            }
//        }
        List<Integer> ready = new ArrayList<>();
        int sum = 0;
        boolean first = true;
        for (int value : list) {
            if (first) {
                first = false;
            } else {
                sum += value;
                ready.add(sum);
            }
            sum = value;
        }
        return ready;
    }
}