/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import civilism.*;
import civilism.characters.*;
import civilism.buildings.*;
import civilism.exceptions.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 * 
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class House extends Building implements Improvement{
    //habitant
    //Constantes.HOUSE_FULL;
    protected Integer habitant_number = 0;
    protected static Integer house_number = 1;
    
    
    
    ArrayList habitant = new ArrayList();

    public House(Adress adress) {
        super(adress);
        name = "house".concat(House.house_number.toString());
        this.name = name;
    }
 
    
    public Boolean is_full(){
        return this.habitant_number >=  Constantes.HOUSE_FULL;
    }
/**
 * Info permet de connaître le nombre d'habitant de la maison et les personnages 
 */
    public void infos() {
        int i=1;
        // A remplacer apres pour lenght de la liste
        System.out.println("le nombre de d'habitant dans votre maison est de " + this.habitant_number);
        System.out.println("Il existe " + House.house_number + " maisons dans votre ville");
        while (i< this.habitant_number){
            //System.out.print(super.human.name + "" + super.human.surname);
        }   
    }
    
    /**
     * Permet de décrire l'utilité de la maison
     */
    public static void description(){
        System.out.println("La maison est l'endroit où vivent les personnages");
        System.out.println("Une maison peut contenir " + Constantes.HOUSE_FULL + " au maximun ");
        System.out.println("Chaque personnage de votre jeu a besoin d'une maison sinon son mécontentement augmente");
        System.out.println("ATTENTION: Trop de mécontentement est mauvais dans la gestion de votre ville.");
    }
    
    @Override
    public void create_building(Vector bulding){
        House house = new House(Adress.RUE_DE_LA_PAIX);
        System.out.println("Vous venez de créer une maison");
        bulding.add(house);
    }

    @Override
    public boolean checkBuilding(Integer recherche, Integer money) {
        if (money <= Constantes.IMPROVE_HOUSE){
            System.out.println("Vous n'avez pas les fonds suffisants pour acheter une nouvelle maison.");
            return false;
        }
        else {
            return true;
        }
    }
    
 
}
