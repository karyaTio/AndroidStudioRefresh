package com.bookingmobil.jeff.bookingmobil;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class CarRecyclerViewAdapter extends RecyclerView.Adapter<CarRecyclerViewAdapter.CarHolder> {

    Context mContext;
    List<Car> mData;
    Dialog mDialog;

    public CarRecyclerViewAdapter(Context mContext, List<Car> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CarHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;

        v = LayoutInflater.from(mContext).inflate(R.layout.item_car, viewGroup, false);
        final CarHolder carHolder = new CarHolder(v);

        mDialog = new Dialog(mContext);
        mDialog.setContentView(R.layout.dialog_book);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        carHolder.item_car.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                TextView tv_dialog_name = (TextView) mDialog.findViewById(R.id.dialog_car_name);
                TextView tv_dialog_merek = (TextView) mDialog.findViewById(R.id.dialog_car_merek);
                TextView tv_dialog_harga = (TextView) mDialog.findViewById(R.id.dialog_car_harga);
                TextView tv_dialog_model = (TextView) mDialog.findViewById(R.id.dialog_car_model);
                ImageView img_dialog = (ImageView) mDialog.findViewById(R.id.dialog_car_image);

                tv_dialog_name.setText(mData.get(carHolder.getAdapterPosition()).getName());
                tv_dialog_merek.setText(mData.get(carHolder.getAdapterPosition()).getMerek());
                tv_dialog_harga.setText(mData.get(carHolder.getAdapterPosition()).getHarga());
                tv_dialog_model.setText(mData.get(carHolder.getAdapterPosition()).getModel());
                img_dialog.setImageResource(mData.get(carHolder.getAdapterPosition()).getGambar());
//                Toast.makeText(mContext, "Tes Click " + String.valueOf(carHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                mDialog.show();
            }
        });
        return carHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CarHolder carHolder, int i) {

        carHolder.tv_name.setText(mData.get(i).getName());
        carHolder.tv_merek.setText(mData.get(i).getMerek());
        carHolder.img.setImageResource(mData.get(i).getGambar());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class CarHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_car;
        private TextView tv_name;
        private TextView tv_merek;
        private ImageView img;

        public CarHolder(@NonNull View itemView) {
            super(itemView);

            item_car = (LinearLayout) itemView.findViewById(R.id.item_car_id);
            tv_name = (TextView) itemView.findViewById(R.id.car_name);
            tv_merek = (TextView) itemView.findViewById(R.id.car_merek);
            img = (ImageView) itemView.findViewById(R.id.car_image);
        }
    }
}
