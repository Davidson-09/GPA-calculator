package com.android.bignerdranch.gpa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 vp;
    ViewPagerAdapter adapter;
    TabLayout tabLayout;

    private String[] titles = new String[]{"1st", "2nd"};

    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.viewPager2);
        adapter = new ViewPagerAdapter();
        vp.setAdapter(adapter);

        tabLayout = findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, vp,
                (tab, position) -> tab.setText(titles[position])
        ).attach();
    }
}
