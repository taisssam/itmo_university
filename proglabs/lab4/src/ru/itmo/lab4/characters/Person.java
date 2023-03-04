package ru.itmo.lab4.characters;

import ru.itmo.lab4.exceptions.NameException;

import java.util.Objects;

public abstract class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}