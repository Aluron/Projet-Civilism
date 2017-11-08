/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 *
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class Office {
    
    protected Integer policeman_number = 0;
    protected Police commissaire ;
    
    
    public void infos(){
        System.out.println("Vous avez " + this.policeman_number + " dans votre commissariat");
        if (commissaire != null ){
            System.out.println("Il n'y à pas encore de commissaire");
        }
        else{
            System.out.println("Votre commaissaire porte le nom de " + commissaire.name + " " + commissaire.surname);
        }
    }
    
    
}
