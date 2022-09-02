package com.example.intern_sample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG =MainActivity.class.getSimpleName();
    SearchView searchView;
    AnimatedBottomBar animatedBottomBar;
    FragmentManager fragmentManager;
    RelativeLayout relativeLayout;


    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        searchView = findViewById(R.id.Search_View);
        searchView.setQueryHint("Search in amazon.in");
        //searchView.setIconified(false);
        //searchView.setBackgroundColor(R.color.white);
        searchView.setIconifiedByDefault(false);


        animatedBottomBar = findViewById(R.id.animBottom_appBar);
        relativeLayout = findViewById(R.id.ToolBarLayout);

        if (savedInstanceState==null){
            animatedBottomBar.selectTabById(R.id.Home_bottomBar,true);
            fragmentManager = getSupportFragmentManager();
            Home_Fragment home_fragment = new Home_Fragment();
            fragmentManager.beginTransaction().replace(R.id.Fragmentcontainer,home_fragment).commit();
        }

        animatedBottomBar.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int lastIndex, @Nullable AnimatedBottomBar.Tab lastTab, int newIndex, @NotNull AnimatedBottomBar.Tab newTab) {

                Fragment fragment = null;
                switch (newTab.getId()){
                    case R.id.Home_bottomBar:
                        fragment = new Home_Fragment();
                        break;
                    case R.id.User_bottomBar:
                        relativeLayout.setEnabled(false);
                        fragment = new UserFragment();
                        break;
                    case R.id.Cart_bottomBar:
                        fragment = new Cart_Fragment();
                        break;
                    case R.id.Menu_bottomBar:
                        fragment = new MenuFragment();
                        break;
                }

                if (fragment!=null){
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.Fragmentcontainer,fragment).commit();
                }else {
                    Log.e(TAG,"Error in creating the fragment");
                }

            }

            @Override
            public void onTabReselected(int i, @NotNull AnimatedBottomBar.Tab tab) {

                Fragment fragment = null;

                switch (tab.getId()){
                    case R.id.Home_bottomBar:
                        fragment = new Home_Fragment();
                        break;
                    case R.id.User_bottomBar:
                        fragment = new UserFragment();
                        break;
                    case R.id.Cart_bottomBar:
                        fragment = new Cart_Fragment();
                        break;
                    case R.id.Menu_bottomBar:
                        fragment = new MenuFragment();
                        break;
                }


                if (fragment!=null){
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.Fragmentcontainer,fragment).commit();
                }else {
                    Log.e(TAG,"Error in reselceting the fragment");
                }
            }
        });

    }
}