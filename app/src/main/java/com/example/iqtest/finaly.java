package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.TextView;

public class finaly extends AppCompatActivity implements OnClickListener{


    TextView resault;
    AppCompatButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finaly);
        resault = (TextView) findViewById(R.id.resault);
        back = (AppCompatButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        resault.setText(Integer.toString(MainActivity.result));

    }

    public void onClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        MainActivity.result = 0;
        startActivity(intent);
        finish();

    }
}