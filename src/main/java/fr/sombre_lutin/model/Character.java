package fr.sombre_lutin.model;

public class Character {
    // Attributs de la classe Character
    private String name;
    private int life;
    private Attack[] attacks;// tableau d'attaques, on utilise la classe Attack pour définir le type d'attaques

    public Character(String name, int life, Attack[] attacks) {
        this.name = name;
        this.life = life;
        this.attacks = attacks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public Attack[] getAttacks() {
        return attacks;
    }
    public void setAttacks(Attack[] attacks) {
        this.attacks = attacks;
    }

    //Méthode pour attaquer un personnage
    public void attack(Attack atk, Character car, Character opponent){
        // pour la concatenation de chaines de caractères, on utilise le + commme en javascript
        System.out.println(car.name + " a choisi " + atk.getName());
        if (atk.isSuccess()){
            if (atk.getPower() < 0){
                opponent.setLife(opponent.getLife() + atk.getPower());
                System.out.println("l'attaque de " + car.getName() + " a reussie, et a fait " + atk.getPower() + "a " + opponent.getName() );
            }else{
                car.setLife(car.getLife() + atk.getPower());
                System.out.println("Le soin de " + car.getName() + " a reussie, et lui fait gagner " + atk.getPower());
            }
        }else{
            System.out.println("l' attaque de " + car.getName() + " a échoué");
        }
    }
}
