package com.example.dhikacompany.fragment_main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dhikacompany.model.ModelCompany;
import com.example.dhikacompany.R;
import com.example.dhikacompany.adapter.AdapterCompany;

import java.util.ArrayList;
import java.util.List;

public class Company extends Fragment {

    List<ModelCompany> items;
    RecyclerView recyclerView;
    AdapterCompany adapter;
    public Company() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_company, container, false);

        items = new ArrayList<ModelCompany>();

        // Add items to the list

        items.add(new ModelCompany("Google","Google Corp",R.drawable.google));
        items.add(new ModelCompany("AWS","AWS Corp",R.drawable.aws));
        items.add(new ModelCompany("IBM","IBM Corp",R.drawable.ibm));
        items.add(new ModelCompany("Indosat","PT Indosat Hutchison",R.drawable.indosat));
        items.add(new ModelCompany("Lenovo","Lenovo Corp",R.drawable.lenovo));
        items.add(new ModelCompany("Kominfo","Kementrian Komunikasi dan Informasi",R.drawable.kemkominfo));


        // Find the RecyclerView in the fragment's layout
        recyclerView = view.findViewById(R.id.rvCompany);

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new AdapterCompany(items, requireContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
}