package com.game;

/**
 * JR: not thorough enough, for proper BVT (Boundary Value Testing)
 * for range of values [1,20], we test:
 *  0,1  and  20,21
 *
 * Even though all three properties (strength, intellect, charisma) are in range [1,20],
 * it's best to thoroughly test all of them, sniffing out any bugs related to misuse of
 * < instead of <=.
 */
class CharacterValidationTest {

    public static void main(String[] args) {

        // correct instance example with default values
        Character t1 = new Character("John Smith");
        System.out.println(t1 + "\n");

        // wrong intellect argument
        Character t2 = new Character("Valid Sofia", Background.WARLOCK, 1, 30, 20);
        System.out.println(t2 + "\n");

        // wrong charisma argument
        Character t3 = new Character("Cheater Jack", Background.SORCERER, 1, 1, 0);
        System.out.println(t3 + "\n");

        // test of charming spell of warlock background
        t3.attack(t2, t1);
        System.out.println("Is " + t1.getName() + " charmed? - " + t1.isCharmed());
        System.out.println("Is " + t2.getName() + " charmed? - " + t2.isCharmed());
        System.out.println("Is " + t3.getName() + " charmed? - " + t3.isCharmed());
    }
}