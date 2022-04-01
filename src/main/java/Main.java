public class Main {
    public static void main(String[] args) {
        RSP rsp = new RSP();

        int playsBeforeOneWon = rsp.playRSPUntilWin();
        System.out.println("hur många gånger innan 1 won: " + playsBeforeOneWon);

    }
}
