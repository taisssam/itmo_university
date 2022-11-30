package ru.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide (double pow, double acc) {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() * 100 < 30) {
            super.applyOppEffects(p);
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "применяет Rock Slide";
    }
}
