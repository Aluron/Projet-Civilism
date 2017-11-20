/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 * The child class is the pre-Adult class.
 * The "Child" character is a character that is slowly becoming an adult by going to school.
 * @author qkame
 */
public class Child extends Human{
    
    /**
     * Number of years already studied by the child.
     */
    protected Integer education;
    /**
     * Class degree the child attends.
     */
    protected Degree degree;
    
    public void findTreasure(){
        // event trouver un trésor
    }
    
    /**
     * Simple SOUT function to announce the birth of the child.
     */
    public void born(){
        System.out.println("Félicitations! " + name + surname + "est né! Ses parents " 
            + father.name + " & " + mother.name + " sont ravis!");
    }
    
    /**
     * Represents the fact that the child passes an educational year (Increments the eductation Var).
     */
    public void study(){
        this.education++;
    }
    
    /**
     * The child becomes an adult. Deletes the Object to create his equivalent as an Adult.
     */
    public void becomeAdult(){
        // Delete the object "Child" and create an object "Adult"
        
        System.out.println("");
        
    }
}
