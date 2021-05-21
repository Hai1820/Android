package com.example.lab1;

public class Questions {
    public String questions[] ={
        "Mercury is the first planet in the Solar System?",
            "Venus is the second planet in the Solar System?",
            "Earth is the third planet in the Solar System?",
            "Mars is the first planet in the Solar System?",
            "Jupiter is the fifth planet in the Solar System?",
            "Saturn is the sixth planet in the Solar System?",
            "Uranus is the seventh planet in the Solar System?",
            "Neptune is the eighth planet in the Solar System?",
    };
    public String answers[] = {
        "true",
            "true",
            "true",
            "false",
            "false",
            "false",
            "true",
            "false",
    };
    public String getQuestion(int number){
        return questions[number];
    }
    public String getAnswer(int number){
        return answers[number];
    }
}
