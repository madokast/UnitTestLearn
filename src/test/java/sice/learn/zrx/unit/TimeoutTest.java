package sice.learn.zrx.unit;

import org.junit.Ignore;
import org.junit.Test;

public class TimeoutTest {
    @Ignore
    @Test(timeout = 1)
    public void testTimeout() throws InterruptedException {
        while (true){}
    }
}
