package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showButton = findViewById(R.id.showButton);
        showButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {



                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtra("name", "Violeta"); // Optional
                intent.putExtra("number", 1); // Optional
                startActivity(intent);
            }
        });
    }
}
