package basicjava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHypotenuse {
    @Test
    public void testHypotenuse () {
        Hypotenuse standardTriangle = new Hypotenuse();
        assertEquals(5.0, 0, standardTriangle.calculateHypotenuse(3.0, 4.0));


    }

}
