package com.example.layout_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    EditText testo;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testo = findViewById(R.id.insert_text);
    }

    public void addButton(View v)
    {
        Button newbtn = new Button(this);
        newbtn.setText(testo.getText().toString());
        layout.addView(newbtn);
    }
}