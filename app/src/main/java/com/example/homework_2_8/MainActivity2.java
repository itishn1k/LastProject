package com.example.homework_2_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        try {
            textView1 = findViewById(R.id.tv_name_1);

            String newValue1 = getIntent().getStringExtra("text1");
            Integer number1 = Integer.valueOf(newValue1);

            String newValue2 = getIntent().getStringExtra("text2");
            Integer number2 = Integer.valueOf(newValue2);

            Integer last = (number1 + number2);
            String lastTry = (last.toString());

            textView1.setText(lastTry);

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

        textView2 = findViewById(R.id.tv_name_2);
        String newValue3 = getIntent().getStringExtra("text3");
        String newValue4 = getIntent().getStringExtra("text4");
        textView2.setText(newValue3 + " " + newValue4);

    }
}