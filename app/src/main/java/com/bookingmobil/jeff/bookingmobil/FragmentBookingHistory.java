package com.bookingmobil.jeff.bookingmobil;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentBookingHistory extends Fragment {

    View v;

    public FragmentBookingHistory(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_bookinghistory, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
