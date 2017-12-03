/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.characters;

import civilism.buildings.House;
import civilism.buildings.Office;

/**
 * The Police is virtually here to maintain the Law&Order in the city.
 * The Police class inherits from the Adult Class.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public class Police extends Adult{
    
    /**
     * THe police office where the police man works.
     */
    public Office office;
    
    /**
     * The current rank of the police man.
     */
    public Rank rank;
    
    /**
     * Constructor for the Police class.
     * @param office the work place of the character
     * @param rank the rank of the character
     * @param name the name of the character
     * @param surname the surname of the character
     * @param home the house where the character lives
     */
    public Police(Office office, Rank rank, Name name, Surname surname, House home) {
        super(name, surname, home);
        this.office = office;
        this.rank = rank;
    }
    
    /**
     * Gets the office where the character lives
     * @return the office
     */
    public Office getOffice() {
        return office;
    }

    /**
     * Sets the office of the policeman
     * @param office the new office
     */
    public void setOffice(Office office) {
        this.office = office;
    }

    /**
     * Gets the rank of the policeman
     * @return the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Sets the new rank of the policeman
     * You can also use the 'promote' method in this class
     * @param rank thenew rank
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }
    
    /**
     * Displays informations of what a Police object is
     */
    public static void description (){
            System.out.println("Le Policier sert au maintien de l'ordre.");
            System.out.println("Il travaille dans un commisseriat.");
            System.out.println("Pas assez de policiers et trop de mécontentement de la population peut-être un danger pour votre ville.");
    }
    
    /**
     * Promotes a Police man to a new rank
     * @param rank the new rank
     */
    public void promote(Rank rank){
        System.out.println(name + " " + surname + " a été promu " + rank + " après " + experience + " années de service.");
        this.rank = rank;
    }

    
    
    
}
