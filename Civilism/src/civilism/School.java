/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilism;

import java.util.ArrayList;

/**
 *
 * @author Object ou class fait par BENOIT PEPIN ISEN LILLE 2017 JAVA
 */
public class School {
    protected static Integer teacher_number;
    protected Integer teacher;
    protected Professor directeur;
    ArrayList eleve = new ArrayList();
    ArrayList prof = new ArrayList();
    protected static Integer number_school = 1;  //Si nouvelle object crée implémenter la variable
    
    //Constantes.SCHOOL_full;
    
/////////////////////////////////////////////////////////////
    /////////////////////////////////////////////
    
   
    
    public School(int teacher_number, int taille) {
        this.teacher_number = teacher_number;
 
    }
    
    /**
     * Regarde si l'école est pleine
     * @return boolean
     */
    public boolean is_full(){
        if (this.teacher_number >=Constantes.SCHOOL_FULL){
            return (true);
        }
        return (false);
    }
    
      public void infos() {
        int i=1;
        // A remplacer apres pour lenght de la liste
        System.out.println("Le nombre de travalleur dans vos école est de " + this.teacher_number);
          System.out.println("Le nombre de travailleur dans cette école est de " + this.teacher);
        if (this.directeur== null ){
            System.out.println("Il n'y à pas de directeur dans votre école ");
        }
        System.out.println("Il existe un directeur dans votre école et c'est " + this.directeur );
        System.out.println("Il y a un entretien pour votre école et il s'élève à : "+ Constantes.MAINTENANCE_SCHOOL);  
  
    }
    /**
     * description permet de connaitre des informations de l'utilité d'un Factory
     */
    public void description(){
        System.out.println("L'école est le lieu ou les élèves apprennent leur futur métier");
        System.out.println("L'école à pour capacité " + Constantes.SCHOOL_FULL + "mais vous pouvez en avoir plusieurs");
        System.out.println("Chaque professeur peut avoir un et seulement un élève pendant sa période de formation " );
        System.out.println("Une formation est plus ou moins longue selon la formation de l'élève");
        System.out.println("Mais attention, il y a un coût d'entretien à votre école" );
    }
    
    
}
///////////////////////////////////////////////////////////
/*
 public Integer correspondance (){
        if(this.actual_school == "petite_ecole"){
            return Constantes.SMALL_SCHOOL_FULL;
        }
        if(this.actual_school=="moyenne_ecole"){
            return Constantes.MIDDLE_SCHOOL_FULL;
        }
        if(this.actual_school == "grande_entreprise"){
            return Constantes.BIG_SCHOOL_FULL;
        }    
        return -1;
    }


*/