package com.rpg_project;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Create a character object
        Character hero = new Character("Humar");
        System.out.println("We have a new character!");
        System.out.println(hero.getName());
        System.out.println(hero);
    }
}
