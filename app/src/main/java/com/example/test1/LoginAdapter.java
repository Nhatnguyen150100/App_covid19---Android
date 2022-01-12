package com.example.test1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {

    public LoginAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch (position) {
            case 0:
                frag = new LoginTabFragment();
                break;
            case 1:
                frag = new SignupTabFragment();
                break;
        }
        assert frag != null;
        return frag;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
