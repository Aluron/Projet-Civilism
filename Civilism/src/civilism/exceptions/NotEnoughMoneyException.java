/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.exceptions;

/**
 *
 * @author qkame
 */
public class NotEnoughMoneyException extends Exception {

    /**
     * Creates a new instance of <code>NotEnoughMoneyException</code> without
     * detail message.
     */
    public NotEnoughMoneyException() {
        System.out.println("Vous n'avez actuellement pas sufisemment d'argent pour effectuer cette action");
    }

    /**
     * Constructs an instance of <code>NotEnoughMoneyException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotEnoughMoneyException(String msg) {
        super(msg);
    }
}
