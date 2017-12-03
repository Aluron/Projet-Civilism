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
 * This Enum contains every available Names for the characters.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 * @version 1.0
 * @since Septembre 2017
 */
public enum Name {
    
    /**
     *
     */
    MAXIME, 

    /**
     *
     */
    SAMI, 

    /**
     *
     */
    JEAN, 

    /**
     *
     */
    THIBAUT, 

    /**
     *
     */
    BENOIT, 

    /**
     *
     */
    QUENTIN, 

    /**
     *
     */
    MICKAEL, 

    /**
     *
     */
    HUGO, 

    /**
     *
     */
    SIMON,

    /**
     *
     */
    JOHANNA,

    /**
     *
     */
    OLIVIER,

    /**
     *
     */
    JULIETTE,

    /**
     *
     */
    SARAH,

    /**
     *
     */
    LUCIE,

    /**
     *
     */
    SANDRINE, 

    /**
     *
     */
    SOPHIE,

    /**
     *
     */
    ANTOINE,

    /**
     *
     */
    ANGELINA,

    /**
     *
     */
    BRAD,

    /**
     *
     */
    JOHNNY,

    /**
     *
     */
    EDDY,

    /**
     *
     */
    DOMINIQUE,

    /**
     *
     */
    JACKY,

    /**
     *
     */
    BRYAN,

    /**
     *
     */
    FRANCKY,

    /**
     *
     */
    VINCENT;
    
    /**
     * Creates a list of all the values in Domain
     * Used to pick randomly an element
     */
    private static final List<Name> VALUES =
        Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

    /**
     * Picks a random Name
     * @return a random name
     */    
    public static Name randomName()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
  }
    
}
