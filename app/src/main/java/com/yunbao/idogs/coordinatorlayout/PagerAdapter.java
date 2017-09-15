package com.yunbao.idogs.coordinatorlayout;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Administrator on 2017/9/15 0015.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int nNumOfTabs;
    public PagerAdapter(FragmentManager fm, int nNumOfTabs)
    {
        super(fm);
        this.nNumOfTabs=nNumOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                OneFragment tab1=new OneFragment();
                return tab1;
            case 1:
                twoFragment tab2=new twoFragment();
                return tab2;
            case 2:
                ThreeFragment tab3=new ThreeFragment();
                return tab3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return nNumOfTabs;
    }
}