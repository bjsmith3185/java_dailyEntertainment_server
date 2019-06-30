package com.company.U1M4SummativeSmithBrian.model;

// This class can create an object that has question and/or answer properties


public class Answer {
    // properties
    private String question;
    private String answer;

    // constructor

    public Answer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }


    // getters/setters

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
