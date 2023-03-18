package ru.itmo.lab4.objects;

import ru.itmo.lab4.enums.Adjectives;
import ru.itmo.lab4.exceptions.NameException;

import java.util.Objects;


public class Message {
    private final String name;
    @Override
    public String toString() {
        return name;
    }
    //lab4 unchecked exception
    public Message(String name) throws NameException {
        if(!Objects.equals(name, "сообщения")) {
            throw new NameException("Некорректное название предмета");
        }
        this.name = name;
    }
    public void beEnough(Message m){
        System.out.print(Adjectives.THIS + " " + m.toString() + " было досаточно,");
    }
}

