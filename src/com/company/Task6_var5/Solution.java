package com.company.Task6_var5;

public class Solution {

    public static double idealExpFunc(double x) {
        return Math.asin(x);
    }

    public static double expFunc(double x, int n) {
        double sum = 0;
        double term = x;
        if (n != 0) {
            sum += x;
            for (int i = 1; i < n; i++) {
                term = term * (2 * i - 1) * (2 * i - 1) * x * x / (2 * i * (2 * i + 1));
                sum += term;
            }
        }
        return sum;
    }

    public static Result expFuncEps(double x, double eps) {
        double sum = 0;
        double term = x;
        int i = 0;
        if (Math.abs(term) > eps) {
            sum += x;
        }
        while (Math.abs(term) > eps) {
            i++;
            term = term * (2 * i - 1) * (2 * i - 1) * x * x / (2 * i * (2 * i + 1));
            sum += term;
        }
        return new Result(sum, i);
    }
}