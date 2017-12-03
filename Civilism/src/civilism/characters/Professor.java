/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism.characters;

import civilism.buildings.House;
import civilism.buildings.School;
import java.util.ArrayList;

/**
 * A Professor is virtually here to teach Children.
 * The Professsor clas inherits from the Adult class.
 * @author Quentin KAMENDA & Benoit PEPIN - ISEN 2017
 */
public class Professor extends Adult{
    
    /**
     * The school where the professor works
     */
    public School school;
    
    /**
     * The title of the professor
     */
    public Title title;
    
    /**
     * The availability of the prof
     */
    protected Boolean free;
    
    /**
     * The list of all students of the prof
     */
    protected ArrayList<Child> pupils = new ArrayList<>();
    
    /**
     * The list of former students of the prof
     * UNUSED
     */
    protected ArrayList<Adult> formerPupils = new ArrayList<>();

    /**
     * Constructor for a Professor object
     * @param school the school where the character will work
     * @param title the title of the character
     * @param free the availability of the prof
     * @param name the name of the character
     * @param surname the surname of the character
     * @param home the house where the character lives 
     */
    public Professor(School school, Title title, Boolean free, Name name, Surname surname, House home) {
        super(name, surname, home);
        this.school = school;
        this.title = title;
        this.free = free;
    }
    
    /**
     * Gets the school where the prof works
     * @return the school
     */
    public School getSchool() {
        return school;
    }

    /**
     * Sets the school where the prof works
     * @param school the new school
     */
    public void setSchool(School school) {
        this.school = school;
    }

    /**
     * Gets the title of the prof
     * @return the title
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the title of the prof
     * @param title the new title
     */
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * Gets the availability of the prof
     * @return True if available
     */
    public Boolean getFree() {
        return free;
    }

    /**
     * Sets the availability of the prof
     * @param free the availability
     */
    public void setFree(Boolean free) {
        this.free = free;
    }

    /**
     * Gets the list of the students
     * @return the list of students
     */
    public ArrayList<Child> getPupils() {
        return pupils;
    }

    /**
     * Sets the list of students
     * @param pupils the new list of students
     */
    public void setPupils(ArrayList<Child> pupils) {
        this.pupils = pupils;
    }

    /**
     * Gets the list of all former students
     * @return the list of all former students
     */
    public ArrayList<Adult> getFormerPupils() {
        return formerPupils;
    }

    /**
     * Sets the list of all former students
     * @param formerPupils the new list of all former students
     */
    public void setFormerPupils(ArrayList<Adult> formerPupils) {
        this.formerPupils = formerPupils;
    }
    
    
    /**
     * Displays the infos on what a professor is
     */
    public static void description (){
            System.out.println("Un professeur ne peut avoir qu'un élève à la fois.");
            System.out.println("Plus vous avez de professeur, plus vous pouvez avoir d'élève et ainsi augmenter rapidement votre population");
    }
    
    /**
     * Increments the education level of all students of the prof
     */
    public void educate(){
        for (int i=0; i < pupils.size(); i++){
            pupils.get(i).education++;
        }
    }
    
    /**
     * Adds a student to the prof's student list
     * @param pupil 
     */
    public void newPupil(Child pupil){
        pupils.add(pupil);
    }
    
    /**
     * Removes a student from the student list because he has graduated
     * @param pupil 
     */
    public void graduatePupil(Child pupil){
        pupils.remove(pupil);
    }
    
    /**
     * Adds a student to the prof's former student list
     * @param pupil 
     */
    public void formerPupil(Adult pupil){
        formerPupils.add(pupil);
    }

    
    
    
    
}
