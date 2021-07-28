package sice.learn.zrx.unit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class ExceptionTest {
    @Test(expected = NullPointerException.class)
    public void testException(){
        Objects.requireNonNull(null);
    }
}
