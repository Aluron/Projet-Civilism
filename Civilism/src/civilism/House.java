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
public class House {
    //habitant
    //Constantes.HOUSE_FULL;
    protected Integer habitant_number = 0;

    public House() {
    }
 
    /*
    Info permet de connaître le nombre d'habitant de la maison et les personnages 
    */
    public void infos() {
        int i=1;
        // A remplacer apres pour lenght de la liste
        System.out.println(this.habitant_number);
        while (i< this.habitant_number){
            //System.out.print(super.human.name + "" + super.human.surname);
        }   
    }
    
    public void description(){
        System.out.println("La maison est l'endroit où vivent les personnages");
        System.out.println("");
    }
    
    
    
}
