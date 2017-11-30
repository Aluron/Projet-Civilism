/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import civilism.*;
import civilism.characters.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class School extends Building implements Improvement{
    protected static Integer teacher_number;
    protected Professor directeur;
    ArrayList eleve = new ArrayList();
    ArrayList teachers = new ArrayList();
    ArrayList scientists = new ArrayList();
    protected static Integer number_school = 1;  //Si nouvel object créé, implémenter la variable

    
    
    public School(Professor directeur, Adress adress, String name) {
        super(adress, name);
        this.directeur = directeur;
    }
    
 
    
/////////////////////////////////////////////////////////////
    /////////////////////////////////////////////

    /**
     * Regarde si l'école est pleine
     * @return boolean
     */
    public boolean is_full(){
        if (this.teachers.size() >= Constantes.SCHOOL_FULL){
            return (true);
        }
        return (false);
    }
    
    private boolean is_full_science() {
        if (this.scientists.size() >= Constantes.SCHOOL_FULL_SCIENCE){
            return (true);
        }
        return (false);
    }
    
    /**
     * Permet de récuperer les informations liés à l'object School
     */
      public void infos() {
        int i=1;
        // A remplacer apres pour lenght de la liste
        System.out.println("Le nombre de professeurs dans " + this.name + " est de " + this.teachers.size());
        System.out.println("Le nombre de travailleur dans vos ecoles est de " + this.teachers.size());

        if (this.directeur== null ){
            System.out.println("Il n'y à pas de directeur dans votre école ");
        }
        else{
            System.out.println("Il existe un directeur dans votre école et c'est " + this.directeur );
        }
        System.out.println("Il y a un entretien pour votre école et il s'élève à : "+ Constantes.MAINTENANCE_SCHOOL);  
    }
      
      
    /**
     * description permet de connaitre des informations de l'utilité d'un Factory
     */
    public static void description(){
        System.out.println("L'école est le lieu ou les élèves apprennent leur futur métier");
        System.out.println("L'école à pour capacité " + Constantes.SCHOOL_FULL + "mais vous pouvez en avoir plusieurs");
        System.out.println("Chaque professeur peut avoir un et seulement un élève pendant sa période de formation " );
        System.out.println("Une formation est plus ou moins longue selon la formation de l'élève");
        System.out.println("Mais attention, il y a un coût d'entretien à votre école" );
    }
    
    
    
    /**
     * Permet de savoir si un nouveau batiment peut-être crée
     * @param recherche
     * @param money
     * @return 
     */
    @Override
    public boolean checkBuilding(Integer recherche, Integer money) {
        System.out.println("recherche" + recherche);
        System.out.println("Constantes"+Constantes.IMPROVE_SKILL);
        if (recherche < Constantes.IMPROVE_SKILL){
            System.out.println("Vous n'avez pas assez de point de recherche pour obtenir une nouvelle école");
            return false;
        }
        if (money < Constantes.IMPROVE_MONEY){
            System.out.println("Vous n'avez pas assez d'argent pour obtenir une nouvelle école");
            return false;
        }
        else{
            return true;
        }
    }

    
    //COMMENT ON CREE UN NOUVELLE OBJECT SCHOOL?
    @Override
    public void create_building(Vector bulding) {
        System.out.println("Quelle est le nom de votre nouvelle école?");
        String keywords = Game.keyboard.nextLine();
        School school = new School(null,Adress.AVENUE_DE_L_ISEN,keywords);
        System.out.println("Vous avez créer une école");
        bulding.add(school);
    }
    
    
    public static void addProfessor(Vector<School> schools, Professor prof){
        int i = 0;
        while (i < schools.size()){
            if(!schools.elementAt(i).is_full()){
                schools.elementAt(i).teachers.add(prof);
                return;
            }
            else {
                i++;
            }
        }
        if (i==schools.size()){
            System.out.println("ATTENTION: Il n'y a actuellement pas de place pour un nouveau professeur dans votre ville.");
        }
    }
    
    public static void addScientist(Vector<School> schools, Scientist scientist){
        int i = 0;
        while (i < schools.size()){
            if(!schools.elementAt(i).is_full_science()){
                schools.elementAt(i).scientists.add(scientist);
                return;
            }
            else {
                i++;
            }
        }
        if (i==schools.size()){
            System.out.println("ATTENTION: Il n'y a actuellement pas de place pour un nouveau chercheur dans votre ville.");
        }
    }
   
}
///////////////////////////////////////////////////////////
/*
 public Integer correspondance (){
        if(this.actual_school == "petite_ecole"){
            return Constantes.SMALL_SCHOOL_FULL;
        }
        if(this.actual_school=="moyenne_ecole"){
            return Constantes.MIDDLE_SCHOOL_FULL;
        }
        if(this.actual_school == "grande_entreprise"){
            return Constantes.BIG_SCHOOL_FULL;
        }    
        return -1;
    }


*/