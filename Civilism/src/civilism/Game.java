/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

import civilism.characters.*;
import civilism.buildings.*;
import civilism.exceptions.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is the clas where everything happens.
 * It contains every information about the current game.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
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
     * FileWriter for the logs (from java.io)
     */
    private FileWriter log;
    /**
     * BufferedWriter for the logs (from java.io)
     */
    private BufferedWriter buffer;

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
    protected ArrayList<Human> inhabitants = new ArrayList();
    /**
     * List of all the children in the city.
     */
    protected ArrayList<Child> children = new ArrayList();
    
    /**
     * List of all the buildings in the city.
     */
    protected ArrayList<Building> buildings = new ArrayList();
    /**
     * List of all the houses in the city.
     */
    protected ArrayList<House> houses = new ArrayList();
    /**
     * List of all the schools in the city.
     */
    public ArrayList<School> schools = new ArrayList();
    /**
     * List of all the schools in the city.
     */
    public ArrayList<Factory> factories = new ArrayList();
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
     *
     */
    protected Integer work_worker;
    /**
     *
     */
    protected static BufferedWriter writer;

    /**
     * Constructor.
     * Beginning of the Game (Description, Introduction, Creation...)
     * @throws java.io.IOException
     */
    public Game() throws IOException {
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
                + "et de jeunes couples ont d'ores et deja rejoint les rangs des habitants.");
        System.out.println("Ainsi, vous recevez "+ Constantes.BEGIN_MONEY + " € pour le debut de votre partie et " + Constantes.BEGIN_HUMAN + " personnes vivent"
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
                + "\n - Une phase d'observation, dans laquelle vous avez acces a toutes les informations concernant votre ville."
                + "\n - Une phase decisionnelle, dans laquelle vous effectuerez des actions concrètes de gestion de votre ville."
                + "\n");

        /**
         * Début du jeu (aide + lancement)
         */
        System.out.println("Bon, il est temps pour vous de prendre vos fonctions mais ne vous inquietez pas, je restereai avec vous pour accompagner."
                + "\n A tout moment il vous suffit de taper le mot clef 'help' suivi du nom de l'élément sur lequel vous désirez plus d'amples informations.");
        System.out.println("");
        
        //File writer = new File(this.townName + "_log.txt");
        
        /**
         * Creation of the log file
         */ 
        try
        { 
        writer = new BufferedWriter(new FileWriter(new File(this.townName + "_log.txt"))) ;
        writer.newLine();
        }
        catch (IOException e)
        {
        System.out.println("Impossible");
        }
        /*
        FileWriter log = new FileWriter(this.townName + "_log.txt");
        BufferedWriter buffer = new BufferedWriter(log);
        buffer.write("Partie: " + this.townName + "\n"); */
       

    
        
        /**
         * Initialization of the Game ecosystem
         */
        cash = Constantes.BEGIN_MONEY;
        recherche =Constantes.BEGIN_SEARCH;
        texte_log("Au commancement de la partie, votre argent est de : ", cash);
        texte_log("Au commancement de la partie, vos points de recherche sont de : ",recherche);
        texte_log("---------------------------------------------------------");
        this.initialisation();
        
        
        
        
    }
    ////////////////////////////////////////////////////////////////
