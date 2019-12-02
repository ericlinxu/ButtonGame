package com.example.buttongame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Button playGame = findViewById(R.id.playGame);
        final Button instructions = findViewById(R.id.instructions);
        playGame.setVisibility(View.VISIBLE);
        instructions.setVisibility(View.VISIBLE);
        playGame.setOnClickListener(unused -> {
            playGame.setVisibility(View.GONE);
            instructions.setVisibility(View.GONE);
            startActivity(new Intent(this, PlayGame.class));
        });
        instructions.setOnClickListener(unused -> {
            playGame.setVisibility(View.GONE);
            instructions.setVisibility(View.GONE);
            startActivity(new Intent(this, Instructions.class));
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
