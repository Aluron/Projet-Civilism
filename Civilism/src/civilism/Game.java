/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author qkame
 */
public class Game {
   
    public String gameName;
    public Date creationDate;
    
    protected Integer cash;
    protected Integer turnNumber;
    
    protected List<Human> inhabitants;
    protected List<Building> buildings;

    public Game() {
        // CODE DE CREATION DE PARTIE A FAIRE !!
        System.out.println("Bonjour, vous avez lancez une partie de Civilism");
    System.out.println("Quelle est le nom de votre ville");
    Scanner keyboard = new Scanner(System.in);
    //NOM_DE_VILLE = keyboard.nextLine();
    
   System.out.println("Vous recevez "+ Constantes.BEGIN_MONEY + "€ pour le debut de votre partie et" + Constantes.BEGIN_HUMAN +" personnes");
   System.out.println("Vous avez "+ Constantes.BEGIN_BUILDING +" batiments au commencement de ce jeu :"+ 
           "\n" +"- une ecole "+ 
           "\n" +"- une atelier" +
           "\n" + "- un commissariat" +
           "\n" + "- une maison ");
    }
    
    public void observation(){
        // CODE DES COMMANDES
        // Switchcase
    }
    
    public void decision(){
        //CODE D'EXECUTION
    }
    
    
    
    
    
    
    
    
}
