package com.company.Task5_var28;

import java.util.Scanner;

public class Task5_var28 {

    public static void FirstLine (int s) {
        for (int w = 1; w <= s; w++) {
            if (w > s / 2) {
                System.out.print("*");
            } else System.out.print(" ");
        }
        System.out.println();
    }

    public static void LastLine (int s) {
        for (int w = 1; w <= s / 2; w++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printPicture (int s) {
        FirstLine(s);
        for (int i = 1; i <= s - 2; i++) {
            if (i <= (s - 2) / 2) {
                for (int w = 1; w <= s-i; w++) {
                    if (w <= s / 2) {
                        System.out.print(" ");
                        continue;
                    }
                    if (w <= s - i - 1 && w > s / 2 + 1) {
                        System.out.print("#");
                        continue;
                    } else System.out.print("*");
                }
                System.out.println();
            }
            if (i > (s - 2) / 2) {
                for (int w = 1; w < s / 2; w++) {
                    if (w < s - i) {
                        System.out.print(" ");
                    } else if (w == s - i) {
                        System.out.print("*");
                    } else System.out.print("#");
                }
                System.out.println("*");
            }
        }
        LastLine(s);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ширину и высоту: ");
        int s = scan.nextInt();
        printPicture(s);
    }
}
