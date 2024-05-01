package com.example.a12_autosearch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private Button searchButton;

    // Sample data for auto-complete suggestions
    private static final String[] Searches = new String[] {
            "What is Android","Wce Sangli","android Studio","Android Lab Ese", "IPL 2024"
            // Add more countries as needed...
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        searchButton = findViewById(R.id.searchButton);

        // Creating an ArrayAdapter containing country names
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, Searches);

        // Setting the ArrayAdapter data on the AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter);

        // Set click listener for the search button
        searchButton.setOnClickListener(view -> {
            String searchText = autoCompleteTextView.getText().toString();
            // Perform search operation here with searchText
            Toast.makeText(MainActivity.this, "Searching for: " + searchText, Toast.LENGTH_SHORT).show();
        });
    }
}
