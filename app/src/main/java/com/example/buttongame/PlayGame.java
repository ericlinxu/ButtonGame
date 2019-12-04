package com.example.buttongame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayGame extends AppCompatActivity {
    private String number = "21";
    //public EditText numberSticks = findViewById(R.id.stickNum);
    //private int num = Integer.parseInt(numberSticks.getText().toString());

    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_game);
        play();
    }
    public void play() {
        TextView numberSticks = findViewById(R.id.stickNum);
        numberSticks.setText(number);
        Button restart = findViewById(R.id.restart);
        TextView lose = findViewById(R.id.lose);
        TextView win = findViewById(R.id.win);
        lose.setVisibility(View.GONE);
        win.setVisibility(View.GONE);

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);

        if(number.equals("1")) {
            two.setVisibility(View.GONE);
        }
        if (number.equals("0")) {
            one.setVisibility(View.GONE);
            two.setVisibility(View.GONE);
            lose.setVisibility(View.VISIBLE);
        }

        restart.setOnClickListener(unused -> startActivity(new Intent(this, MainActivity.class)));
        one.setOnClickListener(unused -> {
            int num = Integer.parseInt(number);
            num--;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            play();
            //computer();
        });
        two.setOnClickListener(unused -> {
            int num = Integer.parseInt(number);
            num = num - 2;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            play();
            //computer();
        });
    }
    /*public void computer() {
        EditText numberSticks = findViewById(R.id.stickNum);
        int rand = (int) (Math.random() * 2) + 1;
        if (number.equals("3")) {
            int num = Integer.parseInt(number);
            num = num - 2;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            play();
        } else if (number.equals("2")) {
            int num = Integer.parseInt(number);
            num--;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            play();
        } else {
            int num = Integer.parseInt(number);
            num -= rand;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            play();
        }
    }*/
}
