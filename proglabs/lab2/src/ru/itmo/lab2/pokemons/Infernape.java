package ru.itmo.lab2.pokemons;

import ru.itmo.lab2.moves.*;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class Infernape extends Monferno {
    public Infernape(String name, int level) {
        super(name, level);

        super.setType(Type.FIRE, Type.FIGHTING);
        super.setStats(76, 104, 71, 104, 71, 108);

        Ember ember = new Ember(40, 100);
        FlameWheel flamewheel = new FlameWheel(60, 100);
        SlackOff slackoff = new SlackOff(0, 0);
        WillOWisp willowisp = new WillOWisp(0, 85);
        super.setMove(ember, flamewheel, slackoff, willowisp);

    }
}