package com.example.buttongame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayGame extends AppCompatActivity {
    private String number = "21";
    private static int playerCheck = 1;

    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_game);
        play();
    }
    public void play() {
        //Initialize
        TextView numberSticks = findViewById(R.id.stickNum);
        numberSticks.setText(number);
        Button restart = findViewById(R.id.restart);
        TextView playerNum = findViewById(R.id.message);

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);

        //Check player's turn
        if (playerCheck % 2 == 0) {
            String msg = "Player 2's turn";
            playerNum.setText(msg);
            playerCheck++;
        } else {
            String msg = "Player 1's turn";
            playerNum.setText(msg);
            playerCheck++;
        }

        //Check whether or not game is about to end
        if(number.equals("1")) {
            two.setVisibility(View.GONE);
        }
        if (number.equals("0")) {
            one.setVisibility(View.GONE);
            two.setVisibility(View.GONE);
            if (playerCheck % 2 != 0) {
                String msg =  "Player 2 Wins!!!";
                playerNum.setText(msg);
            } else {
                String msg =  "Player 1 Wins!!!";
                playerNum.setText(msg);
            }
        }
        //Go to Main Menu
        restart.setOnClickListener(unused -> startActivity(new Intent(this, MainActivity.class)));

        //Buttons
        one.setOnClickListener(unused -> {
            int num = Integer.parseInt(number);
            num--;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            play();
        });
        two.setOnClickListener(unused -> {
            int num = Integer.parseInt(number);
            num = num - 2;
            number = String.valueOf(num);
            numberSticks.setText(String.valueOf(num));
            play();
        });
    }
}
