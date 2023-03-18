package ru.itmo.lab4.enums;

public enum Places {
    STREETS("улиц"),
    SCHOOL_CLASS("классе"),
    ROOM("комнату");

    private String name;
    Places(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}
