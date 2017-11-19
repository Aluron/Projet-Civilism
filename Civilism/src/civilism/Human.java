/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 * The Human Class is the class representing every character.
 * It is the "mother" of the Child and the Adult class.
 * @author qkame
 */
public class Human{
    
    /**
     * True if alive, False if dead.
     */
    protected Boolean isAlive;
    
    /**
     * Name of a character.
     */
    protected Name name;
    /**
     * Surname of a character.
     */
    protected Name surname;
    /**
     * Age of the character (equivalent to his experience).
     */
    protected Integer age;
    //protected Aspect aspect;
    
    /**
     * House where the character lives.
     */
    public House home;
    /**
     * Father of the character.
     */
    public Adult father;
    /**
     * Mother of the character.
     */
    public Adult mother;
       
    
    /**
     * Simple SOUT function to make the character introduce himself.
     */
    private void introduce(){
        System.out.println(name + " : " + "Bonjour, je m'appelle " +  name + " " + surname +  ". J'ai " + age + "ans et vis au " + home);
    }
    
    /**
     * Simple SOUT function to make the character speak.
     * @param says 
     */
    private void parle(String says){
        System.out.println(name + " : " + says);
    }
    
    
}
