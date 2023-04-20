package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            String name = extras.getString("name");
            String number = extras.getString("shoeSize");

            TextView nameView = findViewById(R.id.textViewName);
            nameView.setText(name);

            TextView shoeSizeView = findViewById(R.id.textViewShoeSize);
            shoeSizeView.setText(number);
        }
    }
}