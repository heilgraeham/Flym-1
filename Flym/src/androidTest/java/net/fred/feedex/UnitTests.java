package net.fred.feedex;



import android.app.Application;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static net.fred.feedex.utils.NetworkUtils.getBaseUrl;

/**
 * Created by Chris on 11/9/17.
 */

public class UnitTests extends Application{

    @Test
    public void testGetBaseUrl() throws Exception{
        String x = "http://www.cnn.com/2017/11/09/";

        String correct = "www.cnn.com";

        assertEquals(x,correct);
    }


}
