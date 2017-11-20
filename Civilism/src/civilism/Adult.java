/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 * The Adult class is the main Character Class.
 * It extends the Human class and is the "mother" of the functionnal character classes (Scientist, Professor, Worker & Police)
 * @author qkame
 */
public class Adult extends Human{
    
    public Adult partner;
    public Child child;
    
    public static Integer experience;
    
    /**
     * Sadly, an adult can die. This is a simple SOUT function announcing the death of the character.
     */
    public void die(){
        System.out.println("La ville est en deuil aujourd'hui. " + name + " " + surname + " est mort à l'âge de " + age + ".");       
    }

    public Adult(Name name, Surname surname, House home) {
        super(name, surname, home);
    }
    
}