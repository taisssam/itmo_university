package ru.itmo.lab4.characters;

import ru.itmo.lab4.enums.Pronouns;
import ru.itmo.lab4.enums.Adjectives;

public class Mother extends Person implements Likeable {

    public Mother(String name) {
        super(name);
    }

    public void isGood(){

        System.out.println(Adjectives.HOW + " " + Pronouns.SHE + " " + Adjectives.SCARY_GOOD + ".");
    }
}
