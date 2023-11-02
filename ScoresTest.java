//import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class ScoresTest {
    
    /**
     * test method
     */
    @Test public void Test() {
        int[] nums = {2, 5, 8, 7, 19};
        Scores trueTest = new Scores(nums);
        Assert.assertEquals(8.2, trueTest.calculateAverage(), 0.00001);
    }
}
