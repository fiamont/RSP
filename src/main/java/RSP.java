import java.util.Random;

public class RSP {

    public static void main(String[] args) {
        //playRSP();
        //playMore();
        playRSPUntilWin();
        System.out.println("You played: " + playRSPUntilWin() + " times!");
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
            System.out.println("\nDo you want to play again? Press 1\nDo you want to play until Player1 wins? Press 2 \nExit, press 3\n");
            int choice = playMoreChoice();

            if (choice == 3) {
                System.out.println("Ok, bye!");
                break;
            }else if (choice == 1){
                playRSP();
            }
            else {
                playRSPUntilWin();
                System.out.println("You played: " + playRSPUntilWin() + " times!");
                break;

            }
        }
    }
    public static int playRSPUntilWin () {
        int count = 1;
        while (true){
            System.out.println("\nLets play Rock, scissor, paper! \n");
            String player1 = player();
            System.out.println("Player 1 chose: " + player1);
            String player2 = player();
            System.out.println("Player 2 chose: " + player2);
            System.out.println(gameOutcome(player1, player2));
            count++;
            if (gameOutcome(player1,player2).equals("player 1 wins")){
                break;
            }
        }return count;

    }

    public static int playMoreChoice () {
        Random random = new Random();
        return random.nextInt(3) + 1;
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
