package ru.itmo.lab4.objects;

import ru.itmo.lab4.exceptions.NameException;

import java.util.Objects;

public class Bump {
    private final String name;
    @Override
    public String toString() {
        return name;
    }
    //lab4 unchecked exception
    public Bump(String name) throws NameException {
        if(!Objects.equals(name, "шишку на лбу")) {
            throw new NameException("Некорректное название предмета");
        }
        this.name = name;
    }
}
