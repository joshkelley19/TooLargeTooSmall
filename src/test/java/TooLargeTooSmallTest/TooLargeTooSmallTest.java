package TooLargeTooSmallTest;

import TooLargeTooSmall.TooLargeTooSmall;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by joshuakelley on 9/10/16.
 */
public class TooLargeTooSmallTest {
    @Test
    public void largeSmallTest(){
        TooLargeTooSmall test = new TooLargeTooSmall(100);
        Assert.assertTrue("Should return true, 'You tried 1 times'", test.guessTheNumber(100));
    }
}
