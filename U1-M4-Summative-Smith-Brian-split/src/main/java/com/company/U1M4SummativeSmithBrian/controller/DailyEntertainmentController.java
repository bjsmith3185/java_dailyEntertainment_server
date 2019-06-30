package com.company.U1M4SummativeSmithBrian.controller;

import com.company.U1M4SummativeSmithBrian.model.Answer;
import com.company.U1M4SummativeSmithBrian.model.Definition;
import com.company.U1M4SummativeSmithBrian.model.Quote;

import com.company.U1M4SummativeSmithBrian.methods.MagicEightBall;
import com.company.U1M4SummativeSmithBrian.methods.WordDefinitions;
import com.company.U1M4SummativeSmithBrian.methods.DailyQuotes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class DailyEntertainmentController {


    // Quote of the Day --------------------------------------------------------------
     /*
     Route for random quote of the day
     Path: /quote
     Method: GET
     No request body or parameters
     Returns Quote object
     */

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote quoteOfTheDay() {

        // call the generateQuote method
        return DailyQuotes.generateQuote();
    }


    // Word Definition ---------------------------------------------------------------
     /*
     Route for random definition of the day
     Path: /word
     Method: GET
     No request body or parameters
     Returns Definition object
     */

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition definitionOfTheDay() {

        // call the generateDefinition method
        return WordDefinitions.generateDefinition();
    }


    // Magic 8 Ball ------------------------------------------------------------------
     /*
     Route for 8 ball answer
     Path: /magic
     Method: POST
     Requires a request body, Answer object with only the question property populated
     Returns Answer object with the original question and a random answer property
     */

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer magic8ballAnswer(@RequestBody Answer question) {

        // call the generateAnswer method
        return MagicEightBall.generateAnswer(question);
    }

}