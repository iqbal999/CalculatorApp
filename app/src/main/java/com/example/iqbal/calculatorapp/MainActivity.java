package com.example.iqbal.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber, secondNumber;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = findViewById(R.id.num1);
        secondNumber = findViewById(R.id.num2);
        result = findViewById(R.id.showResult);

    }

    public void add(View view) {


        float x = Float.parseFloat(firstNumber.getText().toString());
        float y = Float.parseFloat(secondNumber.getText().toString());
        float result1 = x + y;
        result.setText(""+result1);

    }

    public void sub(View view) {
        float x = Float.parseFloat(firstNumber.getText().toString());
        float y = Float.parseFloat(secondNumber.getText().toString());
        float result1 = x - y;
        result.setText(""+result1);
    }

    public void mul(View view) {
        float x = Float.parseFloat(firstNumber.getText().toString());
        float y = Float.parseFloat(secondNumber.getText().toString());
        float result1 = x * y;
        result.setText(""+result1);
    }

    public void div(View view) {
        float x = Float.parseFloat(firstNumber.getText().toString());
        float y = Float.parseFloat(secondNumber.getText().toString());
        float result1 = x / y;
        result.setText(""+result1);
    }
}
