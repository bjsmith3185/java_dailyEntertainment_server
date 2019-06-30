package com.company.U1M4SummativeSmithBrian.methods;

import com.company.U1M4SummativeSmithBrian.model.Quote;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DailyQuotes {

    // method for selecting random quote
    // return a random quote in a Quote object
    public static Quote generateQuote() {

        Random random = new Random();
        List<Quote> quoteList = new ArrayList<>();

        quoteList.add(new Quote("Brian Smith", "It ain't hard people.."));
        quoteList.add(new Quote("Mark Twain", "Twenty years from now you will be more disappointed by the things that you didn’t do than by the ones you did do"));
        quoteList.add(new Quote("Kesh", "Did you look at Java docs?"));
        quoteList.add(new Quote("Deep", "Yes, there is additional homework."));
        quoteList.add(new Quote("Babe Ruth", "Never let the fear of striking out keep you from playing the game."));
        quoteList.add(new Quote("Jordan Mentz", "I got this!"));
        quoteList.add(new Quote("Brian Smith", "Let it go Big Daddy."));
        quoteList.add(new Quote("Wayne Gretzky", "You miss 100 percent of the shots you never take."));
        quoteList.add(new Quote("Emmett Smith", "Daddy, build a train track with me."));
        quoteList.add(new Quote("Tom Petty", "I won't back down"));
        quoteList.add(new Quote("Aristotle", "We are what we repeatedly do; excellence, then, is not an act but a habit."));

        return quoteList.get(random.nextInt(10));
    }
}
