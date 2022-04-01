import org.junit.jupiter.api.*;

public class RSPTest {
    @BeforeEach
    public void beforeTheEach() {
        System.out.println("the test starts");
    }

    @AfterEach
    public void afterTheEach() {
        System.out.println("the test ends");
    }

    @RepeatedTest(8)
    @DisplayName("Is there a valid input from player")
    public void playerInputIsValid () {
        String value = RSP.player();
        Assertions.assertTrue(value.equals("rock") || value.equals("scissor") || value.equals("paper"));
    }
    @Test
    @DisplayName("Will the gameOutcome return something?")
    public void gameOutcomeReturn () {
        Assertions.assertEquals("draw", RSP.gameOutcome("rock", "rock"));
    }

    @RepeatedTest(4)
    @DisplayName("Does random work as it should")
    public void maybePlayAgain () {
        int value = RSP.playMoreChoice();
        Assertions.assertTrue(value==1 || value==2 || value==3);

    }
    @RepeatedTest(100)
    @DisplayName("Play until player one wins or max 15 times")
    public void playUntilWinMax15Times () throws Exception {
        if(RSP.playRSPUntilWin()>=15){
            throw new Exception("You should have won by now...");
        }
    }
}
