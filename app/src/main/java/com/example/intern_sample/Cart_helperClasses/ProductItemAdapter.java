package com.example.intern_sample.Cart_helperClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intern_sample.R;

import java.util.ArrayList;

public class ProductItemAdapter extends RecyclerView.Adapter<ProductItemAdapter.ItemViewHolder> {

    ArrayList<ProductItem_helperClass> ItemHelper_list;

    public ProductItemAdapter(ArrayList<ProductItem_helperClass> itemHelper_list) {
        ItemHelper_list = itemHelper_list;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_product_item_model,parent,false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        ProductItem_helperClass item_helperClass = ItemHelper_list.get(position);

       // item_helperClass.getEtNumm().setText((CharSequence) holder.numTimes);
        holder.ProName.setText(item_helperClass.getProductNameCart());
        holder.ProPrice.setText(item_helperClass.getProductPriceCart());
        holder.FreeShip.setText(item_helperClass.getFreeShippingCart());
        holder.Stocks.setText(item_helperClass.getInStockCart());
        holder.ColorQ.setText(item_helperClass.getColorQue());
        holder.ColorAns.setText(item_helperClass.getColorAns());
        holder.Styleq.setText(item_helperClass.getStyleQue());
        holder.Styleans.setText(item_helperClass.getStyleAns());
        holder.Del.setText(item_helperClass.getDelete());
        holder.svLater.setText(item_helperClass.getSaveLater());

        holder.MainImg.setImageResource(item_helperClass.getMainImage());
        holder.PlusImg.setImageResource(item_helperClass.getPlusImage());
        holder.MinusImg.setImageResource(item_helperClass.getMinusImage());



    }

    @Override
    public int getItemCount() {
        return ItemHelper_list.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder{

       // EditText numTimes;
        TextView ProName,ProPrice,FreeShip,Stocks,ColorQ,ColorAns,Styleq,Styleans,Del,svLater;
        ImageView MainImg,PlusImg,MinusImg;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);


          //  numTimes = itemView.findViewById(R.id.product_count);
            ProName = itemView.findViewById(R.id.Cart_ProductName);
            ProPrice = itemView.findViewById(R.id.Cart_ProductPrice);
            FreeShip = itemView.findViewById(R.id.Shipping_type);
            Stocks = itemView.findViewById(R.id.in_Stock);
            ColorQ = itemView.findViewById(R.id.product_color);
            ColorAns = itemView.findViewById(R.id.product_color_ans);
            Styleq = itemView.findViewById(R.id.product_styleName);
            Styleans = itemView.findViewById(R.id.product_styleAns);
            Del = itemView.findViewById(R.id.Cart_DeleteButton);
            svLater = itemView.findViewById(R.id.Cart_Saveforlater_button);
            MainImg = itemView.findViewById(R.id.Cart_imageView);
            PlusImg = itemView.findViewById(R.id.plusImage);
            MinusImg = itemView.findViewById(R.id.minusImage);
        }
    }
}
