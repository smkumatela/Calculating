package za.ac.calculate.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-05.
 */
public class subtractNumTest {

    private SubtractNum sub;

    @Before
    public void setUp() throws Exception {
        sub = new SubtractNum();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(3, sub.subtract(6, 3));
    }
}
