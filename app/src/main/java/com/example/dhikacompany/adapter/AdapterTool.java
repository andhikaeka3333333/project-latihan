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
import com.example.dhikacompany.model.ModelCompany;
import com.example.dhikacompany.model.ModelTools;

import java.util.List;

public class AdapterTool extends RecyclerView.Adapter<AdapterTool.ViewHolder>{
    private Context context;
    private List<ModelTools> listData;
    private LayoutInflater mInflater;

    public AdapterTool(List<ModelTools> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterTool.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view_tools, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTool.ViewHolder holder, int position) {
        ModelTools items = this.listData.get(position);

        holder.tvNamaTools.setText(items.getTools());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNamaTools;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaTools = itemView.findViewById(R.id.tvTool);
        }
    }


}
