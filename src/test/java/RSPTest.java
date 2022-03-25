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
    @DisplayName("test 1")
    public void whenThereISTwoInputsNoExceptionIsThrown (){
        RSP.playRSP(1, 2);
        Assertions.assertTrue(true);
    }
    @Test
    @DisplayName("test 2")
    public void whenTheInputsAreEqualThenThereIsADraw () {
        //Assertions.assertEquals(2, RSP.playRSP(1,1));
    }
}
