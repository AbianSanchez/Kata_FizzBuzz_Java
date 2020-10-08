import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testModulusFive() {
        String ModulusFive = FizzBuzz.checkFizzBuzz(5);
        assertEquals("Buzz",ModulusFive);
    }

    @Test
    void testModulusThree() {
        String ModulusFive = FizzBuzz.checkFizzBuzz(3);
        assertEquals("Fizz",ModulusFive);
    }
}