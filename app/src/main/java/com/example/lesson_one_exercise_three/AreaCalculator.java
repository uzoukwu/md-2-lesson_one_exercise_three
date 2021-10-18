package com.example.lesson_one_exercise_three;


import android.util.Log;

public class AreaCalculator {

    public double circle(int radius) {
        return Log.d("myLog","Area of circle is: " + Math.PI * (radius * radius));
    }

    public double square(int area) {
        return Log.d("myLog","Area of square is: " + area * area);
    }

    public double rectangle(int width, int height){
        return Log.d("myLog","Area of rectangle is: " + width * height);
    }


}
