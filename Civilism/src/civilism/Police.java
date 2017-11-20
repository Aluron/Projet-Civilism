/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 * The Police is virtually here to maintain the Law&Order in the city.
 * The Police class inherits from the Adult Class.
 * @author qkame
 */
public class Police extends Adult{
    
    public Office office;
    
    public Rank rank;
    
    public void takeIn(){
        // event arrestation
    }

    public Police(Office office, Rank rank, Name name, Name surname, House home) {
        super(name, surname, home);
        this.office = office;
        this.rank = rank;
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
