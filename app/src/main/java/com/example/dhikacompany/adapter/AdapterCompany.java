package com.example.dhikacompany.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.dhikacompany.model.ModelCompany;
import com.example.dhikacompany.R;

import java.util.List;

public class AdapterCompany extends RecyclerView.Adapter<AdapterCompany.ViewHolder>{
    private Context context;
    private List<ModelCompany> listData;
    private LayoutInflater mInflater;

    public AdapterCompany(List<ModelCompany> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterCompany.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view_company, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCompany.ViewHolder holder, int position) {
        ModelCompany items = this.listData.get(position);

        holder.tvNamaCompany.setText(items.getName());
        holder.tvDeskripsi.setText(items.getDescription());
        holder.ivImageCompany.setImageResource(items.getImage());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvNamaCompany, tvDeskripsi;
        ImageView ivImageCompany;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaCompany = itemView.findViewById(R.id.tvNamaCompany);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsiCompany);
            ivImageCompany = itemView.findViewById(R.id.ivImageCompany);
        }

    }


}
