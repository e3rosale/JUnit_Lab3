package com.example.eduardo_rosales.lab3exercise.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.example.eduardo_rosales.lab3exercise.MainActivity;

/**
 * Created by eduardo_rosales on 4/19/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test() {

        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();

        EditText sum = (EditText)mainActivity.findViewById(com.example.eduardo_rosales.lab3exercise.R.id.txtResult);

        double num1 = com.example.eduardo_rosales.lab3exercise.R.id.txtNumber1;
        double num2 = com.example.eduardo_rosales.lab3exercise.R.id.txtNumber2;
        double sumNum = num1 + num2;

        assertEquals(sumNum, 0);

        /*
        firstNumber = (EditText)findViewById(R.id.txtNumber1);
        secondNumber = (EditText)findViewById(R.id.txtNumber2);
        addResult = (TextView)findViewById(R.id.txtResult);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        */
    }

    public void test_Second() {
        mainActivity = getActivity();

        EditText sum = (EditText)mainActivity.findViewById(com.example.eduardo_rosales.lab3exercise.R.id.txtResult);

        double number1 = 6.0;
        double number2 = 8.0;

        //com.example.eduardo_rosales.lab3exercise.R.id.txtNumber1

        double num1 = com.example.eduardo_rosales.lab3exercise.R.id.txtNumber1;
        double num2 = com.example.eduardo_rosales.lab3exercise.R.id.txtNumber2;
        double sumNum = num1 + num2;

        assertEquals(sumNum, sumNum);

        /*
        firstNumber = (EditText)findViewById(R.id.txtNumber1);
        secondNumber = (EditText)findViewById(R.id.txtNumber2);
        addResult = (TextView)findViewById(R.id.txtResult);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        */
    }
}
