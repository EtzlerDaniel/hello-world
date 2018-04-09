import java.util.Scanner;

/**
 * Created by Daniel on 05.06.2017.
 */
public class Test {
    public static void main(String[] args){
        boolean again;
        String text;
        short index;

        Trainer aTrainer = new Trainer();
        Trainer bTrainer = new Trainer();
        aTrainer.setNachname("ATrainer");
        bTrainer.setNachname("BTrainer");

        Goalkeeper aKeeper = new Goalkeeper();
        Goalkeeper bKeeper = new Goalkeeper();
        aKeeper.setNachname("AKeeper");
        bKeeper.setNachname("BKeeper");

        Player[] aPlayer = new Player[10];
        Player[] bPlayer = new Player[10];
        for (index = 0; index < 9; index++){
            aPlayer[index] = new Player();
            text = index + "aSpieler";
            aPlayer[index].setNachname(text);
            bPlayer[index] = new Player();
            text = index + "bSpieler";
            bPlayer[index].setNachname(text);
        }

        Team A = new Team(aTrainer, aKeeper, aPlayer);
        Team B = new Team(bTrainer, bKeeper, bPlayer);

        Match Test = new Match(A, B);

        do {
            aTrainer.setStrategy((int)(Math.random() * 101));
            bTrainer.setStrategy((int)(Math.random() * 101));

            aKeeper.setReaction((int)(Math.random() * 101));
            bKeeper.setReaction((int)(Math.random() * 101));

            for (index = 0; index < 9; index++){
                aPlayer[index].setStrength((int)(Math.random() * 101));
                bPlayer[index].setStrength((int)(Math.random() * 101));
            }

            System.out.println("Start des Freundschaftsspiel zwischen");
            System.out.println("Team A");
            System.out.println("Trainer: " + aTrainer.getNachname());
            System.out.println("und");
            System.out.println("Team B");
            System.out.println("Trainer: " + bTrainer.getNachname());
            System.out.println("-----------------------------------\n");

            Test.play();

            System.out.println("-----------------------------------\n");
            System.out.println("Das Freundschaftsspiel endete\n");
            System.out.println("Team A - Team B " + Test.getaTor() + ":" + Test.getbTor());
            System.out.println("-----------------------------------\n");

            again = false;
            System.out.println("Noch einmal?(Y/N)");
            Scanner scan = new Scanner(System.in);
            text = scan.next();
            if (text == "Y" || text == "y" || text == "yes" || text == "Yes" || text == "Ja" || text == "ja" || text == "j" || text == "J"){
                again = true;
            }
        } while (again);
    }
}
