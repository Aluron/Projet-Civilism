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
 * @author qkame
 */
public class Worker extends Adult{
    
    private static final Integer PRODUCTION = 300;
    
    public Factory factory;
    public Job job;

    public Worker(Factory factory, Job job, Name name, Surname surname, House home) {
        super(name, surname, home);
        this.factory = factory;
        this.job = job;
    }
    
    public static void description (){
            System.out.println("Un travailleur à l'usine vous permet d'obtenir de l'argent ");
            System.out.println("Pour chaque travalleur vous gagné : " + Constantes.WORKER_MONEY);      
    }
    
    
    public void work(){
        
    }
    
    public void promote(){
        
    }
    
    public void retire(){
        
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
    

    
    
}
