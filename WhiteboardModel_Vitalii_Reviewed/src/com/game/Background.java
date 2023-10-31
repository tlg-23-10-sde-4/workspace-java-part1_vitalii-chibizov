package com.game;

/*
    Class with limited amount of options to choose for "background" attribute
 */
enum Background {
    FIGHTER("Fighter"),
    SORCERER("Sorcerer"),
    WARLOCK("Warlock");

    // Attribute and method created to change appearance of background enum type
    private final String backgroundStr;
    Background(String backgroundStr) {
        this.backgroundStr = backgroundStr;
    }
    public String getBackgroundStr() {
        return backgroundStr;
    }
    public String toString() {
        return getBackgroundStr();
    }
}