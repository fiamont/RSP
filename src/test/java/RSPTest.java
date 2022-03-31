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
    @Test
    @DisplayName("Play until player one wins")
    public void playUntilWin () {
        int numberOfRepeat = RSP.playRSPUntilWin();
        Assertions.assertEquals(numberOfRepeat,RSP.playRSPUntilWin());
    }
}
