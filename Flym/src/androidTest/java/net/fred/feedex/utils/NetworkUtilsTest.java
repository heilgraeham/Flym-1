package net.fred.feedex.utils;

import org.junit.Test;

import java.io.IOException;
import java.net.URL;

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

    @Test
    public void testHTTPURLConnection() throws IOException {
        String result = "okhttp3.internal.huc.OkHttpURLConnection:https://docs.oracle.com/javase/7/docs/api/";
        assertEquals(result,NetworkUtils.setupConnection("https://docs.oracle.com/javase/7/docs/api/").toString());
    }

    @Test
    public void testHTTPURLConnectionUrl() throws IOException {
        URL url = new URL("https://docs.oracle.com/javase/7/docs/api/");
        String result = "okhttp3.internal.huc.OkHttpURLConnection:https://docs.oracle.com/javase/7/docs/api/";
        assertEquals(result,NetworkUtils.setupConnection(url).toString());
    }

}