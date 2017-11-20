/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 * The Workers are the characters thet produce for the city. The "create" money.
 * The Worker class inherits from the Adult class.
 * @author qkame
 */
public class Worker extends Adult{
    
    private static final Integer PRODUCTION = 300;
    
    public Factory factory;
    public Job job;

    public Worker(Factory factory, Job job, Name name, Name surname, House home) {
        super(name, surname, home);
        this.factory = factory;
        this.job = job;
    }
    
    
    
    public void work(){
        
    }
    
    public void promote(){
        
    }
    
    public void retire(){
        
    }
    
    public void protest(){
        
    }
    
}
