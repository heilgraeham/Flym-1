package net.fred.feedex.view;

import junit.framework.TestCase;

/**
 * Created by connor on 12/5/17.
 */
public class BakedBezierInterpolatorTest extends TestCase {

    public void testGetInterpolation() throws Exception {
        BakedBezierInterpolator z = BakedBezierInterpolator.getInstance();

        assertEquals(1.0f, z.getInterpolation(1));
    }

}