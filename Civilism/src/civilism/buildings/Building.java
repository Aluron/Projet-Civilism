/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import civilism.*;

/**
 * Building is the mother of factory,house,school and office
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public class Building {
    
    protected Adress adress;
    protected String name;
 
    
    /**
     * Constructor for building
     * @param adress 
     * @param name 
     */
    public Building(Adress adress, String name) {
        this.adress = adress;
        this.name = name;
        
    }
    /**
     * There is no name with our house
     * @param adress 
     */
    public Building(Adress adress){
        this.adress = adress;
    }
    
    /**
     * Gets the adress of the building
     * @return the adress
     */
    public Adress getAdress() {
        return adress;
    }
    /**
     * Sets the adress of the bulding
     * @param adress the new adress
     */
    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    /**
     * Gets the name of the bulding
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the bulding
     * @param name  the new name
     */
    public void setName(String name) {
        this.name = name;
    }
//////////////////////////////////////////////////////////////  
    /**
     * Dependra de 2 pourcentages et retournera si oui ou non l'object brule
     * @param first_rate
     * @param second_rate
     * @return 
     */
    public static  boolean burn (Integer first_rate,Integer second_rate){
        Integer rate = first_rate * second_rate;
        return rate > Constantes.RATE_BURN;
    }
/////////////////////////////////////////////////////////////     
    
  /**
   * entretien permet de recuperer le cout de l'entretien total des batiments
     * @param game the current game
   * @return Integer
   */
  public static Integer entretien (Game game){
      Integer maintenance = Constantes.MAINTENANCE_FACTORY * game.factories.size()
              + Constantes.MAINTENANCE_OFFICE
              + Constantes.MAINTENANCE_SCHOOL * game.schools.size();
      return maintenance;
  } 
  /////////////////////////////////////////////////////////
  /**
   * Know if the building is full
   * @param personn
   * @param full
   * @return 
   */
  public Boolean is_full(Integer personn, Integer full){
        return personn >= full;
    }
}
///////////////////////////////////////////////////////////
  