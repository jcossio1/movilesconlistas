package com.example.turistiandov2.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.AmpliandoHotel;
import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.MoldeTurismo;
import com.example.turistiandov2.moldes.MoldeTurismo;

import java.util.ArrayList;

public class AdaptadorTurismo extends RecyclerView.Adapter<AdaptadorTurismo.viewHolder> {
    //Este es el atributo del adaptador
    public ArrayList<MoldeTurismo> listaTurismo;

    //constructores del adaptador


    public AdaptadorTurismo() {
    }

    @NonNull
    @Override
    public AdaptadorTurismo.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldeturismo,null,false);
        return new AdaptadorTurismo.viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorTurismo.viewHolder holder, int position) {

        holder.actualizarDatos(listaTurismo.get(position));

    }

    @Override
    public int getItemCount() {

        return listaTurismo.size();

    }

    public AdaptadorTurismo(ArrayList<MoldeTurismo> listaTurismo) {

        this.listaTurismo = listaTurismo;

    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoTurismo;
        TextView nombreTurismo;
        TextView precioTurismo;
        TextView contactoTurismo;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            fotoTurismo=itemView.findViewById(R.id.imagenListaSitios);
            nombreTurismo=itemView.findViewById(R.id.sitioListaSitios);
            precioTurismo=itemView.findViewById(R.id.precioListaSitios);
            contactoTurismo=itemView.findViewById(R.id.contactoListaSitios);

        }

        public void actualizarDatos(MoldeTurismo moldeTurismo) {
            fotoTurismo.setImageResource(moldeTurismo.getFoto());
            nombreTurismo.setText(moldeTurismo.getNombre());
            precioTurismo.setText(moldeTurismo.getPrecio());
            contactoTurismo.setText(moldeTurismo.getPrecio());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoHotel.class);
                    itemView.getContext().startActivity(intent);

                }
            });

        }
    }
}
