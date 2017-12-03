/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.characters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * This Enum contains all available Surnames for the characters.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public enum Surname {
    
    /**
     *
     */
    DUPONT, 

    /**
     *
     */
    DUPOND, 

    /**
     *
     */
    CROS,

    /**
     *
     */
    DIDIER, 

    /**
     *
     */
    MORELLE, 

    /**
     *
     */
    PEPIN, 

    /**
     *
     */
    CORDIER, 

    /**
     *
     */
    KAMENDA, 

    /**
     *
     */
    JOULIA, 

    /**
     *
     */
    DROUARD, 

    /**
     *
     */
    TARTEMPION;
    
    /**
     * Creates a list of all the values in Surname
     * Used to pick randomly an element
     */
    private static final List<Surname> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    /**
     * Picks a random domain
     * @return a random domain
     */
    public static Surname randomSurname()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    
}
