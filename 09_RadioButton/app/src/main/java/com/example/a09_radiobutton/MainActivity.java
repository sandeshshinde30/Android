package com.example.a09_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private RadioButton radioMale, radioFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        radioMale = findViewById(R.id.radioMale);
        radioFemale = findViewById(R.id.radioFemale);

        // Set initial clipart image
        imageView.setImageResource(R.drawable.male_clipart);

        // Radio button click listeners
        radioMale.setOnClickListener(v -> {
            // Display male clipart when male radio button is clicked
            imageView.setImageResource(R.drawable.male_clipart);
        });

        radioFemale.setOnClickListener(v -> {
            // Display female clipart when female radio button is clicked
            imageView.setImageResource(R.drawable.female_clipart);
        });
    }
}