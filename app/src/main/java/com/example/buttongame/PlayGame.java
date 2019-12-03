package com.example.buttongame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayGame extends AppCompatActivity {
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_game);
        play();
    }
    public void play() {
        EditText numberSticks = findViewById(R.id.stickNum);
        int number = 21;
        numberSticks.setText(number.toString());
        Button restart = findViewById(R.id.restart);
        TextView lose = findViewById(R.id.lose);
        TextView win = findViewById(R.id.win);
        restart.setVisibility(View.GONE);
        lose.setVisibility(View.GONE);
        win.setVisibility(View.GONE);

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);

        one.setOnClickListener(unused -> {

        });
    }
}
