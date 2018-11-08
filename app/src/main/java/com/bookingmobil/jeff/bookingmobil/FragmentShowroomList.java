package com.bookingmobil.jeff.bookingmobil;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FragmentShowroomList extends Fragment {

    View v;
    private RecyclerView mRecycleView;
    private List<Showroom> listShowroom;

    FirebaseDatabase mFirebase;
    DatabaseReference myRef;

    public FragmentShowroomList(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mFirebase = FirebaseDatabase.getInstance();
        myRef = mFirebase.getReference("showrooms");

        listShowroom = new ArrayList<>();

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                Log.e("Count " ,""+snapshot.getChildrenCount());
                for (DataSnapshot postSnapshot: snapshot.getChildren()) {
                    Showroom post = postSnapshot.getValue(Showroom.class);
                    listShowroom.add( new Showroom(post.getName(), post.getLocation(), "5.4", R.drawable.ic_directions_car));
                    Log.e("Get Data", post.getName());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("The read failed: " ,databaseError.getMessage());
            }

        });


        listShowroom.add( new Showroom("Showroom satu", "Lampung", "5.4", R.drawable.ic_directions_car));
        listShowroom.add( new Showroom("Showroom dua", "Tanggerang", "6", R.drawable.ic_directions_car));
        listShowroom.add( new Showroom("Showroom tiga", "Metro", "7", R.drawable.ic_directions_car));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_showroomlist, container, false);
        mRecycleView = (RecyclerView) v.findViewById(R.id.showroom_list);
        ShowroomRecyclerViewAdapter recyclerViewAdapter =  new ShowroomRecyclerViewAdapter(getContext(), listShowroom);
        mRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecycleView.setAdapter(recyclerViewAdapter);
        return v;
    }

}
