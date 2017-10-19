package net.fred.feedex.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.fred.feedex.Constants;
import net.fred.feedex.R;
import net.fred.feedex.adapter.MagazineCursorAdapter;
import net.fred.feedex.provider.FeedData;

/**
 * A simple {@link Fragment} subclass.
 */
public class MagazineFragment extends ListFragment {
    private MagazineCursorAdapter mMagazineCursorAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //TODO get entries for selected magazine
        mMagazineCursorAdapter = new MagazineCursorAdapter(getActivity(), FeedData.MagazineColumns.CONTENT_URI, Constants.EMPTY_CURSOR, false);
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setListAdapter(mMagazineCursorAdapter);
        return inflater.inflate(R.layout.fragment_magazine, container, false);
    }
}
