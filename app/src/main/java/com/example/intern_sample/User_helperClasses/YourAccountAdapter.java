package com.example.intern_sample.User_helperClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intern_sample.R;

import java.util.ArrayList;

public class YourAccountAdapter extends RecyclerView.Adapter<YourAccountAdapter.YourAccountViewHolder> {

    ArrayList<YourAccount_helperClass> Account_list;

    public YourAccountAdapter(ArrayList<YourAccount_helperClass> account_list) {
        Account_list = account_list;
    }

    @NonNull
    @Override
    public YourAccountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_youraccount_recycler,parent,false);
        YourAccountViewHolder yourAccountViewHolder = new YourAccountViewHolder(view);
        return yourAccountViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull YourAccountViewHolder holder, int position) {

        YourAccount_helperClass helperClass = Account_list.get(position);

        holder.Your_accounts.setText(helperClass.getYourAccounts_text());

    }

    @Override
    public int getItemCount() {
        return Account_list.size();
    }

    public static class YourAccountViewHolder extends RecyclerView.ViewHolder{

        TextView Your_accounts;

        public YourAccountViewHolder(@NonNull View itemView) {
            super(itemView);

            Your_accounts = itemView.findViewById(R.id.YourAccountText);
        }
    }
}
