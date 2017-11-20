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
public abstract class Human{
    
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
    protected Surname surname;
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
    //public Adult father;
    /**
     * Mother of the character.
     */
    //public Adult mother;

    /**
     * Constructor for an Object Character.
     * @param name The Name of the character
     * @param surname The Surname of the character
     * @param home The house where the character lives
     * @param mother The mother of the character
     */
    public Human(Name name, Surname surname, House home) {
        this.name = name;
        this.surname = surname;
        this.home = home;
        //this.father = father;
        //this.mother = mother;
        this.isAlive = true;
    }

    public Boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Surname getSurname() {
        return surname;
    }

    public void setSurname(Surname surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public House getHome() {
        return home;
    }

    public void setHome(House home) {
        this.home = home;
    }
       
    
    
    
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
