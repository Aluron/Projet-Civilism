/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import civilism.Constantes;
import civilism.characters.Police;
import java.util.ArrayList;

/**
 *
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class Office extends Building {
    
    /**
     *
     */
    protected static Integer policeman_number = 0;  // Il existe qu'un object commissariat mais il peut s'ameliorer

    /**
     *
     */
    protected Police commissaire ;
    
    /**
     *
     */
    public ArrayList<Police> policemen = new ArrayList();

    /**
     *
     * @param commissaire
     * @param adress
     * @param name
     */
    public Office(Police commissaire, Adress adress, String name) {
        super(adress, name);
        this.commissaire = commissaire;
    }

    

    /*
    Infos permet d'afficher le nom du commissaire et et le nombre de policier
    */

    /**
     *
     */

    public void infos(){
        System.out.println("Vous avez " + policeman_number + " dans votre commissariat");
        if (commissaire == null ){
            System.out.println("Il n'y à pas encore de commissaire");
        }
        else{
            System.out.println("Votre commaissaire porte le nom de " + this.commissaire.name + " " + commissaire.surname);
        } 
        System.out.println("L'entretien du commissariat coûte "  + Constantes.MAINTENANCE_OFFICE );
    }
    /*
    Affiche l'utilité du commissariat
    */

    /**
     *
     */

    public static void description (){
            System.out.println("Le commissariat est l'endroit òu l'on trouve les policers en service");
            System.out.println("Les policers permettent de faire régner l'ordre dans la ville");
            System.out.println("Pas assez de policiers et trop de mécontentement de la population peut-être un danger pour votre ville.");
    }

    //////Qu'es que c'était?///////

    /**
     *
     */
    public void rapport (){
        
    }
    
}
