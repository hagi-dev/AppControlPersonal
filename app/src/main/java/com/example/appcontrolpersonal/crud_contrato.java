package com.example.appcontrolpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class crud_contrato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_contrato);

        Button xBtnAdd =(Button) findViewById(R.id.i100btn_add);

        xBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xIntent = new Intent(getApplicationContext(), contrato_add.class);
                startActivity(xIntent);
            }
        });
    }
}