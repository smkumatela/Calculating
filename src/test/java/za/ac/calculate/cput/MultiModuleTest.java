package za.ac.calculate.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.calculate.cput.Impl.MultiModuleCalcImpl;

/**
 * Created by Songezo on 2016-03-06.
 */
public class MultiModuleTest {

    private MultiModuleCalc multiModuleCalc;

    @Before
    public void setUp() throws Exception {
        multiModuleCalc = new MultiModuleCalcImpl();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(8, multiModuleCalc.add(2, 6));
    }

    @Test
    public void testDivide() throws Exception {
        Assert.assertEquals(2, multiModuleCalc.divide(8, 4));
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(20, multiModuleCalc.multiply(10, 2));
    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(4, multiModuleCalc.subStract(9, 5));
    }
}
