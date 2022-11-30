package ru.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.itmo.lab2.moves.*;

public class Hitmonlee extends Tyrogue{
    public Hitmonlee(String name, int level) {
        super(name, level);

        super.setType(Type.FIGHTING);
        super.setStats(35, 35, 35, 35, 35, 35);

        Rest rest = new Rest(0, 0);
        RockSlide rockslide = new RockSlide(75, 90);
        LowSweep lowsweep = new LowSweep(65, 100);
        FocusEnergy focusenergy = new FocusEnergy(0, 0);
        super.setMove(rest, rockslide, lowsweep, focusenergy);
    }

}
