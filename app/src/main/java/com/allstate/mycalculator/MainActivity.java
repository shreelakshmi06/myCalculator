package com.allstate.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    EditText result , equation;
    Button one, two, three, four, five, six, seven, eight, nine, zero;
    Button add, sub, mul, div;
    Button dot;
    Button square, sqrt, percent, mod;
    Button clear, equal;
    float valueOne, valueTwo;
    boolean isAdd, isSub, isMul, isDiv, isPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the elements

        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        zero = (Button) findViewById(R.id.button0);
        dot = (Button) findViewById(R.id.buttonPoint);
        add = (Button) findViewById(R.id.buttonAdd);
        sub = (Button) findViewById(R.id.buttonSub);
        mul = (Button) findViewById(R.id.buttonMul);
        div = (Button) findViewById(R.id.buttonDiv);
        square = (Button) findViewById(R.id.buttonSquare);
        sqrt = (Button) findViewById(R.id.buttonSuareRoot);
        percent = (Button) findViewById(R.id.buttonPercentage);
        clear = (Button) findViewById(R.id.buttonClear);
        equal = (Button) findViewById(R.id.buttonEqual);
        result = (EditText) findViewById(R.id.etRes);
        equation = (EditText) findViewById(R.id.etEquation);

        //set on click listener for every button

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + ".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result == null) {
                    result.setText("");
                } else {
                    valueOne = Float.parseFloat(result.getText().toString());
                    isAdd = true;
                    equation.setText(result.getText()+"+");
                    result.setText(null);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(result.getText() + "");
                isSub = true;
                equation.setText(result.getText()+"-");
                result.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(result.getText() + "");
                isMul = true;
                equation.setText(result.getText()+"*");
                result.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(result.getText() + "");
                isDiv = true;
                equation.setText(result.getText()+"/");
                result.setText(null);
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(result.getText()+"");
                isPercent = true;
                equation.setText(result.getText()+"% of ");
                result.setText(null);
            }
        });

        square.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                valueOne = Float.parseFloat(result.getText()+"");
                result.setText(valueOne*valueOne+"");
                equation.setText(valueOne+ "²  = "+result.getText());
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                valueOne = Float.parseFloat(result.getText()+"");
                result.setText(Math.sqrt(valueOne)+"");
                equation.setText("√"+valueOne+" = "+result.getText());
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(result.getText() + "");

                if(isAdd){
                    result.setText(valueOne+valueTwo+"");
                    equation.setText(equation.getText()+""+valueTwo+" = "+result.getText());
                    isAdd = false;
                }

                if(isSub){
                    result.setText(valueOne-valueTwo+"");
                    equation.setText(equation.getText()+""+valueTwo+" = "+result.getText());
                    isSub = false;
                }

                if(isMul) {
                    result.setText(valueOne * valueTwo + "");
                    equation.setText(equation.getText()+""+valueTwo+" = "+result.getText());
                    isMul = false;
                }

                if(isDiv){
                    result.setText(valueOne/valueTwo+"");
                    equation.setText(equation.getText()+""+valueTwo+" = "+result.getText());
                    isDiv = false;
                }

                if(isPercent){
                    result.setText((valueOne*valueTwo)/100+"");
                    equation.setText(equation.getText()+""+valueTwo+" = "+result.getText());
                    isPercent = false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(result.getText().length()>0) {
                    result.setText(result.getText().delete(result.getText().length() - 1, result.getText().length()));
                }
                equation.setText("");
            }
        });
    }
}
