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
 * 
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class House extends Building implements Improvement{
    //habitant
    //Constantes.HOUSE_FULL;
    ArrayList habitant = new ArrayList();

    public House(Adress adress) {
        super(adress);
        //name = "house".concat(House.house_number.toString());
    }
 //////////////////////////////////////////////////////////////////

    public ArrayList getHabitant() {
        return habitant;
    }

    public void setHabitant(ArrayList habitant) {
        this.habitant = habitant;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    ///////////////////////////////////////////////////////////////
    
    public Boolean is_full(){
        return this.habitant.size() >=  Constantes.HOUSE_FULL;
    }
/**
 * Info permet de connaître le nombre d'habitant de la maison et les personnages 
 */
    public void infos() {
        int i=0;
        // A remplacer apres pour lenght de la liste
        System.out.println("le nombre de d'habitant dans votre maison est de " + this.habitant.size());
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
        System.out.println("Chaque personnage de votre jeu a besoin d'une maison sinon son mécontentement augmente");
        System.out.println("ATTENTION: Trop de mécontentement est mauvais dans la gestion de votre ville.");
    }
    
    @Override
    public void create_building(ArrayList bulding){
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
