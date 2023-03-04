package ru.itmo.lab4.objects;

import ru.itmo.lab4.exceptions.NameException;

import java.util.Objects;

public class Closet {
    private final String name;
    @Override
    public String toString(){
        return name;
    }

    //lab4 unchecked exception
    public Closet(String name) throws NameException {
        if(!Objects.equals(name, "шкаф")) {
            throw new NameException("Некорректное название предмета");
        }
        this.name = name;
    }
}
