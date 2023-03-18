package ru.itmo.lab4.objects;
import ru.itmo.lab4.characters.Person;
import ru.itmo.lab4.exceptions.NameException;

import java.util.Objects;

public class Mood {

    private final String name;
    @Override
    public String toString(){
        return name;
    }
    //lab4 unchecked_exception
    public Mood(String name) throws NameException {
        if(!Objects.equals(name, "настроение")) {
            throw new NameException("Некорректное название предмета");
        }
        this.name = name;
    }
    public void getBetter(Person p, Mood m){

        System.out.print(" чтобы у " + p.getName() + "а "+ "улучшилось " + m.toString() + ". ");
    }
}
