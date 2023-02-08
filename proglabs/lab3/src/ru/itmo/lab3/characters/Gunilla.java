package ru.itmo.lab3.characters;

import java.util.Objects;

import ru.itmo.lab3.enums.Places;
import ru.itmo.lab3.enums.Pronouns;
import ru.itmo.lab3.enums.Adjectives;


public class Gunilla extends Person {

    public Gunilla(String name) {
        super(name);
    }

    public void cameIn(Person p1, Person p2){

        System.out.println(" как в " + Places.ROOM + " вошли " + p1.getName() + " и " + p2.getName() + "." );
    }

    public void live_with(Person p) {
         System.out.print(Pronouns.THEY + " жили " + "на " + Adjectives.SAME + " " + Places.STREETS + "е что и " + p.getName() + ",");
    }

    public void study() {
        System.out.print(" и" + " учились" + " c " + Pronouns.HIM2 + " в " + Adjectives.ONE + " " + Places.SCHOOL_CLASS + ". ");
    }
}

