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
public class Professor {
    
    public School school;
    public Title title;
    
    protected Boolean free;
    
    protected ArrayList<Child> pupils = new ArrayList<Child>();
    protected ArrayList<Adult> formerPupils = new ArrayList<Adult>();
    
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
