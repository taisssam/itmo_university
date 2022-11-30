package ru.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Move extends PhysicalMove {
    public Move (double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    @Override
    protected String describe() {
        return "применяет ";
    }
}
