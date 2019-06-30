package com.company.U1M4SummativeSmithBrian.methods;

import com.company.U1M4SummativeSmithBrian.model.Definition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordDefinitions {

    // method for selecting random word/definition
    // return a random word/definition in a Definition object
    public static Definition generateDefinition() {

        Random random = new Random();
        List<Definition> definitionList = new ArrayList<>();

        definitionList.add(new Definition("Java", "Very hard programming language"));
        definitionList.add(new Definition("Grenadine", "Thin syrup made from pomegranate juice"));
        definitionList.add(new Definition("Pelter", "A thrower of missiles"));
        definitionList.add(new Definition("Concretize", "Make something concrete"));
        definitionList.add(new Definition("La playa", "Beach"));
        definitionList.add(new Definition("Utopian", "Of or pertaining to or resembling a utopia"));
        definitionList.add(new Definition("Effervescence", "The process of bubbling as gas escapes"));
        definitionList.add(new Definition("Twain", "Two items of the same kind"));
        definitionList.add(new Definition("Parvenu", "A person who has suddenly risen to a higher economic status"));
        definitionList.add(new Definition("Keshwan", "Meaning very smart..."));

        return definitionList.get(random.nextInt(10));
    }
}
