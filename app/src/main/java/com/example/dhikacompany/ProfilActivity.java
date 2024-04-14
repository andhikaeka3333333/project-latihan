package com.example.dhikacompany;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.dhikacompany.fragment_profil.About;
import com.example.dhikacompany.fragment_profil.Organitation;
import com.example.dhikacompany.fragment_profil.Product;
import com.google.android.material.navigation.NavigationView;

public class ProfilActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showHomePage();

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.organitation) {
                    showHomePage();
                } else if (itemId == R.id.about){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new About())
                            .commit();
                    getSupportActionBar().setTitle("About");
                } else if (itemId == R.id.product) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new Product())
                            .commit();
                    getSupportActionBar().setTitle("Product");
                }

                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    private void showHomePage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new Organitation())
                .commit();

        getSupportActionBar().setTitle("Organitation");
    }
}