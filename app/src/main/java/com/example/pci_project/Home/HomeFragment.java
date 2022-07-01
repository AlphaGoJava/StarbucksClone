package com.example.pci_project.Home;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pci_project.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView rec_select = v.findViewById(R.id.rec_select);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext(), RecyclerView.HORIZONTAL, false);

        ArrayList<HomeDTO> list = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            list.add(new HomeDTO(R.drawable.jamong,"자몽 허니 블랙 티" ));
            list.add(new HomeDTO(R.drawable.americano,"아이스 아메리카노" ));
            list.add(new HomeDTO(R.drawable.shucream,"슈크림 라떼" ));
            list.add(new HomeDTO(R.drawable.mint,"민트 초콜릿 블렌디드" ));
            list.add(new HomeDTO(R.drawable.malcha,"딸기 드림 말차 라떼" ));
        }

        HomeAdapter adapter = new HomeAdapter(inflater, list);
        //RecyclerView rec_view = v.findViewById(R.id.rec_tv);


        rec_select.setAdapter(adapter);
        rec_select.setLayoutManager(manager);
        return v;
    }
}