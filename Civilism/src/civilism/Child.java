/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

/**
 * The child class is the pre-Adult class.
 * The "Child" character is a character that is slowly becoming an adult by going to school.
 * @author qkame
 */
public class Child extends Human{
    
    /**
     * Number of years already studied by the child.
     */
    protected Integer education;
    /**
     * Class degree the child attends.
     */
    protected Degree degree;
    /**
     * The number of years the child aims to stay in the education system.
     */
    protected Integer ambition;

    public Child(Integer education, Degree degree, Name name, Surname surname, House home) {
        super(name, surname, home);
        this.education = education;
        this.degree = degree;
        System.out.println("Félicitations! " + this.name + this.surname + "est né!");
    }
    
    public Child(Name name, Surname surname, House home){
        super(name, surname, home);
    }
    
    
    
    /**
     * Represents the fact that the child passes an educational year (Increments the eductation Var).
     */
    public void study(){
        this.education++;
    }
    
    /**
     * The child becomes a worker. Deletes the Object to create his equivalent as an Adult.
     * @param child The Child to become Worker.
     */
    public static void becomeWorker(Child child, Factory factory){
        Worker worker = new Worker(factory, Job.WORKER, child.name, child.surname, child.home);
        
    }
    
    /**
     * The child becomes a Police man. Deletes the Object to create his equivalent as an Adult.
     * @param child The Child to become Police.
     */
    public static void becomePolice(Child child){
        
    }
    
    /**
     * The child becomes a Professor. Deletes the Object to create his equivalent as an Adult.
     * @param child The Child to become Professor.
     */
    public static void becomeProfessor(Child child){
        
    }
    
    /**
     * The child becomes a scientist. Deletes the Object to create his equivalent as an Adult.
     * @param child The Child to become Scientist.
     */
    public static void becomeScientist(Child child){
        
    }
    
    public static void description (){
            System.out.println("Les enfants sont le futur de votre ville");
            System.out.println("Vous avez un nouvel enfant quand un enfant fini sa formation");
            System.out.println("Votre nombre d'enfant est limité selon le nombre de professeur");
            System.out.println("Pour que votre enfant soit un ouvrier, il lui faut " + Constantes.OUVRIER );
            System.out.println("¨Pour un policier " + Constantes.POLICIER);
            System.out.println("Pour un professeur " + Constantes.PROFESSEUR);
            System.out.println("Pour un chercheur "+ Constantes.CHERCHEUR);
    }
    
    protected void affectation(Child child){
        System.out.println("Un enfant est ne et pret à se former. " + child.name + " " + child.surname + " est en attente d'une formation. Que choisissez-vous comme etudes pour lui ?");
        System.out.println("(RAPPEL: un enfant peut étudier les metiers d'ouvrier, de policier, de professuer ou de chercheur.)");
        switch (Game.keyboard.nextLine()){
            case "help": 
            case "ouvrier": child.degree = Degree.ELEMENTARY;
            case "policier": child.degree = Degree.HIGHSCHOOL;
            case "professeur": child.degree = Degree.COLLEGE;
            case "chercheur": child.degree = Degree.UNIVERSITY;
            default: 
        }
    }
    
    
}
