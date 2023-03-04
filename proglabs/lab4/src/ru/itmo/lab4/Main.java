package ru.itmo.lab4;

import ru.itmo.lab4.characters.*;
import ru.itmo.lab4.objects.*;


class Main {
    public static void main(String[] args) {
        Carlson carlson = new Carlson("Карлсон");
        Christer christer = new Christer("Кристер");
        Christer.OftenActions ch_actions = christer.new OftenActions(); //lab4 non-static_class
        Gunilla gunilla = new Gunilla("Гунилла");
        Kids kids = new Kids("ребятами");
        Mother mother = new Mother("маме");
        SmallBoy smallBoy = new SmallBoy("Малыш");
        Bump bump = new Bump("шишку на лбу");
        Closet closet = new Closet("шкаф");
        Message message = new Message("сообщения");
        Mood mood = new Mood("настроение");

        //lab4 anonymous_class_1
        Christer fChrister = new Christer("Кристером") {
            @Override
            public String toString() {
                return getName();
            }
        };

        //lab 4 anonymous_class_2
        Gunilla fGunilla = new Gunilla("Гуниллу") {
            @Override
            public String toString() {
                return getName();
            }
        };

        message.beEnough(message);
        mood.getBetter(carlson, mood);
        smallBoy.close(smallBoy, closet);
        christer.cameIn(gunilla, christer);
        gunilla.live_with(smallBoy);
        gunilla.study();
        smallBoy.statusGunilla(smallBoy, gunilla);
        smallBoy.tell(mother);
        mother.isGood();
        smallBoy.statusChrister(smallBoy, christer);
        smallBoy.sorry(bump);
        ch_actions.fight(fChrister);
        ch_actions.make_peace();
        kids.fight(smallBoy, fChrister, kids);
        smallBoy.notHurt(fGunilla);
    }
}