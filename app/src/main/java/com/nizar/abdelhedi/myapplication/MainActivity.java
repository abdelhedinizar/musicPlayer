package com.nizar.abdelhedi.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.nizar.abdelhedi.myapplication.fragment.FragmentA;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends FragmentActivity {

    private static final int NUM_PAGES = 3;
    List<FragmentA> fragmentArray = new ArrayList<>();
    private ViewPager mPager;
    CircleIndicator indicator;
    TextView fragmentTextView;
    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());


        fragmentArray.add(new FragmentA(R.drawable.background3));
        fragmentArray.add(new FragmentA(R.drawable.background1));
        fragmentArray.add(new FragmentA(R.drawable.background2));
        fragmentTextView = (TextView)findViewById(R.id.textView);
        fragmentTextView.setText("Discover \nAll kinds on new \nunique music");

        indicator = (CircleIndicator) findViewById(R.id.indicator);
        mPager.setAdapter(mPagerAdapter);
        indicator.setViewPager(mPager);

    }


    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {

            super(fm);
            fragmentTextView = (TextView) findViewById(R.id.textView);
            Animation shake = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim);
            fragmentTextView.startAnimation(shake);


        }

        @Override
        public Fragment getItem(int position) {

            return fragmentArray.get(position);


        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
