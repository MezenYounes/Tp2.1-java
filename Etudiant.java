

import java.util.ArrayList;

public class Etudiant implements IStatisticable,Comparable<Etudiant> {
    private String matricule;
    private String nom;
    private ArrayList<Note> notes;

    public Etudiant(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    @Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", notes=" + notes + "]";
	}

	public double getValue() {
        double sum = 0;
        for (Note note : notes) {
            sum += note.getNote();
        }
        return sum / notes.size();
    }

	@Override
	public int compareTo(Etudiant autre) {
		
	     if(this.getValue()>autre.getValue())
	    	 {
	    	 	return 1;
	    	 }
	     if(this.getValue()<autre.getValue())
    	 {
    	 	return -1;
    	 }
	     else
	    	 return 0;
	    
	}

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

	
}
	
	
	


