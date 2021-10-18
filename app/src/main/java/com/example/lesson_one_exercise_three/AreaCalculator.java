package com.example.lesson_one_exercise_three;


import android.util.Log;

public class AreaCalculator {
    public int area;
    public int height;
    public int width;
    public int base;

    /*AreaCalculator(int area, int height, int base, int width) {
        this.area = area;
        this.base = base;
        this.width = width;
        this.height = height;
    }*/

    public double circle(int radius) {
        return Log.d("myLog","Area of circle is: " + Math.PI * (radius * radius));
    }


}