//////////////////Getter and Setter////////////////////////////////
    /**
     * Gets the writer for the log
     * @return the writer
     */
    public BufferedWriter getWriter() {
        return writer;
    }
    /**
    * Sets the writer for the log
    * @param writer the new writer
    */
    public void setWriter(BufferedWriter writer) {
        Game.writer = writer;
    }

    /**
     * Gets the town name of the game
     * @return the name of the town
     */
    public String getTownName() {
        return townName;
    }

    /**
     * Sets the town name of the game
     * @param townName 
     */
    public void setTownName(String townName) {
        this.townName = townName;
    }

    /**
     * Gets the creation date of the game
     * @return the creation date
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the creation date of the game
     * Why would you do this ?
     * @param creationDate the new creation date
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * Gets the filewriter for the log
     * @return the file writer
     */
    public FileWriter getLog() {
        return log;
    }

    /**
     * Sets the file writer for the log
     * @param log the new file writer
     */
    public void setLog(FileWriter log) {
        this.log = log;
    }

    /**
     * Gets the buffer writer for the log
     * @return the buffer writer
     */
    public BufferedWriter getBuffer() {
        return buffer;
    }

    /**
     * Sets the buffer writer for the log
     * @param buffer the new buffer writer
     */
    public void setBuffer(BufferedWriter buffer) {
        this.buffer = buffer;
    }

    /**
     * Gets the amount of cash available for the player
     * @return the cash
     */
    public Integer getCash() {
        return cash;
    }

    /**
     * Sets the amount of cash the player has
     * @param cash the new amount of cash
     */
    public void setCash(Integer cash) {
        this.cash = cash;
    }

    /**
     * Gets the number of research points the player has
     * @return the number of research points
     */
    public Integer getRecherche() {
        return recherche;
    }

    /**
     * Sets the number of research point the player has
     * @param recherche the new number of research points
     */
    public void setRecherche(Integer recherche) {
        this.recherche = recherche;
    }

    /**
     * Gets the turn number of the game
     * @return the turn number
     */
    public Integer getTurnNumber() {
        return turnNumber;
    }

    /**
     * Sets the turn number of the game
     * Are you trying to cheat ?
     * @param turnNumber 
     */
    public void setTurnNumber(Integer turnNumber) {
        this.turnNumber = turnNumber;
    }

    /**
     * Gets the list of all inhabitants
     * @return the list of all inhabitants
     */
    public ArrayList<Human> getInhabitants() {
        return inhabitants;
    }

    /**
     * Sets the list of all inhabitants
     * @param inhabitants the new list of inhabitants
     */
    public void setInhabitants(ArrayList<Human> inhabitants) {
        this.inhabitants = inhabitants;
    }

    /**
     * Gets the list of all children
     * @return the list of all children
     */
    public ArrayList<Child> getChildren() {
        return children;
    }

    /**
     * Sets the list of all students 
     * @param children the new list of all students
     */
    public void setChildren(ArrayList<Child> children) {
        this.children = children;
    }

    /**
     * Gets the list of all buildings in the city
     * @return the list of all buildings
     */
    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    /**
     * Sets the list of all buildings in the city
     * @param buildings the new list of all buildings
     */
    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    /**
     * Gets the list of all the houses in the city
     * @return the list of all houses
     */
    public ArrayList<House> getHouses() {
        return houses;
    }

    /**
     * Sets the list of all the houses in the city
     * @param houses the new list of all houses
     */
    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    /**
     * Gets the list of all the schools in the city 
     * @return the list of all schools
     */
    public ArrayList<School> getSchools() {
        return schools;
    }

    /**
     * Sets the list of all the schools in the city
     * @param schools the new list of schools
     */
    public void setSchools(ArrayList<School> schools) {
        this.schools = schools;
    }

    /**
     * Gets the list of all the factories in the city
     * @return the list of factories
     */
    public ArrayList<Factory> getFactories() {
        return factories;
    }

    /**
     * Sets the list of all factories in the city
     * @param factories the new list of factories
     */
    public void setFactories(ArrayList<Factory> factories) {
        this.factories = factories;
    }

    /**
     * Gets the office of the city
     * @return the office of the city
     */
    public Office getOffice() {
        return office;
    }

    /**
     * Sets the office of the city
     * @param office the new office
     */
    public void setOffice(Office office) {
        this.office = office;
    }

    /**
     * Gets the action command of the game
     * @return the action command
     */
    public String[] getAction() {
        return action;
    }

    /**
     * Sets the action command of the game
     * @param action the new action
     */
    public void setAction(String[] action) {
        this.action = action;
    }

    /**
     * Gets the keyword command of the game
     * @return the keyword command
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the keyword command of the game
     * @param keywords the new keyword
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    
    
    //////////////////////////////////////////////////
     /**
     * Initialises the first objects to be created
     *      creates 1 school, 1 office, 1 factory & 1 house
     *              1 professor, 2 workers, 1 child
     */
    private void initialisation(){
        
        System.out.println("La première tâche qui vous incombe est l'une des plus simples: Inaugurer les premiers bâtiments de " + this.townName);
        System.out.println("Vous devez maintenant choisir les noms de vos premiers bâtiments. Si vous souhaitez garder les noms par défaut, appuyez simplement sur Entrée.");
        
        //Creation des batiments
        System.out.println("Quel nom pour votre école?");
        String name;
        name= keyboard.nextLine();
        if ("".equals(name)){
            name = "ISEN";
        }
        School school = new School(null,Adress.randomAdress(),name);
        buildings.add(school);
        schools.add(school);
        
        System.out.println("Quel nom pour votre comissariat?");
        name= keyboard.nextLine();
        if ("".equals(name)){
            name = "Quai des Orfèvres";
        }
        office = new Office(null,Adress.randomAdress(),name);
        buildings.add(office);  
        
        
        System.out.println("Quel nom pour votre usine?");
        name= keyboard.nextLine();
        if ("".equals(name)){
            name = "U$in€";
        }
        Factory factory = new Factory (null,Adress.randomAdress(),name);
        buildings.add(factory);
        factories.add(factory);
 
        
        House house = new House (Adress.randomAdress());
        buildings.add(house);
        houses.add(house);
        
        // Creation des personnages
        Professor person = new Professor(school, Title.ENSEIGNANT, true, Name.randomName(), Surname.randomSurname(), house);
        this.inhabitants.add(person);
        School.addProfessor(this.schools , person);
        
        Worker worker = new Worker(factory, Job.WORKER, Name.randomName(), Surname.randomSurname(), house);
        this.inhabitants.add(worker);
        Factory.addWorker(factories, worker);
        
        worker = new Worker(factory, Job.WORKER, Name.randomName(), Surname.randomSurname(), house);
        this.inhabitants.add(worker);
        Factory.addWorker(factories, worker);
        
        this.children.add(new Child(Name.randomName(), Surname.randomSurname(), house));
        

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
        
        /**
         * Reminder of the available commands
         */
        this.helpObservation();
        
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
                                int teacher =0;
                                int scientist = 0;
                                for(int i = 0; i <schools.size() ; i++){
                                    this.schools.get(i).infos();
                                    teacher = this.schools.get(i).getTeachers().size() + teacher;
                                    scientist = this.schools.get(i).getScientists().size() + scientist;
                                }
                                System.out.println("Vous avez " + teacher + " professeurs en tout dans vos ecole ce qui correspond " + teacher + " eleves en formation" );
                                System.out.println("Vous avez " + scientist + " scientifiques dans votre jeu ce qui correspond a " + scientist + " points de recherche par tour");
                                return false;
                            case "factory":
                                int worker =0;
                                for(int i = 0; i < factories.size(); i++){
                                    this.factories.get(i).infos();
                                    worker  = this.factories.get(i).getWorker().size() + worker;
                                }
                                this.work_worker = worker * Constantes.WORKER_MONEY;
                                System.out.println("Vous avez " + factories.size() + " usines dans votre jeu");
                                System.out.println("Vous avez " + worker + " travailleurs dans votre ville ce qui correspond à " + this.work_worker + "€");
                                return false;
                            case "office":
                                office.infos();
                                return false;
                            case "house":
                                int habitant =0;
                                for(int i = 0; i <houses.size(); i++){
                                    this.houses.get(i).infos(i);
                                    habitant = habitant  + this.houses.get(i).getHabitant().size();     
                                }
                                System.out.println("Vous avez " + houses.size() + " maisons dans votre jeu");
                                System.out.println("Vous avez " + habitant + " habitants en tout dans votre jeu ");
                                return false;
                            case "city":
                                this.infos();
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

        texte_log("Vous etes au tour numero : ", turnNumber);

        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("La phase d'observation est dorenavant terminee.");
        System.out.println("Quelles decisions majeures pour " + this.townName + " allez vous prendre maintenant ?");
        System.out.println("");
        
        children.forEach((child) -> {
            child.setEducation(child.getEducation()+1);
            // Tous les eleves gagnent en education
        }); //Avant ou apres les 2 trucs ?
        
        for (int i=0;i<schools.size();i++){
            recherche = recherche + schools.get(i).getScientists().size();
        }
        System.out.println("");
        characterGestion();
        System.out.println("");
        shop();
        System.out.println("");
        this.cash = this.cash - Building.entretien(this);
        
       this.fin_tour();
        
        try{
            Game.moneyFail(cash);
            } catch (PoorException e) {}
        
 
        System.out.println("A la fin du tour, vous avez : " + this.cash + "€ et un total de " + this.recherche + " points de recherche.");
        System.out.println("Le tour " + this.turnNumber + " est maintenant terminé. Passons au tour suivant !");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        
        return true;
    }
    
    
    
   /////////////////////////////////////////////////////////////////////////
   /////////////////Methods for Decision and Observation///////////////
    
    
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
                child.setAmbition(Constantes.OUVRIER);
                child.setDegree(Degree.ELEMENTARY);
                break;
            case "police":
                child.setAmbition(Constantes.POLICIER);
                child.setDegree(Degree.HIGHSCHOOL);
                break;
            case "professor":
                child.setAmbition(Constantes.PROFESSEUR);
                child.setDegree(Degree.COLLEGE);
                break;
            case "scientist":
                child.setAmbition(Constantes.CHERCHEUR);
                child.setDegree(Degree.UNIVERSITY);
                break;
            default: 
                characterGestion();
                break;
        }
        System.out.println("");
    }
     
    /**
     * Regroups the gestion of all characters (affectation of children, check the number of policemen)
     */
    protected void characterGestion(){
        int i = 0;
        while (i < children.size()) {
            if (children.get(i).getAmbition()==null){
                // Code d'affectation de l'eleve à un type d'etudes
                this.affectation(children.get(i));
            }
            if (children.get(i).getAmbition()==children.get(i).getEducation()-1){
                // Code de fin d'études
                try {
                    House.addHabitant(houses, children.get(i));
                    
                    switch (children.get(i).getDegree()){
                    case ELEMENTARY:
                        Factory.addWorker(factories, new Worker(this.factories.get(this.factories.size()-1), Job.WORKER, children.get(i).name, children.get(i).surname, children.get(i).home));
                        children.remove(i);
                        break;
                    case HIGHSCHOOL:
                        this.office.policemen.add(new Police(this.office, Rank.AGENT, children.get(i).name, children.get(i).surname, children.get(i).home));
                        children.remove(i);
                        break;
                    case COLLEGE:
                        School.addProfessor(schools, new Professor(this.schools.get(this.schools.size()-1), Title.ENSEIGNANT, true, children.get(i).name, children.get(i).surname, children.get(i).home));
                        children.remove(i);
                        children.add(new Child(Name.randomName(), Surname.randomSurname(), null));
                        break;
                    case UNIVERSITY:
                        School.addScientist(schools, new Scientist(Title.ENSEIGNANT, Domain.randomDomain(), children.get(i).name, children.get(i).surname, children.get(i).home));
                        children.remove(i);
                        break;
                    default:
                }
                } catch (NoSpaceException e){}
                
                children.add(new Child(Name.randomName(), Surname.randomSurname(), null));
            }
            i++;
        }
        Integer criminals = this.inhabitants.size() - this.office.policemen.size()*Constantes.POLICE_HANDLE;
        if (criminals > 0){
            this.cash = this.cash-Constantes.CRIME_COST*criminals;
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
            try{
                fastQuit(keywords);
            } catch (QuitException e) {}
            switch (keywords){
                case "house":
                    if (this.houses.get(0).checkBuilding(recherche,cash)){
                        this.houses.get(0).create_building(houses);
                        cash = cash - Constantes.IMPROVE_HOUSE;
                        System.out.println("Vos comptes en banque maintenant est de :" + cash);
                    }
                    
                break;
                case "school":
                    if (this.schools.get(0).checkBuilding(recherche,cash)){
                        this.schools.get(0).create_building(schools);
                        update_values();
                    }
                break;
                case "factory":
                    if(this.factories.get(0).checkBuilding(recherche,cash)){
                        this.factories.get(0).create_building(factories);
                        update_values();
                    }
                break;
                case "finish": 
                    System.out.println("Vous sortez de la phase d'amelioration");
                    System.out.println("");
                    
                default : 
            }       
        }
        System.out.println("");
    }
    
    ////////////////////////////////////////////////////////////////////////
    ////////////// ////////////////////////////////////////////////////////
    /**
     * Prints the List of all implemented commands.
     */
    private void listOfCommands(){
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
     * Get help on 'infos' command
     */
    public void helpInfos(){
        System.out.println("La commande 'infos' permet de connaître le statut de chaque élément du jeu");
        System.out.println("'infos' seul vous donne le statut actuel de votre ville (argent et habitants)");
        System.out.println("'infos' accompagné du nom d'un élément du jeu vous donne le statut actuel de l'élément.");
        System.out.println("Argumuments disponibles:     'school', 'factory', 'house', city'");
        System.out.println("");
        
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
        this.listOfCommands();
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
        System.out.println("Vous avez "+ this.inhabitants.size() + " habitants dans votre ville");
        System.out.println("");
    }
    
    /**
     * Prints the description of the game
     */
    public void desc(){
        System.out.println("Civilism est un jeu issu d'un projet scolaire ISEN, réalisé par Quentin KAMENDA & Benoît PEPIN");
        System.out.println("");
    }
    
    
    /**
     * Throws an eception if the player has not enough money to buy an item.
     * @param cash
     * @param cost
     * @throws NotEnoughMoneyException 
     */
    public void checkMoney(Integer cash, Integer cost)
            throws NotEnoughMoneyException{
        if (cash-cost < 0){
            throw new NotEnoughMoneyException();
        }
    }

    
    /**
     * Updates the ressources of the player.
     * 
    **/
    public void update_values(){
        recherche =  recherche - Constantes.IMPROVE_SKILL;
        System.out.println("Vos points de recherches sont maintenant de : " + recherche);
        cash = cash - Constantes.IMPROVE_MONEY;
        System.out.println("Votre compte en banque est maintenant de : " + cash);
        System.out.println("");
    }
    /**
     * Give the worker's number in totality in your town to knoow how many cash you win.
     */
    public void worker_number(){
        int worker =0;
        for(int i = 0; i < factories.size(); i++){
            worker  = this.factories.get(i).getWorker().size() + worker;
            }
            this.work_worker = worker * Constantes.WORKER_MONEY;
    }
    
    /**
     * Print in your end of turn some actuality about your town
     */
    public void fin_tour(){
        System.out.println("A la fin du tour, vous avez : " + this.cash + "€ et un total de " + this.recherche + " points de recherche.");
        System.out.println("Le tour " + this.turnNumber + " est maintenant terminé. Passons au tour suivant !");
        texte_log("Votre argent est de : ",this.cash);
        texte_log("Vos points de recherch sont de : ", this.recherche);
        texte_log("Votre nombre d'habitant s'eleve a : ",this.inhabitants.size());
        this.worker_number();
        texte_log("Vos travailleurs vous rapporte ",this.work_worker);
        texte_log("L'entretien de vos batiments pour ce tour s'eleve a : ",Building.entretien(this));
        texte_log("Vous venez de terminer votre tour numero : ",turnNumber);
        texte_log("---------------------------------------------------------");
    }
    
    /////////////////////////STATIC METHODS////////////////////////////////////
    /**
     * Close and save your log
     * @throws IOException 
     */
     public static void close() throws IOException{
        writer.close();
    }
     
    /**
     * Add texte and Integer (convert Integer to String )in your in file.txt in you folder for log file
     * @param print
     * @param texte 
     */
     public static void texte_log(String print,Integer texte){
         try
        { 
       
        writer.write(String.valueOf(print + texte));
        writer.flush();
        writer.newLine();
        }
        catch (IOException e)
        {
            System.out.println("Impossible");
        }
    }
         
         /**
          * Add texte in file.txt in your folder for log file
          * @param texte 
          */
    public static void texte_log(String texte){
         try
        { 
            
        writer.write(texte);
        //writer.write("\r\n");  // PASSER UNE LIGNE 
        writer.flush();
        writer.newLine();
        }
        catch (IOException e)
        {
            System.out.println("Impossible");
        }
    }
     /**
     * Ends the game.
     * 
     */
    public static void gameOver(){
        System.out.println("--- GAME OVER ---");
        System.out.println("Vous allez manquer a " + Constantes.NARRATOR + "... Relancez une partie pour retrouver votre conseiller favori.");
        System.exit(0);
    }
    
    /**
     * Quits the game instantly
     * @param input
     * @throws QuitException 
     */
    public static void fastQuit(String input)
            throws QuitException{
        if ("quit".equals(input)){
            try {
                close();
            } catch (IOException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
            throw new QuitException();
        }
    }
    
    /**
     * Throws an exception if the player has not enough money to continue the game.
     * @param cash
     * @throws PoorException 
     */
    public static void moneyFail(Integer cash)
            throws PoorException{
        if (cash < Constantes.FAIL_MONEY){
            throw new PoorException();
        }
    }
    

    
}
