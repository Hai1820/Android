package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    TextView tv_question;
    Button b_true, b_false;
    Questions questions;
    int questionsLength;
    ArrayList<Item> questionsList;
    int currentQuestion = 0;
    boolean winner = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_question = (TextView)findViewById(R.id.tv_question);
        b_true = (Button) findViewById(R.id.b_true);
        b_false = (Button)findViewById(R.id.b_false);

        questions = new Questions();
        questionsLength = questions.questions.length;
        questionsList = new ArrayList<>();

        for (int i = 0; i < questionsLength; i++){
            questionsList.add(new Item(questions.getQuestion(i), questions.getAnswer(i)));

        }
        Collections.shuffle(questionsList);
        setQuestion(currentQuestion);

        b_true.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkQuestion(currentQuestion)) {
                    currentQuestion++;
                    if (currentQuestion< questionsLength){
                        setQuestion(currentQuestion);
                    }else {
                        winner = true;
                        endGame();
                    }
                }else {
                    endGame();
                }
            }
        });
        b_false.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkQuestion(currentQuestion)) {
                    currentQuestion++;
                    if (currentQuestion< questionsLength){
                        setQuestion(currentQuestion);
                    }else {
                        winner = true;
                        endGame();
                    }
                }else {
                    endGame();
                }

            }
        });

    }
    private void setQuestion(int number){
        tv_question.setText(questionsList.get(number).getQuestion());
    }
    private boolean checkQuestion(int number){
        String answer = questionsList.get(number).getAnswer();
        return answer.equals("true");
    }
    private void endGame(){
        if(winner){
            Toast.makeText(this, "Game over! You win", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Game over! You lose", Toast.LENGTH_LONG).show();
            finish();

        }
    }
}
