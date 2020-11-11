package com.company;

import java.util.Random;

public class Warrior extends Hero{
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperPower.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setDamage(20);
        Random l=new Random();
        setDamage(getDamage()*l.nextInt(4)+2);

    }

}
