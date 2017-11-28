/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.characters;

import civilism.buildings.House;

/**
 * The Adult class is the main Character Class.
 * It extends the Human class and is the "mother" of the functionnal character classes (Scientist, Professor, Worker & Police)
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 */
public class Adult extends Human{
    
    /**
     * Family vars.
     * UNUSED
     */
    //public Adult partner;
    //public Child child;
    
    public static Integer experience;
    
    /**
     * Sadly, an adult can die. This is a simple SOUT function announcing the death of the character.
     * UNUSED
     */
    public void die(){
        System.out.println("La ville est en deuil aujourd'hui. " + name + " " + surname + " est mort à l'âge de " + age + ".");       
    }

    /**
     * Constructor for a object of Adult type.
     * @param name Name of the character
     * @param surname Surname of the character
     * @param home Place where the character lives
     */
    public Adult(Name name, Surname surname, House home) {
        super(name, surname, home);
    }
    
    /**
     * Displays help on what a Human is.
     */
     public static void description (){
            System.out.println("L'adulte est un enfant qui a fini sa formation ");
            System.out.println("A la fin de sa formation devient un adulte à voué à un travail soit :");
            System.out.println("- Policier");
            System.out.println("- travailleur à l'usine");
            System.out.println("- professeur");
            System.out.println("- chercheur");
    }


     /**
      * Getter for the experience of the character
      * @return the experience of the character
      */
    public static Integer getExperience() {
        return experience;
    }

    /**
     * Sets the experience of a character
     * @param experience the new experience of the character
     */
    public static void setExperience(Integer experience) {
        Adult.experience = experience;
    }

     
     
}