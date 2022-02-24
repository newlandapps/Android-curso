package com.digimat.myapplication.practica4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.digimat.myapplication.R;
import com.digimat.myapplication.practica4.model.Datum;

import java.util.List;

public class adapterEmpleados extends RecyclerView.Adapter<adapterEmpleados.ViewHolder>{
    private List<Datum> data;
    private Context context;

    public adapterEmpleados(List<Datum> data,Context context)
    {
        this.data=data;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_practica4, parent, false);
        return new adapterEmpleados.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterEmpleados.ViewHolder holder, int position) {
        holder.nameRepartidor.setText(data.get(position).getEmployeeName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameRepartidor;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameRepartidor=itemView.findViewById(R.id.nameRepartidor);
        }
    }
}
