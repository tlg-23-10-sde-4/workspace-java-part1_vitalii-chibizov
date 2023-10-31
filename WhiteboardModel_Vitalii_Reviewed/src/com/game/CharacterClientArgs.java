package com.game;

import java.util.Arrays;

/**
 * JR: good job, works as expected.
 * Usage banner is good, and easy for user to figure out how to run it.
 */
class CharacterClientArgs {

    public static void main(String[] args) {

        if(args.length < 5){
            String usage = "Usage: com.game.CharacterClientArgs: <name> <background> <strength> <intellect> <charisma>";
            String example = "Example: com.game.CharacterClientArgs: Astarion Sorcerer 10 10 10";
            String note = "Note: supported backgrounds are " + Arrays.toString(Background.values());
            String warning = "Warning: ability scores must be within " + Character.MIN_STAT + " and " + Character.MAX_STAT;

            System.out.printf("\n%s\n%s\n%s\n%s\n", usage, example, note, warning);

            return;  // application exits if not enough attributes
        }

        // application proceeds if enough attributes
        Character c10 = new Character(args[0]);
        c10.setBackground(Background.valueOf(args[1].toUpperCase()));
        c10.setStrength(Integer.parseInt(args[2]));
        c10.setIntellect(Integer.parseInt(args[3]));
        c10.setCharisma(Integer.parseInt(args[4]));

        System.out.println(c10.toString());
    }
}