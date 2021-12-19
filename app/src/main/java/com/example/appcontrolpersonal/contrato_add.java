package com.example.appcontrolpersonal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

public class contrato_add extends AppCompatActivity {

    Button btnPickerOne ;
    TextView tvDateOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrato_add);

        /*
        btnPickerOne = findViewById(R.id.i8btn_Picker);
        tvDateOne = findViewById(R.id.i9testOne);

        MaterialDatePicker.Builder builder = MaterialDatePicker.Builder.datePicker();
        builder.setTitleText("SELECT DATE");
        final MaterialDatePicker materialDatePicker = builder.build();
        //end

        btnPickerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                materialDatePicker.show(getSupportFragmentManager(),"DATE_PICKER");

            }
        });

        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                tvDateOne.setText("Selected Date : "+ materialDatePicker.getHeaderText());
            }
        });
*/
    }
}