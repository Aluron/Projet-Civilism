/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.buildings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * This Enum contains several Adress available for factory,office and school.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public enum Adress {
    
    /**
     *
     */
    RUE_PIERRE_DUPONT, 

    /**
     *
     */
    AVENUE_DE_L_ISEN, 

    /**
     *
     */
    BOULEVARD_DES_REVES_BRISES, 

    /**
     *
     */
    RUE_DE_LA_PAIX;
    
    private static final List<Adress> VALUES =
        Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

    /**
     *
     * @return
     */
    public static Adress randomAdress()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    
}
