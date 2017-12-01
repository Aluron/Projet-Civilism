/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

import java.io.*;

/**
 * This is the main Instance, where the Game starts.
 * @authors Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 */
public class Civilism {


    
    protected static String etat;
    
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
        etat = "observation";
        while(newGame.turnNumber < Constantes.TURN_LIMIT){
            if ("observation".equals(etat)){
                boolean observation = newGame.observation();
                if (true == observation ){
                    etat = "decision";
                    System.out.println("-------------------------------------------------------------------------");
                }
            }
            if ("decision".equals(etat)){
                boolean decision = newGame.decision();
                if (true == decision){
                 etat= "observation";
                 newGame.turnNumber++;
                 System.out.println("-------------------------------------------------------------------------");
                 System.out.println("-------------------------------------------------------------------------");
                 System.out.println("-------------------------------------------------------------------------");
                }  
            }
        }
        
    }
    
}
