/**
 * Created by Daniel Etzler on 05.06.2017.
 */

public class Person {
    // Attribute
    private String vorname = "-";
    private String nachname = "-";
    private short alter = 0;
    private float gehalt = (float)0.0;
    private int vertragsdauer = 0;

    // Set
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public boolean setAlter(short alter) {
        if (alter <= 0){
            return false;
        } else  {
            this.alter = alter;
            return true;
        }
    }
    public boolean setGehalt(float gehalt) {
        if (gehalt <= (float)0.0){
            return false;
        } else {
            this.gehalt = gehalt;
            return true;
        }
    }
    public boolean setVertragsdauer(int vertragsdauer) {
        if (vertragsdauer <= 0){
            return false;
        } else {
            this.vertragsdauer = vertragsdauer;
            return true;
        }
    }


    // Get
    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public short getAlter() {
        return alter;
    }
    public float getGehalt() {
        return gehalt;
    }
    public int getVertragsdauer() {
        return vertragsdauer;
    }


    // Constructor
    public Person(String vorname, String nachname, short alter, float gehalt, int vertragsdauer) {
        if (alter <= 0 || gehalt < 0 || vertragsdauer < 0){
            System.out.println("Initialisierungsfehler!");
            //throw new ArithmeticException("Initialisierungsfehler!");
        }
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.gehalt = gehalt;
        this.vertragsdauer = vertragsdauer;
    }

    // Default
    public Person(){

    }
}
