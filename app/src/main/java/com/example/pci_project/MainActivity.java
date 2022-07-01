package com.example.pci_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.pci_project.Gift.GiftFragment;
import com.example.pci_project.Home.HomeFragment;
import com.example.pci_project.Order.OrderFragment;
import com.example.pci_project.Other.OtherFragment;
import com.example.pci_project.Pay.PayFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;
    BottomNavigationView bottom_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();

        changeFragment(new HomeFragment());

        bottom_nav = findViewById(R.id.bottom_nav);

        bottom_nav.setItemIconTintList(null);

        bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // 바텀 네비게이션 메뉴가 바뀔 때 마다 토스트창 띄우기
                // 프래그먼트가 각각의 화면에 맞게 전환 됨
                if (item.getItemId() == R.id.tab1){
                    changeFragment(new HomeFragment());
                }else if (item.getItemId() == R.id.tab2){
                    changeFragment(new PayFragment());
                }else if (item.getItemId() == R.id.tab3){
                    changeFragment(new OrderFragment());
                }else if (item.getItemId() == R.id.tab4) {
                    changeFragment(new GiftFragment());
                }else if (item.getItemId() == R.id.tab5){
                    changeFragment(new OtherFragment());
                }
                return true;
            }
        });
    }

    public void changeFragment(Fragment fragment){   /* 플래그먼트가 바뀌면서 */
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}