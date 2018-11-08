package com.bookingmobil.jeff.bookingmobil;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ShowroomRecyclerViewAdapter extends RecyclerView.Adapter<ShowroomRecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Showroom> mData;

    public ShowroomRecyclerViewAdapter(Context mContext, List<Showroom> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_showroom, viewGroup, false);

        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_location.setText(mData.get(position).getLocation());
        holder.img.setImageResource(mData.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_name;
        private TextView tv_location;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = (TextView) itemView.findViewById(R.id.showroom_name);
            tv_location = (TextView) itemView.findViewById(R.id.showroom_location);
            img = (ImageView) itemView.findViewById(R.id.showroom_image);

        }
    }
}
