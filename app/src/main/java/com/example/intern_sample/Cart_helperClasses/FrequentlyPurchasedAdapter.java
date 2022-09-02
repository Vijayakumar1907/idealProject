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

public class FrequentlyPurchasedAdapter extends RecyclerView.Adapter<FrequentlyPurchasedAdapter.FrequentViewHolder> {

    ArrayList<FrequentlyPurchased_helperClass> re_HelperList;

    public FrequentlyPurchasedAdapter(ArrayList<FrequentlyPurchased_helperClass> re_HelperList) {
        this.re_HelperList = re_HelperList;
    }

    @NonNull
    @Override
    public FrequentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_frequently_repurchased_model,parent,false);
        FrequentViewHolder frequentViewHolder = new FrequentViewHolder(view);
        return frequentViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FrequentViewHolder holder, int position) {

        FrequentlyPurchased_helperClass FrequentList = re_HelperList.get(position);

        holder.ImgRepurchased.setImageResource(FrequentList.getImageRepurchased());
        holder.ReMainText.setText(FrequentList.getRepurchased_MainText());
        holder.RePrice.setText(FrequentList.getRepurchased_Price());
        holder.ReCart.setText(FrequentList.getRepurchased_AddToCart());

    }

    @Override
    public int getItemCount() {
        return re_HelperList.size();
    }

    public static class FrequentViewHolder extends RecyclerView.ViewHolder {

        ImageView ImgRepurchased;
        TextView ReMainText,RePrice,ReCart;

        public FrequentViewHolder(@NonNull View itemView) {
            super(itemView);

            ImgRepurchased = itemView.findViewById(R.id.RepurchaseMain_img);
            ReMainText = itemView.findViewById(R.id.Repuchase_mainText);
            RePrice = itemView.findViewById(R.id.Repurchase_Price);
            ReCart = itemView.findViewById(R.id.Repurchase_AddtoCart);

        }
    }
}
