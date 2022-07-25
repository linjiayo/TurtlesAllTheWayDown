import org.junit.Assert;
import org.junit.Test;

class FactorialTest {

    @org.junit.jupiter.api.Test
    void factorial() {
        Factorial f = new Factorial();

        long expected = 120L;

        long actual = f.factorial(5);

        Assert.assertEquals(expected, actual);
    }


}