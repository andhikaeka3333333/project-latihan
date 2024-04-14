package com.example.dhikacompany;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dhikacompany.adapter.AdapterCompany;
import com.example.dhikacompany.adapter.AdapterTool;
import com.example.dhikacompany.model.ModelCompany;
import com.example.dhikacompany.model.ModelTools;

import java.util.ArrayList;
import java.util.List;

public class PreviewProduct extends AppCompatActivity {

    //Risaikel piu

    List<ModelTools> items;
    RecyclerView recyclerView;
    AdapterTool adapter;

    ImageView ivGambarProduk, ivArrowBack;
    TextView tvNamaProduk, tvHarga;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_product);

        ivGambarProduk = findViewById(R.id.ivGambarProduk);
        ivArrowBack = findViewById(R.id.ivArrowBack);
        tvNamaProduk = findViewById(R.id.tvNamaProduk);
        tvHarga = findViewById(R.id.tvHarga);

        ivArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        // Add items to the list
        items = new ArrayList<ModelTools>();


        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");


        switch (nama) {
            case "Web Application":
                tvNamaProduk.setText("Web Application");
                tvHarga.setText("Web Application");
                ivGambarProduk.setImageResource(R.drawable.round_web_24);
                items.add(new ModelTools("VS Code"));
                items.add(new ModelTools("Chrome Browser"));
                items.add(new ModelTools("Node JS"));
                break;
            case "Android Application":
                tvNamaProduk.setText("Android Application");
                tvHarga.setText("Android Application");
                ivGambarProduk.setImageResource(R.drawable.round_android_24);
                items.add(new ModelTools("Android Studio"));
                items.add(new ModelTools("Java Development Kit"));
                items.add(new ModelTools("LD Player Emulator"));
                break;
            case "IOS Application":
                tvNamaProduk.setText("IOS Application");
                tvHarga.setText("IOS Application");
                ivGambarProduk.setImageResource(R.drawable.round_phone_iphone_24);
                items.add(new ModelTools("VS Code"));
                items.add(new ModelTools("Flutter Framework (Optional)"));
                items.add(new ModelTools("Swift (Optional)"));
                break;
            case "Dekstop Application":
                tvNamaProduk.setText("Dekstop Application");
                tvHarga.setText("Dekstop Application");
                ivGambarProduk.setImageResource(R.drawable.round_laptop_windows_24);
                items.add(new ModelTools("Microsoft Visual Studio"));
                items.add(new ModelTools("SQL Server Management"));
                items.add(new ModelTools("Another SQL Server"));
                break;
            case "Game Application":
                tvNamaProduk.setText("Game Application");
                tvHarga.setText("Game Application");
                ivGambarProduk.setImageResource(R.drawable.round_videogame_asset_24);
                items.add(new ModelTools("Microsoft Visual Studio"));
                items.add(new ModelTools("Unity"));
                items.add(new ModelTools("Unreal"));
                items.add(new ModelTools("Blunder"));
                break;
        }

        recyclerView = findViewById(R.id.rvTools);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterTool(items, this);
        recyclerView.setAdapter(adapter);
    }
}