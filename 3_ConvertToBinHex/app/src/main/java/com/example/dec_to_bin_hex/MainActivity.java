package com.example.dec_to_bin_hex;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner conversionSpinner;
    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conversionSpinner = findViewById(R.id.conversionSpinner);
        outputText = findViewById(R.id.outputText);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.conversion_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        conversionSpinner.setAdapter(adapter);
    }

    public void convertButtonClicked(View view) {
        EditText decimalInput = findViewById(R.id.decimalInput);
        String input = decimalInput.getText().toString();

        if (!input.isEmpty()) {
            int decimal = Integer.parseInt(input);

            String conversionOption = conversionSpinner.getSelectedItem().toString();
            if (conversionOption.equals("Binary")) {
                outputText.setText("Binary: " + Integer.toBinaryString(decimal));
            } else if (conversionOption.equals("Hexadecimal")) {
                outputText.setText("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
            }
        } else {
            outputText.setText("Output:");
        }
    }
}
