package com.game;

import java.util.Arrays;
/*
    Business class for character creation for "Dungeon and Dragons"-type game.
 */
class Character {

    //  attributes of business class - focused on character creation and starting stats
   private String name = "Unknown Hero";
   private Background background = Background.FIGHTER;
   private Integer strength = 1;
   private Integer intellect = 1;
   private Integer charisma = 1;

   // other variables
   public static final int MIN_STAT = 1;
   public static final int MAX_STAT = 20;
   private boolean isCharmed = false;
   public static String[] spells = {"fireball", "ice storm", "insect plague"};

   //   constructors: in order to create instance of com.game.Character must be at least name provided
    public Character (String name){
        setName(name);
    }
    public Character (String name, Background background){
        this(name);
        setBackground(background);
    }
    public Character (String name, Background background, int strength){
        this(name, background);
        setStrength(strength);
    }
    public Character (String name, Background background, int strength, int intellect){
        this(name, background, strength);
        setIntellect(intellect);
    }
    public Character (String name, Background background, int strength, int intellect, int charisma){
        this(name, background, strength, intellect);
        setCharisma(charisma);
    }

   //   business "action" methods
   public void attack(Character c1, Character c2) {
        switch (c1.background){
            case FIGHTER:
                this.meleeAttack(c1, c2);
                break;
            case SORCERER:
                this.castRandomSpell(c1, c2);
                break;
            case WARLOCK:
                this.charm(c1, c2);
                break;
        }
   }
   private void meleeAttack(Character c1, Character c2){
       if (c1.getStrength() > c2.getStrength()){
           int damage = c1.getStrength();
           System.out.printf("%s has dealt %s damage to %s\n", c1.getName(), damage, c2.getName());
       }
       else {
           System.out.printf("%s has parried an attack from %s\n", c2.getName(), c1.getName());
       };
   }
   private void castRandomSpell (Character c1, Character c2){
       int max = 2, min = 0;
       double randomNum = (Math.random() * (max - min + 1) +min);
       System.out.printf("%s knows those spells: %s\n",c1.getName() ,Arrays.toString(Character.spells));
       System.out.printf("%s channels his/her magic in %s\n", c1.getName(), spells[(int)randomNum]);
       if (c1.getIntellect() > 15){
           System.out.printf("%s have successfully cast %s\n", c1.getName(), spells[(int)randomNum]);
       }
       else {
           System.out.print("Your magic failed you\n");
       }
   }
   private void charm (Character c1, Character c2) {
       //random
       if (c1.getCharisma() > c2.getCharisma()) {
           c2.isCharmed = true;
           System.out.printf("%s has charmed %s\n", c1.getName(), c2.getName());
       } else {
           System.out.printf("%s failed to charm %s\n", c1.getName(), c2.getName());
       }
   }

   //   accessor methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Background getBackground() {
        return background;
    }
    public void setBackground(Background background) {
        this.background = background;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        if (MIN_STAT <= strength && strength <= MAX_STAT) {
            this.strength = strength;
        }
        else {
            System.out.printf("Invalid strength input, try another value in this range: %s - %s\n", MIN_STAT,  MAX_STAT);
        }
    }

    public int getIntellect() {
        return intellect;
    }
    public void setIntellect(int intellect) {
        if (MIN_STAT <= intellect && intellect <= MAX_STAT) {
            this.intellect = intellect;
        }
        else {
            System.out.printf("Invalid intellect input, try another value in this range: %s - %s\n", MIN_STAT,  MAX_STAT);
        }
    }

    public int getCharisma() {
        return charisma;
    }
    public void setCharisma(int charisma) {
        if (MIN_STAT <= charisma && charisma <= MAX_STAT) {
        this.charisma = charisma;}
        else {
            System.out.printf("Invalid charisma input, try another value in this range: %s - %s\n", MIN_STAT,  MAX_STAT);
        }
    }

    public boolean isCharmed() {
        return isCharmed;
    }
    public void setCharmed(boolean charmed) {
        isCharmed = charmed;
    }

    public String toString() {
        return String.format("com.game.Character's name is: %s, his background is: %s,\n" +
                "his ability scores are: strength - %s, intellect - %s, charisma - %s\n",
                getName(), getBackground(), getStrength(), getIntellect(), getCharisma());
    }
}
