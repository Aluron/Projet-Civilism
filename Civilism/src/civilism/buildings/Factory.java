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
    
    protected Integer worker_number;
    protected Integer internNumber;
    protected Worker boss ;
    
    ArrayList worker = new ArrayList();

    public Factory(Worker boss, Adress adress, String name) {
        super(adress, name);
        this.worker_number = 0;
        this.boss = boss;
    }
    //////////////////////////////////////////////////////////////

    public Integer getWorker_number() {
        return worker_number;
    }

    public void setWorker_number(Integer worker_number) {
        this.worker_number = worker_number;
    }

    public Integer getInternNumber() {
        return internNumber;
    }

    public void setInternNumber(Integer internNumber) {
        this.internNumber = internNumber;
    }

    public Worker getBoss() {
        return boss;
    }

    public void setBoss(Worker boss) {
        this.boss = boss;
    }
    public ArrayList getWorker() {
        return worker;
    }

    public void setWorker(ArrayList worker) {
        this.worker = worker;
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
    
    
    /////////////////////////////////////////////////////////////

    
    /**
     * is_full permet de savoir si Factory est pleine ou pas
     * @return 
     */
    public Boolean is_full(){
        return this.worker.size() >=  Constantes.COMPAGNY_FULL;
    }
    // CEST QUOI CE BORLDE ICI ?
    
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
        if (i==factories.size()){
            System.out.println("ATTENTION: Il n'y a actuellement pas de place pour un nouvel ouvrier dans votre ville.");
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
