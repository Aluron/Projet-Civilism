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
public class QuitException extends Exception {

    /**
     * Creates a new instance of <code>QuitException</code> without detail
     * message.
     */
    public QuitException() {
        System.out.println("Merci d'avoir joué à Civilism. Nous espérons que vous avez apprécié l'expérience.");
        System.exit(0);
    }

    /**
     * Constructs an instance of <code>QuitException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public QuitException(String msg) {
        super(msg);
    }
}
