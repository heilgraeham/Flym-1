package net.fred.feedex.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Connor on 12/3/2017.
 */
public class PrefUtilsTest {
    @Test
    public void getBoolean() throws Exception {
        assertEquals(true, PrefUtils.getBoolean("key", true));
    }

    @Test
    public void getInt() throws Exception {
        assertEquals(1, PrefUtils.getInt("key", 1));
    }

    @Test
    public void getLong() throws Exception {
        assertEquals(1, PrefUtils.getLong("key", 1L));
    }

    @Test
    public void getString() throws Exception {
        assertEquals("key", PrefUtils.getString("key", "key"));
    }

}