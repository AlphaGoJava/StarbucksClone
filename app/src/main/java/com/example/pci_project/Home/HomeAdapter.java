package com.example.pci_project.Home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pci_project.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.Home>{
    LayoutInflater inflater;    // ★ 화면을 붙이기 위한 객체가 필요함 ★
    ArrayList<HomeDTO> list;

    public HomeAdapter(LayoutInflater inflater, ArrayList<HomeDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    // 3. ViewHolder 를 만드는 행위를 함
    // 맨 처음에 아직 화면 셋팅이 안되어있을 때
    @NonNull
    @Override
    public Home onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_homerecview, parent, false);
        return new Home(itemView);
    }

    // 데이터를 실제로 처리 해주는 부분
    @Override
    public void onBindViewHolder(@NonNull Home holder, int i) {
        holder.rec_tv.setText(list.get(i).getName());
        holder.jamong.setImageResource(list.get(i).getImag_url());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // 1. 뷰 홀더 클래스 생성, RecyclerView.Adapter ← VH ← 클래스를 의미함
    // instance of 같은 객체 형태로 만듬 RecyclerView.ViewHolder
    public class Home extends RecyclerView.ViewHolder{
        View itemview;
        ImageView jamong;
        TextView rec_tv;
        public Home(@NonNull View itemView) {
            super(itemView);
            this.itemview = itemView;

            rec_tv = itemview.findViewById(R.id.rec_tv);
            jamong = itemview.findViewById(R.id.jamong);
        }
    }
}










