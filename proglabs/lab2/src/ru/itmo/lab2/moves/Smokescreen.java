package ru.itmo.lab2.moves;


import ru.ifmo.se.pokemon.*;

public class Smokescreen extends StatusMove {
    public Smokescreen (double pow, double acc) {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Effect e = new Effect().stat(Stat.ACCURACY, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "применяет Smokescreen" ;
    }
}
