package com.example.tothenextactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        String textFromFragment = intent.getStringExtra("textFromFragment");

        // Display the text in a TextView in SecondActivity
        TextView textViewInSecondActivity = findViewById(R.id.txtView1);
        textViewInSecondActivity.setText(textFromFragment);
    }
}