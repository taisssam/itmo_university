package ru.itmo.lab4.characters;

import ru.itmo.lab4.enums.Adverbs;
import ru.itmo.lab4.enums.Places;
import ru.itmo.lab4.enums.Pronouns;

public class Christer extends Person implements Fightable {

    public Christer(String name) {
        super(name);
    }

    public void cameIn(Person p1, Person p2){
        System.out.println(" как в " + Places.ROOM + " вошли " + p1.getName() + " и " + p2.getName() + "." );
    }

    //lab4 non-static class
    public class OftenActions{
        public void fight(Person p) {
            System.out.print(Adverbs.TRUTH + " c " + p.getName() + " " + Pronouns.THEY + " " + Adverbs.QUITE_OFTEN + " дрались, ");
        }

        public void make_peace(){
            System.out.println("но " + Adverbs.ALWAYS + " " + Adverbs.HERE + " мирились.");
        }
    }

}
