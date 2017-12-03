/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import civilism.*;
import civilism.characters.*;
import civilism.exceptions.NoSpaceException;
import java.util.ArrayList;

/**
 * House is a inheritante to building, house is a class where all the habitant live
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public class House extends Building implements Improvement{
    //habitant
    //Constantes.HOUSE_FULL;
    ArrayList habitant = new ArrayList();

    /**
     * Constructor for House
     * @param adress 
     */
    public House(Adress adress) {
        super(adress);
    }

    //////////////////////////////////////////////////////////////////
    /**
     * Gets habitant in house 
     * @return habitant
     */
    public ArrayList getHabitant() {
        return habitant;
    }
    /**
     * Sets the new habitant in factory
     * @param habitant the new habitant
     */
    public void setHabitant(ArrayList habitant) {
        this.habitant = habitant;
    }
    /**
     * Gets adress in factory inherite building
     * @return adress the new adress
     */
    @Override
    public Adress getAdress() {
        return adress;
    }
    /**
     * Sets the new adress in factory inherite building
     * @param adress 
     */
    @Override
    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    /**
     * Gets name in factory inherite building
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * Sets the new Adress in factory inherite building
     * @param name the new name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    
    ///////////////////////////////////////////////////////////////
/**
 * Check if your House is full
 * @return boolean
 */
    public boolean is_full(){
        return this.habitant.size() >=  Constantes.HOUSE_FULL;
    }
/**
 * Info permet de connaître le nombre d'habitant de la maison et les personnages
     * @param name
 */
    public void infos(Integer name) {
        int i=0;
        // A remplacer apres pour lenght de la liste
        System.out.println("Le nom de votre maison est HOUSE " + name );
        System.out.println("le nombre de d'habitant dans votre maison est de " + this.habitant.size());
        System.out.println("Cette maison est a l'adresse : " +  this.getAdress());
        while (i< this.habitant.size()){
            //System.out.print(super.human.name + "" + super.human.surname);
        }   
    }
    
    /**
     * Permet de décrire l'utilité de la maison
     */
    public static void description(){
        System.out.println("La maison est l'endroit où vivent les personnages");
        System.out.println("Une maison peut contenir " + Constantes.HOUSE_FULL + " au maximun ");
        System.out.println("Chaque personnage de votre jeu a besoin d'une maison sinon il mourra de froid, WINTER IS COMING");
    }
    /**
     * Create a new house in the game
     * @param bulding 
     */
    @Override
    public void create_building(ArrayList bulding){
        House house = new House(Adress.RUE_DE_LA_PAIX);
        System.out.println("Vous venez de créer une maison");
        bulding.add(house);
    }
    /**
     * Chech if you can create a new house
     * @param recherche
     * @param money
     * @return 
     */
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
    
    /**
     * Add a new habitant in houses if you can
     * @param houses
     * @param human
     * @throws NoSpaceException 
     */
    public static void addHabitant(ArrayList<House> houses, Human human)
            throws NoSpaceException{
        int i = 0;
        while (i < houses.size()){
            if(!houses.get(i).is_full()){
                houses.get(i).habitant.add(human);
                return;
            }
            else {
                i++;
            }
        }
        if (i==houses.size()){
            throw new NoSpaceException();
        }
    }
 
}
