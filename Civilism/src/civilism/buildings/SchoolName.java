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
 *
 * @author qkame
 */
public enum SchoolName {
    
    /**
     *
     */
    SAINT_JEAN,

    /**
     *
     */
    SAINT_PAUL,

    /**
     *
     */
    OZANAM,

    /**
     *
     */
    JULES_FERRY,

    /**
     *
     */
    JEAN_MACE;
    
    private static final List<SchoolName> VALUES =
        Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

    /**
     *
     * @return
     */
    public static SchoolName randomName()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    
}
