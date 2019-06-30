package com.company.U1M4SummativeSmithBrian.model;

// This class can create an object that has author and/or quote properties

public class Quote {

    // properties
    private String author;
    private String quote;

    // constructor
    public Quote(String author, String quote) {
        this.author = author;
        this.quote = quote;
    }

    // getters/setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
