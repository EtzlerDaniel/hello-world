/**
 * Created by Daniel on 05.06.2017.
 */
public class Team {
    // Attribute
    private Trainer trainer;
    private Goalkeeper goalkeeper;
    private Player[] player;

    // Set
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    public void setGoalkeeper(Goalkeeper goalkeeper) {
        this.goalkeeper = goalkeeper;
    }
    public void setPlayer(Player[] player) {
        if (player.length == 10) {
            this.player = player;
        } else {
            System.out.println("Initialisierungsfehler!");
            //throw new ArithmeticException("Initialisierungsfehler!");
        }
    }
    public void setPlayer(Player player, int index) {
        this.player[index] = player;
    }

    // Get
    public Trainer getTrainer() {
        return trainer;
    }
    public Goalkeeper getGoalkeeper() {
        return goalkeeper;
    }
    public Player[] getPlayer() {
        return player;
    }
    public  Player getPlayer(short index){
        return player[index];
    }

    // Constructor
    public Team(Trainer trainer, Goalkeeper goalkeeper, Player[] player) {
        this.trainer = trainer;
        this.goalkeeper = goalkeeper;
        if (player.length == 10) {
            this.player = player;
        } else {
            System.out.println("Initialisierungsfehler!");
            //throw new ArithmeticException("Initialisierungsfehler!");
        }
    }

    // Default
    public Team(){

    }

    // Methode
    public int getStrength(){
        int zaehler = 0;
        zaehler += this.getTrainer().getStrategy();
        zaehler += this.getGoalkeeper().getReaction();
        for (short i = 0; i < 9; i++){
            zaehler += this.player[i].getStrength();
        }
        return zaehler;
    }
}
