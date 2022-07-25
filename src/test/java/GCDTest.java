import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {
    @Test
    public void testGcd() {
        GCD gcd = new GCD();
        int expected = 12;

        int actual = gcd.gcd(60, 36);

        Assert.assertEquals(expected, actual);
    }
}