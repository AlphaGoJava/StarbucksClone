package com.example.pci_project.Order;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pci_project.Home.HomeAdapter;
import com.example.pci_project.Home.HomeDTO;
import com.example.pci_project.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class OrderFragment extends Fragment {

    TabLayout tab_layout, tab_layout1;
    ArrayList<OrderDTO> list;
    OrderAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_order, container, false);
//==================================================================================================
        RecyclerView rec_select = v.findViewById(R.id.rec_select);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext(), RecyclerView.VERTICAL, false);

        ArrayList<OrderDTO> list1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            list1.add(new OrderDTO(R.drawable.jamong,"자몽 허니 블랙 티" ));
        }

        rec_select.setAdapter(adapter);
        rec_select.setLayoutManager(manager);
//==================================================================================================
        list = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            list.add(new OrderDTO(R.drawable.jamong,"자몽 허니 블랙 티" ));
            list.add(new OrderDTO(R.drawable.americano,"아이스 아메리카노" ));
            list.add(new OrderDTO(R.drawable.shucream,"슈크림 라떼" ));
            list.add(new OrderDTO(R.drawable.mint,"민트 초콜릿 블렌디드" ));
            list.add(new OrderDTO(R.drawable.malcha,"딸기 드림 말차 라떼" ));
        }
        adapter = new OrderAdapter(inflater, list);
        tab_layout = v.findViewById(R.id.tab_layout);
        tab_layout.addTab(tab_layout.newTab().setText("음료").setId(0));
        tab_layout.addTab(tab_layout.newTab().setText("푸드").setId(1));
        tab_layout.addTab(tab_layout.newTab().setText("상품").setId(2));

        tab_layout1 = v.findViewById(R.id.tab_layout1);
        tab_layout1.addTab(tab_layout1.newTab().setText("전체 메뉴").setId(0));
        //tab_layout1.addTab(tab_layout1.newTab().setText("나만의 메뉴").setId(1));

        tab_layout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                adapter.list = changeData(tab);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        rec_select.setAdapter(adapter);
        return v;
    }

    private ArrayList<OrderDTO> changeData(TabLayout.Tab tab) {
        ArrayList<OrderDTO> list = new ArrayList<>();

        if (tab.getPosition() == 0) {
            for (int i = 1; i <= 10; i++) {
                list.add(new OrderDTO(R.drawable.jamong,"자몽 허니 블랙 티" ));
                list.add(new OrderDTO(R.drawable.americano,"아이스 아메리카노" ));
                list.add(new OrderDTO(R.drawable.shucream,"슈크림 라떼" ));
                list.add(new OrderDTO(R.drawable.mint,"민트 초콜릿 블렌디드" ));
                list.add(new OrderDTO(R.drawable.malcha,"딸기 드림 말차 라떼" ));
            }

        } else if (tab.getPosition() == 1) {
            for (int i = 1; i <= 10; i++) {
                list.add(new OrderDTO(R.drawable.bread, "브레드"));
                list.add(new OrderDTO(R.drawable.cakebread, "케이크"));
                list.add(new OrderDTO(R.drawable.send, "샌드위치"));
                list.add(new OrderDTO(R.drawable.snack, "스낵"));
                list.add(new OrderDTO(R.drawable.ice, "아이스크림"));

            }

        }else if (tab.getPosition() == 2) {
            for (int i = 1; i <= 10; i++) {
                list.add(new OrderDTO(R.drawable.tum1, "벚꽃 텀블러"));
                list.add(new OrderDTO(R.drawable.tum2, "망고 텀블러"));
                list.add(new OrderDTO(R.drawable.tum3, "소다 텀블러"));
                list.add(new OrderDTO(R.drawable.tum4, "베이지 텀블러"));
                list.add(new OrderDTO(R.drawable.tum5, "하늘 텀블러"));
            }
        }
        adapter.setList(list);
        adapter.notifyDataSetChanged();
        return list;
    }
}