package za.ac.calculate.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-05.
 */
public class mulitiplyNumTest {

    private MultiplyNum multi;

    @Before
    public void setUp() throws Exception {
        multi = new MultiplyNum();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testDivideTest() throws Exception {
        Assert.assertEquals(20, multi.multiply(10, 2));
    }
}
