package com.example.lesson_one_exercise_three;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AreaCalculator myarea = new AreaCalculator();
        myarea.circle(2);

        myarea.square(2);


    }
}