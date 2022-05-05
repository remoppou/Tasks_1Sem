package com.company.Task4_var29;

import java.util.Scanner;

/**Найти сумму целых чисел от A до B таких, что в записи числа в десятичной системе счисления кол-во честных и нечетных цифр совпадает (0 — четное).
Для определения, подходит ли число под требования задачи, реализовать функцию. Также реализовать функцию для подсчета суммы таких чисел от A до B.
Запрещено использовать строки и массивы.*/

public class Task4_var29 {

    public static boolean quantity(int x){
        int Chet = 0;
        int Nechet = 0;
        if (x == 0) {
            Chet = 1;
        }
        while (x >= 1){
            if (x % 10 % 2 == 1){
                Nechet = Nechet + 1;
            } else {
                Chet = Chet + 1;
            }
            x = x / 10;
        }
        return (Chet == Nechet);
    }

    public static int searchSum(int s, int x){
        return s + x;
    }

    public static int Base (int a, int b) {
        int Sum = 0;
        for (int i = a; i <= b; i++){
            if(quantity(i)){
                Sum = searchSum(Sum, i);
            }
        }
        return Sum;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = scanner.nextInt();
        System.out.print("Enter B: ");
        b = scanner.nextInt();
        System.out.println(Base (a,b));
    }
}
