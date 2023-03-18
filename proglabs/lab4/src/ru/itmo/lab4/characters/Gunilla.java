package ru.itmo.lab4.characters;

import java.util.Objects;

import ru.itmo.lab4.enums.Places;
import ru.itmo.lab4.enums.Pronouns;
import ru.itmo.lab4.enums.Adjectives;


public class Gunilla extends Person implements Likeable {

    public Gunilla(String name) {
        super(name);
    }

    public void live_with(Person p) {
         System.out.print(Pronouns.THEY + " жили " + "на " + Adjectives.SAME + " " + Places.STREETS + "е что и " + p.getName() + ",");
    }

    public void study() {
        System.out.print(" и" + " учились" + " c " + Pronouns.HIM2 + " в " + Adjectives.ONE + " " + Places.SCHOOL_CLASS + ". ");
    }
}

