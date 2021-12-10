package com.example.appcontrolpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    LinearLayout btnHome;
    LinearLayout btnContrato;
    LinearLayout btnPersonal;
    LinearLayout btnAsistencia;
    ImageView imgHome;
    TextView txtHome;
    ImageView imgContrato;
    TextView txtContrato;
    ImageView imgAsistencia;
    TextView txtAsistencia;
    ImageView imgPersonal;
    TextView txtPersonal;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       imgHome=(ImageView)findViewById(R.id.imgHome);
        imgAsistencia=(ImageView)findViewById(R.id.imgAsistencia);
        imgContrato=(ImageView)findViewById(R.id.imgContrato);
        imgPersonal=(ImageView)findViewById(R.id.imgPersonal);
        txtHome=(TextView)findViewById(R.id.txtHome);
        txtAsistencia=(TextView)findViewById(R.id.txtAsistencia);
        txtContrato=(TextView)findViewById(R.id.txtContrato);
        txtPersonal=(TextView)findViewById(R.id.txtPersonal);
        btnHome=(LinearLayout)findViewById(R.id.btnHome);
        btnPersonal=(LinearLayout)findViewById(R.id.btnPersonal);
        btnAsistencia=(LinearLayout)findViewById(R.id.btnAsistencia);
        btnContrato=(LinearLayout)findViewById(R.id.btnContrato);
        imgHome.setColorFilter(getResources().getColor(R.color.selectionIcons));
        txtHome.setTextColor(getResources().getColor(R.color.selectionIcons));
        context = this;

        btnAsistencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelection("asistencia");
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelection("home");
            }
        });
        btnPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelection("personal");
            }
        });
        btnContrato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelection("contrato");
                Intent intent= new Intent(context,Contrato.class);
                startActivity(intent);
            }
        });

    }

    public void colorSelection(String dato){
        imgHome.setColorFilter(getResources().getColor(R.color.unableIcons));
        imgAsistencia.setColorFilter(getResources().getColor(R.color.unableIcons));
        imgContrato.setColorFilter(getResources().getColor(R.color.unableIcons));
        imgPersonal.setColorFilter(getResources().getColor(R.color.unableIcons));
        txtHome.setTextColor(getResources().getColor(R.color.unableIcons));
        txtAsistencia.setTextColor(getResources().getColor(R.color.unableIcons));
        txtContrato.setTextColor(getResources().getColor(R.color.unableIcons));
        txtPersonal.setTextColor(getResources().getColor(R.color.unableIcons));
        switch (dato) {
            case "contrato":
                imgContrato.setColorFilter(getResources().getColor(R.color.selectionIcons));
                txtContrato.setTextColor(getResources().getColor(R.color.selectionIcons));
                break;
            case "personal":
                imgPersonal.setColorFilter(getResources().getColor(R.color.selectionIcons));
                txtPersonal.setTextColor(getResources().getColor(R.color.selectionIcons));
                break;
            case "asistencia":
                imgAsistencia.setColorFilter(getResources().getColor(R.color.selectionIcons));
                txtAsistencia.setTextColor(getResources().getColor(R.color.selectionIcons));
                break;
            default:
                imgHome.setColorFilter(getResources().getColor(R.color.selectionIcons));
                txtHome.setTextColor(getResources().getColor(R.color.selectionIcons));
                break;
        }

    }
}


