import java.util.Locale;
import java.util.Scanner;

public class RSP {

    public static void playRSP(String a, String b) {
        System.out.println("Hej");

    }

    public static String playersInput () {

        //Scanner scanner = new Scanner(System.in);

        //String playersInput = scanner.nextLine();

        String playersInput = "  hej ";


        if(playersInput.toLowerCase().trim() !="rock"){
            System.out.println("Write \"rock\" ");
            playersInput = "rock";

            return playersInput.toLowerCase().trim();
        }

        return playersInput.toLowerCase().trim();
    }

}
