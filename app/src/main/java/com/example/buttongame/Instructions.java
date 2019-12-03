package com.example.buttongame;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Instructions extends AppCompatActivity {
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_play);
        displayText();

        Button back = findViewById(R.id.main);
        back.setOnClickListener(unused -> startActivity(new Intent(this, MainActivity.class)));
    }
    public void displayText() {
        TextView how = findViewById(R.id.paragraph);
        TextView title = findViewById(R.id.title);
        String header = "How to Play";
        title.setText(header);
        String text = "There are 21 counts in this game. You get to choose 1 or 2 sticks every turn. " +
                "In order to win, you cannot be the person to grab the last count. " +
                "If you grab the last count, you lose.";
        how.setText(text);
    }
}
