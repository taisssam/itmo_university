package ru.itmo.lab3.characters;

import ru.itmo.lab3.enums.Adverbs;
import ru.itmo.lab3.enums.Pronouns;

public class Christer extends Person implements Fightable{

    public Christer(String name) {
        super(name);
    }

    public void fight(Person p) {
        System.out.print(Adverbs.TRUTH + " c " + p.getName() + "ом " + Pronouns.THEY + " " + Adverbs.QUITE_OFTEN + " дрались, ");
    }
}
