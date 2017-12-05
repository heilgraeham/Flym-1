package net.fred.feedex.provider;

import android.net.Uri;

import junit.framework.TestCase;

import java.net.URI;

/**
 * Created by connor on 12/5/17.
 */
public class EntryColumnsTest extends TestCase {
    public void testENTRIES_FOR_FEED_CONTENT_URI() throws Exception {
        assertEquals(Uri.parse("content://net.fred.feedex.provider.FeedData/feeds/1/entries"), FeedData.EntryColumns.ENTRIES_FOR_FEED_CONTENT_URI(1));
    }

    public void testENTRIES_FOR_FEED_CONTENT_URI1() throws Exception {
        assertEquals(Uri.parse("content://net.fred.feedex.provider.FeedData/feeds/1/entries"), FeedData.EntryColumns.ENTRIES_FOR_FEED_CONTENT_URI("1"));
    }

    public void testENTRIES_FOR_GROUP_CONTENT_URI() throws Exception {
        assertEquals(Uri.parse("content://net.fred.feedex.provider.FeedData/groups/1/entries"), FeedData.EntryColumns.ENTRIES_FOR_GROUP_CONTENT_URI(1));
    }

    public void testENTRIES_FOR_GROUP_CONTENT_URI1() throws Exception {
        assertEquals(Uri.parse("content://net.fred.feedex.provider.FeedData/groups/1/entries"), FeedData.EntryColumns.ENTRIES_FOR_GROUP_CONTENT_URI("1"));
    }

    public void testENTRIES_FOR_MAGAZINE_URI() throws Exception {
        assertEquals(Uri.parse("content://net.fred.feedex.provider.FeedData/magazines/1/entries"), FeedData.EntryColumns.ENTRIES_FOR_MAGAZINE_URI(1l));
    }

    public void testUNREAD_ENTRIES_CONTENT_URI() throws Exception {
        assertEquals(Uri.parse("content://net.fred.feedex.provider.FeedData/unread_entries/1"), FeedData.EntryColumns.UNREAD_ENTRIES_CONTENT_URI("1"));
    }

    public void testCONTENT_URI() throws Exception {
        assertEquals(Uri.parse("content://net.fred.feedex.provider.FeedData/entries/1"), FeedData.EntryColumns.CONTENT_URI(1));
    }

    public void testCONTENT_URI1() throws Exception {
        assertEquals(Uri.parse("content://net.fred.feedex.provider.FeedData/entries/1"), FeedData.EntryColumns.CONTENT_URI("1"));
    }


}