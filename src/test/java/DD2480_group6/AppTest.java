package DD2480_group6;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This is an AppTest that contains unit tests for the App class.
 */

public class AppTest 
    extends TestCase
{
    /**
     * Constructs the test case.
     * @param testName              a String containing the name of the test case.
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * Produces the suite of tests being tested.
     * @return              a TestSuite containing the suite of tests being tested.
     */

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Tests the unique output of addTwoPlusTwo, four.
     */

    public static void addTwoPlusTwo()
    {
        App app = new App();
        assertTrue(app.addTwoPlusTwo() == 4);
        assertFalse(app.addTwoPlusTwo() == 5);
    }

    /**
     * Tests if the multiply method works. The multiply method multiplies two given integers.
     */

    public static void testMultiply()
    {
        App app = new App();
        assertTrue(app.multiply(5, 5) == 25);
        assertFalse(app.multiply(1, 0) == 1);
    }

    /**
     * Tests if the fibonacci method works. The fibonacci method obtains the n-th Fibonacci number.
     */

    public static void fibonacci()
    {
        App app = new App();
        assertTrue(app.fibonacci(3) == 2);
        assertFalse(app.fibonacci(1) == 0);
    }
}
