/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 *
 * @author qkame
 */
public class UnexpectedArg extends Exception {

    /**
     * Creates a new instance of <code>UnexpectedArg</code> without detail
     * message.
     */
    public UnexpectedArg() {
        System.out.println("La commande demandée n'est pas disponible. Voici la liste des commandes disponibles.");
        
    }

    /**
     * Constructs an instance of <code>UnexpectedArg</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public UnexpectedArg(String msg) {
        super(msg);
    }
}
