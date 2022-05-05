package com.company.Task1_var17;

import java.util.Scanner;

/**
 * Даны различных целых 3 числа. Выбрать из этих чисел среднее по значению
 * (например, для чисел 8, 5, 100 правильным ответом будет 8). Числа вводятся в произвольном порядке.
 * Использовать методы Math.Min(...) и Math.Max(...), условный оператор использовать нельзя, только присваивания.
 */

public class Task1_Var17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first, second, third, first_check, second_check, answer;
        System.out.print("Enter the first number: ");
        first = scan.nextInt();
        System.out.print("Enter the second number: ");
        second = scan.nextInt();
        System.out.print("Enter the third number: ");
        third = scan.nextInt();
        first_check = Math.max(Math.max(first, second), third);
        second_check = Math.min(Math.min(first, second), third);
        answer = first + second + third - first_check - second_check;
        System.out.println("Число, среднее по значению: " + answer);
    }
}
