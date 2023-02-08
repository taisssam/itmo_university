package ru.itmo.lab3;

import ru.itmo.lab3.characters.*;
import ru.itmo.lab3.objects.*;


class Main {
    public static void main(String[] args) {
        Carlson carlson = new Carlson("Карлсон");
        Christer christer = new Christer("Кристер");
        Gunilla gunilla = new Gunilla("Гунилла");
        Kids kids = new Kids("ребятами");
        Mother mother = new Mother("маме");
        SmallBoy smallBoy = new SmallBoy("Малыш");
        Bump bump = new Bump();
        Closet closet = new Closet();
        Message message = new Message();
        Mood mood = new Mood();

        message.beEnough(message);
        mood.getBetter(carlson, mood);
        smallBoy.close(smallBoy, closet);
        gunilla.cameIn(gunilla, christer);
        gunilla.live_with(smallBoy);
        gunilla.study();
        smallBoy.like(smallBoy, gunilla);
        smallBoy.tell(mother);
        mother.isGood();
        smallBoy.love(smallBoy, christer);
        smallBoy.sorry(bump);
        christer.fight(smallBoy);
        smallBoy.make_peace();
        kids.fight(smallBoy, christer, kids);

    }
}