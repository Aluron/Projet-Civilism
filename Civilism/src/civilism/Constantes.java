/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 * This Class contains all the Constants of the game. 
 * Possible imprivement: Change these Vars to set the difficulty.
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class Constantes {
    
    
    /*
    INCIDENCE D AVOIR UN DIRECTEUR ET UN BOSS ??
    */
    //////////Child.///////////////////////
    /**
     * Number of years required to become a worker.
     */
    public final static Integer OUVRIER=1;
    /**
     * Number of years required to become a policeman.
     */
    public final static Integer POLICIER=3;
    /**
     * Number of years required to become a professor.
     */
    public final static Integer PROFESSEUR=5;
    /**
     * Number of years required to become a scientist.
     */
    public final static Integer CHERCHEUR=5;
    
 
    //////////School///////////
    /**
     * Capacity (max of Students) of a School.
     */
    public final static Integer SCHOOL_FULL=5;
    ////////////////////////////////////////
    ////public final static Integer MIDDLE_SCHOOL_FULL=10;
    ////public final static Integer BIG_SCHOOL_FULL=15;
    ///////////////////////////////////////////////////
    
    /**
     * Number of cash for maintenance about School
     */
    public final static Integer MAINTENANCE_SCHOOL = 300 ; 
    
    
    //////////Game///////////////
    
    /**
     * Number of inhabitants at the benning of the Game.
     */
    public final static Integer BEGIN_HUMAN = 4;
    /**
     * Number of buildings at the beggining of the Game
     */
    public final static Integer BEGIN_BUILDING = 4;
    /**
     * Cash available at the beginning of the Game.
     */
    public final static Integer BEGIN_MONEY = 10000;
    /**
     * Default search at the beginning of the game
     */
    public final static Integer BEGIN_SEARCH = 0;
    
    /**
     * Default name of the city
     */
    public String NOM_DE_VILLE;    
    /**
     * Limit of turns. Past this limit, the Game is over
     */
    public final static Integer TURN_LIMIT = 50;
    /**
     * Name of the Narrator/Advisor
     */
    public static final String NARRATOR = "Penultimo";
    
    ////////////Factory///////////////////////////
    
    /**
     * Capacity (max of Workers) of a Factory.
     */
    public final static Integer COMPAGNY_FULL = 5; 
    /**
     * Number of cash win about worker
     */
    public final static Integer WORKER_MONEY = 100 ;
    /**
     * Number of cash for maintenance about Factory
     */
    public final static Integer MAINTENANCE_FACTORY = 300 ;
    
    ////////////Police_station//////////////////
    
    
    //////////////House////////////////////////
    /**
     * Capacity (max of inhabitants) of a House.
     */
    public final static Integer HOUSE_FULL = 5; 
    
        ////////////Police_station//////////////////
    public final static Integer MAINTENANCE_OFFICE = 300 ; // SUPPOSER CONSTANTE
    
    /////////////BUILDING///////////////////////
    
    public final static Integer RATE_BURN =90;
    /////////////////////////////////////////////
    ///////////public final static Integer MOYEN_COMPANY =300;
    ///////////public final static Integer GRAND_COMPANY =500;
    ///////////////////////////////////////////:
   
    
    
    
    ////////////Improvement////////////////////
    public final static Integer IMPROVE_MONEY = 500;
    public final static Integer IMPROVE_SKILL = 10;
    public final static Integer IMPROVE_HOUSE = 400;
    
    
    
    
    
    
    
    
}
