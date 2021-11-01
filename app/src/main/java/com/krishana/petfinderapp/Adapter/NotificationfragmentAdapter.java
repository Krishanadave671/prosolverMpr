package com.krishana.petfinderapp.Adapter;

import android.support.v4.os.IResultReceiver;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.krishana.petfinderapp.fragment.Requestfragments;
import com.krishana.petfinderapp.fragment.notifications2fragment;

public class NotificationfragmentAdapter extends FragmentStateAdapter {


    public NotificationfragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new notifications2fragment();

            case 2:
                return new Requestfragments();

            default:
                return new notifications2fragment();

        }
    }

    @Override
    public int getItemCount() {

        return 2;
    }
}
