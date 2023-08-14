package com.example.spinner_demo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String card[]={"Aadhaar card","Pan card","Voter card","Driving licence","Xth Score Card","XII score card"};
    String language[]={"Gujarati","English","Hindi","Marathi","Telugu","Tamil","Sanskrit","Dutch"};
    AutoCompleteTextView actxtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        actxtview = findViewById(R.id.actxtview);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,card);
        spinner.setAdapter(spinnerAdapter);
        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,card);
        actxtview.setAdapter(spinnerAdapter);
        actxtview.setThreshold(1);
    }
}