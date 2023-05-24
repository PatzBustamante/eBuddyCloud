package com.ebuddy.ebuddycloud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCardClicked(View view) {
        int id = view.getId();

        if (id == R.id.card_pos) {
            // Handle Home card click
            //Intent intent = new Intent(this, PosActivity.class);
            Intent intent = new Intent(this, ScannerActivity.class);
            startActivity(intent);
        } else if (id == R.id.card_reports) {
            // Handle Language card click
            Intent intent = new Intent(this, ReportsActivity.class);
            startActivity(intent);
        } else if (id == R.id.card_inventory) {
            // Handle Chat card click
            Intent intent = new Intent(this, InventoryActivity.class);
            startActivity(intent);
        }else if (id == R.id.card_generate) {
            // Handle Chat card click
            Intent intent = new Intent(this, GeneratorActivity.class);
            startActivity(intent);
        }else if (id == R.id.card_settings) {
            // Handle Chat card click
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }else if (id == R.id.card_exit) {
            // Handle Chat card click
            finishAffinity();
        }


    }
}