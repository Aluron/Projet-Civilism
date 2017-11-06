/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.civilism;

/**
 *
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */



public class Personnage {
public static int MONEY_OUVRIER = 300;
    
    
    protected String Nom;
    protected String Prenom;
    protected Integer Age;
    protected String Sexe;
    
    
////////////////Constructor///////////////////
    /////////////////////////////////////////
    public Personnage(String Nom, String Prenom, Integer Age, String Sexe) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.Sexe = Sexe;
        
    }
    
////////////////GETTER/////////////////////
    ///////////////////////////////////////
    
    /**
     * Recupere le nom du Personnage
     * @return 
     */
    public String getNom() {
        return Nom;
    }
/**
 * Recupere le prenom du Personnage
 * @return 
 */
    public String getPrenom() {
        return Prenom;
    }
/**
 * Recupere l'age du Personnage
 * @return 
 */
    public Integer getAge() {
        return Age;
    }
/**
 * Recupere le sexe du Personnage
 * @return 
 */
    public String getSexe() {
        return Sexe;
    }
////////// SETTER//////////////////////////
    ////////////////////////////////////////
    
/**
 * Fixe la variable "nom"
 * @param Nom 
 */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
/**
 * Fixe la variable "Prenom"
 * @param Prenom 
 */
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

/**
 * Fixe la variable "Age"
 * @param Age 
 */
    public void setAge(Integer Age) {
        this.Age = Age;
    }

/**
 * Fixe la variable "Sexe"
 * @param Sexe 
 */
    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

////////////////METHODS////////////////////
///////////////////////////////////////////


    
    
}
