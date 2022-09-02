package com.example.intern_sample;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intern_sample.User_helperClasses.YourAccountAdapter;
import com.example.intern_sample.User_helperClasses.YourAccount_helperClass;
import com.example.intern_sample.User_helperClasses.YourOrderAdapter;
import com.example.intern_sample.User_helperClasses.YourOrder_helperClass;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class UserFragment extends Fragment {

    // Your Order Recyclerview
    RecyclerView recyclerYourOrder;
    RecyclerView.Adapter your_Adapter;

    Context context;

    // Your Account Recyclerview
    RecyclerView recyclerYour_account;
    RecyclerView.Adapter account_Adapter;

    public UserFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.user_fragment, container, false);

        recyclerYourOrder = view.findViewById(R.id.YourOrder_Recycler);
        recyclerYour_account = view.findViewById(R.id.Your_AccountRecycler);

        Your_Order_fun();
        Your_Account_fun();
        return view;

        //YourOrder function


    }

    private void Your_Account_fun() {

        recyclerYour_account.setHasFixedSize(true);
        recyclerYour_account.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        recyclerYour_account.setNestedScrollingEnabled(false);

        ArrayList<YourAccount_helperClass> YourAcclist = new ArrayList<>();

        YourAcclist.add(new YourAccount_helperClass("Ideal pay"));
        YourAcclist.add(new YourAccount_helperClass("Ideal prime"));
        YourAcclist.add(new YourAccount_helperClass("Your Browsing History"));
        YourAcclist.add(new YourAccount_helperClass("Subscribe & save"));

        account_Adapter = new YourAccountAdapter(YourAcclist);
        recyclerYour_account.setAdapter(account_Adapter);
    }

    private void Your_Order_fun() {

        recyclerYourOrder.setHasFixedSize(true);
        recyclerYourOrder.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        recyclerYourOrder.setNestedScrollingEnabled(false);

        ArrayList<YourOrder_helperClass> YourOrderlist = new ArrayList<>();

        YourOrderlist.add(new YourOrder_helperClass(R.drawable.slider_one,"Buy Again"));
        YourOrderlist.add(new YourOrder_helperClass(R.drawable.slider_two,"Buy Again"));
        YourOrderlist.add(new YourOrder_helperClass(R.drawable.slider_three,"Buy Again"));
        YourOrderlist.add(new YourOrder_helperClass(R.drawable.slider_four,"Buy Again"));
        YourOrderlist.add(new YourOrder_helperClass(R.drawable.slider_five,"Buy Again"));
        YourOrderlist.add(new YourOrder_helperClass(R.drawable.slider_one,"Buy Again"));

        your_Adapter = new YourOrderAdapter(YourOrderlist);
        recyclerYourOrder.setAdapter(your_Adapter);


    }


}