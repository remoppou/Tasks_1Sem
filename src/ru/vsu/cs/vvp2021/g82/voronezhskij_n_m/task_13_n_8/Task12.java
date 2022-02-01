package ru.vsu.cs.vvp2021.g82.voronezhskij_n_m.task_13_n_8;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    private static void process(List<Integer> elements, int k, Consumer callback, List<Integer> constList, int index) {
        for (int i = index; i < constList.size(); i++) {
            elements.add(constList.get(i));
            if (elements.size() < k) {
                index++;
                process(elements, k,  callback, constList, index);
            }
            else {
                callback.accept(elements);
            }
//            elements.remove(elements.size()- 1);
        }
    }

    public static void genAll(List<Integer> constList, int k, Consumer callback) throws Exception {
        for (int i = 0; i < constList.size(); i++) {
            for (int j = i + 1; j < constList.size(); j++) {
                if (constList.get(i).equals(constList.get(j))) {
                    throw new Exception("\"Ошибка: в листе присутствуют повторяющиеся элементы.\"");
                }
            }
        }
        process(new ArrayList<>(), k, callback, constList, 0);
    }

    public interface Consumer {
        void accept(List<Integer> list);
    }
}
