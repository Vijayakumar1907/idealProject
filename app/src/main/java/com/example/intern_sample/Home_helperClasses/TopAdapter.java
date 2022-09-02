package com.example.intern_sample.Home_helperClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intern_sample.R;

import java.util.ArrayList;

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.TopViewHolder> {

    ArrayList<Top_HelperClass> top_list_helper;

    public TopAdapter(ArrayList<Top_HelperClass> top_list_helper) {
        this.top_list_helper = top_list_helper;
    }

    @NonNull
    @Override
    public TopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_recyclerview_model,parent,false);
        TopViewHolder topViewHolder = new TopViewHolder(view);
        return topViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TopViewHolder holder, int position) {

        Top_HelperClass top_helperClass = top_list_helper.get(position);

        holder.imageViewTop.setImageResource(top_helperClass.getImage_top());
        holder.textViewTop.setText(top_helperClass.getImg_text());


    }

    @Override
    public int getItemCount() {
        return top_list_helper.size();
    }

    public static class TopViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewTop;
        TextView textViewTop;

        public TopViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewTop = itemView.findViewById(R.id.image_top);
            textViewTop = itemView.findViewById(R.id.text_top);
        }
    }
}
