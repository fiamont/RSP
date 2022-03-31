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

   /* @Test
    @DisplayName("Is there a valid input from the player")

    public void playerInputIsValid() {
        Assertions.assertTrue(RSP.playersInput().equals("rock") || RSP.playersInput().equals("scissor") || RSP.playersInput().equals("paper"));
    }*/

    @RepeatedTest(8)
    @DisplayName("Is there a valid input from computer")

    public void playerInputIsValid () {
        String value = RSP.player();
        Assertions.assertTrue(value.equals("rock") || value.equals("scissor") || value.equals("paper"));
    }
    /*@Test
    @DisplayName("Is there a draw")
    public void isTheGameADraw () {
        Assertions.assertEquals("draw");
    }*/

}
