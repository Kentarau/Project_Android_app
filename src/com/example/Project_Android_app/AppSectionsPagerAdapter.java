package com.example.Project_Android_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Kevin on 26/03/14.
 */
public class AppSectionsPagerAdapter extends FragmentPagerAdapter {
    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 6;

    public AppSectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment;
        switch (i) {
            case 0:
                fragment = new Tab1Fragment();
            break;
            case 1:
                fragment = new Tab2Fragment();
            break;
            case 2:
                fragment = new Tab3Fragment();
            break;
            case 3:
                fragment = new Tab4Fragment();
            break;
            case 4:
                fragment = new Tab5Fragment();
            break;
            default:
                fragment = new Tab1Fragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab " + (position + 1);
    }
}

