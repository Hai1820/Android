package com.example.lab1;
/*
* create on 5/21/2021 by Nguyen Hoang Hai
* */
public class Item {
    private String question, answer;

    public Item(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
