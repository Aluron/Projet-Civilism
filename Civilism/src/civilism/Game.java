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
   
    /**
     * Name of the town (and by extension the name of the Game)
     */
    public String townName;
    /**
     * Creation Date of the Game instance.
     */
    public Date creationDate; 
    /**
     * Ammount of Cash the player has.
     */
    protected static Integer cash;
    /**
     * Index of the Turn being played.
     */
    protected Integer turnNumber;
    /**
     * List of all the inhabitants in the city.
     */
    protected List<Human> inhabitants;
    /**
     * List of all the buildings in the city.
     */
    protected List<Building> buildings;
    /**
     * Tool for the input (keyboard).
     */
    protected Scanner keyboard = new Scanner(System.in);
    /**
     * Command entered by the player.
     */
    protected String action;
    /**
     * Keywords entered by the player.
     */
    protected String[] keywords;
    
    
    /**
     * Constructor.
     * Beginning of the Game (Description, Introduction, Creation...)
     */
    public Game() {
        // CODE DE CREATION DE PARTIE A FAIRE !!
        turnNumber = 1;

        /**
         * Introduction
         */
        System.out.println("Bonjour! Bienvenue dans Civilism,  le jeu de gestion de ville révolutionnaire des étudiants ISEN.");
        System.out.println("Je suis " + Constantes.NARRATOR + ", je serai présent pour vous accompagner tout au long de votre aventure.");
        System.out.println("Dans Civilism, vous incarnez un maire d'une ville naissante et grandissante, en charge de prendre toutes "
                + "les décisions nécessaires au bon fonctionnement de votre ville.");
        
        /**
         * Choix du nom de la ville
         */
        System.out.println("Votre première mission mais non des moindres: Nommer votre ville."
                + "\n   - Quel nom magestueux voulez-vous pour votre ville ?");
        townName = keyboard.nextLine();
    
        /**
         * Explication des ressources
         */
        System.out.println("Pour débuter cette nouvelle aventure en tant que Maire de " + townName + ", plusieurs hommes d'affaires ont déjà investi "
                + " et de jeunes couples ont d'ores et déjà rejoins les rangs des habitants.");
        System.out.println("Ainsi, vous recevez "+ Constantes.BEGIN_MONEY + " € pour le debut de votre partie et " + Constantes.BEGIN_HUMAN + " personnes vivent "
                + " dans les " + Constantes.BEGIN_BUILDING +" batiments déjà construits,  à savoir :" 
                + "\n - une ecole "
                + "\n - une atelier" 
                + "\n - un commissariat" 
                + "\n - une maison ");
        
        /**
         * Explication du système de jeu
         */
        System.out.println("\n");
        System.out.println("Un partie de Civilism se joue au tour par tour. Chaque tour de jeu se découpe en deux phases:"
                + "\n - Une phase d'observation, dans laquelle vous avez acces à toutes les informations concernant votre ville."
                + "\n - Une phase decisionnelle, dans laquelle vous effectuerez des actions concrètes de gestion de votre ville."
                + "\n");
        
        /**
         * Début du jeu (aide + lancement)
         */
        System.out.println("Bon, il est temps pour vous de prendre vos fonctions mais ne vous inquietez pas, je restereai avec vous pour accompagner."
                + "\n A tout moment il vous suffit de taper le mot clef 'help' suivi du nom de l'élément sur lequel vous désirez plus d'amples informations.");
        System.out.println("");
        
        /**
         * Initialization of the Game
         */
        cash = Constantes.BEGIN_MONEY;
        
        /**
         * BATIMENTS DE BASE A CREER !!!!!!!!!!!!!!!!!!!!
         */
        /*
        inhabitants = Constantes.BEGIN_INHABITANT_LIST;
        buildings = Constantes.BEGIN_BUILDING_LIST;
        */
        
        ///////////////////////////////
        //CREATION DES OBJECTS/////////
        create_object();
        //////////////////////////////
        
        
        
        
    }
    
    /**
     * First phase of a turn.
     * This is the phase when/where the player is given all the informations he needs before making any decision.
     */
    public void observation(){
        // CODE DES COMMANDES
        if (turnNumber == 1){
            // Code de l'explication de la phase d'observation
        }
        // ATTENTION BOUCLE
        
        action = keyboard.nextLine();
        keywords = analyse(action);
        while( !isEnd(keywords)){
            switch (keywords[0]){
                case "help":        // help on a command
                    switch (keywords[1]){
                        case "infos":
                        case "desc":
                        case "finish":
                        // Ajouter tous les cas !!!
                        default: listOfCommands();
                    }
                case "infos":       // infos on an element
                    switch (keywords[1]){
                        case "school": 
                        case "factory":
                        case "office":
                        case "house":
                        case "city":
                        // Ajouter tous les cas !!!
                        default: listOfCommands();
                    }
                case "desc":     // description of the role of an element
                    switch (keywords[1]){
                        case "child":
                        case "adult":
                        case "professor":
                        case "worker":
                        case "scientist":
                        case "police":
                        // Ajouter tous les cas !!!
                        default: listOfCommands();
                    }
                case "finish": endOfObservation();      // End of the phase, 
                default: listOfCommands();
            }
        }
    }
    
    /**
     * Second phase of a turn.
     * This is the phase when/where the player makes decisions that will impact the game.
     */
    public void decision(){
        //CODE D'EXECUTION
        if (turnNumber == 1){
            // Code de l'explication de la phase de décision
        }
        
        
    }
    
    /**
     * Permet de crée tous les objects pour la classe Game
     */
    public static void create_object(){
        School school = new School("Title.CHERCHEUR","Title.ENSEIGNANT",3,5);
        
    }
    
    /**
     * Analyses a String and extracts keywords from it.
     * @param input (String)
     * @return An Array of detected keywords in the "input" String
     */
    private List<String> stringAnalysis(String input){
        return null;
    } 
    
    /**
     * Ends the 1st phase and launches the 2nd phase.
     */
    private void endOfObservation(){
        
    }
    
    /**
     * Prints the List of all implemented commands.
     */
    private void listOfCommands(){
        
    }
    
    /**
     * Converts the input into keywords
     * @param input
     * @return the extracted keywords
     */
    private String[] analyse(String input){
        return input.split(" ");
    }
    
    
    private Boolean isEnd(String[] input){
        return input[0].equals("finish");
    }
    
    
}
