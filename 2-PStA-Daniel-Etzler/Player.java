/**
 * Created by Daniel Etzler on 05.06.2017.
 */
public class Player extends Person {
    // Attribute
    private int strength = 0;
    private int scoredGoals = 0;

    // Set
    public boolean setStrength(int strength) {
        if (strength < 0 || strength > 100){
            return false;
        } else {
            this.strength = strength;
            return true;
        }
    }
    public boolean setScoredGoals(int scoredGoals) {
        if (scoredGoals < 0) {
            return false;
        } else {
            this.scoredGoals = scoredGoals;
            return true;
        }
    }
    public void setTor(){
        scoredGoals++;
    }

    // Get
    public int getStrength() {
        return strength;
    }
    public int getScoredGoals() {
        return scoredGoals;
    }

    // Constructor
    public Player(int strength){
        if (this.setStrength(strength)){
            System.out.println("Initialisierungsfehler!");
            //throw new ArithmeticException("Initialisierungsfehler!");
        }
    }
    public Player(int strength, int scoredGoals){
        if (this.setStrength(strength)){
            System.out.println("Initialisierungsfehler!");
            //throw new ArithmeticException("Initialisierungsfehler!");
        }
        if (this.setScoredGoals(scoredGoals)){
            System.out.println("Initialisierungsfehler!");
            //throw new ArithmeticException("Initialisierungsfehler!");
        }
    }
    public Player(int strength, int scoredGoals, String vorname, String nachname, short alter, float gehalt, int vertragsdauer){
        if (this.setStrength(strength)){
            System.out.println("Initialisierungsfehler!");
            //throw new ArithmeticException("Initialisierungsfehler!");
        }
        if (this.setScoredGoals(scoredGoals)){
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
    public Player() {

    }

    // Methode
    public int shoot(){
        return this.getStrength() + (int)(Math.random() * 26);
    }
}
