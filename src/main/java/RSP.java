import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RSP {

    public static void playRSP(String a, String b) {
        System.out.println("Hej");

    }

    public static String playersInput () {

        //Scanner scanner = new Scanner(System.in);

        //String playersInput = scanner.nextLine();

        String playersInput = "lizard";


        if(playersInput.toLowerCase().trim().equals("rock") || playersInput.toLowerCase().trim().equals("scissor") || playersInput.toLowerCase().trim().equals("paper") ){

            return playersInput.toLowerCase().trim();
        } else {
            System.out.println("Write \"rock\" or \"scissor\" or \"paper\" ");
            playersInput = "rock";
            return playersInput.toLowerCase().trim();
        }
    }

    public static String computersInput () {
        Random random = new Random();
        int computerInput = random.nextInt(3)+1;

        if(computerInput==1){
            return "rock";
        }else if(computerInput==2){
            return "scissor";
        }else if(computerInput==3){
            return "paper";
        }else {
            return "";
        }
    }

}
