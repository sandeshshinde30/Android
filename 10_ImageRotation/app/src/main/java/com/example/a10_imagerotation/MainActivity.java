package com.example.a10_imagerotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {

    private ImageButton imageButton,imageButton1;
    private ImageButton rotateButton;
    private int currentRotation = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.imageButton);


        rotateButton = findViewById(R.id.rotateButton);

        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateImage();
            }
        });
    }

    private void rotateImage() {
        currentRotation += 90;
        RotateAnimation rotate = new RotateAnimation(currentRotation, currentRotation + 90,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);
        rotate.setFillAfter(true);
        imageButton.startAnimation(rotate);
    }
}
