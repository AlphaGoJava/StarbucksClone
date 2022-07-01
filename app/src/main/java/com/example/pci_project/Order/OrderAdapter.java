package com.example.pci_project.Order;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pci_project.R;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder>{

    LayoutInflater inflater;
    ArrayList<OrderDTO> list;

    public ArrayList<OrderDTO> getList() {
        return list;
    }

    public void setList(ArrayList<OrderDTO> list) {
        this.list = list;
    }

    public OrderAdapter(LayoutInflater inflater, ArrayList<OrderDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_order, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.rec_tv.setText(list.get(i).getName());
        holder.jamong.setImageResource(list.get(i).getImag_url());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        View itemview;
        ImageView jamong;
        TextView rec_tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemview = itemView;

            rec_tv = itemview.findViewById(R.id.rec_tv);
            jamong = itemview.findViewById(R.id.jamong);
        }


    }


}
