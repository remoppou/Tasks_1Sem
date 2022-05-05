package com.company.Task3_var65;

public class Parabola {

    public double x0,y0,a;

    public Parabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointRightOfParabola(double x, double y) {
        return x > a * Math.pow(y - y0, 2) + x0;
    }

    public boolean isPointLeftOfParabola(double x, double y) {
        return x < a * Math.pow(y - y0, 2) + x0;
    }
}
