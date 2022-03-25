import org.junit.jupiter.api.*;

public class RSPTest {
    @Test
    @DisplayName("test 1")
    public void whenThereISTwoInputsNoExceptionIsThrown (){
        RSP.playRSP(1, 2);
        Assertions.assertTrue(true);
    }
}
