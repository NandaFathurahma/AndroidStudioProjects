package com.example.linearlayout;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class LinearLayout extends AppCompatActivity {
    EditText to, subject,message;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to = findViewById(R.id.to);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
        send = findViewById(R.id.send);
    }
}