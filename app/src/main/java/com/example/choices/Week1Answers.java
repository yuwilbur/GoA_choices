package com.example.choices;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Week1Answers extends AppCompatActivity {

    TextView levelView;
    TextView questionView;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    // TODO: Create member variables int level
    int level = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionView = this.findViewById(R.id.question);
        levelView = this.findViewById(R.id.level);
        button1 = this.findViewById(R.id.button1);
        button2 = this.findViewById(R.id.button2);
        button3 = this.findViewById(R.id.button3);
        button4 = this.findViewById(R.id.button4);
        setLevel(0);
    }

    private void setLevel(int level) {
        // TODO: Set the member variable level to the local variable level

        // TODO: Set the levelView to show the current level

        this.level = level;
        levelView.setText("" + this.level);

        // TODO: Initialize all required local variables for setQuestion
        String question = "";
        String answer = "";
        String option1 = "";
        String option2 = "";
        String option3 = "";
        String option4 = "";
        if (level == 0) {
            question = "Press any options to START";
        } else if (level == 1) {
            // TODO: Complete level 1 (option1, option2, option4)
            question = "1 + 1 = ";
            answer = "2";
            option1 = "0";
            option2 = "1";
            option3 = answer;
            option4 = "3";
        } else if (level == 2) {
            // TODO: Create level 2
            question = "2 + 3 * 4 = ";
            answer = "12";
            option1 = "10";
            option2 = answer;
            option3 = "14";
            option4 = "20";
        }
        // TODO (Optional): Create more levels!

        // TODO: Call setQuestion with local variables above
        setQuestion(question, option1, option2, option3, option4, answer);
    }

    private void nextLevel() {
        // TODO: Increment the level and set the level
        this.level++;
        setLevel(this.level);
    }

    private void setQuestion(String question, String option1, String option2, String option3, String option4, String answer) {
        // TODO: set the questionView with the question text
        questionView.setText(question);
        setupButton(button1, option1, answer);
        // TODO: Finish setting up buttons 2, 3 and 4
        setupButton(button2, option2, answer);
        setupButton(button3, option3, answer);
        setupButton(button4, option4, answer);
    }

    private void setupButton(Button button, String option, String answer) {
        button.setText(option);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: call nextLevel() if this button is the answer!
                if (option.equals(answer)) {
                    nextLevel();
                }
            }
        });
    }
}