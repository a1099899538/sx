package com.cgc.sx;


import android.util.Log;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import org.jetbrains.annotations.NotNull;

public class AdapterViewPager extends FragmentStatePagerAdapter {
    public Fragment currentFragment;

    public AdapterViewPager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }


//    @Override
//    public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
//        Log.i("航海","的说法是");
//        this.currentFragment = (Fragment) object;
//        super.setPrimaryItem(container, position, object);
//    }
}
