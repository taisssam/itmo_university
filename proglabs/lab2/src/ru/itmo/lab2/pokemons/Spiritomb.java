package ru.itmo.lab2.pokemons;

import ru.itmo.lab2.moves.*;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class Spiritomb extends Pokemon {
    public Spiritomb (String name, int level) {
        super(name, level);

        super.setType(Type.DARK, Type.GHOST);
        super.setStats(50, 92, 108,92,108,35);

        RockTomb rocktomb = new RockTomb(60, 90);
        Swagger swagger = new Swagger(0, 85);
        Smokescreen smokescreen = new Smokescreen(0, 100);
        ConfuseRay confuseray = new ConfuseRay(0, 100);
        super.setMove(rocktomb, swagger, smokescreen, confuseray);

    }
}
