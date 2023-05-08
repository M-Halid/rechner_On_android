package com.ewig.rechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText inputNumber1;
        EditText inputNumber2;
        TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);
        resultText = findViewById(R.id.resultText);


    }
    public void sum(View view){
        if(inputNumber1.getText().toString().matches("" ) || inputNumber2.getText().toString().matches("" ) ){
            resultText.setText("Enter Number !");
        }else {
            int number1 = Integer.parseInt(inputNumber1.getText().toString());
            int number2 = Integer.parseInt(inputNumber2.getText().toString());
            int result = number1+number2;
        resultText.setText("Result: "+result);
        }

    }
    public void subs(View view){
        if(inputNumber1.getText().toString().matches("" ) || inputNumber2.getText().toString().matches("" ) ){
            resultText.setText("Enter Number !");
        }else {
            int number1 = Integer.parseInt(inputNumber1.getText().toString());
            int number2 = Integer.parseInt(inputNumber2.getText().toString());
            int result = number1-number2;
        resultText.setText("Result: "+result);}

    }
    public void multiply(View view){
            if(inputNumber1.getText().toString().matches("" ) || inputNumber2.getText().toString().matches("" ) ){
                resultText.setText("Enter Number !");
            }else {
                int number1 = Integer.parseInt(inputNumber1.getText().toString());
                int number2 = Integer.parseInt(inputNumber2.getText().toString());
                int result = number1*number2;
        resultText.setText("Result: "+result);}

    }
    public void divide(View view){
                if(inputNumber1.getText().toString().matches("" ) || inputNumber2.getText().toString().matches("" ) ){
                    resultText.setText("Enter Number !");
                }else {
                    int number1 = Integer.parseInt(inputNumber1.getText().toString());
                    int number2 = Integer.parseInt(inputNumber2.getText().toString());
                    int result = number1 / number2;
                    resultText.setText("Result: " + result);
                }
    }
}