package ru.itmo.lab3.objects;
import ru.itmo.lab3.characters.Person;

public class Mood {
    @Override
    public String toString() {
        return ("настроение");
    }

    public void getBetter(Person p, Mood m){

        System.out.print(" чтобы у " + p.getName() + "а "+ "улучшилось " + m.toString() + ". ");
    }
}
