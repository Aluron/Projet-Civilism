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
    
    protected String adress;
    protected String name;
    protected Integer price;
    protected Integer max_capacity;
//////////////////////////////////////////////
    //////////////////////////////////////////
    public Building(String adress, Integer price, Integer max_capacity) {
        this.adress = adress;
        //name = Scanner...;
        this.name = name;
        this.price = price;
        this.max_capacity = max_capacity;
        
    }
//////////////GETTER and SETTER/////////////////////
    ////////////////////////////////////
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(Integer max_capacity) {
        this.max_capacity = max_capacity;
    }
    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    
    /**
     * Selon la capacité maximun l'entretien d'un batiment coute plus cher
     * @param entretien
     * @return 
     */

//////////////////////////////////////////////////////////////  
    /**
     * Dependra de 2 pourcentages et retournera si oui ou non l'object brule
     * @param first_rate
     * @param second_rate
     * @return 
     */
    public boolean burn (Integer first_rate,Integer second_rate){
        Integer rate = first_rate * second_rate;
        if (rate > Constantes.RATE_BURN){
            return true;
        }
        else {
            return false;
        }
    }
/////////////////////////////////////////////////////////////     
    
  
}
