package ru.itmo.lab4.enums;

public enum Adverbs {

    BARELY("едва"),
    OFTEN("часто"),
    TOO("тоже"),
    LONG_AGO("давно"),
    QUITE_OFTEN("частенько"),
    HERE("тут же"),
    TRUTH(" Правда,"),
    HOWEVER("Впрочем,"),
    ALWAYS("всегда"),
    ALMOST("почти"),
    NEVER("никогда");

    private String name;
    Adverbs(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}

