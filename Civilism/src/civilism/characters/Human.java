/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.characters;

import civilism.buildings.House;

/**
 * The Human Class is the class representing every character.
 * It is the "mother" of the Child and the Adult class.
 * Since no Human can be anything else than Child or Adult, this class is implemented as abstact.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 */
public abstract class Human{
    
    /**
     * True if alive, False if dead.
     */
    protected Boolean isAlive;
    /**
     * Name of a character.
     */
    public Name name;
    /**
     * Surname of a character.
     */
    public Surname surname;
    /**
     * Age of the character (equivalent to his experience).
     */
    protected Integer age;
    //protected Aspect aspect; IMPROVEMENT
    
    /**
     * House where the character lives.
     */
    public House home;
    /**
     * Father of the character.
     * UNUSED
     */
    //public Adult father; IMPROVEMENT
    /**
     * Mother of the character.
     * UNUSED
     */
    //public Adult mother; IMPROVEMENT

    /**
     * Constructor for an Object Character.
     * @param name The Name of the character
     * @param surname The Surname of the character
     * @param home The house where the character lives
     */
    public Human(Name name, Surname surname, House home) {
        this.name = name;
        this.surname = surname;
        this.home = home;
        //this.father = father;
        //this.mother = mother;
        this.isAlive = true;
    }
    

    /**
     * Gets the status of the character 
     * Alive/Dead
     * @return True if Alive; False if Dead
     */
    public Boolean getIsAlive() {
        return isAlive;
    }
    /**
     * Sets the status of the character
     * @param isAlive True if alive; False if dead
     */
    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }
    /**
     * Gets the name of the character
     * @return the name of the character
     */
    public Name getName() {
        return name;
    }
    /**
     * Sets the name of the character
     * @param name the name of the character
     */
    public void setName(Name name) {
        this.name = name;
    }
    /**
     * Gets the surname of the character
     * @return the surname of the character
     */
    public Surname getSurname() {
        return surname;
    }
    /**
     * Sets the surname of the character
     * @param surname the surname of the character
     */
    public void setSurname(Surname surname) {
        this.surname = surname;
    }
    /**
     * Gets the age of the character
     * @return the age of the character
     */
    public Integer getAge() {
        return age;
    }
    /**
     * Sets the age of the character
     * @param age the age of the character
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    /**
     * Gets the home of the character
     * @return the home of the character
     */
    public House getHome() {
        return home;
    }
    /**
     * Sets the Home of the character
     * @param home the home of the character
     */
    public void setHome(House home) {
        this.home = home;
    }
       
    
    
    
    /**
     * Simple SOUT function to make the character introduce himself.
     * UNUSED
     */
    private void introduce(){
        System.out.println(name + " : " + "Bonjour, je m'appelle " +  name + " " + surname +  ". J'ai " + age + "ans et vis au " + home);
    }
    
    /**
     * Simple SOUT function to make the character speak.
     * UNUSED
     * @param says the sentence the character has to say
     */
    private void parle(String says){
        System.out.println(name + " : " + says);
    }
    
    
}
