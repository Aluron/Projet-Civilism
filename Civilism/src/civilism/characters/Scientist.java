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
 * @author qkame
 */
public class Scientist extends Adult{
    
    public static School school;
    
    public Title title;
    protected Domain domain;

    public Scientist(Title title, Domain domain, Name name, Surname surname, House home) {
        super(name, surname, home);
        this.title = title;
        this.domain = domain;
    }
    
    public static void description (){
            System.out.println("Le scientifique à pour fonction de faire gagner des points de compétences ");
            System.out.println("Ces points de compétences vous permettent d'avoir d'autres maisons, d'autres usines ou d'autres écoles ");
    }
    
    public void search(){
        
    }
    
    public void promote(){
        
    }

    public static School getSchool() {
        return school;
    }

    public static void setSchool(School school) {
        Scientist.school = school;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }
    
    
    
}
