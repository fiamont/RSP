import org.junit.jupiter.api.*;

public class RSPTest {
    @BeforeEach
    public void beforeTheEach () {
        System.out.println("the test starts");
    }
    @AfterEach
    public void afterTheEach () {
        System.out.println("the test ends");
    }

    @Test
    @DisplayName("Is there a valid rock input from the player")

    public void playerRockInputIsValid () {

        Assertions.assertEquals("rock",RSP.playersInput());
    }

}
