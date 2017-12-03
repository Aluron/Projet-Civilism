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
 * This Enum contains available Research domains.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public enum Domain {
    
    /**
     *
     */
    PHARMACOLOGY, 

    /**
     *
     */
    HISTORY, 

    /**
     *
     */
    GEOGRAPHY, 

    /**
     *
     */
    THEOLOGY, 

    /**
     *
     */
    PHILOSOPHY, 

    /**
     *
     */
    PSYCHOLOGY, 

    /**
     *
     */
    LANGUAGES, 

    /**
     *
     */
    MATHEMATICS, 

    /**
     *
     */
    PHYSICS;
    
    /**
     * Creates a list of all the values in Domain
     * Used to pick randomly an element
     */
    private static final List<Domain> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    /**
     * Picks randomly an element of Domain
     * @return a random domain
     */
    public static Domain randomDomain()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    
}
