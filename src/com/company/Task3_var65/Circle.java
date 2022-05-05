package com.company.Task3_var65;

public class Circle {

    public double x0, y0, r;

    public Circle(double x0, double y0, double r) {
        this.x0=x0;
        this.y0=y0;
        this.r=r;
    }

    public boolean isPointInCircle(double x, double y){
        return r*r >=  Math.pow(x - x0, 2) + Math.pow(y - y0, 2);
    }
}
