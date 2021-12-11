package com.example.appcontrolpersonal;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class ContratoAdaptador extends RecyclerView.Adapter<ContratoAdaptador.mViewHolder> {
    private List<clsContrato> data1;
    private List<clsPersona> data2;
    private RecyclerViewOnItemClickListener recyclerViewOnItemClickListener;

    class mViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ConstraintLayout layout;
        private CircularImageView img;
        private TextView txtContrato;
        private TextView txtnombres;
        private TextView txtEstado;
        private CheckBox chkAccion;

        public mViewHolder(View itemView) {
            super(itemView);

            //txtCurso = (TextView) itemView.findViewById(R.id.txtCurso);
            //txtDocente = (TextView) itemView.findViewById(R.id.txtDocente);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            recyclerViewOnItemClickListener.onClick(view, getAdapterPosition());
        }
    }

    public ContratoAdaptador(List<clsContrato> data, RecyclerViewOnItemClickListener recyclerViewOnItemClickListener) {
        this.data1 = data;
        this.recyclerViewOnItemClickListener = recyclerViewOnItemClickListener;
    }

    @Override
    public ContratoAdaptador.mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_contrato_desing, parent, false);
        return new mViewHolder(vItem);
    }

    @Override
    public void onBindViewHolder(ContratoAdaptador.mViewHolder holder, int position) {
        clsContrato contrato = data1.get(position);
        //holder.txtCurso.setText(contrato.getsCurso());
        //holder.txtDocente.setText(contrato.getsDocente());
    }

    @Override
    public int getItemCount() {
        return data1.size();
    }
}