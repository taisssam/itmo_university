package ru.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb (double pow, double acc) {
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применяет Rock Tomb";
    }
}