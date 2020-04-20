

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Robot2Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Robot2Test
{
    /**
     * Default constructor for test class Robot2Test
     */
    public Robot2Test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Robot2_Test()
    {
        Robot2 robot21 = new Robot2();
        robot21.setRobotWalk("green", 5);
        assertEquals("green", robot21.getColor());
        assertEquals(5.0, robot21.getSpeed(), 0.1);
        Robot2 robot22 = new Robot2();
        robot22.setRobotWalk("yellow", 5);
        assertEquals("yellow", robot22.getColor());
        assertEquals(6.0, robot22.getSpeed(), 0.1);
        Robot2 robot23 = new Robot2();
        robot23.setRobotWalk("red", 5);
        assertEquals("red", robot23.getColor());
        assertEquals(0.0, robot23.getSpeed(), 0.1);
    }
}

