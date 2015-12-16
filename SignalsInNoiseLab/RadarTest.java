import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        Radar rad = new Radar();
        monsterLoc = [10,10];
        int best = 1;
        for(int i = 0; i < 15; i++)
        {
            scan();
        }

        for(int i = 0; i < accumulator.length; i++)
        {
            for( int e = 0; e < accumulator.length; e++)
            {
                if (accumulator[i][e] > best)
                {
                    accumulator[i][e] = best;
                }
            }
        }
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

}
