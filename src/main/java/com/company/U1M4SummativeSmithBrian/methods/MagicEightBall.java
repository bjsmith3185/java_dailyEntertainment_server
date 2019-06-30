package com.company.U1M4SummativeSmithBrian.methods;

import com.company.U1M4SummativeSmithBrian.model.Answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MagicEightBall {

    public static Answer generateAnswer(Answer input) {

        // pick random number 1 - 8;
        Random random = new Random();
        int randomIndex = random.nextInt(8);

        // create array of string answers;
        List<String> answersList = new ArrayList<>();
        answersList.add("Doesn't look good");
        answersList.add("Probably So");
        answersList.add("Yes");
        answersList.add("No");
        answersList.add("It ain't hard people");
        answersList.add("Absolutely");
        answersList.add("Check back later");
        answersList.add("Look's like tomorrow");

        // select the random answer
        String randomAnswer = answersList.get(randomIndex);

        // set the random answer to the Answer object
        input.setAnswer(randomAnswer);

        // returns the original Answer object with added 'answer' property
        return input;
    }
}
