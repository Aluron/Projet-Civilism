/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

import java.util.Hashtable;

/**
 *
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class Factory {
    
    protected Integer worker_number;
    protected Worker boss ;
    //Constantes.WORKSHOP
    protected static String size; //La taille est améliorable à tout l'object
    protected String actuel_compagny = "petite";
    
    
    /**
     * is_full permet de savoir si Factory est pleine ou pas
     * @return 
     */
    public Boolean is_full(){
        if (worker_number ==  Constantes.WORKSHOP_FULL){
            return true;
        }
        return false;
    }
    
    
    /**
     * 
     * produce permet de retrouner le nombre d'argent que fait l'entreprise
     * @return INTEGER
     */
    public Integer produce(){
        return (this.worker_number * Constantes.WORKER_MONEY);
    }
    
    public Integer account(){
        Integer output=0;
        Integer input = produce();
        if (this.actuel_compagny == "petite"){
            output = Constantes.PETIT_COMPANY;
        }
        if (this.actuel_compagny == "moyenne"){
            output = Constantes.MOYEN_COMPANY;
        }
        if (this.actuel_compagny == "grande"){
            output = Constantes.GRAND_COMPANY;
        }
        return (input - output);
        
    }
    
    
    
    
    
    
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    /**
     * infos permet de connaitre des informations à propos de l'object Factory
     */
    public void infos() {
        int i=1;
        // A remplacer apres pour lenght de la liste
        System.out.println("Le nombre de travalleur dans votre usine est de  " + this.worker_number);
        if (this.boss== null ){
            System.out.println("Il n'y à pas de patron dans votre usine");
        }
        System.out.println("Il existe un patron et c'est " + this.boss + " dans votre usine");
        System.out.println("Votre Usine est de taille " + this.size );
          System.out.println("Il y a un entretien dans votre usine et il est de : "+ Constantes.MAINTENANCE_FACTORY);  
  
    }
    /**
     * description permet de connaitre des informations de l'utilité d'un Factory
     */
    public void description(){
        System.out.println("L'usine permet de rapporter de l'argent");
        System.out.println("L'usine est à sa pleine capacité à " + this.actuel_compagny + "mais peut être améliorable si vous n'avez pas encore GRANDE_COMPAGNY");
        System.out.println("Chaque travailleur vous crée de la richesse d'une valeur de " + Constantes.WORKER_MONEY);
        System.out.println("Mais attention, il y a un coût d'entretien à votre usine" );
    }
    
    
    
    
    
    
    // PERMET LA CREATION D UN DICO VOIR AVEC MOREL Hashtable dico =new Hashtable();
    
    
    
    
    
    
}
