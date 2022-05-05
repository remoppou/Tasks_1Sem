package com.company.Task3_var65;

import java.util.Scanner;

public class Task3_var65 {

    public static final Circle CIRCLE = new Circle(-3, -3, 4);

    public static final Parabola P1 = new Parabola(2, 3, -1);

    public static final Parabola P2 = new Parabola(-3, -3, -0.25);

    public static final Parabola P3 = new Parabola(-6, -6, 1);

    public static SimpleColor getColor(double x, double y) {
        if (CIRCLE.isPointInCircle(x, y) && P1.isPointLeftOfParabola(x, y)) {
            return SimpleColor.WHITE;
        }
        if (!CIRCLE.isPointInCircle(x, y) && !P1.isPointLeftOfParabola(x, y) && !P2.isPointLeftOfParabola(x, y) && x < -3 && 1 > y && y > 0) {
            return SimpleColor.WHITE;
        }
        if ((P1.isPointLeftOfParabola(x, y) && P2.isPointLeftOfParabola(x, y)) ||
                (P2.isPointLeftOfParabola(x, y) && P3.isPointRightOfParabola(x, y)) ||
                (P2.isPointRightOfParabola(x, y) && P3.isPointLeftOfParabola(x, y) && y < -6)) {
            return SimpleColor.YELLOW;
        }
        if (CIRCLE.isPointInCircle(x, y)) {
            return SimpleColor.GRAY;
        }
        if (P1.isPointLeftOfParabola(x, y) || P2.isPointLeftOfParabola(x, y)) {
            return SimpleColor.BLUE;
        }
        if (P3.isPointRightOfParabola(x, y)) {
            return SimpleColor.GREEN;
        }
        return SimpleColor.ORANGE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.println("(" + x + "; " + y + ") -> " + getColor(x, y));
    }

    public static void main(String[] args) {
        printColorForPoint(-9.0, -9.0);
        printColorForPoint(5.0, 5.0);
        printColorForPoint(-5.0, 3.0);
        printColorForPoint(-9.0, 0.0);
        printColorForPoint(-1.0, 1.0);
        printColorForPoint(-2.0, -3.0);
        printColorForPoint(-8.0, -4.0);
        printColorForPoint(3.0, -5.0);
        printColorForPoint(-8.0, 9.0);
        printColorForPoint(-5.0, -5.4);
        printColorForPoint(-5.4, 0.2);
        printColorForPoint(-3, 0.95);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter X: ");
        double x = scan.nextDouble();
        System.out.print("Enter Y: ");
        double y = scan.nextDouble();

        printColorForPoint(x, y);
    }
}
