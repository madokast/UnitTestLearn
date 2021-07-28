package sice.learn.zrx.unit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class AssertTest {
    @Test
    public void testAssertEquals() {
        assertEquals("a", "a");
    }

    @Test
    public void testHamcrest() {
        assertThat("ab", both(startsWith("a")).and(endsWith("b")));
    }
}
