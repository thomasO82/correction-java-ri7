package fr.sombre_lutin.model;
import java.util.Random; //importation de la classe Random pour générer des nombres aléatoires

//declaration de la classe Person
public class Attack {
    String name;
    int power;
    int probability;
    //constructeur de la classe
    public Attack(String name, int power, int probability) {
        this.name = name;
        this.power = power;
        this.probability = probability;
    }

    //getters et setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    //méthode pour vérifier si l'attaque a réussi
    public boolean isSuccess() {
        // Crée une instance de la classe Random
        Random random = new Random();
        int test = random.nextInt(100);
        System.out.println("Test: " + test + ", Probability: " + this.probability);
        // Génère un nombre aléatoire entre 0 et 99 et le compare à la probabilité de l'attaque
        return test < this.probability;
    }

}
