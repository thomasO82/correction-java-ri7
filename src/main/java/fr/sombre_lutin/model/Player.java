package fr.sombre_lutin.model;

import java.util.Random;
import java.util.Scanner;

public class Player extends Character {

    public Player(String name, Attack[] attacks, int pv) {
        super(name, pv, attacks);
    }

    @Override
    public Attack choiceAttack() {
        System.out.println("Choose your attack:");
        for (int i = 0; i < this.getAttacks().length; i++) {
            System.out.println((i + 1) + ". " + this.getAttacks()[i].getName());
        }
        int choice = new Scanner(System.in).nextInt() - 1; // -1 pour ajuster l'index
        return this.getAttacks()[choice];
    }



}
