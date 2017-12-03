/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import java.util.ArrayList;

/**
 *Improvement is a Interface for factory and school to create a new building
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public interface Improvement {

 
    /**
     * Permet de savoir si la condition pour crée un building sont remplies
     * @param recherche
     * @param money
     * @return 
     */
 public boolean checkBuilding(Integer recherche, Integer money);
 
 /**
  * Créer le nouveau batiment
     * @param bulding
  */
 public void create_building(ArrayList bulding);    
 
 }

