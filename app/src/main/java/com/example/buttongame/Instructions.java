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
        String text = "There are 21 points that you and your opponent can take from.\n" +
                "On each turn, you have to take either one or two points.\n" +
                "If you take the last point, you lose.\n" +
                "If your opponent takes the last point, you win.\n" +
                "Good luck!";
        how.setText(text);
    }
}
