/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import civilism.*;

/**
 *
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class Building {
    
    /**
     *
     */
    protected Adress adress;

    /**
     *
     */
    protected String name;
//    protected Integer price;
//    protected Integer max_capacity;

    /**
     *
     * @param adress
     * @param name
     */
    public Building(Adress adress, String name) {
        this.adress = adress;
        this.name = name;
        
    }
    
    /**
     *
     * @param adress
     */
    public Building(Adress adress){
        this.adress = adress;
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
  