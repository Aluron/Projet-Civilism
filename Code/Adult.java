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
public class Adult extends Human{
    
    public Adult partner = new Adult();
    public Child child = new Child();
    
    public static Integer experience;
    
    public void die(){
        
    }
    
}
