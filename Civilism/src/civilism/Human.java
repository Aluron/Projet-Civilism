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
public class Human{
    
    protected Boolean isAlive;
    
    protected Name name;
    protected Name surname;
    protected Integer age;
    //protected Aspect aspect;
    
    public House home;
    public Adult father;
    public Adult mother;
       
    
    public void introduce(){
        System.out.println(name + " : " + "Bonjour, je m'appelle " +  name + " " + surname +  ". J'ai " + age + "ans et vis au " + home);
    }
    
    public void parle(String says){
        System.out.println(name + " : " + says);
    }
    
}
