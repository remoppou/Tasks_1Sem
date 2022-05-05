package com.company.Task6_var5;

import java.util.Locale;
import java.util.Scanner;

public class Task6_var5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter e: ");
        double e = sc.nextDouble();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double ideal = Solution.idealExpFunc(x);

        double resultN = Solution.expFunc(x, n);
        double deltaN = Math.abs(ideal - resultN);

        Result rE = Solution.expFuncEps(x, e);
        double deltaE = Math.abs(rE.getSum() - ideal);

        Result rE10 = Solution.expFuncEps(x, e * 0.1);
        double deltaE10 = Math.abs(rE10.getCount() - ideal);

        System.out.printf("Ideal result: arcsin(x) = %.15f\n", ideal);
        System.out.printf("Task  result: arcsin(x) = %.15f; delta = %e\n", resultN, deltaN);
        System.out.printf("ExpFunc with Eps  = %.15f; delta = %e; count = %d\n", rE.getSum(), deltaE, rE.getCount());
        System.out.printf("ExpFunc with Eps10= %.15f; delta = %e; count = %d\n", rE10.getSum(), deltaE10, rE10.getCount());
    }
}
