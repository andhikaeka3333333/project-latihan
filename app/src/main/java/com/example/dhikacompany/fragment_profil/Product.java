package com.example.dhikacompany.fragment_profil;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dhikacompany.PreviewProduct;
import com.example.dhikacompany.R;
import com.example.dhikacompany.adapter.AdapterOrganitation;
import com.example.dhikacompany.adapter.AdapterProduct;
import com.example.dhikacompany.model.ModelOrganitation;
import com.example.dhikacompany.model.ModelProduct;

import java.util.ArrayList;
import java.util.List;

public class Product extends Fragment implements AdapterProduct.ItemClickListener{

    List<ModelProduct> items;
    RecyclerView recyclerView;
    AdapterProduct adapter;

    public Product() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_product, container, false);

        items = new ArrayList<ModelProduct>();

        // Add items to the list


        items.add(new ModelProduct("Web Application","Web Application",R.drawable.round_web_24));
        items.add(new ModelProduct("Android Application","Android Application", R.drawable.round_android_24));
        items.add(new ModelProduct("IOS Application","IOS Application",R.drawable.round_phone_iphone_24));
        items.add(new ModelProduct("Dekstop Application","Dekstop Application",R.drawable.round_laptop_windows_24));
        items.add(new ModelProduct("Game Application","Game Application",R.drawable.round_videogame_asset_24));


        // Find the RecyclerView in the fragment's layout
        recyclerView = view.findViewById(R.id.rvProduk);

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new AdapterProduct(items, requireContext());
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(getActivity(), PreviewProduct.class);
        intent.putExtra("nama", adapter.getItem(position).getName());
        startActivity(intent);
        Toast.makeText(getActivity(), "You clicked " + adapter.getItem(position).getName() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}