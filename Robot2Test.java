

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
    public void RobotWalk_Test()
    {
        Robot2 robot21 = new Robot2();
        robot21.setRobotWalk("green", 5.0);
        assertEquals("green", robot21.getColor());
        assertEquals(5.0, robot21.getSpeed(), 0.0);
        robot21.setRobotWalk("yellow", 5.0);
        assertEquals("yellow", robot21.getColor());
        assertEquals(6.0, robot21.getSpeed(), 0.0);
        robot21.setRobotWalk("red", 5.0);
        assertEquals("red", robot21.getColor());
        assertEquals(0.0, robot21.getSpeed(), 0.0);
    }
}

