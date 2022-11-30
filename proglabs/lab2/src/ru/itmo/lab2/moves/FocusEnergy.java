package ru.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {
    public FocusEnergy(double pow, double acc) {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.ATTACK, -2 );
    }

        @Override
        protected String describe() {
            return "применяет Focus Energy";
        }
    }

