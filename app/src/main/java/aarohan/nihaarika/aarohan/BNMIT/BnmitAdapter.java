package aarohan.nihaarika.aarohan.BNMIT;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static aarohan.nihaarika.aarohan.BNMIT.Tab_Fragment_For_BNM_MBA.int_item_in_BNMIT;

/**
 * Created by nihaarika on 26/4/18.
 */

public class BnmitAdapter extends FragmentPagerAdapter {
    public BnmitAdapter(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position){
            case 0:
                return new About_BNM();
            case 1:
                return new About_MBA();
            case 2:
                return new Events_IN_MBA();
        }
        return null;
    }

    @Override
    public int getCount() {


        return int_item_in_BNMIT;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "ABOUT BNM";
            case 1:
                return "ABOUT MBA";
            case 2:
                return "EVENTS";

        }

        return null;
    }
}


