package ru.itmo.lab2;

import ru.itmo.lab2.pokemons.*;
import ru.itmo.lab2.moves.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {
    public static void main(String[] args){
        Battle b = new Battle();
        Spiritomb spiritomb = new Spiritomb("Первый", 1);
        Chimchar chimchar = new Chimchar("Второй", 1);
        Monferno monferno = new Monferno("Третий", 1);
        Infernape infernape = new Infernape("Четвертый", 1);
        Tyrogue tyrogue = new Tyrogue("Пятый", 1);
        Hitmonlee hitmonlee = new Hitmonlee("Шестой", 1);
        b.addFoe(spiritomb);
        b.addAlly(chimchar);
        b.addFoe(monferno);
        b.addAlly(infernape);
        b.addFoe(tyrogue);
        b.addAlly(hitmonlee);
        b.go();
    }
}
