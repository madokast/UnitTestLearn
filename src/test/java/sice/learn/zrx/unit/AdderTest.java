package sice.learn.zrx.unit;

import org.junit.Assert;
import org.junit.Test;

public class AdderTest {
    Adder adder = new Adder();

    @Test
    public void testAdd() {
        Assert.assertEquals(3,adder.add(1,2));
    }
}