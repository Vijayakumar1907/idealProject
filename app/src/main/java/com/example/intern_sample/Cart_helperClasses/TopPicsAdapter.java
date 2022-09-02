package com.example.intern_sample.Cart_helperClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intern_sample.R;

import java.util.ArrayList;

public class TopPicsAdapter extends RecyclerView.Adapter<TopPicsAdapter.TopViewHolder> {

    ArrayList<TopPics_helperClass> helperList;

    public TopPicsAdapter(ArrayList<TopPics_helperClass> helperList) {
        this.helperList = helperList;
    }

    @NonNull
    @Override
    public TopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_toppics_model,parent,false);
        TopViewHolder topViewHolder = new TopViewHolder(view);
        return topViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TopViewHolder holder, int position) {

        TopPics_helperClass helperlists = helperList.get(position);

        holder.ImgTop.setImageResource(helperlists.getImageTop());
        holder.TopMainText.setText(helperlists.getTop_MainText());
        holder.TopPrice.setText(helperlists.getTop_Price());
        holder.TopCart.setText(helperlists.getTop_AddToCart());


    }

    @Override
    public int getItemCount() {
        return helperList.size();
    }

    public static class TopViewHolder extends RecyclerView.ViewHolder{

        ImageView ImgTop;
        TextView TopMainText,TopPrice,TopCart;
        public TopViewHolder(@NonNull View itemView) {
            super(itemView);

            ImgTop = itemView.findViewById(R.id.TopMain_img);
            TopMainText = itemView.findViewById(R.id.Top_mainText);
            TopPrice = itemView.findViewById(R.id.Top_Price);
            TopCart = itemView.findViewById(R.id.Top_AddtoCart);
        }
    }
}
