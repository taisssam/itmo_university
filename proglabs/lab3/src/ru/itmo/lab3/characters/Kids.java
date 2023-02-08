package ru.itmo.lab3.characters;

import ru.itmo.lab3.enums.Adjectives;
import ru.itmo.lab3.enums.Adverbs;
import ru.itmo.lab3.enums.Places;
import ru.itmo.lab3.enums.Pronouns;

public class Kids extends Person implements Fightable {
    public Kids(String name) {
        super(name);
    }

    public void fight(Person p1, Person p2, Person p3) {
        System.out.println(Adverbs.HOWEVER + " дрался " + p1.getName() + " не только c "  + p2.getName() + "ом, a " + Adverbs.ALMOST + " со " + Adjectives.ALL + " " + p3.getName() + " c " + Pronouns.THEIR + " " + Places.STREETS + "ы.");
    }
}
