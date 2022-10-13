package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Q1 extends AppCompatActivity implements OnClickListener{

    AppCompatButton b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        b1 = (AppCompatButton) findViewById(R.id.b1);
        b2 = (AppCompatButton) findViewById(R.id.b2);
        b3 = (AppCompatButton) findViewById(R.id.b3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }

    public void onClick(View v){

        switch (v.getId()){
            case R.id.b1:
                MainActivity.result = MainActivity.result - 90;
                break;
            case R.id.b2:
                MainActivity.result = MainActivity.result + 20;
                break;
            case R.id.b3:
                MainActivity.result = MainActivity.result - 20;
                break;
        }
        Intent intent = new Intent(this, Q2.class);
        startActivity(intent);


    }
}