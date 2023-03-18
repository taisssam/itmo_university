package ru.itmo.lab4.enums;

public enum Pronouns {
    HE("он"),
    HIM1("ему"),
    HIM2("ним"),
    THEY("Они"),
    SHE("она"),
    THEIR("их");

    private String name;
    Pronouns(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

}
