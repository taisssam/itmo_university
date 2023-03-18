package ru.itmo.lab4.objects;

import ru.itmo.lab4.exceptions.NameException;
import ru.itmo.lab4.enums.*;
import java.util.Objects;


public class Bump {
    public static String forehead;
    private final String name;
    @Override
    public String toString(){
        return name;
    }
    public Bump(String name, String f) {
        this.name = name;
        forehead = f;
    }

    //lab4
     public static class Place{
        public static String infPlace(){
             return forehead;
         }
     }
    public void Sorry(Bump b){
        System.out.print( ", и " + Adverbs.LONG_AGO + " простил " + Pronouns.HIM1 + " " + b.toString() + " " + Place.infPlace() + "."  );
    }
}
