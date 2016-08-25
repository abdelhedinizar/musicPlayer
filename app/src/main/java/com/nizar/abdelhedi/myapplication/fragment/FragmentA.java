package com.nizar.abdelhedi.myapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nizar.abdelhedi.myapplication.R;

/**
 * Created by abdelhedi on 17/08/2016.
 */
public class FragmentA extends Fragment {

    int backgroundId;
    public View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);


        LinearLayout layout =(LinearLayout)view.findViewById(R.id.fragmentId);
        layout.setBackgroundResource(backgroundId);

        this.mView=view;
        return view;
    }

    public FragmentA(int backgroundId) {
       this.backgroundId=backgroundId;




    }
}
