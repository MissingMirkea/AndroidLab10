package com.example.laborator10;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton1, toggleButton2;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    // Metodă pentru a adăuga evenimente pentru buton
    public void addListenerOnButton() {
        // Inițializăm butoanele ToggleButton și Button
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        // Adăugăm un OnClickListener pentru butonul "btnDisplay"
        btnDisplay.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // StringBuffer pentru a concatena textul pentru Toast
                StringBuffer result = new StringBuffer();
                result.append("toggleButton1 : ").append(toggleButton1.getText());
                result.append("\ntoggleButton2 : ").append(toggleButton2.getText());

                // Afișăm un Toast cu starea butoanelor
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
