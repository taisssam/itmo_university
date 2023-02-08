package ru.itmo.lab3.objects;

import ru.itmo.lab3.enums.Adjectives;

public class Message {
    @Override
    public String toString() {
        return ("сообщения");
    }

    public void beEnough(Message m){
        System.out.print(Adjectives.THIS + " " + m.toString() + " было досаточно,");
    }
}

