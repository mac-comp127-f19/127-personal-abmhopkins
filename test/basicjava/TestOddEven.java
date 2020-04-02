package basicjava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOddEven {
    @Test

    public void testOddEvens () {
        OddEven userNum = new OddEven();
        assertEquals("That is odd", userNum.isOdd(3));
        assertEquals("That is even", userNum.isOdd(2));
        assertEquals("That is even", userNum.isOdd(-4));
    }

}
