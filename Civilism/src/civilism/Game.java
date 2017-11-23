/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * This is the clas where everything happens. 
 * @author qkame
 */
public class Game {

    protected String townName;
/**
     * Name of the town (and by extension the name of the Game)
     */
        /**
     * Creation Date of the Game instance.
     */
    public Date creationDate; 

    /**
     * Ammount of Cash the player has.
     */
    private Integer cash;
    /**
     * Index of the Turn being played.
     */
    protected Integer turnNumber;
    /**
     * List of all the inhabitants in the city.
     */
    private List<Human> inhabitants;
    /**
     * List of all the buildings in the city.
     */
    protected List<Building> buildings;
    private List<House> houses;
    private List<School> schools;
    private List<Factory> factories;
    /**
     * Tool for the input (keyboard).
     */
    protected static final Scanner keyboard = new Scanner(System.in);
    
    /**
     * Command entered by the player.
     */
    private String[] action;
    /**
     * Keywords entered by the player.
     */

    private String keywords;

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
        initialisation();
    }
       
    /**
     * First phase of a turn.
     * This is the phase when/where the player is given all the informations he needs before making any decision.
     * @return 
     */
    protected boolean observation(){
        // CODE DES COMMANDES
        if (turnNumber == 1){
            // Code de l'explication de la phase d'observation
            // DEPLACE A UNE FONCTION A PART POUR EVITER QUE CA BOUCLE APRES CHAQUE COMMANDE
        }
        // ATTENTION BOUCLE
        
        // PROBLEME NE SORT JAMAIS DU IF SI VOUS AVEZ DEJA FAIT LA SEMAINE

//        String word;
        keywords = keyboard.nextLine();
        
        if (!"".equals(keywords))  { // EVITE LES BUGS DE BOUCLE
            String concat = keywords.concat(" #");
            action = analyse(concat);
            while(!"finish".equals(keywords)){
                switch (action[0]){
                    case "help":        // help on a command
//                        System.out.println("Dans help, il y a 3 commandes qui vous donneront des informations sur ce que fait chacun des commandes utile dans la phase d'observation");
//                        System.out.println("infos ,desc et finish");
//                        System.out.println("");
//                        word = keyboard.nextLine();
                            switch (action[1]){
                                case "infos": this.helpInfos();
                                    return false;
                                case "desc": this.helpDesc();
                                    return false;
                                case "finish": this.helpFinish();
                                    return false;
                            
                                // Ajouter tous les cas !!!
                                default: listOfCommands();
                                    return false;
                        }      
                    case "infos":       // infos on an element
//                        System.out.println("Dans infos, il y à les détails de chacun de vos batiments");
//                        System.out.println("taper : school, factory, office, house, city pour les connaitre");
//                        System.out.println("");
//                        word = keyboard.nextLine();
                        switch (action[1]){
                            case "school": 
                                return false;
                            case "factory":
                                return false;
                            case "office":
                                return false;
                            case "house":
                                return false;
                            case "city":
                                return false;
                            // Ajouter tous les cas !!!
                            default: infos();
                                return false;    
       
                        }
                    case "desc":     // description of the role of an element
//                        System.out.println("Dans desc, il y à les détails des informations globales sue votre jeu");
//                        System.out.println("taper : child, adult, professor, worker, scientist, police, school, factory, office , house pour les connaitre");
//                        System.out.println("");
//                        word = keyboard.nextLine();
                        switch (action[1]){
                            case "child": 
                                Child.description();
                                return false;
                            case "adult": 
                                Adult.description();
                                return false;
                            case "professor": 
                                Professor.description();
                                return false;
                            case "worker": 
                                Worker.description();
                                return false;
                            case "scientist": 
                                Scientist.description();
                                return false;
                            case "police": 
                                Police.description();
                                return false;
                            case "school": 
                                School.description();
                                return false;
                            case "factory": 
                                Factory.description();
                                return false;
                            case "office": 
                                Office.description();
                                return false;
                            case "house":  
                                House.description();
                                return false;
                            // Ajouter tous les cas !!!
                            default: desc();
                                return false;    
                        }
                    case "finish":
                        System.out.println("--- Fin de la phase d'observation ---");
                        return true;     // End of the phase,
                        
                    default: return false;
                    }
                }
            return true;
        }
        return false;
    }

    /**
     * Second phase of a turn.
     * This is the phase when/where the player makes decisions that will impact the game.
     * @return 
     */
    protected boolean decision(){
        //CODE D'EXECUTION
        System.out.println("ton return a marche");
        if (turnNumber == 1){
            // Code de l'explication de la phase de décision
        }
        
        System.out.println("La phase d'observation et dorenavant terminee.");
        System.out.println("Quelles decisions majeures pour " + this.townName + " alez vous prendre maintenant ?");
        
        
        return false;
    }
   
    /**
     * Prints the List of all implemented commands.
     */
    private static void listOfCommands(){
        System.out.println("");
        System.out.println("Les commandes disponibles sont: \n"
        + "help:    "
        + "infos:    "
        + "desc:    "
        + "finish:  ");
        System.out.println("");
    }

    /**
     * Analyses a String and extracts keywords from it.
     * @param input (String)
     * @return An Array of detected keywords in the "input" String
     */
    private String[] analyse(String input){
        return input.split(" ");
    }

    
    /**
     * Initialises the first objects to be created
     */
    private void initialisation(){

        System.out.println("Vous pouvez maintenant choisir les noms de vos premiers bâtiments. Si vous voulez garder les noms par défaut, appuyez sur Entrée.");
        
        System.out.println("Quelle est le nom de votre école?");
        String name;
        name= keyboard.nextLine();
        School school = new School(null,null,Adress.AVENUE_DE_L_ISEN,name);
        
        System.out.println("Quelle est le nom de votre comissariat?");
        name= keyboard.nextLine();
        Office office = new Office(null,Adress.BOULEVARD_DES_REVES_BRISES,name);
        
        System.out.println("Quelle est le nom de votre Factory");
        name= keyboard.nextLine();
        Factory factory = new Factory (0,null,Adress.RUE_PIERRE_DUPONT,name);
        
        System.out.println("Quelle est le nom de votre Maison ?");
        name= keyboard.nextLine();
        House house = new House (Adress.RUE_DE_LA_PAIX,name);
        
        Adult mickael = new Adult(Name.MAXIME, Surname.DUPOND, house);      
        //this.inhabitants.add(mickael);
        Adult benoit = new Adult(Name.BENOIT, Surname.PEPIN, house);
        //this.inhabitants.add(benoit);
        Adult quentin = new Adult(Name.QUENTIN, Surname.KAMENDA, house);
        //this.inhabitants.add(quentin);

    }

    public void helpInfos(){
        System.out.println("La commande 'infos' permet de connaître le statut de chaque élément du jeu");
        System.out.println("'info' seul vous donne le statut actuel de votre ville (argent et habitants)");
        System.out.println("'info' accompagné du nom d'un élément du jeu vous donne le statut actuel de l'élément.");
        System.out.println("Argumuments disponibles:     'school', 'factory', 'house', city'");
        
    }
    
    public void helpDesc(){
        System.out.println("La commande 'desc' permet d'accéder aux détails des informations globales sue votre jeu");
        System.out.println("Vous y trouverez les informations concernant chaques metiers ou chaques batiments, mais aussi "
                + "la compréhension du système du jeu dans les phases enfant/adulte de vos personnages ");
        System.out.println("");
        
    }
    
    public void helpFinish(){
        System.out.println("Si vous entrez 'finish' dans la barre de jeu, alors votre tour d'observation et d'analyse sera terminé");
        System.out.println("Vous passerez donc à la phase décisionnel du jeu");
        System.out.println("");
    }
    
    public void helpObservation(){
        Game.listOfCommands();
    }
    
    public void helpDecision(){
        
    }
    
    public void infos(){
        System.out.println("Dans " + this.townName +" vous avez " + this.cash +" € " );
        System.out.println("");
        //PB AVEC LA LISTE
        //System.out.println("Vous avez "+ this.inhabitants.size() +" dans votre ville");
    }
    
    public void desc(){
        System.out.println("Civilism est un jeu issu d'un projet scolaire ISEN, réalisé par Quentin KAMENDA & Benoît PEPIN");
    }
    
}
