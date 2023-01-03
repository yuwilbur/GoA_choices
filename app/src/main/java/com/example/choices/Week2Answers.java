package com.example.choices;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Week2Answers extends AppCompatActivity {

    TextView levelView;
    TextView questionView;
    TextView scoreView;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    // TODO: Create member variables int score
    int score = 0;
    int level = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionView = this.findViewById(R.id.question);
        // TODO: Connect scoreView with R.id.score
        scoreView = this.findViewById(R.id.score);
        levelView = this.findViewById(R.id.level);
        button1 = this.findViewById(R.id.button1);
        button2 = this.findViewById(R.id.button2);
        button3 = this.findViewById(R.id.button3);
        button4 = this.findViewById(R.id.button4);
        setLevel(0);
    }

    private void setLevel(int level) {
        this.level = level;
        levelView.setText("" + this.level);
        String question = "";
        String answer = "";
        String option1 = "";
        String option2 = "";
        String option3 = "";
        String option4 = "";
        if (level == 0) {
            question = "Press any options to START";
        } else if (level == 1) {
            question = "1 + 1 = ";
            answer = "2";
            option1 = "0";
            option2 = "1";
            option3 = answer;
            option4 = "3";
        } else if (level == 2) {
            question = "2 + 3 * 4 = ";
            answer = "12";
            option1 = "10";
            option2 = answer;
            option3 = "14";
            option4 = "20";
        } else if (level == 3) {
            // TODO: Create level 3!
            question = "What is the water content of a watermelon?";
            answer = "96%";
            option1 = "77%";
            option2 = "81%";
            option3 = answer;
            option4 = "99%";
        }
        setQuestion(question, option1, option2, option3, option4, answer);
    }

    private void nextLevel() {
        this.level++;
        setLevel(this.level);
    }

    private void setQuestion(String question, String option1, String option2, String option3, String option4, String answer) {
        questionView.setText(question);
        setupButton(button1, option1, answer);
        setupButton(button2, option2, answer);
        setupButton(button3, option3, answer);
        setupButton(button4, option4, answer);
    }

    private void setupButton(Button button, String option, String answer) {
        button.setText(option);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Call success when it's correct and fail when it's not
                if (option.equals(answer)) {
                    success();
                } else {
                    fail();
                }
            }
        });
    }

    // TODO: Create functions success and fail.
    // TODO (success): We want to increment the score and show it, then go to next level
    // TODO (fail): We want to go to the next level without incrementing the score

    private void success() {
        this.score++;
        scoreView.setText("" + this.score);
        nextLevel();
    }

    private void fail() {
        nextLevel();
    }
}