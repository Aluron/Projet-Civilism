/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

import java.io.*;

/**
 * This is the main Instance, where the Game starts.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public class Civilism {

    /**
     * C'est ici que débute le jeu.
     * Etat est un variable pour proteger la phase de decision et d'observation
     * @param args UNUSED
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        /**
         * Creates an instance of a Game.
         */
        Game newGame = new Game();

        /**
         * Loop of the Game.
         * Ends with a specific number of turn.
         */
   
        /*
        ATTENTUON CE N EST PAS A GAME DE COMPTER SES PROPRES TOUR, C'est le main qui pilote le game et non game qui se pilote lui même
        car en plus turnNumber est pas static
        IDEM POUR CASH 
        IDEM POur Inhuman
        */
        
        
        //INIT DE ETAT
        String etat;
        etat = "observation";
        while(newGame.turnNumber < Constantes.TURN_LIMIT){
            if ("observation".equals(etat)){
                boolean observation = newGame.observation();
                if (true == observation ){
                    etat = "decision";
                }
            }
            if ("decision".equals(etat)){
                boolean decision = newGame.decision();
                if (true == decision){
                 etat= "observation";
                 newGame.turnNumber++;
                 
                }  
            }
        }
        
    }
    
}
