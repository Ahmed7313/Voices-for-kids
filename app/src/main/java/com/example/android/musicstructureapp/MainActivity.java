package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        ImageView animals = findViewById(R.id.animals_button);
        animals.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityContainer.class));
            }
        });

        ImageView numbers = findViewById(R.id.numbers_button);
        numbers.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int page = 2;
                Intent intent = new Intent(MainActivity.this, ActivityContainer.class);
                intent.putExtra("One", page);// One is your argument
                startActivity(intent);
            }
        });
    }
}
