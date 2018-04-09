/**
 * Created by Daniel Etzler on 05.06.2017.
 */
public class Goalkeeper extends Person {
    // Attribute
    private int reaction = 0;

    // Set
    public boolean setReaction(int reaction) {
        if (reaction < 0) {
            return false;
        } else {
            this.reaction = reaction;
            return true;
        }
    }

    // Get
    public int getReaction() {
        return reaction;
    }

    // Constructor
    public Goalkeeper(int reaction){
        if (this.setReaction(reaction)){
            System.out.println("Initialisierungsfehler!");
            //throw new ArithmeticException("Initialisierungsfehler!");
        }
    }

    public Goalkeeper(int reaction, String vorname, String nachname, short alter, float gehalt, int vertragsdauer){
        if (this.setReaction(reaction)){
            System.out.println("Initialisierungsfehler!");
            //throw new ArithmeticException("Initialisierungsfehler!");
        }
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setAlter(alter);
        this.setGehalt(gehalt);
        this.setVertragsdauer(vertragsdauer);
    }

    // Default
    public Goalkeeper() {

    }

    // Methode
    public boolean shotStopped(int shotStrength){
        return (this.getReaction() + 15) >= shotStrength;
    }
}
