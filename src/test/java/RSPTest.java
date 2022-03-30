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

        if (RSP.playersInput().equals("rock") || RSP.playersInput().equals("scissors") || RSP.playersInput().equals("paper")) {
            boolean input = true;
            Assertions.assertTrue(input);
        } else {
            Assertions.assertTrue(false);
        }


    }
}
