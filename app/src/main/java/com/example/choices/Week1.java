package com.example.choices;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Week1 extends AppCompatActivity {

    TextView levelView;
    TextView questionView;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    // TODO: Create member variables int level

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
        // TODO: Set the member variable level (this.level) with the local variable level (level)'s value
        // TODO: Set the levelView to show the current level

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
            // TODO: option1?
            option2 = "1";
            option3 = answer;
            // TODO: option4?
        } else if (level == 2) {
            // TODO: Create level 2
        }

        // TODO: Call setQuestion with local variables above (example: setQuestion(question, ???);)
    }

    private void nextLevel() {
        // TODO: Call setLevel with the current level + 1
    }

    private void setQuestion(String question, String option1, String option2, String option3, String option4, String answer) {
        // TODO: set the questionView with using .setText(String text);

        setupButton(button1, option1, answer);
        // TODO: Finish setting up buttons 2, 3 and 4
    }

    private void setupButton(Button button, String option, String answer) {
        button.setText(option);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: call nextLevel() if this option is the answer! Remember to use .equals()
            }
        });
    }
}