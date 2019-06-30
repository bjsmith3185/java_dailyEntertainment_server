package com.company.U1M4SummativeSmithBrian.model;

// This class can produce an object with word and/or definition properties.

public class Definition {

    // properties
    private String word;
    private String definition;

    // constructor

    public Definition(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    // getters/setters

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
