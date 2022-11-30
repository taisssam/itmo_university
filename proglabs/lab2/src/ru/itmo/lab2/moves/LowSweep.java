package ru.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep (double pow, double acc) {
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применяет Low Sweep";
    }
}
