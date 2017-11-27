/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

import civilism.characters.*;
import civilism.buildings.*;
import civilism.exceptions.*;
import java.util.Vector;
import java.util.Date;
import java.util.Scanner;

/**
 * This is the clas where everything happens. 
 * @author qkame
 */
public class Game {

    /**
     * Name of the town (and by extension the name of the Game)
     */
    protected String townName;
    /**
     * Creation Date of the Game instance.
     */
    public Date creationDate; 

    /**
     * Ammount of Cash the player has.
     */
    protected Integer cash;
    /**
     * Research points number the player has.
     */
    protected Integer recherche;
    /**
     * Index of the Turn being played.
     */
    protected Integer turnNumber;
    /**
     * List of all the inhabitants(adults) in the city.
     */
    protected Vector<Human> inhabitants = new Vector();
    /**
     * List of all the children in the city.
     */
    protected Vector<Child> children = new Vector();
    
    /**
     * List of all the buildings in the city.
     */
    protected Vector<Building> buildings = new Vector();
    /**
     * List of all the houses in the city.
     */
    protected Vector<House> houses = new Vector();
    /**
     * List of all the schools in the city.
     */
    public Vector<School> schools = new Vector();
    /**
     * List of all the schools in the city.
     */
    public Vector<Factory> factories = new Vector();
    /**
     * Instance of the only office in the city.
     */
    protected Office office;
    
