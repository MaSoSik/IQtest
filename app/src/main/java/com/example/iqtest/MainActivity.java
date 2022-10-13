package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    public static int result;
    AppCompatButton cs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cs = (AppCompatButton) findViewById(R.id.cs);
        cs.setOnClickListener(this);
        result = 100;
    }

    public void onClick(View v){
        Intent intent = new Intent(this, Q1.class);
        intent.putExtra("result", result);
        startActivity(intent);

    }
}