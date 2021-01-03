package com.game.projet.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\n Bienvue dans le jeux Aventure & Dangeon\n\n");
        Hero aventurier = new Hero();
        Dangeon dangeon=new Dangeon();
        dangeon.entreDangeon(aventurier);

    }
}
