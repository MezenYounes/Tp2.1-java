

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Stats {
    private Vector <Etudiant> groupe;

    public Stats(Vector<Etudiant> groupe2) {
        this.groupe = groupe2;
    }

    public void afficherStatsEtudiants() {
        for (Etudiant etudiant : groupe) {
            double moyenne = etudiant.getValue();
            double max = Collections.max(etudiant.getNotes(), Comparator.comparing(Note::getNote)).getNote();
            double min = Collections.min(etudiant.getNotes(), Comparator.comparing(Note::getNote)).getNote();
            System.out.println("Etudiant: " + etudiant.getNom() + "  Moyenne: " + moyenne +
                    " Meilleure note: " + max + "  Moins bonne note: " + min);
        }
    }

    public double getMoyenneGroupe() {
    	double sum = 0;
        for (Etudiant etudiant : groupe) {
            sum += etudiant.getValue();
        }
        return sum / groupe.size();
    }

    public Etudiant getMaximumGroupe() {
        return Collections.max(groupe);
    }

    public Etudiant getMinimumGroupe() {
        return Collections.min(groupe);
    }
}

