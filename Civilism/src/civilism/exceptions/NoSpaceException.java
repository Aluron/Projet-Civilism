/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.exceptions;

/**
 * Throws an exception if there is no available place for an habitant to live.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 */
public class NoSpaceException extends Exception {

    /**
     * Creates a new instance of <code>NoSpaceException</code> without detail
     * message.
     */
    public NoSpaceException() {
        System.out.println("Malheureusement, il n'y a pas assez de place dans votre ville pour acceuillir cet habitant.");
    }

    /**
     * Constructs an instance of <code>NoSpaceException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NoSpaceException(String msg) {
        super(msg);
    }
}
