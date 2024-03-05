

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class main {

	public static void main(String[] args) {
	
		Etudiant etudiant1 = new Etudiant("123456", "moha");
        etudiant1.addNote(new Note("Math", 13));
        etudiant1.addNote(new Note("Phys", 14));
        etudiant1.addNote(new Note("Info", 15));
        etudiant1.addNote(new Note("sgbd", 1));

        
       System.out.println( etudiant1.toString());
        Etudiant etudiant2 = new Etudiant("8888", "aziz");
        etudiant2.addNote(new Note("Math", 12));
        etudiant2.addNote(new Note("Phys", 13));
        etudiant2.addNote(new Note("Info", 11));
        System.out.println( etudiant2.toString());

        Vector <Etudiant> gr=new Vector<>();
        
        gr.add(etudiant2);
        gr.add(etudiant1);
        
        Stats s =new Stats(gr);
        
        
        System.out.println("avant trier");
        s.afficherStatsEtudiants();

        Collections.sort(gr);
        System.out.println("aprés trier");
        s.afficherStatsEtudiants();
        
        
        
        CompareMat comMat = new CompareMat();
        Collections.sort(gr,comMat);
        
        System.out.println("aprés trier matricule");

        s.afficherStatsEtudiants();
        
        CompareNom ComNom = new CompareNom();
        Collections.sort(gr,ComNom);
        
        System.out.println("aprés trier nom");

        s.afficherStatsEtudiants();
        
        System.out.println("La moyenne du groupe  : "+s.getMoyenneGroupe());
        System.out.println("le meilleur étudiant  : "+s.getMaximumGroupe());
        System.out.println("Le moins bon étudiant : "+s.getMinimumGroupe());





        

	}

}
