package com.example.dhikacompany.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dhikacompany.R;
import com.example.dhikacompany.model.ModelOrganitation;

import java.util.List;

public class AdapterOrganitation extends RecyclerView.Adapter<AdapterOrganitation.ViewHolder>{
    private Context context;
    private List<ModelOrganitation> listData;
    private LayoutInflater mInflater;

    public AdapterOrganitation(List<ModelOrganitation> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterOrganitation.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view_organitation, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterOrganitation.ViewHolder holder, int position) {
        ModelOrganitation items = this.listData.get(position);

        holder.tvNama.setText(items.getNama());
        holder.tvJabatan.setText(items.getJabatan());
        holder.tvMasa.setText(items.getMasa());
        holder.ivImage.setImageResource(items.getImage());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvNama, tvJabatan, tvMasa;
        ImageView ivImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvJabatan = itemView.findViewById(R.id.tvJabatan);
            tvMasa = itemView.findViewById(R.id.tvMasaJabatan);
            ivImage = itemView.findViewById(R.id.ivImage);
        }

    }


}
