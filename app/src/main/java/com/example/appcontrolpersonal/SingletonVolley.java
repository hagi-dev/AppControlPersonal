package com.example.appcontrolpersonal;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class SingletonVolley {
    private Context context;
    private RequestQueue requestQueue;

    private static SingletonVolley singletonVolley;

    private SingletonVolley(Context context){
        this.context = context;
        this.requestQueue = getRequestQueue();
    }

    public static synchronized SingletonVolley getInstance(Context context){

        if (singletonVolley == null)
            singletonVolley = new SingletonVolley(context);

        return singletonVolley;
    }

    private RequestQueue getRequestQueue() {

        if (this.requestQueue == null)
            this.requestQueue = Volley.newRequestQueue(this.context.getApplicationContext());
        return this.requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> request){

        this.requestQueue.add(request);

    }

}
