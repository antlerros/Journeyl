package com.example.antlerros95.journeyl;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MilestonesActivity extends AppCompatActivity {
    private static final int NUM_PAGES = 2;
    private TabLayout tabs;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milestones);

        tabs = findViewById(R.id.milestoneTabs);
        mPager = findViewById(R.id.milestonePager);

        mPager.setAdapter(new MilestonePagerAdapter(getSupportFragmentManager()));
        tabs.setupWithViewPager(mPager);


    }


    private class MilestonePagerAdapter extends FragmentStatePagerAdapter {
        public MilestonePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return MilestoneContentFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return "EXPLORE";
            } else {
                return "MAKE YOUR OWN";
            }
        }
    }
}
