package net.fred.feedex.utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import net.fred.feedex.provider.DatabaseHelper;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Connor on 12/3/2017.
 */
public class UiUtilsTest {
    @Test
    public void getScaledBitmap() throws Exception {
        byte[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        assertEquals(null, UiUtils.getScaledBitmap(array, 20));

    }

}