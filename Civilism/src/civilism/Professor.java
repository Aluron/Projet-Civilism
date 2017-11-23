/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

import java.util.ArrayList;

/**
 * A Professor is virtually here to teach Children.
 * The Professsor clas inherits from the Adult class.
 * @author qkame
 */
public class Professor extends Adult{
    
    public School school;
    public Title title;
    
    protected Boolean free;
    
    protected ArrayList<Child> pupils = new ArrayList<>();
    protected ArrayList<Adult> formerPupils = new ArrayList<>();

    public Professor(School school, Title title, Boolean free, Name name, Surname surname, House home) {
        super(name, surname, home);
        this.school = school;
        this.title = title;
        this.free = free;
    }
    
    public static void description (){
            System.out.println("Un professeur à uniquement un élève  ");
            System.out.println("Chaque professeur permet d'avoir un élève, plus vous avez de professeur plus vous pouvez avoir d'élève et augmenter rapidement votre population");
    }
    
    
    public void educate(){
        for (int i=0; i < pupils.size(); i++){
            pupils.get(i).education++;
        }
    }
    
    public void newPupil(Child pupil){
        pupils.add(pupil);
    }
    
    public void graduatePupil(Child pupil){
        pupils.remove(pupil);
    }
    
    public void formerPupil(Adult pupil){
        formerPupils.add(pupil);
    }
    
    
}
