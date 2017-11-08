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
public class Police extends Adult{
    
    public Office office;
    
    public Rank rank;
    
    public void takeIn(){
<<<<<<< HEAD
        // event arrestation
=======
   
>>>>>>> 95b7d1101302665aae44980cb2c73450955e64bb
    }
    
    public void promote(Rank rank){
        System.out.println(name + " " + surname + " a été promu " + rank + " après " + experience + " années de service.");
        this.rank = rank;
    }
    
    @Override
    public void die(){
        // Si comissaire, on doit promouvoir un nouveau comissaire.
    }
    
}
