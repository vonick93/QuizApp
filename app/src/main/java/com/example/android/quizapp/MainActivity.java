package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    private void question1()
//    {
//        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
//        whippedCreamTopping = whippedCreamCheckBox.isChecked();
//
//
//        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
//        chocolateTopping = chocolateCheckBox.isChecked();
//
//    }

    int score = 0;

    public void submitButton(View view)
    {
        question1();
        question2();
        question3();
        question4();
        question5();

        String message = "Congratz you got " + score +" out of 5 question right!";
        displayMessage(message);

        score = 0;


    }

    public void question1() {
        // Is the button now checked?
        RadioButton radioButton1 =(RadioButton) findViewById(R.id.question_one_a);
        boolean isChecked = radioButton1.isChecked();

        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.question_one_a:
//                if (checked)
//                    score++;
//                    break;
//            case R.id.question_one_b:
//                if (checked)
//                    break;
//            case R.id.question_one_c:
//                if (checked)
//                    break;
//            case R.id.question_one_d:
//                if (checked)
//                    break;
        if (isChecked)
            {
                score++;
            }
        }

    public void question2()
    {
        EditText text = (EditText) findViewById(R.id.question_two_input);
        int input = Integer.parseInt(text.getText().toString());

        if(input == 240)
        {
            score++;
        }

    }

    public void question3() {
        // Is the button now checked?
        RadioButton radioButton3 =(RadioButton) findViewById(R.id.question_three_b);
        boolean isChecked = radioButton3.isChecked();

        // Check which radio button was clicked
        if (isChecked)
        {
            score++;
        }

    }

    public void question4()
    {
        EditText text = (EditText) findViewById(R.id.question_four_input);
        int input = Integer.parseInt(text.getText().toString());

        if(input == 98)
        {
            score++;
        }

    }

    public void question5()
    {
        CheckBox isAChecked = (CheckBox) findViewById(R.id.question_five_a);
        boolean boxA = isAChecked.isChecked();

        CheckBox isBChecked = (CheckBox) findViewById(R.id.question_five_b);
        boolean boxB = isBChecked.isChecked();

        CheckBox isCChecked = (CheckBox) findViewById(R.id.question_five_c);
        boolean boxC = isCChecked.isChecked();

        CheckBox isDChecked = (CheckBox) findViewById(R.id.question_five_d);
        boolean boxD = isDChecked.isChecked();

        if(boxA ==false && boxB == true && boxC == false && boxD == true )
        {
            score++;
        }
    }

    private void displayMessage(String message) {
        TextView quizSummary = (TextView) findViewById(R.id.quiz_result);
        quizSummary.setText(message);
    }




}
