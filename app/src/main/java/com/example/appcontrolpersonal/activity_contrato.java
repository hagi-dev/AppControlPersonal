package com.example.appcontrolpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class activity_contrato extends AppCompatActivity {

    private static final String[] COUNTRIES = new String[]{
        "asdf", "bsdf","csdf"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrato);


        Spinner xSpn_ubication = findViewById(R.id.i9Spn_area);
        ArrayList<String> alUbicaciones = new ArrayList<>();
        alUbicaciones.add("WASHINGTON DC");
        alUbicaciones.add("LONDRES");
        alUbicaciones.add("NEW YORK");
        alUbicaciones.add("MIAMI BEACH");
        ArrayAdapter AA_arrayList_to_spinner =new ArrayAdapter(this, android.R.layout.simple_spinner_item,alUbicaciones);
        xSpn_ubication.setAdapter(AA_arrayList_to_spinner);


    }
}