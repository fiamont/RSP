import java.util.Random;

public class RSP {

    public static void main(String[] args) {
        playRSP();
        playMore();
    }

    public static void playRSP() {
        System.out.println("Lets play Rock, scissor, paper! \n");
        String player1 = player();
        System.out.println("Player 1 chose: " + player1);
        String player2 = player();
        System.out.println("Player 2 chose: " + player2);
        System.out.println(gameOutcome(player1, player2));
    }

    public static void playMore () {
        while (true) {
            System.out.println("\nDo you want to play again? 2 for yes 1 for no: \n");
            int choice = playMoreChoice();

            if (choice == 1) {
                System.out.println("Ok, bye!");
                break;
            }else{
                playRSP();
            }
        }
    }
    public static int playMoreChoice () {
        Random random = new Random();
        int choice = random.nextInt(2) + 1;
        if(choice==1){
            return 1;
        }else if(choice==2){
            return 2;
        }else {
            return 0;
        }
    }

    public static String gameOutcome (String player1, String player2) {

        if (player1.equals("rock") && player2.equals("scissor") || player1.equals("scissor") && player2.equals("paper") || player1.equals("paper") && player2.equals("rock")) {
            return "player 1 wins";
        }
        else if (player2.equals("rock") && player1.equals("scissor") || player2.equals("scissor") && player1.equals("paper") || player2.equals("paper") && player1.equals("rock")) {
            return "player 2 wins";
        }
        else {
            return "draw";
        }
    }

    public static String player () {
        Random random = new Random();
        int playerInput = random.nextInt(3)+1;
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
