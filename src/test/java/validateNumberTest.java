import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class validateNumberTest {

    @Test
    public void testOneIsPrime(){
        assertFalse(ValidatePrime.isPrime(1));
    }

    @Test
    public void testTwoIsPrime(){
        assertTrue(ValidatePrime.isPrime(2));
    }

    @Test
    public void testSevenIsPrime(){
        assertTrue(ValidatePrime.isPrime(7));
    }

    @Test
    public void testElevenIsPrime(){
        assertTrue(ValidatePrime.isPrime(11));
    }

    @Test
    public void testEightIsNotPrime(){
        assertFalse(ValidatePrime.isPrime(8));
    }
}
