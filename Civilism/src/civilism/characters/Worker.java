/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.characters;

import civilism.Constantes;
import civilism.buildings.Factory;
import civilism.buildings.House;

/**
 * The Workers are the characters thet produce for the city. The "create" money.
 * The Worker class inherits from the Adult class.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public class Worker extends Adult{

    /**
     * The factory where the worler works
     */
    public Factory factory;
    
    /**
     * The Job title of the worker
     */
    public Job job;

    /**
     * Constructor for a worker object
     * @param factory the factory where the worker works
     * @param job the job title of the worker
     * @param name the name of the character
     * @param surname the surname of the character
     * @param home the house where the character lives
     */
    public Worker(Factory factory, Job job, Name name, Surname surname, House home) {
        super(name, surname, home);
        this.factory = factory;
        this.job = job;
    }
    
    /**
     * Displays the informations on what a worker is.
     */
    public static void description (){
            System.out.println("Un travailleur a l'usine vous permet d'obtenir de l'argent ");
            System.out.println("Pour chaque travalleur vous gagnez : " + Constantes.WORKER_MONEY + " par tour.");      
    }
    
    /**
     * Gets the factory where the worker works
     * @return the factory
     */
    public Factory getFactory() {
        return factory;
    }

    /**
     * Sets the factory where the worker works
     * @param factory the new factory
     */
    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    /**
     * Gets the job title of the worker
     * @return the job title
     */
    public Job getJob() {
        return job;
    }

    /**
     * Sets the job title of the worker
     * @param job the job title
     */
    public void setJob(Job job) {
        this.job = job;
    }
    

    
    
}
