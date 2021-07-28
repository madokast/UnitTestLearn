package sice.learn.zrx.unit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParamTest {
    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{
                {5, 2, 3},
                {2, 1, 1}
        });
    }

    private final int expect;
    private final int a;
    private final int b;

    public ParamTest(int expect, int a, int b) {
        this.expect = expect;
        this.a = a;
        this.b = b;
    }

    @Test
    public void testAdder() {
        Adder adder = new Adder();
        Assert.assertEquals(
                expect,
                adder.add(a, b)
        );
    }
}
