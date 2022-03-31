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

    @Test
    @DisplayName("Is there a valid input from the player")

    public void playerInputIsValid() {
        Assertions.assertTrue(RSP.playersInput().equals("rock") || RSP.playersInput().equals("scissors") || RSP.playersInput().equals("paper"));
    }

    @RepeatedTest(8)
    @DisplayName("Is there a valid input from computer")

    public void computerInputIsValid () {
        Assertions.assertTrue(RSP.computersInput().equals("rock") || RSP.computersInput().equals("scissors") || RSP.computersInput().equals("paper"));
    }

}
