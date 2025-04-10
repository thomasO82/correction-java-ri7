package fr.sombre_lutin.model;
import java.util.Random; //on importe la classe Random pour générer des nombres aléatoires



public class Bot extends Character {

    public Bot(String name, Attack[] attacks, int pv) {
        super(name, pv, attacks);
    }

    @Override
    public Attack choiceAttack() {
        Random random = new Random(); // Crée une instance de la classe Random
        int randomIndex = random.nextInt(this.getAttacks().length); // Génère un index aléatoire entre 0 (inclus) et attacks.length (exclus)
        return this.getAttacks()[randomIndex]; // Retourne l'attaque correspondante
    }

}
