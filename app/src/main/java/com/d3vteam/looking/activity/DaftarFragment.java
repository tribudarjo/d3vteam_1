package com.d3vteam.looking.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.d3vteam.looking.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DaftarFragment extends Fragment {


    public DaftarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daftar, container, false);
    }

}
