package com.demos.tabhost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jay on 15/3/23.
 */
public class MeTabFragment extends Fragment {

    private static final String TAG="MeTabFragment";
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.tab04,container,false);
        Log.i(TAG, "onCreateView");
        return v;
    }
}
