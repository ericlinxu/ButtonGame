package com.example.buttongame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayComp extends AppCompatActivity {
    private String number = "21";

    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_game);
        play();
    }
    public void play() {
        TextView numberSticks = findViewById(R.id.stickNum);
        numberSticks.setText(number);
        Button restart = findViewById(R.id.restart);
        TextView currentLine = findViewById(R.id.message);
        String l = "You Lose :(";

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);

        if(number.equals("1")) {
            two.setVisibility(View.GONE);
        }
        if (number.equals("0")) {
            one.setVisibility(View.GONE);
            two.setVisibility(View.GONE);
            currentLine.setText(l);
        }

        restart.setOnClickListener(unused -> startActivity(new Intent(this, MainActivity.class)));
        one.setOnClickListener(unused -> {
            int num = Integer.parseInt(number);
            num--;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            //play();
            //SystemClock.sleep(2000);
            computer();
        });
        two.setOnClickListener(unused -> {
            int num = Integer.parseInt(number);
            num = num - 2;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            //play();
            //SystemClock.sleep(2000);
            computer();
        });
    }
    public void computer() {
        TextView numberSticks = findViewById(R.id.stickNum);
        TextView currentLine = findViewById(R.id.message);

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);

        String w = "You Win!!!";
        String l = "You Lose :(";

        int rand = (int) (Math.random() * 2) + 1;
        if (number.equals("0")) {
            one.setVisibility(View.GONE);
            two.setVisibility(View.GONE);
            currentLine.setText(l);
        } else if(number.equals("1")) {
            two.setVisibility(View.GONE);
            int num = Integer.parseInt(number);
            num--;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            String mess = "The computer took 1.";
            currentLine.setText(mess);
            one.setVisibility(View.GONE);
            currentLine.setText(w);
        } else if (number.equals("3")) {
            int num = Integer.parseInt(number);
            num = num - 2;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            String mess = "The computer took 2.";
            currentLine.setText(mess);
            currentLine.setVisibility(View.VISIBLE);
            play();
        } else if (number.equals("2")) {
            int num = Integer.parseInt(number);
            num--;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            String mess = "The computer took 1.";
            currentLine.setText(mess);
            currentLine.setVisibility(View.VISIBLE);
            play();
        } else {
            int num = Integer.parseInt(number);
            num -= rand;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            String mess = "The computer took " + rand;
            currentLine.setText(mess);
            currentLine.setVisibility(View.VISIBLE);
            play();
        }
    }
}
