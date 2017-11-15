/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 *
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class Constantes {
    
    
    /*
    INCIDENCE D AVOIR UN DIRECTEUR ET UN BOSS ??
    */
    
    //////////School///////////
    /**
     * Capacity (max of Students) of a School.
     */
    ////////////////////////////////////////
    ////protected final static Integer MIDDLE_SCHOOL_FULL=10;
    ////protected final static Integer BIG_SCHOOL_FULL=15;
    ///////////////////////////////////////////////////
    protected final static Integer SCHOOL_FULL=5;
    protected final static Integer MAINTENANCE_SCHOOL = 300 ; 
    
    
    //////////Game///////////////
    /**
     * Number of inhabitants at the benning of the Game.
     */
    protected final static Integer BEGIN_HUMAN = 4;
    /**
     * Number of buildings at the beggining of the Game
     */
    protected final static Integer BEGIN_BUILDING = 4;
    /**
     * Cash available at the beginning of the Game.
     */
    protected final static Integer BEGIN_MONEY = 10000;
    
    /**
     * Default name of the city
     */
    protected String NOM_DE_VILLE;    
    /**
     * Limit of turns. Past this limit, the Game is over
     */
    protected final static Integer TURN_LIMIT = 50;
    /**
     * Name of the Narrator/Advisor
     */
    public static final String NARRATOR = "Penultimo";
    
    ////////////Factory///////////////////////////
    /**
     * Capacity (max of Workers) of a Factory.
     */
    
    protected final static Integer COMPAGNY_FULL = 5; 
    protected final static Integer WORKER_MONEY = 100 ;
    protected final static Integer MAINTENANCE_FACTORY = 300 ;
    
   
    
    ////////////Police_station//////////////////
    
    
    //////////////House////////////////////////
    /**
     * Capacity (max of inhabitants) of a House.
     */
    protected final static Integer HOUSE_FULL = 5; 
    
        ////////////Police_station//////////////////
    protected final static Integer MAINTENANCE_OFFICE = 300 ; // SUPPOSER CONSTANTE
    
    /////////////BUILDING///////////////////////
    
    protected final static Integer RATE_BURN =90;
    /////////////////////////////////////////////
    ///////////protected final static Integer MOYEN_COMPANY =300;
    ///////////protected final static Integer GRAND_COMPANY =500;
    ///////////////////////////////////////////:
   
    
    
    
    ////////////Improvement////////////////////
    protected final static Integer IMPROVE_MONEY = 500;
    protected final static Integer IMPROVE_SKILL = 10;
    
    
    
    
    
    
    
}
