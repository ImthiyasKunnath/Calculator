package com.baabtra.calculatorbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText result;
    int display=0,d_number,st_number;
    int n;
    String operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (EditText)findViewById(R.id.editText);

    }
    public void numberClicked(View v)
    {
    //    display = 0;
        Button b = (Button)v;
        n=Integer.parseInt(b.getText().toString());
        display = display*10+n;
        result.setText(Integer.toString(display));
    }
    public void operatorClicked(View v)
    {
        Button b = (Button) v;
        operator = b.getText().toString();
        //TextView ans = (TextView) findViewById(R.id.Ans);
        d_number = Integer.parseInt(result.getText().toString());
        result.setText("0");
        display=0;
    }
    public void equalTO(View v)
    {
     //   TextView ans = (TextView) findViewById(R.id.Ans);
        if (operator.equals("+")) {
            st_number = Integer.parseInt(result.getText().toString()) + d_number;
        }
        else if(operator.equals("-")) {
            st_number = d_number -Integer.parseInt(result.getText().toString()) ;

        }
        else if (operator.equals("×"))
        {
            st_number = d_number * Integer.parseInt(result.getText().toString()) ;
        }
        else
        {
            try {
                st_number = d_number / Integer.parseInt(result.getText().toString());
            }
            catch (ArithmeticException e)
            {
                result.setText("Division By Zero Not Possible");
            }


        }
        result.setText(Integer.toString(st_number));
        
    }
    public void clearfunction(View v)
    {
        Button c = (Button) v;
        result.setText("0");
        display=0;
    }









}
