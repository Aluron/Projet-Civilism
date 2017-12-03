/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import civilism.Constantes;
import civilism.Game;
import civilism.characters.Worker;
import java.util.ArrayList;


/**
 * Factory is a inheritante to building, factory is a class where the workers work
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */

public class Factory extends Building implements Improvement{
   
    protected Worker boss ;
    
    ArrayList worker = new ArrayList();
/**
 * Constructor for Factory
 * @param boss
 * @param adress
 * @param name 
 */
    public Factory(Worker boss, Adress adress, String name) {
        super(adress, name);
        this.boss = boss;
    }
    //////////////////////////////////////////////////////////////
/**
 * Gets the boss in factory
 * @return boss
 */
    public Worker getBoss() {
        return boss;
    }
/**
 * Sets the boss in factory
 * @param boss the new boss
 */
    public void setBoss(Worker boss) {
        this.boss = boss;
    }
    /**
     * Gets the worker in factory
     * @return worker
     */
    public ArrayList getWorker() {
        return worker;
    }
    /**
     * Sets the worker in factory
     * @param worker  the new worker
     */
    public void setWorker(ArrayList worker) {
        this.worker = worker;
    }
    /**
     * Gets adress in factory inherite building
     * @return adress
     */
    @Override
    public Adress getAdress() {
        return adress;
    }
    /**
     * Sets the new adress in factory inherite building
     * @param adress the new adress
     */
    @Override
    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    /**
     * Gets name in factory inherite building
     * @return 
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the new name in factory inherite building
     * @param name the new name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    
    /////////////////////////////////////////////////////////////

    
    /**
     * is_full permit to know if this factory is full
     * @return 
     */
    public Boolean is_full(){
        return this.worker.size() >=  Constantes.COMPAGNY_FULL;
    }
    
    /**
     * 
     * produce permet de retrouner le nombre d'argent que fait l'entreprise
     * @param game
     * @return INTEGER
     */
    public Integer produce(Game game){
        return (game.factories.size() * Constantes.WORKER_MONEY); //prend en compte toute les usines
    }
    
    /**
     * Calcule le rendement totale de l'usine (combien gagne - combien perdu)
     * @param game
     * @return Integer
     */
    public Integer account(Game game){
        Integer output= Constantes.MAINTENANCE_FACTORY * game.factories.size();
        Integer input = produce(null);
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
        System.out.println("Le nom de votre usine est : " + this.getName());
        System.out.println("Le nombre de travailleur de cette usine est de " + worker.size());
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
        System.out.println("L'usine est à sa pleine capacité à " + Constantes.COMPAGNY_FULL+ " mais vous pouvez avoir plusieurs usines");
        System.out.println("Chaque travailleur vous crée de la richesse d'une valeur de " + Constantes.WORKER_MONEY);
        System.out.println("Mais attention, il y a un coût d'entretien à votre usine" );
    }

    
    /**
     * Check if is possible the create a new factory
     * @param recherche
     * @param money
     * @return boolean
     */
    @Override
    public boolean checkBuilding(Integer recherche, Integer money) {
        if (Constantes.IMPROVE_SKILL <= recherche ){
            System.out.println("Vous n'avez pas assez de point de recherche pour obtenir une nouvelle usine");
            return false;
        }
        if (Constantes.IMPROVE_MONEY <= money){
            System.out.println("Vous n'avez pas assez d'argent pour obtenir une nouvelle usine");
            return false;
        }
        else{
            return true;
        }
    }
    /**
     * Create a new factory in the game
     * @param bulding 
     */
    @Override
    public void create_building(ArrayList bulding) {
        System.out.println("Quel est le nom de votre nouvelle usine?");
        String keywords = Game.keyboard.nextLine();
        Factory factory = new Factory(null,Adress.RUE_DE_LA_PAIX,keywords);
        System.out.println("Vous venez de créer une usine");
        bulding.add(factory);
        
    }
    /**
     * Add worker where you can
     * @param factories
     * @param worker 
     */
    public static void addWorker(ArrayList<Factory> factories, Worker worker){
        int i = 0;
        
        while (i < factories.size()){
            if(!factories.get(i).is_full()){
                factories.get(i).worker.add(worker);
                return;
            }
            else {
                i++;
            }
        }
        if (i==factories.size()){
            System.out.println("ATTENTION: Il n'y a actuellement pas de place pour un nouvel ouvrier dans votre ville, ce personnage est perdu. \n");
        }
    }
    
}