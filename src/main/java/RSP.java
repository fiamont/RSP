import java.util.Random;

public class RSP {

    public static void playRSP(String a, String b) {
        System.out.println("Hej");

    }

    public static String player () {
        Random random = new Random();
        int playerInput = random.nextInt(3)+1;
        System.out.println(playerInput);
        if(playerInput==1){
            return "rock";
        }else if(playerInput==2){
            return "scissor";
        }else if (playerInput==3){
            return "paper";
        }
        else {
            return "";
        }
    }
/*public static String playersInput () {
        String playersInput = "lizard";

        if(playersInput.toLowerCase().trim().equals("rock") || playersInput.toLowerCase().trim().equals("scissor") || playersInput.toLowerCase().trim().equals("paper") ){

            return playersInput.toLowerCase().trim();
        } else {
            System.out.println("Write \"rock\" or \"scissor\" or \"paper\" ");
            playersInput = "rock";
            return playersInput.toLowerCase().trim();
        }
    }*/
}
