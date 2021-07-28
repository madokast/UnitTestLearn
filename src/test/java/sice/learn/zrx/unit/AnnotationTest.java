package sice.learn.zrx.unit;

import org.junit.*;

public class AnnotationTest {
    @Test
    public void testTest(){
        System.out.println("@Test");
    }

    @Test
    public void testTest2(){
        System.out.println("@Test2");
    }

    @Before
    public void before(){
        System.out.println("@Before");
    }

    @After
    public void after(){
        System.out.println("@After");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("@AfterClass");
    }

}
