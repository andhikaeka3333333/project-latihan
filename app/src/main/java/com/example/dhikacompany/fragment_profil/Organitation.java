package com.example.dhikacompany.fragment_profil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dhikacompany.R;
import com.example.dhikacompany.adapter.AdapterCompany;
import com.example.dhikacompany.adapter.AdapterOrganitation;
import com.example.dhikacompany.model.ModelOrganitation;

import java.util.ArrayList;
import java.util.List;


public class Organitation extends Fragment {

    List<ModelOrganitation> items;
    RecyclerView recyclerView;
    AdapterOrganitation adapter;

    public Organitation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_organitation, container, false);

        items = new ArrayList<ModelOrganitation>();

        // Add items to the list


        items.add(new ModelOrganitation("Andhika Eka","Chief Executive Officer (CEO)","2021-2024",R.drawable.dhika));
        items.add(new ModelOrganitation("Bumi Bagus","Chief Technology Officer (CTO)","2023-2026",R.drawable.bumi));
        items.add(new ModelOrganitation("Nevan Artwin","Chief Financial Officer (CFO)","2023-2029",R.drawable.nevan));
        items.add(new ModelOrganitation("Adlialfakhri","Chief Marketing Officer (CMO)","2022-2025",R.drawable.adlialfakhri));
        items.add(new ModelOrganitation("Rionaldo Rizky","Chief Operating Officer (COO)","2024-2030",R.drawable.rio));


        // Find the RecyclerView in the fragment's layout
        recyclerView = view.findViewById(R.id.rvOrganitation);

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new AdapterOrganitation(items, requireContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
}