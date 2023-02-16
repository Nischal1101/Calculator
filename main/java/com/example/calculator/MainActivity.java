package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    boolean add, subtract, divide, multiply;
    float number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
    }

    public void onButtonClick(View view) {
        switch (view.getId()){
            case R.id.n0:
                textView.append("0");
                break;
            case R.id.n1:
                textView.append("1");
                break;
            case R.id.n2:
                textView.append("2");
                break;
            case R.id.n3:
                textView.append("3");
                break;
            case R.id.n4:
                textView.append("4");
                break;
            case R.id.n5:
                textView.append("5");
                break;
            case R.id.n6:
                textView.append("6");
                break;
            case R.id.n7:
                textView.append("7");
                break;
            case R.id.n8:
                textView.append("8");
                break;
            case R.id.n9:
                textView.append("9");
                break;
            case R.id.decimal:
                textView.append(".");
                break;
            case R.id.plus:
                if(textView==null)
                    textView.setText("");
                else {
                    number1 = Float.parseFloat(textView.getText().toString());
                    add = true;
                    textView.setText(null);
                }
                break;
            case R.id.minus:
                if(textView==null)
                    textView.setText("");
                else {
                    number1 = Float.parseFloat(textView.getText().toString());
                    subtract = true;
                    textView.setText(null);
                }
                break;
            case R.id.multiply:
                if(textView==null)
                    textView.setText("");
                else {
                    number1 = Float.parseFloat(textView.getText().toString());
                    multiply = true;
                    textView.setText(null);
                }
                break;
            case R.id.divide:
                if(textView==null)
                    textView.setText("");
                else {
                    number1 = Float.parseFloat(textView.getText().toString());
                    divide = true;
                    textView.setText(null);
                }
                break;

            case R.id.equals:
                number2=Float.parseFloat(textView.getText().toString());
                if(add){
                    number1=number1+number2;
                    textView.setText(number1+"");
                    add=false;
                }
                if(subtract){
                    number1=number1-number2;
                    textView.setText(number1+"");
                    subtract=false;
                }
                if(multiply){
                    number1=number1*number2;
                    textView.setText(number1+"");
                    multiply=false;
                }
                if(divide){
                    number1=number1/number2;
                    textView.setText(number1+"");
                    divide=false;
                }
                break;
            case R.id.c:
                textView.setText(null);
                break;
        }
    }
}