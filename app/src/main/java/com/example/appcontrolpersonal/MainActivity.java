package com.example.appcontrolpersonal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayout btnHome;
    LinearLayout btnContrato;
    LinearLayout btnPersonal;
    LinearLayout btnAsistencia;
    ImageView imgHome;
    TextView txtHome;
    ImageView imgContrato;
    TextView txtContrato;
    TextView txtTitle;
    ImageView imgAsistencia;
    TextView txtAsistencia;
    ImageView imgPersonal;
    TextView txtPersonal;
    Context context;
    RecyclerView rclPersona;
    private String urlPersonal = "http://127.0.0.1:3000/api/personal";
    private List<clsPersona> personaList;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rclPersona=(RecyclerView)findViewById(R.id.rclPersona);
        imgHome=(ImageView)findViewById(R.id.imgHome);
        imgAsistencia=(ImageView)findViewById(R.id.imgAsistencia);
        imgContrato=(ImageView)findViewById(R.id.imgContrato);
        imgPersonal=(ImageView)findViewById(R.id.imgPersonal);
        txtHome=(TextView)findViewById(R.id.txtHome);
        txtAsistencia=(TextView)findViewById(R.id.txtAsistencia);
        txtContrato=(TextView)findViewById(R.id.txtContrato);
        txtPersonal=(TextView)findViewById(R.id.txtPersonal);
        txtTitle=(TextView)findViewById(R.id.txtTitle);
        btnHome=(LinearLayout)findViewById(R.id.btnHome);
        btnPersonal=(LinearLayout)findViewById(R.id.btnPersonal);
        btnAsistencia=(LinearLayout)findViewById(R.id.btnAsistencia);
        btnContrato=(LinearLayout)findViewById(R.id.btnContrato);
        imgHome.setColorFilter(getResources().getColor(R.color.selectionIcons));
        txtHome.setTextColor(getResources().getColor(R.color.selectionIcons));
        context = this;
        personaList = new ArrayList<>();
        adapter = new AdaptadorPersonal(getApplicationContext(),personaList);
        rclPersona.setAdapter(adapter);

        btnAsistencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelection("asistencia");
                txtTitle.setText("Asistencia");
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelection("home");
                txtTitle.setText("Home");
            }
        });
        btnPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelection("personal");
                txtTitle.setText("Personal");
            }
        });
        btnContrato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorSelection("contrato");
                txtTitle.setText("Contrato");
                Intent intent= new Intent(context, ContratoDate.class);
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

    private void getData() {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(urlPersonal, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);

                        clsPersona persona = new clsPersona();
                        persona.setId(jsonObject.getInt("id"));
                        persona.setDni(jsonObject.getString("dni"));
                        persona.setNombre(jsonObject.getString("nombre"));
                        persona.setEdad(jsonObject.getInt("edad"));
                        persona.setPaterno(jsonObject.getString("apellidoPaterno"));
                        persona.setMaterno(jsonObject.getString("apellidoMaterno"));
                        persona.setGenero(jsonObject.getString("sexo"));
                        persona.setTelefono(jsonObject.getString("telefono"));
                        persona.setFechaNacimiento(jsonObject.getString("fechaNacimiento"));
                        persona.setDireccion(jsonObject.getString("direccion"));
                        persona.setUrlFoto(jsonObject.getString("foto"));


                        personaList.add(persona);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        progressDialog.dismiss();
                    }
                }
                adapter.notifyDataSetChanged();
                progressDialog.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", error.toString());
                progressDialog.dismiss();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }
}
