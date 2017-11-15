/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;


import java.util.ArrayList;

/**
 *
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class House extends Building{
    //habitant
    //Constantes.HOUSE_FULL;
    protected Integer habitant_number = 0;
    protected static Integer house_number = 0;
    
    ArrayList habitant = new ArrayList();

    public House(String adress, Integer price, Integer max_capacity) {
        super(adress, price, max_capacity);
    }

 
    
    public Boolean is_full(){
        if (this.habitant_number >=  Constantes.HOUSE_FULL){
            return true;
        }
        return false;
    }
    /*
    Info permet de connaître le nombre d'habitant de la maison et les personnages 
    */
    public void infos() {
        int i=1;
        // A remplacer apres pour lenght de la liste
        System.out.println("le nombre de d'habitant dans votre maison est de " + this.habitant_number);
        System.out.println("Il existe " + this.house_number + " maisons dans votre ville");
        while (i< this.habitant_number){
            //System.out.print(super.human.name + "" + super.human.surname);
        }   
    }
    
    public void description(){
        System.out.println("La maison est l'endroit où vivent les personnages");
        System.out.println("Une maison peut contenir " + Constantes.HOUSE_FULL + " au maximun ");
        System.out.println("Chaque personnage de votre jeu a besoin d'une maison sinon son mécontentement augmente");
        System.out.println("ATTENTION: Trop de mécontentement est mauvais dans la gestion de votre ville.");
    }
    
    
    
}
