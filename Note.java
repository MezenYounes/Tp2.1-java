

public class Note {
    

	private String intitule;
    private float note;

    public Note(String intitule, float note) {
        this.intitule = intitule;
        this.note = note;
    }

    public String getIntitule() {
        return intitule;
    }

    public float getNote() {
        return note;
    }
    @Override
	public String toString() {
		return "Note [intitule=" + intitule + ", note=" + note + "]";
	}
}


	
	


