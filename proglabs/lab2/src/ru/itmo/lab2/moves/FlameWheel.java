package ru.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

    public class FlameWheel extends PhysicalMove {

        public FlameWheel (double pow, double acc) {
            super(Type.FIRE,60 ,100 );
        }

        @Override
        protected void applyOppEffects(Pokemon p) {
            if (Math.random() * 100 < 10) {
                super.applyOppEffects(p);
                Effect.burn(p);
            }
        }

        @Override
        protected String describe() {
            return "применяет FlameWheel";
        }
    }
