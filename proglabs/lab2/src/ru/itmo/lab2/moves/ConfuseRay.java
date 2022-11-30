package ru.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends StatusMove {
    public ConfuseRay(double pow, double acc) {
        super(Type.GHOST, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "применяет Confuse Ray";
    }
}
