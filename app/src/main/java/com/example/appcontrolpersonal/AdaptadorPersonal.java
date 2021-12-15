package com.example.appcontrolpersonal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorPersonal extends RecyclerView.Adapter<AdaptadorPersonal.MyViewHodler> implements Filterable {
    LayoutInflater inflater;
    List<clsPersona> personaArrayList;

    public AdaptadorPersonal(Context context, List<clsPersona> personaArrayList) {
        this.inflater = LayoutInflater.from(context);
        this.personaArrayList = personaArrayList;
    }

    @NonNull
    @Override
    public MyViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = this.inflater.inflate(R.layout.listas_personal_desing,parent,false);
        return new MyViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHodler holder, int position) {

        clsPersona persona = personaArrayList.get(position);
        holder.txtDni.setText(persona.getDni());
        holder.txtNombres.setText(persona.getNombre());
        holder.txtTelefono.setText(persona.getTelefono());
        holder.txtGenero.setText(persona.getGenero());
        holder.txtEdad.setText(persona.getEdad());
        holder.chkAccion.setText(persona.getId());
        Picasso.get().load(persona.getUrlFoto()).into(holder.imgFotoPerfil);

    }

    @Override
    public int getItemCount() {

        return personaArrayList.size();
    }

    @Override
    public Filter getFilter() {
        return personaFilter;
    }

    private final Filter personaFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            ArrayList<clsPersona> personaArrayListFiltered = new ArrayList<>();

            if (constraint==null || constraint.length()==0){

                personaArrayListFiltered.addAll(personaArrayList);

            }else {

                String filterCriterio = constraint.toString().trim().toLowerCase();

                for (clsPersona persona : personaArrayList)
                    if (persona.getDni().toLowerCase().trim().contains(filterCriterio))
                        personaArrayListFiltered.add(persona);

            }

            FilterResults resultado = new FilterResults();
            resultado.values = personaArrayListFiltered;
            resultado.count = personaArrayListFiltered.size();
            return resultado;

        };

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            personaArrayList.clear();
            personaArrayList.addAll((ArrayList)results.values);
            notifyDataSetChanged();

        }
    };


    public static class MyViewHodler extends RecyclerView.ViewHolder {

        ConstraintLayout lyContenedor;
        TextView txtDni;
        TextView txtNombres;
        TextView txtTelefono;
        TextView txtGenero;
        TextView txtEdad;
        CircularImageView imgFotoPerfil;
        CheckBox chkAccion;

        public MyViewHodler(@NonNull View itemView) {
            super(itemView);
            lyContenedor = itemView.findViewById(R.id.lyContenedor);
            imgFotoPerfil = itemView.findViewById(R.id.imgFotoPerfil);
            txtDni = itemView.findViewById(R.id.txtDni);
            txtNombres = itemView.findViewById(R.id.txtNombres);
            txtTelefono = itemView.findViewById(R.id.txtTelefono);
            txtGenero = itemView.findViewById(R.id.txtGenero);
            txtEdad = itemView.findViewById(R.id.txtEdad);
            chkAccion = itemView.findViewById(R.id.chkAccion);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Algo de click", Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}


