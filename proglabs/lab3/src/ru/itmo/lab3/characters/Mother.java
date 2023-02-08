package ru.itmo.lab3.characters;

import ru.itmo.lab3.enums.Pronouns;
import ru.itmo.lab3.enums.Adjectives;

public class Mother extends Person {

    public Mother(String name) {
        super(name);
    }

    public void isGood(){

        System.out.println(Adjectives.HOW + " " + Pronouns.SHE + " " + Adjectives.SCARY_GOOD + ".");
    }
}
