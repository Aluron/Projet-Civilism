/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 * This is the main Instance, where the Game starts.
 * @author qkame
 */
public class Civilism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Creates an instance of a Game.
         */
        Game newGame = new Game();

        /**
         * Loop of the Game.
         * Ends with a specific number of turn.
         */
        while(newGame.turnNumber < Constantes.TURN_LIMIT){
            newGame.observation();
            newGame.decision();
            newGame.turnNumber++;
            
            
        }
        
    }
    
}
