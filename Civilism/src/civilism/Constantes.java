/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 * This Class contains all the Constants of the game. 
 * Possible improvement: Change these Vars to set the difficulty.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public class Constantes {
    
    

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
    /**
     * Capacity in scientists of a School.
     */
    public final static Integer SCHOOL_FULL_SCIENCE = 10;
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
    public final static Integer BEGIN_SEARCH = 10;
    /**
     * Lower limit of cash. 
     * Under this limit, the Game is Over.
     */
    public static final Integer FAIL_MONEY = -1000;
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
    
    
    
    //////////////House////////////////////////
    /**
     * Capacity (max of inhabitants) of a House.
     */
    public final static Integer HOUSE_FULL = 5; 
    
    
    
    ////////////Police_station//////////////////
    /**
     * Cash cost for the maintenance of the office
     */
    public final static Integer MAINTENANCE_OFFICE = 300 ; 
    /**
     * Cash per turn lose if you don't have enough Policeman
     */
    public final static Integer CRIME = 200;
    
    
    
    
    /////////////BUILDING///////////////////////
    /**
     * Unused cost of a burn.
     */
    public final static Integer RATE_BURN =90;
   
    
    
    ////////////Improvement////////////////////
    /**
     * 
     */
    public final static Integer IMPROVE_MONEY = 500;
    /**
     * 
     */
    public final static Integer IMPROVE_SKILL = 10;
    /**
     * 
     */
    public final static Integer IMPROVE_HOUSE = 400;
    
    
    
    
    
    
    
    
}
