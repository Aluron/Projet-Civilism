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
 * Office is a class inheritate to building, Offise is a place where policeman work
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public class Office extends Building {
    
    protected Police commissaire ;
    public ArrayList<Police> policemen = new ArrayList();

    /**
     *Constructor to Office
     * @param commissaire
     * @param adress
     * @param name
     */
    public Office(Police commissaire, Adress adress, String name) {
        super(adress, name);

    }
    /**
     * Gets commissaire in this office
     * @return commissaire
     */
    public Police getCommissaire() {
        return commissaire;
    }
    /**
     * Sets commissaire in this office
     * @param commissaire the new commaissaire
     */
    public void setCommissaire(Police commissaire) {
        this.commissaire = commissaire;
    }
    /**
     * Gets poliman in this office
     * @return poliman
     */
    public ArrayList<Police> getPolicemen() {
        return policemen;
    }
    /**
     * Sets policeman in this office
     * @param policemen 
     */
    public void setPolicemen(ArrayList<Police> policemen) {
        this.policemen = policemen;
    }
    /**
     * gets adress in office inherite building
     * @return adress
     */
    @Override
    public Adress getAdress() {
        return adress;
    }
    
    /**
     * Sets new adress in office inherite building
     * @param adress the new adress
     */
    @Override
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    /**
     * Gets the name in office inherite building
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * Sets the new Name in office inherite building
     * @param name the new name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }



    /**
     * Infos permet d'afficher le nom du commissaire et et le nombre de policier
     */

    public void infos(){
        System.out.println("Le nom de votre commisariat est " + this.getName() );
        System.out.println("Vous avez " + this.policemen.size() + " dans votre commissariat");
        /*if (commissaire == null ){
            System.out.println("Il n'y à pas encore de commissaire");
        }
        else{
            System.out.println("Votre commaissaire porte le nom de " + this.commissaire.name + " " + commissaire.surname);
        } */
        System.out.println("L'entretien du commissariat coûte "  + Constantes.MAINTENANCE_OFFICE );
    }

    public static void description (){
            System.out.println("Le commissariat est l'endroit òu l'on trouve les policers en service");
            System.out.println("Les policers permettent de faire régner l'ordre dans la ville");
            System.out.println("Il faut un policier pour cinq habitants pour eviter la criminalité");
            System.out.println("La criminalite vaut " + Constantes.CRIME +" € par tour");
    }

    
}
