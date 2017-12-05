package net.fred.feedex.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Connor on 12/3/2017.
 */
public class StringUtilsTest {
    @Test
    public void getDateTimeString() throws Exception {

        assertEquals("Jan 15 11:44 PM",StringUtils.getDateTimeString(1313045029));

    }

    @Test
    public void getMd5() throws Exception {
        assertEquals("98f6bcd4621d373cade4e832627b4f6", StringUtils.getMd5("test"));
    }

}