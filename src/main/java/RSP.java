import java.util.Random;

public class RSP {

    public static void playRSP (){
        System.out.println("Hej");

    }
    public static String gameOutcome (String player1, String player2) {

        if (player1.equals("rock") && player2.equals("scissor") || player1.equals("scissor") && player2.equals("paper")) {
            return "player 1 wins";
        }
        else if (player2.equals("rock") && player1.equals("scissor") || player2.equals("scissor") && player1.equals("paper")) {
            return "player 2 wins";
        }
        else {
            return "draw";
        }
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
}
