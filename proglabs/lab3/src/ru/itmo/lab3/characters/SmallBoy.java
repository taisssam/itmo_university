package ru.itmo.lab3.characters;
import ru.itmo.lab3.enums.Adjectives;
import ru.itmo.lab3.objects.Closet;
import ru.itmo.lab3.objects.Bump;
import ru.itmo.lab3.enums.Pronouns;
import ru.itmo.lab3.enums.Adverbs;

import java.util.Objects;

public class SmallBoy extends Person {

    public SmallBoy(String name) {
        super(name);
    }

    public void close(Person p, Closet c){
        System.out.print(p.getName() + " " + Adverbs.BARELY + " успел закрыть " + c.toString() + ",");
    }

    public void like(Person p1, Person p2){

        System.out.print(p1.getName() + "у" + " очень нравилась " + p2.getName());
    }

    public void tell(Person p){
        System.out.print(" и " + Pronouns.HE + " " + Adverbs.OFTEN + " рассказывал " + Adjectives.HIS + " " + p.getName() + ", ");
    }

    public void love(Person p1, Person p2){
        System.out.print(p2.getName() + "а" + " " + p1.getName() + " " +  Adverbs.TOO + " любил " );
    }

    public void notHurt(Person p){
        System.out.print("Но вот " + p.getName() + " " + Pronouns.HE + " " + Adverbs.NEVER + "не бил");
    }

    public void sorry(Bump b){
        System.out.print("и " + Adverbs.LONG_AGO + " простил " + Pronouns.HIM1 + " " + b.toString() + ".");
    }

    public void make_peace(){
        System.out.println("но " + Adverbs.ALWAYS + " " + Adverbs.HERE + " мирились.");
    }



}




