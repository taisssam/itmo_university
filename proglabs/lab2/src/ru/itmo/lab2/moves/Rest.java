package ru.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest (double pow, double acc) {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        p.setCondition(e);
        p.restore();
    }

    @Override
    protected String describe() {
        return "применяет Rest";
    }
}