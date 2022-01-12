package com.example.test1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

    TabLayout tablayout;
    ViewPager viewpager;
    FloatingActionButton fb,gg,insta;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tablayout = (TabLayout) findViewById(R.id.tab_layout);
        viewpager = (ViewPager)findViewById(R.id.view_pager);
//        fb = findViewById(R.id.fab_fb);
        gg = findViewById(R.id.fab_google);
//        insta = findViewById(R.id.fab_instagram);


        tablayout.addTab(tablayout.newTab().setText("Login"));
        tablayout.addTab(tablayout.newTab().setText("Signup"));
        tablayout.setTabGravity(TabLayout.GRAVITY_FILL);

        FragmentManager manager = getSupportFragmentManager();
        com.example.test1.LoginAdapter adapter = new com.example.test1.LoginAdapter(manager);
        viewpager.setAdapter(adapter);

        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));
        tablayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewpager));

//        fb.setTranslationY(300);
        gg.setTranslationY(300);
//        insta.setTranslationY(300);
        tablayout.setTranslationX(600);

//        fb.setAlpha(v);
        gg.setAlpha(v);
//        insta.setAlpha(v);
        tablayout.setAlpha(v);

//        fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        gg.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
//        insta.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        tablayout.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(1000).start();

    }
}