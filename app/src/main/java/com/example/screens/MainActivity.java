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

                EditText nameEdit = findViewById(R.id.editTextName);
                String name = nameEdit.getText().toString();

                EditText shoeSizeEdit = findViewById(R.id.editTextShoeSize);
                String shoeSize = nameEdit.getText().toString();

                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtra("name", name); // Optional
                intent.putExtra("shoeSize", shoeSize ); // Optional
                startActivity(intent);
            }
        });
    }
}
