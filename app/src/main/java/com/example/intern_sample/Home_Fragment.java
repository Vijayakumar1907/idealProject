package com.example.intern_sample;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intern_sample.Home_helperClasses.FirstAdapter;
import com.example.intern_sample.Home_helperClasses.First_helperClass;
import com.example.intern_sample.Home_helperClasses.TopAdapter;
import com.example.intern_sample.Home_helperClasses.Top_HelperClass;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Home_Fragment extends Fragment {

    public Home_Fragment() {
        // Required empty public constructor
    }


    private int[] images;
    private SliderAdapter adapter;
    private SliderView sliderView;

    // Variables for slider two
    private int[] images_two;
    private String[] Produce_Desc;
    private String[] Produce_Price;
    private String[] Produce_timText;
    private String[] Produce_timerNumber;

    private SliderAdapter_Two adapter_two;
    private SliderView sliderView_two;

    // First Recycler view
    RecyclerView firstRecycler;
    Context context;
    RecyclerView.Adapter FirstRecyclerAdapter;

    // Top Recycler view
    RecyclerView TopRecycler;
    RecyclerView.Adapter TopRecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        sliderView = view.findViewById(R.id.AutoImage_Slider);

        images = new int[]{R.drawable.slider_one,
                R.drawable.slider_two,
                R.drawable.slider_three,
                R.drawable.slider_four,
                R.drawable.slider_five
                };

        adapter = new SliderAdapter(images);
        sliderView.setSliderAdapter(adapter);
        sliderView.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderView.setAutoCycle(true);
        sliderView.setScrollTimeInSec(4);

        //Today Deals SliderView
        sliderView_two = view.findViewById(R.id.AutoImage_SliderTwo);

        // Images for second slider
        images_two = new int[]{
          R.drawable.today_deal_one,
          R.drawable.today_deal_two,
          R.drawable.today_deal_three,
          R.drawable.today_deal_four
        };

        // TextView for Product Description
        Produce_Desc = new String[]{

                "Best Offers | pTron Brand Days",
                "Tecno Spark 7T | 6000 mAh Battery | 48MP Du...",
                "Precious Gold Coins and Bar",
                "Handpicked Laptops & Desktops from HP, Le..."
        };

        Produce_Price = new String[]{

                "$ 129.00 - $ 200.00",
                "$ 1000.00 - $ 5000.00",
                "$ 900.00 - $ 1500.00",
                "$ 6000.00 - $ 10000.00"
        };

        Produce_timText = new String[]{

                "Ends in",
                "Ends in",
                "Ends in",
                "Ends in"
        };

        Produce_timerNumber = new String[]{

                "06:38:45",
                "01:10:00",
                "02:56:05",
                "10:52:00"
        };


       //Setting up an adapter
        adapter_two = new SliderAdapter_Two(images_two,Produce_Desc,Produce_Price,Produce_timText,Produce_timerNumber);
        sliderView_two.setSliderAdapter(adapter_two);
        sliderView_two.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderView_two.setAutoCycle(true);



        firstRecycler = view.findViewById(R.id.horiz_Scroll_2);


        TopRecycler = view.findViewById(R.id.horiz_Scroll1);

        // First Recycler view
        firstRecycler();

        // Top Recycler view
        topRecycler();


        return view;
    }

    private void topRecycler() {
        TopRecycler.setHasFixedSize(true);
        TopRecycler.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        TopRecycler.setNestedScrollingEnabled(false);

        ArrayList<Top_HelperClass> top_help_list = new ArrayList<>();

        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_one,"Fridge"));
        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_two,"Light"));
        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_three,"Sofa"));
        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_one,"Fridge"));
        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_four,"Fashion"));
        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_five,"Electronics"));
        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_six,"Mobiles"));
        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_four,"Fashion"));
        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_one,"Fridge"));
        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_two,"Light"));
        top_help_list.add(new Top_HelperClass(R.drawable.ic_top_three,"Sofa"));


        TopRecyclerAdapter = new TopAdapter(top_help_list);
        TopRecycler.setAdapter(TopRecyclerAdapter);
    }

    private void firstRecycler() {
        firstRecycler.setHasFixedSize(true);
        firstRecycler.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<First_helperClass> firstHelperClasses = new ArrayList<>();

        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two_one));
        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two_two));
        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two_three));
        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two));
        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two_three));
        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two_two));
        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two));
        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two_three));
        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two_one));
        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two_two));
        firstHelperClasses.add(new First_helperClass(R.drawable.horiz_two_three));

        FirstRecyclerAdapter = new FirstAdapter(firstHelperClasses);
        firstRecycler.setAdapter(FirstRecyclerAdapter);
        firstRecycler.setNestedScrollingEnabled(false);

    }


}