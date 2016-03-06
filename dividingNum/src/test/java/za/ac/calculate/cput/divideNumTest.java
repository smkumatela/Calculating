package za.ac.calculate.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-05.
 */
public class divideNumTest {

    private DivideNum dvdN;

    @Before
    public void setUp() throws Exception {
        dvdN = new DivideNum();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testDivideNum() throws Exception {
        Assert.assertEquals(2, dvdN.divide(10, 5));
    }
}
