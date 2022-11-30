package ru.itmo.lab2.pokemons;

 import ru.itmo.lab2.moves.*;
 import ru.ifmo.se.pokemon.Type;
 import ru.ifmo.se.pokemon.Pokemon;

public class Chimchar extends Pokemon {
    public Chimchar(String name, int level) {
        super(name, level);

        super.setType(Type.FIRE);
        super.setStats(44, 58, 44, 58, 44, 51);

        Ember ember = new Ember(40, 100);
        FlameWheel flamewheel = new FlameWheel(60, 100);
        super.setMove(ember, flamewheel);

    }
}
