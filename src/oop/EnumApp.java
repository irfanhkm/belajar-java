package oop;

import oop.enums.Level;

import java.util.Arrays;

public class EnumApp {
    public static void main(String[] args) {
        String levelName = Level.VIP.name();
        Level level = Level.valueOf("PREMIUM");
        Level[] levels = Level.values();

        System.out.println("Level Name " + levelName);
        System.out.println("Level " + level);
        System.out.println("Levels " + String.join(", ", Arrays.toString(levels)));
    }
}
