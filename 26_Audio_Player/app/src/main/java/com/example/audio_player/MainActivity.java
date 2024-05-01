package com.example.audio_player;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton play,pause,stop;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        stop = findViewById(R.id.stop);

        mediaPlayer = MediaPlayer.create(this,R.raw.faded);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(),"Audio Playing",Toast.LENGTH_SHORT).show();
                play.setBackgroundColor(Color.CYAN);
                pause.setBackgroundColor(Color.WHITE);
                stop.setBackgroundColor(Color.WHITE);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                Toast.makeText(getApplicationContext(),"Audio Paused",Toast.LENGTH_SHORT).show();
                pause.setBackgroundColor(Color.CYAN);
                play.setBackgroundColor(Color.WHITE);
                stop.setBackgroundColor(Color.WHITE);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
                Toast.makeText(getApplicationContext(),"Audio Stopped",Toast.LENGTH_SHORT).show();
                stop.setBackgroundColor(Color.CYAN);
                play.setBackgroundColor(Color.WHITE);
                pause.setBackgroundColor(Color.WHITE);
            }
        });
    }

}