/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.characters;

import civilism.buildings.House;
import civilism.buildings.School;

/**
 * A Scientist is virtually here to improve the city, trought the improvement of the buildings.
 * The Scientist class inherits from the Adult class.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public class Scientist extends Adult{
    
    /**
     * School where the scientist works
     */
    public static School school;
    
    /**
     * Title of the scientist
     */
    public Title title;
    
    /**
     * Study domain of the scientist
     */
    protected Domain domain;

    /**
     * Constructor for the scientist class
     * @param title the title of the character
     * @param domain the domain of study of character
     * @param name the name of the character
     * @param surname the surname of the character
     * @param home the house where the character lives
     */
    public Scientist(Title title, Domain domain, Name name, Surname surname, House home) {
        super(name, surname, home);
        this.title = title;
        this.domain = domain;
    }
    
    /**
     * Gets the school where the scientist works
     * @return the school
     */
    public static School getSchool() {
        return school;
    }

    /**
     * Sets the school where the scientist works
     * @param school the new school
     */
    public static void setSchool(School school) {
        Scientist.school = school;
    }

    /**
     * Gets the title of the scientist
     * @return the title
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the title of the scientist
     * @param title the new title
     */
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * Gets the domain of the scientist
     * @return the study domain
     */
    public Domain getDomain() {
        return domain;
    }

    /**
     * Sets the study domain of the scientist
     * @param domain the new domain
     */
    public void setDomain(Domain domain) {
        this.domain = domain;
    }
    
    /**
     * Displays informatiosn on what a Scientist is.
     */
    public static void description (){
            System.out.println("Le scientifique a pour fonction de faire gagner des points de compétences.");
            System.out.println("Ces points de compétences vous permettent d'acheter d'autres maisons, usines ou écoles.");
    }
    
}
