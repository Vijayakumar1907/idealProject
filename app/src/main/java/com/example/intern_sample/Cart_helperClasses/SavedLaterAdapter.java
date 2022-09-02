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

public class SavedLaterAdapter extends RecyclerView.Adapter<SavedLaterAdapter.SavedViewHolder> {

    ArrayList<SavedLater_helperClass> HelperList;

    public SavedLaterAdapter(ArrayList<SavedLater_helperClass> helperList) {
        HelperList = helperList;
    }

    @NonNull
    @Override
    public SavedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_saved_later_model,parent,false);
        SavedViewHolder savedViewHolder = new SavedViewHolder(view);
        return savedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SavedViewHolder holder, int position) {

        SavedLater_helperClass savedList = HelperList.get(position);

        holder.SavedName.setText(savedList.getProductNameCart());
        holder.SavedPrice.setText(savedList.getProductPriceCart());
        holder.SavedFreeShipping.setText(savedList.getFreeShippingCart());
        holder.SavedStock.setText(savedList.getInStockCart());
        holder.SavedColourQ.setText(savedList.getColorQue());
        holder.SavedColourA.setText(savedList.getColorAns());
        holder.SavedStyleQ.setText(savedList.getStyleQue());
        holder.SavedStyleA.setText(savedList.getStyleAns());
        holder.SavedDelete.setText(savedList.getDelete());
        holder.SavedMoveCart.setText(savedList.getMove_to_Cart());
    }

    @Override
    public int getItemCount() {
        return HelperList.size();
    }

    public static class SavedViewHolder extends RecyclerView.ViewHolder{

        TextView SavedName,SavedPrice,SavedFreeShipping,SavedStock,SavedColourQ,SavedColourA,SavedStyleQ,SavedStyleA,SavedDelete,SavedMoveCart;
        ImageView SavedMainImage;

        public SavedViewHolder(@NonNull View itemView) {
            super(itemView);

            SavedName = itemView.findViewById(R.id.Saved_Cart_ProductName);
            SavedPrice = itemView.findViewById(R.id.Saved_Cart_ProductPrice);
            SavedFreeShipping = itemView.findViewById(R.id.Saved_Shipping_type);
            SavedStock = itemView.findViewById(R.id.Saved_in_Stock);
            SavedColourQ = itemView.findViewById(R.id.Saved_product_color);
            SavedColourA = itemView.findViewById(R.id.Saved_product_color_ans);
            SavedStyleQ = itemView.findViewById(R.id.Saved_product_styleName);
            SavedStyleA = itemView.findViewById(R.id.Saved_product_styleAns);
            SavedDelete = itemView.findViewById(R.id.Saved_Cart_DeleteButton);
            SavedMoveCart = itemView.findViewById(R.id.Saved_MoveToCart_button);
            SavedMainImage = itemView.findViewById(R.id.Saved_Cart_imageView);
        }
    }
}
