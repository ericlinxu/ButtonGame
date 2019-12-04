package com.example.buttongame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button playGame = findViewById(R.id.playGame);
        final Button instructions = findViewById(R.id.instructions);
        final Button comp = findViewById(R.id.computer);
        final TextView name = findViewById(R.id.title);
        playGame.setVisibility(View.VISIBLE);
        instructions.setVisibility(View.VISIBLE);
        comp.setOnClickListener(unused -> {
            playGame.setVisibility(View.GONE);
            instructions.setVisibility(View.GONE);
            comp.setVisibility(View.GONE);
            name.setVisibility(View.GONE);
            startActivity(new Intent(this, PlayComp.class));
        });
        playGame.setOnClickListener(unused -> {
            playGame.setVisibility(View.GONE);
            instructions.setVisibility(View.GONE);
            comp.setVisibility(View.GONE);
            name.setVisibility(View.GONE);
            startActivity(new Intent(this, PlayGame.class));
        });
        instructions.setOnClickListener(unused -> {
            playGame.setVisibility(View.GONE);
            instructions.setVisibility(View.GONE);
            comp.setVisibility(View.GONE);
            name.setVisibility(View.GONE);
            startActivity(new Intent(this, Instructions.class));
        });
    }
}
