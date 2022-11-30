package ru.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {
    public WillOWisp (double pow, double acc) {
        super(Type.FIRE, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.burn(p);
    }

    @Override
    protected String describe() {
        return "применяет Will O Wisp";
    }
}