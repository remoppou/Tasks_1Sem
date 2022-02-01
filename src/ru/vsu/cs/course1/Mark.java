package ru.vsu.cs.course1;

public class Mark {
    public String name;
    public int russian;
    public int math;
    public int phisics;
    public int sum;

    public Mark(String name, int russian, int math, int phisics) {
        this.name = name;
        this.russian = russian;
        this.math = math;
        this.phisics = phisics;
    }

    public String getDistrict() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRussian() {
        return russian;
    }

    public void setRussian(int russian) {
        this.russian = russian;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhisics() {
        return phisics;
    }

    public void setPhisics(int phisics) {
        this.phisics = phisics;
    }

    public int getSum() {
        return sum = getRussian() + getMath() + getPhisics();
    }

    public void setSum() {
        sum = getRussian() + getMath() + getPhisics();
    }

}
