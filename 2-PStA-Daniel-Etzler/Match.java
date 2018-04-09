/**
 * Created by Daniel on 05.06.2017.
 */
public class Match {
    // Attribute
    private Team ATeam;
    private Team BTeam;
    private int aTor = 0;
    private int bTor = 0;

    // Set
    public void setATeam(Team ATeam) {
        this.ATeam = ATeam;
    }
    public void setBTeam(Team BTeam) {
        this.BTeam = BTeam;
    }
    public boolean setaTor(int aTor) {
        if (aTor < 0){
            return false;
        } else {
            this.aTor = aTor;
            return true;
        }
    }
    public boolean setbTor(int bTor) {
        if (bTor < 0){
            return false;
        } else {
            this.bTor = bTor;
            return true;
        }
    }

    // Get
    public Team getATeam() {
        return ATeam;
    }
    public Team getBTeam() {
        return BTeam;
    }
    public int getaTor() {
        return aTor;
    }
    public int getbTor() {
        return bTor;
    }

    // Constructor
    public Match(Team ATeam, Team BTeam) {
        this.ATeam = ATeam;
        this.BTeam = BTeam;
    }

    // Default
    public  Match(){

    }

    // Methode
    public void play(){
        short zuf = 0;
        this.aTor = 0;
        this.bTor = 0;
        String attackname;

        for (short index = 1; index < 91; index += 5) {
            zuf = (short) (Math.random() * 10);
            System.out.println(index + ". Minute:");

            if ((this.ATeam.getStrength() + (int) (Math.random() * 31)) >= (this.BTeam.getStrength() + (int) (Math.random() * 30))) {
                // Team A Attack
                attackname = this.ATeam.getPlayer(zuf).getNachname();
                System.out.println("Chance fuer " + attackname + " ...");
                System.out.println(attackname + " zieht ab");
                if (this.BTeam.getGoalkeeper().shotStopped(this.ATeam.getPlayer(zuf).getStrength())) {
                    // Kein Tor
                    System.out.println(this.BTeam.getGoalkeeper().getNachname() + " pariert glanzvoll\n");
                } else {
                    // Tor
                    this.aTor++;
                    this.ATeam.getPlayer(zuf).setTor();
                    System.out.println("TOR !!! " + this.aTor + ":" + this.bTor + " " + attackname + "(" + this.ATeam.getPlayer(zuf).getScoredGoals() + ")\n");
                }
            } else {
                // Team B Attack
                attackname = this.BTeam.getPlayer(zuf).getNachname();
                System.out.println("Chance fuer " + attackname + " ...");
                System.out.println(attackname + " zieht ab");
                if (this.ATeam.getGoalkeeper().shotStopped(this.BTeam.getPlayer(zuf).getStrength())) {
                    // Kein Tor
                    System.out.println(this.ATeam.getGoalkeeper().getNachname() + " pariert glanzvoll\n");
                } else {
                    // Tor
                    this.bTor++;
                    this.BTeam.getPlayer(zuf).setTor();
                    System.out.println("TOR !!! " + this.aTor + ":" + this.bTor + " " + attackname + "(" + this.BTeam.getPlayer(zuf).getScoredGoals() + ")\n");
                }
            }

            if (index == 1) {
                index--;
            }
        }
    }
}
