package za.ac.calculate.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Songezo on 2016-03-05.
 */
public class addNumTest {
    private AddNum aN;

    @Before
    public void setUp() throws Exception {
        aN = new AddNum();

    }

    @After
    public void tearDown() throws Exception {
        

    }

    @Test
    public void testAddNum() throws Exception {
        Assert.assertEquals(2, aN.add(1, 1));
    }
}
