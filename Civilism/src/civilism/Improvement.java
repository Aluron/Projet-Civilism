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
public interface Improvement {
    // RAJOUTER COMBIEN IL A D ARGENT  dans improve
    // RAJOUTER COMBIEN IL A DE POINT DE COMPETENCE dans improve
    
    
    //agrandir();
    /*  ICI CA ME CHIE A LA GUELE ... IL ME DEMANDE QUE CA SOIT ABSTRACT
    public Integer improve (Integer money,Integer skill){
        if (money< Constantes.IMPROVE_MONEY){
            System.out.println("Vous n'avez pas assez d'argent pour pouvoir UP votre batiment ");  // RAJOUTER COMBIEN IL A D ARGENT 
        }
        if(skill <Constantes.IMPROVE_SKILL){
            System.out.println("Vous n'avez pas assez de point de competence pour pouvoir UP votre batiment ");  // RAJOUTER COMBIEN IL A DE POINT DE COMPETENCE
        }
        else {
            System.out.println("Vous avez UP votre batiment ");
            return skill;
        }
    }
*/
    /**
     * Permet de savoir si la condition pour crée un building sont remplies
     * @param recherche
     * @param money
     * @return 
     */
 public boolean upgradeBuilding(Integer recherche, Integer money);
 
 /**
  * Créer le nouveau batiment
  */
 public void create_building();    
 }

