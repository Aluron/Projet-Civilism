/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import civilism.Constantes;
import civilism.Game;
import civilism.characters.Professor;
import civilism.characters.Worker;
import java.util.ArrayList;
import java.util.Vector;


/**
 *
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class Factory extends Building implements Improvement{
    
    protected static Integer total_worker_number;
    protected Integer worker_number;
    protected Worker boss ;
    
    protected static Integer number_factory;
    
    ArrayList worker = new ArrayList();

    public Factory(Worker boss, Adress adress, String name) {
        super(adress, name);
        this.worker_number = 0;
        this.boss = boss;
    }
    

    
    /**
     * is_full permet de savoir si Factory est pleine ou pas
     * @return 
     */
    public Boolean is_full(){
        return worker_number >=  Constantes.COMPAGNY_FULL;
    }
    // CEST QUOI CE BORLDE ICI ?
    
    /**
     * 
     * produce permet de retrouner le nombre d'argent que fait l'entreprise
     * @return INTEGER
     */
    public Integer produce(){
        return (Factory.total_worker_number * Constantes.WORKER_MONEY); //prend en compte toute les usines
    }
    /**
     * Calcule le rendement totale de l'usine (combien gagne - combien perdu)
     * @return Integer
     */
    public Integer account(){
        Integer output= Constantes.MAINTENANCE_FACTORY * Factory.number_factory;
        Integer input = produce();
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
        System.out.println("Le nombre de travalleur dans vos usine est de  " + Factory.total_worker_number);
        System.out.println("Le nombre de travailleur de cette usine est de " + this.worker_number);
        if (this.boss== null ){
            System.out.println("Il n'y à pas de patron dans votre usine");
        }
        System.out.println("Il existe un patron et c'est " + this.boss + " dans votre usine");
        System.out.println("Il y a un entretien dans votre usine et il est de : "+ Constantes.MAINTENANCE_FACTORY);  
  
    }
    /**
     * description permet de connaitre des informations de l'utilité d'un Factory
     */
    public static void description(){
        System.out.println("L'usine permet de rapporter de l'argent");
        System.out.println("L'usine est à sa pleine capacité à " + Constantes.COMPAGNY_FULL+ "mais vous pouvez avoir plusieurs usines");
        System.out.println("Chaque travailleur vous crée de la richesse d'une valeur de " + Constantes.WORKER_MONEY);
        System.out.println("Mais attention, il y a un coût d'entretien à votre usine" );
    }

    
    /**
     * Permet de savoir si un nouveau batiment peut-être crée
     * @param recherche
     * @param money
     * @return 
     */
    @Override
    public boolean checkBuilding(Integer recherche, Integer money) {
        if (recherche <= Constantes.IMPROVE_SKILL){
            System.out.println("Vous n'avez pas assez de point de recherche pour obtenir une nouvelle usine");
            return false;
        }
        if (money <= Constantes.IMPROVE_MONEY){
            System.out.println("Vous n'avez pas assez d'argent pour obtenir une nouvelle usine");
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public void create_building(Vector bulding) {
        System.out.println("Quel est le nom de votre nouvelle usine?");
        String keywords = Game.keyboard.nextLine();
        Factory factory = new Factory(null,Adress.RUE_DE_LA_PAIX,keywords);
        System.out.println("Vous venez de créer une usine");
        bulding.add(factory);
        
    }
    
    public static void addWorker(Vector<Factory> factories, Worker worker){
        int i = 0;
        while (i < factories.size()){
            if(!factories.elementAt(i).is_full()){
                factories.elementAt(i).worker.add(worker);
                return;
            }
            else {
                i++;
            }
        }
    }
    
}

    // PERMET LA CREATION D UN DICO VOIR AVEC MOREL --> MAP

/*
    public Integer correspondance (){
        if(this.actual_compagny == "petite"){
            return Constantes.SMALL_SCHOOL_FULL;
        }
        if(this.actual_compagny=="moyenne"){
            return Constantes.MIDDLE_SCHOOL_FULL;
        }
        if(this.actual_compagny == "grande"){
            return Constantes.BIG_SCHOOL_FULL;
        }    
        return -1;
    }

   public Integer account(){
        Integer output= correspondance();
        Integer input = produce();
        if (this.actual_compagny == "petite"){
            output = Constantes.PETIT_COMPANY;
        }
        if (this.actual_compagny == "moyenne"){
            output = Constantes.MOYEN_COMPANY;
        }
        if (this.actual_compagny == "grande"){
            output = Constantes.GRAND_COMPANY;
        }
        return (input - output);
        
    }
    
*/
