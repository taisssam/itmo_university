package ru.itmo.lab2.pokemons;

import ru.itmo.lab2.moves.*;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class Monferno extends Chimchar {
    public Monferno(String name, int level) {
        super(name, level);

        super.setType(Type.FIRE, Type.FIGHTING);
        super.setStats(64, 78, 52, 78, 52, 81);

        Ember ember = new Ember(40, 100);
        FlameWheel flamewheel = new FlameWheel(60, 100);
        SlackOff slackoff = new SlackOff(0, 0);
        super.setMove(ember, flamewheel, slackoff);

    }
}