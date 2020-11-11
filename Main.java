package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // vyvejdane na dimensions za kakvoto i da e - v sluchaq za GALAXY
        // v metoda shte imame edin massive koito shte vryshta massive
        int[] dimensions = readIntegerArray(scanner.nextLine());

        // nashiq klas GALAXY sme kazali che po DEFAULT shte ima:
        // 1) row
        // 2) col
        Galactic galactic = new Galactic(dimensions[0], dimensions[1]);

        // nashiqt klas PLAYER sme kazali che po DEFAULT shte ima NISHTO
        // 1) starScores shte ima - no ne e nujno da se vyvejdat ot samoto nachalo
        Player player = new Player();

        // v GALACTIC CLUSTER imame dvuizmerniq massive
        GalacticCluster cluster = new GalacticCluster(galactic);

        //vsqka edna komanda si q vkarvame
        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {
            // 2-ra i 3-ta komanda shte bydat posizicqta na IVO i EVIL respektivno
            // pozlvame si metoda koito ni e za chetene na chisla
            int[] playerPositions = readIntegerArray(command);

            // sled kato v metoda imame samo 1 chisla te shte sa na pozicii 0 i 1

            // poiziciq 0 e ROW;
            int playerRow = playerPositions[0];
            // posiziq 1 e COL;
            int playerCol = playerPositions[1];

            //pak chetem nov red za EVIL;
            command = scanner.nextLine();

// sled kato v metoda imame samo 1 chisla te shte sa na pozicii 0 i 1
            int[] evilPosition = readIntegerArray(command);
            // poiziciq 0 e ROW;
            int evilRow = evilPosition[0];
            // posiziq 1 e COL;
            int evilCol = evilPosition[1];


            // 1) shte sloji i nulichki. zatova metoda shte go polzvame samo za EVIL
            // vij kakvo pravi moveEVILforce metoda v klasa CLUSTER!
            cluster.moveEvilForce(evilRow, evilCol);


            int starsToAdd = cluster.collectPlayerStars(playerRow, playerCol);
            player.addStars(starsToAdd);


            command = scanner.nextLine();
        }




        System.out.println(player.getStars());
    }












    public static int[] readIntegerArray(String line) {

        int[] result =  Arrays.stream(line
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        return result;
    }
}