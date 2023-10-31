package com.game;

/*
    Application main class
 */

/**
 * JR: nice job, shows the interaction between Characters well.
 */
public class CharacterClient {

    public static void main(String[] args) {

        // creation of character instance by different methods
        Character c1 = new Character("Karlach");
        c1.setBackground(Background.FIGHTER);
        c1.setStrength(20);
        c1.setIntellect(5);
        c1.setCharisma(5);
        System.out.println(c1 + "\n");

        Character c2 = new Character("Astarion", Background.SORCERER, 5, 20, 5);
        System.out.println(c2 + "\n");

        Character c3 = new Character("Wyll", Background.WARLOCK, 5, 5, 20);
        System.out.println(c3 + "\n");

        // initiating method attack() which is calling for second method specific for each background
        c1.attack(c1, c2);
        System.out.println();
        c2.attack(c2, c3);
        System.out.println();
        c3.attack(c3, c1);
    }
}