package ru.vsu.cs.course1;
import java.util.*;

public class Task {

//    23. При поступлении на некоторую специальность подали заявление множество
//      абитуриентов (абитуриент описывается следующим образом: ФИО, оценка по русскому
//      языку, оценка по математике, оценка по физике). На соответствующей специальности N
//      бюджетных мест, отберите тех студентов, которые поступят. Приоритет имеют студенты
//      с максимальной суммой баллов, затем с большим баллом по математике, затем по
//      физике.

    public static ArrayList<Mark> chooseStudents(List<Mark> students, int n) {
        ArrayList<Mark> answer = new ArrayList<>();
        students.sort(Comparator.comparing(Mark::getSum).thenComparing(Mark::getMath).thenComparing(Mark::getPhisics).reversed());
        for (int i = 0; i < n && i < students.size(); i++) {
            answer.add(students.get(i));
        }
        return answer;
    }


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

}
