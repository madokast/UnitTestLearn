package sice.learn.zrx.unit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {
    @Ignore
    @Test
    public void test() {
        Assert.assertTrue(false);
    }
}
