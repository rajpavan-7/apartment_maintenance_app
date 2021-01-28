package com.example.maintenance_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button2);
        Button button2 = findViewById(R.id.button3);
        Button button3 = findViewById(R.id.button);
        Button button4 = findViewById(R.id.button5);
        Button button5 = findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                startActivity(new Intent(MainActivity.this, Two.class));
                break;
            case R.id.button3:
                startActivity(new Intent(MainActivity.this, one.class));
                break;
            case R.id.button:
                startActivity(new Intent(MainActivity.this, Total_money.class));
                break;
            case R.id.button5:
                startActivity(new Intent(MainActivity.this, Four.class));
                break;
            case R.id.button4:
                startActivity(new Intent(MainActivity.this, IMPdetails.class));
                break;
        }
    }
}