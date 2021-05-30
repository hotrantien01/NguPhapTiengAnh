package com.trantien.nguphaptienganh.Frm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag = null;
        switch (position) {
            case 0:
                frag = new FrmCau();
                break;
            case 1:
                frag = new FrmTu();
                break;
            case 2:
                frag = new FrmLession();
                break;
            case 3:
                frag = new FrmReview();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Câu";
                break;
            case 1:
                title = "Từ";
                break;
            case 2:
                title = "Lession";
                break;
            case 3:
                title = "Review";
                break;
        }

        return title;
    }

}
