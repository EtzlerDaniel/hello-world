/**
 * Created by Daniel Etzler on 05.06.2017.
 */
public class Trainer extends Person{
    // Attribute
    private int strategy = 0;

    // Set
    public boolean setStrategy(int strategy) {
        if (strategy < 0 || strategy > 100){
            return false;
        } else {
            this.strategy = strategy;
            return true;
        }

    }

    // Get
    public int getStrategy() {
        return strategy;
    }

    // Constructor
    public Trainer(int strategy){
        if (this.setStrategy(strategy)){
            System.out.println("Initialisierungsfehler!");
            //throw new ArithmeticException("Initialisierungsfehler!");
        }
    }
    public Trainer(int strategy, String vorname, String nachname, short alter, float gehalt, int vertragsdauer){
        if (this.setStrategy(strategy)){
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
    public Trainer() {

    }
}
