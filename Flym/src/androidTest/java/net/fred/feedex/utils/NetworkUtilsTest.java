package net.fred.feedex.utils;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static net.fred.feedex.utils.NetworkUtils.getBaseUrl;
import static org.junit.Assert.*;

/**
 * Created by Chris on 11/14/17.
 */
public class NetworkUtilsTest {
    @Test
    public void testGetBaseUrl() throws Exception{
        String x = "http://www.cnn.com/2017/11/09/";

        String correct = "www.cnn.com";

        assertEquals(correct,getBaseUrl(x));
    }

}