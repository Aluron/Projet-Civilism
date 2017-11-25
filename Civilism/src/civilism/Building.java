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
public class Building {
    
    protected Adress adress;
    protected String name;
//    protected Integer price;
//    protected Integer max_capacity;

    public Building(Adress adress, String name) {
        this.adress = adress;
        this.name = name;
    }
    
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
   * @return Integer
   */
  public static Integer entretien (){
      Integer maintenance = Constantes.MAINTENANCE_FACTORY * Factory.number_factory
              + Constantes.MAINTENANCE_OFFICE * 1
              + Constantes.MAINTENANCE_SCHOOL * School.number_school;
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
  