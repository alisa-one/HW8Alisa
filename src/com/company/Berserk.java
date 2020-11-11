package com.company;

import java.util.Random;

public class Berserk extends Hero {


    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperPower.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setDamage(10);
        Random r = new Random();
        setDamage(getDamage() + boss.getDamage() / r.nextInt(5) + 1);

    }

}
