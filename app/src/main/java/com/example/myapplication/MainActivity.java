package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEdutText= (EditText)findViewById(R.id.firstNumEdutText);
                EditText secondNumEditText= (EditText)findViewById(R.id.secondnumberEditText);
                TextView resultText= (TextView)findViewById(R.id.resulttextView);

                int num1=Integer.parseInt(firstNumEdutText.getText().toString());
                int num2=Integer.parseInt(secondNumEditText.getText().toString());
                int res=num1+num2;
                resultText.setText(res+"");

            }
        });

    }
}
