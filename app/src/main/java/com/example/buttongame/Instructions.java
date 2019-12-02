package com.example.buttongame;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Instructions extends AppCompatActivity {
    public void onCreate() {
        TextView how = findViewById(R.id.paragraph);
        TextView title = findViewById(R.id.title);
        title.setText("How to Play");
        how.setText("There are 21 counts in this game. You get to choose 1 or 2 sticks every turn. " +
                "In order to win, you cannot be the person to grab the last count. " +
                "If you grab the last count, you lose.");
    }
}
