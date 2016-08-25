package com.nizar.abdelhedi.myapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nizar.abdelhedi.myapplication.R;

/**
 * Created by abdelhedi on 18/08/2016.
 */
public class FragmentC extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c, container, false);
        return view;
    }

}
