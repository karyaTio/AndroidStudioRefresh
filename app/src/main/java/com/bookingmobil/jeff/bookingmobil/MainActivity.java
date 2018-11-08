package com.bookingmobil.jeff.bookingmobil;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout_id);
        viewPager = (ViewPager) findViewById(R.id.view_pager_id);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FragmentShowroomList(), "Showroom");
        viewPagerAdapter.addFragment(new FragmentBookingList(), "Booking");
        viewPagerAdapter.addFragment(new FragmentBookingHistory(), "History");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_directions_car);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_book);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_history);
    }
}
