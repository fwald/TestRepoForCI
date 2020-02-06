package DD2480_group6;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * UNIT TESTS FOR SIMPLE MATH PROGRAM
 * TO-DO DOCUMENTATION
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public static void addTwoPlusTwo()
    {
        App app = new App();
        assertTrue(app.addTwoPlusTwo() == 4);
        assertFalse(app.addTwoPlusTwo() == 5);
    }
    public static void testMultiply()
    {
        App app = new App();
        assertTrue(app.multiply(5, 5) == 25);
        assertFalse(app.multiply(1, 0) == 1);
    }
    public static void fibonacci()
    {
        App app = new App();
        assertTrue(app.fibonacci(3) == 2);
        assertFalse(app.fibonacci(1) == 0);
    }
}
