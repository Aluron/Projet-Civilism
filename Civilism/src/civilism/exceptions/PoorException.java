/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.exceptions;

import civilism.*;

/**
 *
 * @author qkame
 */
public class PoorException extends Exception {

    /**
     * Creates a new instance of <code>PoorException</code> without detail
     * message.
     */
    public PoorException() {
        System.out.println("Vous avez accumulé trop de decouvert. Vous avez perdu.");
        Game.gameOver();
    }

    /**
     * Constructs an instance of <code>PoorException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PoorException(String msg) {
        super(msg);
    }
}
