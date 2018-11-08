package com.bookingmobil.jeff.bookingmobil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ShowroomActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private List<Car> listCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showroom);

        listCar = new ArrayList<>();
        listCar.add(new Car("Honda brio", "Honda", "344242", "Merah", "500/hari", R.drawable.ic_menu_send));
        listCar.add(new Car("Yamaha 24424", "Yamaha", "42342342", "Hijau", "500/hari", R.drawable.ic_menu_send));
        listCar.add(new Car("Honda brio", "Honda", "344242", "Merah", "500/hari", R.drawable.ic_menu_send));
        listCar.add(new Car("Honda brio", "Honda", "344242", "Merah", "500/hari", R.drawable.ic_menu_send));
        listCar.add(new Car("Honda brio", "Honda", "344242", "Merah", "500/hari", R.drawable.ic_menu_send));

        mRecycleView = (RecyclerView) findViewById(R.id.car_list);
        CarRecyclerViewAdapter recyclerViewAdapter =  new CarRecyclerViewAdapter(this, listCar);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mRecycleView.setAdapter(recyclerViewAdapter);
    }
}