    /**
     * Tool for the input (keyboard).
     */
    public static final Scanner keyboard = new Scanner(System.in);
    /**
     * Command entered by the player.s
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
        turnNumber = 1;
        
        System.console();

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
         * Initialization of the Game ecosystem
         */
        cash = Constantes.BEGIN_MONEY;
        recherche =Constantes.BEGIN_SEARCH;
        initialisation();
    }
       
    /**
     * First phase of a turn.
     * This is the phase when/where the player is given all the informations he needs before making any decision.
     * @return 
     */
    protected boolean observation(){
        if (turnNumber == 1){
            // Code de l'explication de la phase d'observation
        }
        
        keywords = keyboard.nextLine();
        
        if (!"".equals(keywords)){
            String concat = keywords.concat(" #");
            action = analyse(concat);
            try{
                fastQuit(action[0]);
            } catch (QuitException e) {}
            
            while(!"finish".equals(keywords)){
                switch (action[0]){
                    case "help":
                        switch (action[1]){
                            case "infos": this.helpInfos();
                                return false;
                            case "desc": this.helpDesc();
                                return false;
                            case "finish": this.helpFinish();
                                return false;
                            // Ajouter tous les cas voulus
                            default: listOfCommands();
                                return false;
                        }      
                    case "infos":
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
                            // Ajouter tous les cas voulus
                            default: infos();
                                return false;    
       
                        }
                    case "desc":
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
                            // Ajouter tous les cas voulues
                            default: desc();
                                return false;    
                        }
                    case "finish":
                        System.out.println("--- Fin de la phase d'observation ---");
                        return true;
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
        if (turnNumber == 1){
            // Code de l'explication de la phase de décision
        }
        
        System.out.println("La phase d'observation est dorenavant terminee.");
        System.out.println("Quelles decisions majeures pour " + this.townName + " allez vous prendre maintenant ?");
        
        characterGestion();
        shop();
        this.cash = this.cash - Building.entretien(this);
        
        System.out.println("A la fin du tour, vous avez : " + this.cash + "€ et un total de " + this.recherche + " points de recherche.");
        System.out.println("Le tour " + this.turnNumber + " est maintenant terminé. Passons au tour suivant !");
        
        return true;
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
     *      creates 1 school, 1 office, 1 factory & 1 house
     *              1 professor, 2 workers, 1 child
     */
    private void initialisation(){
        
        System.out.println("Vous pouvez maintenant choisir les noms de vos premiers bâtiments. Si vous voulez garder les noms par défaut, appuyez sur Entrée.");
        
        System.out.println("Quelle est le nom de votre école?");
        String name;
        name= keyboard.nextLine();
        School school = new School(null,Adress.AVENUE_DE_L_ISEN,name);
        buildings.add(school);
        schools.add(school);
        
        System.out.println("Quel est le nom de votre comissariat?");
        name= keyboard.nextLine();
        office = new Office(null,Adress.BOULEVARD_DES_REVES_BRISES,name);
        buildings.add(office);  
        
        
        System.out.println("Quel est le nom de votre Factory");
        name= keyboard.nextLine();
        Factory factory = new Factory (null,Adress.RUE_PIERRE_DUPONT,name);
        buildings.add(factory);
        factories.add(factory);
        
        House house = new House (Adress.RUE_DE_LA_PAIX);
        buildings.add(house);
        houses.add(house);
        
        Professor person = new Professor(school, Title.ENSEIGNANT, true, Name.MAXIME, Surname.DUPOND, house);
        this.inhabitants.add(person);
        School.addProfessor(this.schools , person);
        this.inhabitants.add(new Worker(factory, Job.WORKER, Name.BENOIT, Surname.PEPIN, house));
        this.inhabitants.add(new Worker(factory, Job.WORKER, Name.QUENTIN, Surname.KAMENDA, house));
        
        this.children.add(new Child(Name.JEAN, Surname.JOULIA, house));
        

    }

    /**
     * Get help on 'infos' command
     */
    public void helpInfos(){
        System.out.println("La commande 'infos' permet de connaître le statut de chaque élément du jeu");
        System.out.println("'info' seul vous donne le statut actuel de votre ville (argent et habitants)");
        System.out.println("'info' accompagné du nom d'un élément du jeu vous donne le statut actuel de l'élément.");
        System.out.println("Argumuments disponibles:     'school', 'factory', 'house', city'");
        
    }
    
    /**
     * Get help on 'desc' command
     */
    public void helpDesc(){
        System.out.println("La commande 'desc' permet d'accéder aux détails des informations globales sue votre jeu");
        System.out.println("Vous y trouverez les informations concernant chaques metiers ou chaques batiments, mais aussi "
                + "la compréhension du système du jeu dans les phases enfant/adulte de vos personnages ");
        System.out.println("");
        
    }
    
    /**
     * Get help on 'finish' command
     */
    public void helpFinish(){
        System.out.println("Si vous entrez 'finish' dans la barre de jeu, alors votre tour d'observation et d'analyse sera terminé");
        System.out.println("Vous passerez donc à la phase décisionnel du jeu");
        System.out.println("");
    }
    
    /**
     * Get help on the observation phase
     */
    public void helpObservation(){
        Game.listOfCommands();
    }
    
    /**
     * Get help on the decision phase
     */
    public void helpDecision(){
        
    }
    
    /**
     * Prints the infos of the game
     */
    public void infos(){
        System.out.println("Dans " + this.townName +" vous avez " + this.cash +" € " );
        System.out.println("");
        System.out.println("Vous avez "+ this.inhabitants.size() + " habitants dans votre ville");
    }
    
    /**
     * Prints the description of the game
     */
    public void desc(){
        System.out.println("Civilism est un jeu issu d'un projet scolaire ISEN, réalisé par Quentin KAMENDA & Benoît PEPIN");
    }
    
    /**
     * Quits the game instantly
     * @param input
     * @throws QuitException 
     */
    public void fastQuit(String input)
            throws QuitException{
        if ("quit".equals(input)){
            throw new QuitException();
        }
    }
    
    /**
     * Regroups the gestion of all characters (affectation of children)
     */
    protected void characterGestion(){
        for (Child child : children) {
            if (child.getAmbition()==null){
                this.affectation(child);
            }
            if (child.getAmbition()==child.getEducation()){
                // Code de fin d'études !
            }
        }
    }
    
    /**
     * Affects each child to an education process
     * @param child 
     */
    protected void affectation(Child child){
        System.out.println(child.name + " " + child.surname + " a besoin d'éducation. Vers quelle filière voulez-vous qu'il se dirige ? ('worker', 'police', 'professor', 'scientist')");
        System.out.println("Filières possibles: worker [1 tour]; police  [3 tours]; professor [5 tours]; scientist [5 tours]");
        
        action = analyse(keyboard.nextLine().concat(" #"));
        try{
            fastQuit(action[0]);
        } catch (QuitException e) {}
        switch(action[0]){
            case "worker": 
                Factory.addWorker(factories, new Worker(this.factories.elementAt(this.factories.size()-1), Job.WORKER, child.name, child.surname, child.home));
                child.setAmbition(Constantes.OUVRIER);
                break;
            case "police":
                this.office.policemen.add(new Police(this.office, Rank.AGENT, child.name, child.surname, child.home));
                child.setAmbition(Constantes.POLICIER);
                break;
            case "professor":
                School.addProfessor(schools, new Professor(this.schools.elementAt(this.schools.size()-1), Title.ENSEIGNANT, true, child.name, child.surname, child.home));
                child.setAmbition(Constantes.PROFESSEUR);
                break;
            case "scientist":
                School.addScientist(schools, new Scientist(Title.ENSEIGNANT, Domain.PHARMACOLOGY, child.name, child.surname, child.home));
                child.setAmbition(Constantes.CHERCHEUR);
                break;
            default: 
                characterGestion();
                break;
        }
    }
    
    /**
     * Method to buy new buildings
     */
    public void shop(){
        System.out.println("Nous allons maintenant passer a la gestion de vos batiments");
        keywords = "";
        while (!"finish".equals(keywords)){
            System.out.println("Veulliez ecrire dans la console l'amelioration souhaitee, si vous ne voulez rien ameliorer ecrivez 'finish'");
            System.out.println("Les ameliorations disponibles sont : house, school, factory");
            keywords= keyboard.nextLine();
            switch (keywords){
                case "house":
                    if (this.houses.elementAt(0).checkBuilding(recherche,cash)){
                        this.houses.elementAt(0).create_building();
                        cash = cash - Constantes.IMPROVE_HOUSE;
                        System.out.println("Vos comptes en banque maintenant est de :" + cash);
                    }
                    
                break;
                case "school":
                    if (this.schools.elementAt(0).checkBuilding(recherche,cash)){
                        this.schools.elementAt(0).create_building();
                        update_values();
                    }
                break;
                case "factory":
                    if(this.factories.elementAt(0).checkBuilding(recherche,cash)){
                        this.factories.elementAt(0).create_building();
                        update_values();
                    }
                break;
                case "finish": 
                    System.out.println("Vous sortez de la phase d'amelioration");
                    
                default : 
            }       
        }
    }
    public void update_values(){
        recherche =  recherche - Constantes.IMPROVE_SKILL;
        System.out.println("Vos points de recherches sont maintenant de : " + recherche);
        cash = cash - Constantes.IMPROVE_MONEY;
        System.out.println("Votre compte en banque est maintenant de : " + cash);
    }
    
    /**
     * Ends the game.
     */
    public static void gameOver(){
        System.out.println("--- GAME OVER ---");
        System.out.println("Vous allez manquer a " + Constantes.NARRATOR + "... Relancez une partie pour retrouver votre conseiller favori.");
        System.exit(0);
    }
}
