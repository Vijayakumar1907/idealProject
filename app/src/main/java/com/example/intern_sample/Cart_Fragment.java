package com.example.intern_sample;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intern_sample.Cart_helperClasses.FrequentlyPurchasedAdapter;
import com.example.intern_sample.Cart_helperClasses.FrequentlyPurchased_helperClass;
import com.example.intern_sample.Cart_helperClasses.ProductItemAdapter;
import com.example.intern_sample.Cart_helperClasses.ProductItem_helperClass;
import com.example.intern_sample.Cart_helperClasses.SavedLaterAdapter;
import com.example.intern_sample.Cart_helperClasses.SavedLater_helperClass;
import com.example.intern_sample.Cart_helperClasses.TopPicsAdapter;
import com.example.intern_sample.Cart_helperClasses.TopPics_helperClass;
import com.example.intern_sample.Home_helperClasses.TopAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Cart_Fragment extends Fragment {

    RecyclerView.Adapter ProductItemAdapter;
    Context context;
    RecyclerView recyclerProductItem;

    // Saved for laterRecycler
    RecyclerView.Adapter savedItemAdapter;
    RecyclerView SavedRecyclerView;

    // Repurchased Recycler
    RecyclerView.Adapter RepurchasedAdapter;
    RecyclerView RepurchasedRecycler;

    // Top Recycler
    RecyclerView.Adapter topAdapter;
    RecyclerView topRecyclerView;

    public Cart_Fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.cart_fragment, container, false);

        recyclerProductItem = view.findViewById(R.id.Product_itemsRecyclerView);
        SavedRecyclerView = view.findViewById(R.id.SaveLater_recycler);
        RepurchasedRecycler = view.findViewById(R.id.Frquently_purshasedRecycler);
        topRecyclerView = view.findViewById(R.id.TopPics_recycler);

        ProductItem();
        SavedItem();
        ReItems();
        TopItems();

        return view;
    }

    private void TopItems() {

        topRecyclerView.setHasFixedSize(true);
        topRecyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<TopPics_helperClass> topHelperClass = new ArrayList<>();

        topHelperClass.add(new TopPics_helperClass(R.drawable.today_deal_four,
                "GeoRic Protective Cover Compatible.",
                "$ 250.00","Add to Cart"));
        topHelperClass.add(new TopPics_helperClass(R.drawable.today_deal_three,
                "GeoRic Protective Cover Compatible.",
                "$ 250.00","Add to Cart"));
        topHelperClass.add(new TopPics_helperClass(R.drawable.today_deal_four,
                "GeoRic Protective Cover Compatible.",
                "$ 250.00","Add to Cart"));
        topHelperClass.add(new TopPics_helperClass(R.drawable.today_deal_two,
                "GeoRic Protective Cover Compatible.",
                "$ 250.00","Add to Cart"));
        topHelperClass.add(new TopPics_helperClass(R.drawable.today_deal_one,
                "GeoRic Protective Cover Compatible.",
                "$ 250.00","Add to Cart"));
        topHelperClass.add(new TopPics_helperClass(R.drawable.today_deal_three,
                "GeoRic Protective Cover Compatible.",
                "$ 250.00","Add to Cart"));
        topHelperClass.add(new TopPics_helperClass(R.drawable.today_deal_one,
                "GeoRic Protective Cover Compatible.",
                "$ 250.00","Add to Cart"));
        topHelperClass.add(new TopPics_helperClass(R.drawable.today_deal_two,
                "GeoRic Protective Cover Compatible.",
                "$ 250.00","Add to Cart"));


        topAdapter = new TopPicsAdapter(topHelperClass);
        topRecyclerView.setAdapter(topAdapter);
    }

    private void ReItems() {

        RepurchasedRecycler.setHasFixedSize(true);
        RepurchasedRecycler.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FrequentlyPurchased_helperClass> Repurchased_helperClass = new ArrayList<>();

        Repurchased_helperClass.add(new FrequentlyPurchased_helperClass(R.drawable.today_deal_one,
                "GeeRic Protective Cover Compatible.",
                "$ 520.00","Add to Cart"));

        Repurchased_helperClass.add(new FrequentlyPurchased_helperClass(R.drawable.today_deal_four,
                "GeeRic Protective Cover Compatible.",
                "$ 520.00","Add to Cart"));

        Repurchased_helperClass.add(new FrequentlyPurchased_helperClass(R.drawable.today_deal_two,
                "GeeRic Protective Cover Compatible.",
                "$ 520.00","Add to Cart"));

        Repurchased_helperClass.add(new FrequentlyPurchased_helperClass(R.drawable.today_deal_three,
                "GeeRic Protective Cover Compatible.",
                "$ 520.00","Add to Cart"));

        Repurchased_helperClass.add(new FrequentlyPurchased_helperClass(R.drawable.today_deal_one,
                "GeeRic Protective Cover Compatible.",
                "$ 520.00","Add to Cart"));

        Repurchased_helperClass.add(new FrequentlyPurchased_helperClass(R.drawable.today_deal_two,
                "GeeRic Protective Cover Compatible.",
                "$ 520.00","Add to Cart"));

        RepurchasedAdapter = new FrequentlyPurchasedAdapter(Repurchased_helperClass);
        RepurchasedRecycler.setAdapter(RepurchasedAdapter);
    }

    private void SavedItem() {

        SavedRecyclerView.setHasFixedSize(true);
        SavedRecyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));

        ArrayList<SavedLater_helperClass> savedHelperClass = new ArrayList<>();

        savedHelperClass.add(new SavedLater_helperClass(R.drawable.today_deal_three,"URBN 10000 mAh Li-Polymer Ultra Compact Power Bank with 12W Fast...",
                "$ 520","Eligible for FREE Shipping","In Stock",
                "Colour","Green","Style Name","American Model",
                "Delete","Move to Cart"));
        savedHelperClass.add(new SavedLater_helperClass(R.drawable.today_deal_three,"URBN 10000 mAh Li-Polymer Ultra Compact Power Bank with 12W Fast...",
                "$ 520","Eligible for FREE Shipping","In Stock",
                "Colour","Green","Style Name","American Model",
                "Delete","Move to Cart"));
        savedHelperClass.add(new SavedLater_helperClass(R.drawable.today_deal_three,"URBN 10000 mAh Li-Polymer Ultra Compact Power Bank with 12W Fast...",
                "$ 520","Eligible for FREE Shipping","In Stock",
                "Colour","Green","Style Name","American Model",
                "Delete","Move to Cart"));
        savedHelperClass.add(new SavedLater_helperClass(R.drawable.today_deal_three,"URBN 10000 mAh Li-Polymer Ultra Compact Power Bank with 12W Fast...",
                "$ 520","Eligible for FREE Shipping","In Stock",
                "Colour","Green","Style Name","American Model",
                "Delete","Move to Cart"));

        savedItemAdapter = new SavedLaterAdapter(savedHelperClass);
        SavedRecyclerView.setAdapter(savedItemAdapter);



    }

    private void ProductItem() {

        recyclerProductItem.setHasFixedSize(true);
        recyclerProductItem.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
       // recyclerProductItem.setNestedScrollingEnabled(true);


        ArrayList<ProductItem_helperClass> itemHelperClasses = new ArrayList<>();

        itemHelperClasses.add(new ProductItem_helperClass(R.drawable.today_deal_three,R.drawable.ic_plus,R.drawable.ic_minus,"URBN 10000 mAh Li-Polymer Ultra Compact Power Bank with 12W Fast...",
                "$250.00","Eligible for FREE Shipping","In Stock",
                "Colour :",
                "Green","Style Name","1000 mAh","Delete",
                "Save for Later"));

        itemHelperClasses.add(new ProductItem_helperClass(R.drawable.today_deal_three,R.drawable.ic_plus,R.drawable.ic_minus,"URBN 10000 mAh Li-Polymer Ultra Compact Power Bank with 12W Fast...",
                "$250.00","Eligible for FREE Shipping","In Stock","Colour :",
                "Green","Style Name","1000 mAh","Delete","Save for Later"));

        itemHelperClasses.add(new ProductItem_helperClass(R.drawable.today_deal_four,R.drawable.ic_plus,R.drawable.ic_minus,"URBN 10000 mAh Li-Polymer Ultra Compact Power Bank with 12W Fast...",
                "$250.00","Eligible for FREE Shipping","In Stock","Colour :",
                "Green","Style Name","1000 mAh","Delete","Save for Later"));

        itemHelperClasses.add(new ProductItem_helperClass(R.drawable.today_deal_one,R.drawable.ic_plus,R.drawable.ic_minus,"URBN 10000 mAh Li-Polymer Ultra Compact Power Bank with 12W Fast...",
                "$250.00","Eligible for FREE Shipping","In Stock","Colour :",
                "Green","Style Name","1000 mAh","Delete","Save for Later"));

        itemHelperClasses.add(new ProductItem_helperClass(R.drawable.today_deal_one,R.drawable.ic_plus,R.drawable.ic_minus,
                "URBN 10000 mAh Li-Polymer Ultra Compact Power Bank with 12W Fast...",
                "$ 250.00","Eligible for free delivery",
                "In Stock","Colour","Red","Style Name","4323 mAh",
                "Delete","Save for later"));

        ProductItemAdapter = new ProductItemAdapter(itemHelperClasses);
        recyclerProductItem.setAdapter(ProductItemAdapter);

    }
}