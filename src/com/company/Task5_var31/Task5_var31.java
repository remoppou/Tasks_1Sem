package com.company.Task5_var31;

import java.util.Scanner;

public class Task5_var31 {

    public static void FirstLine (int s) {
        for (int w = 1; w <= s / 2 + 1; w++) {
            System.out.print("#");
        }
        for (int w = s / 2 + 1; w < s; w++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void CenterLine (int s) {
        System.out.print("#");
        for (int w = 1; w <= s - 2; w++){
            System.out.print(" ");
        }
        System.out.println("#");
    }

    public static void LastLine (int s) {
        for (int w = 1; w <= s / 2; w++) {
            System.out.print("*");
        }
        for (int w = s / 2; w < s; w++) {
            System.out.print("#");
        }
        System.out.println();
    }

    public static void printPicture (int s) {
        FirstLine(s);
        int center = s / 2 + 1;
        for (int i = 1; i <= center - 2; i++) {
            for (int w = 1; w <= s; w++){
                if (w <= center - i) {
                    System.out.print("#");
                    continue;
                }
                if (w >= center + i) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        CenterLine(s);
        for (int i = center - 2; i >= 1; i--) {
            for (int w = 1; w <= s; w++){
                if (w <= center - i) {
                    System.out.print("*");
                    continue;
                }
                if (w >= center + i) {
                    System.out.print("#");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
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
