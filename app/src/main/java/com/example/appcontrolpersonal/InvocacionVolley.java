package com.example.appcontrolpersonal;

import android.content.Context;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class InvocacionVolley {
    private Context context;

    public InvocacionVolley(Context context){
        this.context = context;
    }

    public void invocarJSONObject(int method,
                                  String url,
                                  JSONObject jsonRequest,
                                  Response.Listener<JSONObject> listener,
                                  Response.ErrorListener errorListener ){

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(method,
                                  url,
                                  jsonRequest,
                                  listener,
                                  errorListener);

        Log.i("HVT", "invocarJSONObject: ");
        SingletonVolley.getInstance(this.context.getApplicationContext()).addToRequestQueue(jsonObjectRequest);
    }
}
