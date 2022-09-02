package com.example.intern_sample.User_helperClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intern_sample.R;

import java.util.ArrayList;

public class YourOrderAdapter extends RecyclerView.Adapter<YourOrderAdapter.YourOrderViewHolder> {




    public YourOrderAdapter(ArrayList<YourOrder_helperClass> helper_list) {

        this.helper_list = helper_list;
    }

    ArrayList<YourOrder_helperClass> helper_list;

    @NonNull
    @Override
    public YourOrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View usr_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_yourorders_recycler,parent,false);
        YourOrderViewHolder yourOrderViewHolder = new YourOrderViewHolder(usr_view);
        return yourOrderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull YourOrderViewHolder holder, int position) {

        YourOrder_helperClass yourOrder_helperClass = helper_list.get(position);

        holder.imageYourOrder.setImageResource(yourOrder_helperClass.getYourOrderImage());
        holder.BuyAgainText.setText(yourOrder_helperClass.getBuyAgainText());
    }

    @Override
    public int getItemCount() {
        return helper_list.size();
    }

    public static class YourOrderViewHolder extends RecyclerView.ViewHolder{

        ImageView imageYourOrder;
        TextView BuyAgainText;
        public YourOrderViewHolder(@NonNull View itemView) {
            super(itemView);

            imageYourOrder = itemView.findViewById(R.id.User_yourOrderImage);
            BuyAgainText = itemView.findViewById(R.id.UserYourOrderBuyAgain);
        }
    }
}
