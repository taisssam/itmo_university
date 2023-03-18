package ru.itmo.lab4.enums;

public enum Adjectives {

    THIS("Этого"),
    SAME("той же"),
    ONE("одном"),
    HIS("своей"),
    HOW("какая"),
    SCARY_GOOD("\"ужасно хорошая\""),
    ALL("всеми");
    private String name;
    Adjectives(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}
