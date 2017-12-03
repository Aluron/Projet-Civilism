/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import civilism.*;
import civilism.characters.*;
import java.util.ArrayList;

/**
 * School is a class inherite to building, school is a place where scientists and professor work
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public class School extends Building implements Improvement{


    protected Professor directeur;
    ArrayList eleve = new ArrayList();
    ArrayList teachers = new ArrayList();
    ArrayList scientists = new ArrayList();

    
    /**
     * Constructeur to school
     * @param directeur
     * @param adress
     * @param name 
     */
    public School(Professor directeur, Adress adress, String name) {
        super(adress, name);
        this.directeur = directeur;
    }
    
 /////////////////////////////////////////////////////////////

    /**
     * Gets directeur in this school
     * @return directeur
     */

    public Professor getDirecteur() {
        return directeur;
    }

    /**
     * Sets the new directeur in this school
     * @param directeur the new directeur
     */
    public void setDirecteur(Professor directeur) {
        this.directeur = directeur;
    }

    /**
     * Gets eleve in this school
     * @return eleve 
     */
    public ArrayList getEleve() {
        return eleve;
    }

    /**
     *Sets the new eleve in this school
     * @param eleve the new eleve 
     */
    public void setEleve(ArrayList eleve) {
        this.eleve = eleve;
    }

    /**
     * Gets teacher in this school
     * @return teachers
     */
    public ArrayList getTeachers() {
        return teachers;
    }

    /**
     * Sets the nex teacher in this school
     * @param teachers the new teacher
     */
    public void setTeachers(ArrayList teachers) {
        this.teachers = teachers;
    }

    /**
     * Gets scientists in this school
     * @return scientists
     */
    public ArrayList getScientists() {
        return scientists;
    }

    /**
     * Setes the new scientist in this school
     * @param scientists the new scientists
     */
    public void setScientists(ArrayList scientists) {
        this.scientists = scientists;
    }
    
    /**
     * Get adress in this school inheritate building
     * @return adress
     */
    @Override
    public Adress getAdress() {
        return adress;
    }

    /**
     * Sets the new adress in this school inheritate building
     * @param adress the new adress
     */
    @Override
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    /**
     * Gets name in this school inheritate building
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     *Sets the new name in this school inheritate building
     * @param name the new name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
/////////////////////////////////////////////////////////////
    /////////////////////////////////////////////

    /**
     * check if this shcool is full
     * @return boolean
     */
    public boolean is_full(){
        if (this.teachers.size() >= Constantes.SCHOOL_FULL){
            return (true);
        }
        return (false);
    }
    /**
     * check is number of scientist is full in this school
     * @return boolean
     */
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
          System.out.println("Le nom de votre ecole est : " + this.getName());
        System.out.println("Le nombre de professeurs dans " + this.name + " est de " + this.teachers.size());
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
        System.out.println("L'école à pour capacité " + Constantes.SCHOOL_FULL + " pour le nombre de professeur mais vous pouvez avoir plusieurs ecole");
        System.out.println("L'école à pour capacité " + Constantes.SCHOOL_FULL_SCIENCE + " pour le nombre de scientifique");
        System.out.println("Chaque professeur peut avoir un et seulement un élève pendant sa période de formation " );
        System.out.println("Chaque scientifique vous apporte un point de recherche par tour");
        System.out.println("Il vous faudra des points de recherche pour créer de nouvelles usines et de nouvelles écoles  ");
        System.out.println("Une formation est plus ou moins longue selon la formation de l'élève");
        System.out.println("Mais attention, il y a un coût d'entretien à votre école" );
    }
    
    
    
    /**
     * Permet de savoir si un nouveau batiment peut-être crée
     * @param recherche
     * @param money
     * @return boolean
     */
    @Override
    public boolean checkBuilding(Integer recherche, Integer money) {

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
    /**
     * Create a new school
     * @param bulding 
     */
    @Override
    public void create_building(ArrayList bulding) {
        System.out.println("Quelle est le nom de votre nouvelle école?");
        String keywords = Game.keyboard.nextLine();
        School school = new School(null,Adress.AVENUE_DE_L_ISEN,keywords);
        System.out.println("Vous avez créer une école");
        bulding.add(school);
    }
    
    /**
     * Add a professor where it can
     * @param schools
     * @param prof 
     */
    public static void addProfessor(ArrayList<School> schools, Professor prof){
        int i = 0;
        while (i < schools.size()){
            if(!schools.get(i).is_full()){
                schools.get(i).teachers.add(prof);
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
    
    /**
     * Add a scientist where you can
     * @param schools
     * @param scientist 
     */
    public static void addScientist(ArrayList<School> schools, Scientist scientist){
        int i = 0;
        while (i < schools.size()){
            if(!schools.get(i).is_full_science()){
                schools.get(i).scientists.add(scientist);
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
