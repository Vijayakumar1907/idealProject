package com.example.intern_sample.Home_helperClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intern_sample.R;

import java.util.ArrayList;

// STEP 1 : extends RecyclerView.Adapter
// STEP 2 : Create Arraylist of type HelperClass(First_helperClass)
// STEP 3 : Generate Constructor for that ArrayList

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.FirstViewHolder> {

    // Declare ArrayList
    ArrayList<First_helperClass> first_helperClassm;

    // Generate Constructor for the arrayList
    public FirstAdapter(ArrayList<First_helperClass> first_helperClass) {
        this.first_helperClassm = first_helperClass;
    }

    @NonNull
    @Override
    public FirstViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.first_recyclerview_model,parent,false);
        FirstViewHolder firstViewHolder = new FirstViewHolder(view);
        return firstViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FirstViewHolder holder, int position) {

        First_helperClass first_helperClass = first_helperClassm.get(position);

        holder.imageViewFirst.setImageResource(first_helperClass.getImages());

    }

    @Override
    public int getItemCount() {
        return first_helperClassm.size();
    }

    //3
    public static class FirstViewHolder extends RecyclerView.ViewHolder{ //4

        ImageView imageViewFirst;

        public FirstViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewFirst = itemView.findViewById(R.id.ImageFirst);
        }
    }
}
