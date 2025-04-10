package fr.sombre_lutin.controller;
import fr.sombre_lutin.model.Attack;
import fr.sombre_lutin.model.Bot;
import fr.sombre_lutin.model.Player;


public class Game {
    public static void game(){
        Attack[] playerAttacks = new Attack[4];
        Attack[] opponentAttacks = new Attack[4];

        playerAttacks[0] = new Attack("Frappe rapide", -10, 80); // High probability for a weak attack
        playerAttacks[1] = new Attack("Soin", 15, 60);           // Moderate probability for healing
        playerAttacks[2] = new Attack("Frappe lourde", -20, 50); // Moderate probability for a stronger attack
        playerAttacks[3] = new Attack("Uppercut", -30, 40);      // Lower probability for a very strong attack

        opponentAttacks[0] = new Attack("Bug fatal", -10, 80);   // High probability for a weak attack
        opponentAttacks[1] = new Attack("Patch de réparation", 15, 60); // Moderate probability for healing
        opponentAttacks[2] = new Attack("Erreur 404", -20, 50);  // Moderate probability for a stronger attack
        opponentAttacks[3] = new Attack("Crash système", -30, 40);
        final Player player = new Player("Guerier de feu",playerAttacks,100);
        final Bot sombreLutin = new Bot("Sombre lutin", opponentAttacks, 100);
        while(player.getLife() > 0 && sombreLutin.getLife() > 0){
            player.displayStatus();
            sombreLutin.displayStatus();
            player.attack(player.choiceAttack(),player,sombreLutin);
            if (sombreLutin.getLife() <= 0){
                break;
            }
            sombreLutin.attack(sombreLutin.choiceAttack(),sombreLutin,player);
        }
        if (player.getLife() <= 0) {
            System.out.println("Vous avez perdu");
        } else System.out.println("Vous avez gagné");
    }
}
