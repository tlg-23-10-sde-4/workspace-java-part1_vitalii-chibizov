package com.game;

import java.util.Arrays;

class CharacterClientArgs {

    public static void main(String[] args)
    throws Exception{

        if(args.length < 5){
            printUsage();

            return;  // application exits if not enough attributes
        }

/*        // application proceeds if enough attributes
        Character c10 = new Character(args[0]);
        c10.setBackground(Background.valueOf(args[1].toUpperCase()));
        c10.setStrength(Integer.parseInt(args[2]));
        c10.setIntellect(Integer.parseInt(args[3]));
        c10.setCharisma(Integer.parseInt(args[4]));*/

        // application proceeds if enough attributes
        Character c11 = new Character(args[0]);
        try {
            c11.setBackground(Background.valueOf(args[1].toUpperCase()));
            c11.setStrength(Integer.parseInt(args[2]));
            c11.setIntellect(Integer.parseInt(args[3]));
            c11.setCharisma(Integer.parseInt(args[4]));
        } catch (IllegalArgumentException e) {
        //    e.printStackTrace();
            System.out.println("There is a problem with your inputs: ");
            System.out.printf("You entered %s %s %s %s %s\n\n",args[0], args[1],args[2],args[3],args[4]);
            printUsage();
        }

        //System.out.println(c10.toString());
        System.out.println(c11.toString());
    }

    private static void printUsage() {
        String usage = "Usage: com.game.CharacterClientArgs: <name> <background> <strength> <intellect> <charisma>";
        String example = "Example: com.game.CharacterClientArgs: Astarion Sorcerer 10 10 10";
        String note = "Note: supported backgrounds are " + Arrays.toString(Background.values());
        String warning = "Warning: ability scores must be within " + Character.MIN_STAT + " and " + Character.MAX_STAT;

        System.out.printf("\n%s\n%s\n%s\n%s\n", usage, example, note, warning);
    }
}