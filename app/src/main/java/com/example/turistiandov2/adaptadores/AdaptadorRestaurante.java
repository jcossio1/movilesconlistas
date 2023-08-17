package com.example.turistiandov2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiandov2.R;
import com.example.turistiandov2.moldes.MoldeRestaurante;
import com.example.turistiandov2.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class AdaptadorRestaurante extends RecyclerView.Adapter<AdaptadorRestaurante.viewHolder> {

    //Este es el atributo del adaptador
    public ArrayList<MoldeRestaurante> listaRestaurante;

    //constructores del adaptador


    public AdaptadorRestaurante() {
    }

    @NonNull
    @Override
    public AdaptadorRestaurante.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante, null, false);
        return new AdaptadorRestaurante.viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurante.viewHolder holder, int position) {

        holder.actualizarDatos(listaRestaurante.get(position));

    }

    @Override
    public int getItemCount() {

        return listaRestaurante.size();

    }

    public AdaptadorRestaurante(ArrayList<MoldeRestaurante> listaRestaurante) {

        this.listaRestaurante = listaRestaurante;

    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView precioRestaurante;
        TextView contactoRestaurante;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            fotoRestaurante = itemView.findViewById(R.id.imagenListaRestaurante);
            nombreRestaurante = itemView.findViewById(R.id.nombreListaRestaurante);
            precioRestaurante = itemView.findViewById(R.id.precioListaRestaurante);
            contactoRestaurante = itemView.findViewById(R.id.telefonoListaRestaurante);

        }

        public void actualizarDatos(MoldeRestaurante moldeRestaurante) {
            fotoRestaurante.setImageResource(moldeRestaurante.getFoto());
            nombreRestaurante.setText(moldeRestaurante.getNombre());
            precioRestaurante.setText(moldeRestaurante.getRangoPrecio());
            contactoRestaurante.setText(moldeRestaurante.getTelefono());
        }
    }
}
