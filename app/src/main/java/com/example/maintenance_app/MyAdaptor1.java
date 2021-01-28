package com.example.maintenance_app;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptor1 extends RecyclerView.Adapter<MyAdaptor1.MyViewHolder> {


    ArrayList<model1> mlist;
    Context context;



    public MyAdaptor1(Context context, ArrayList<model1> mlist){
        this.mlist = mlist;
        this.context =context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.singleitem2, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        model1 model = mlist.get(position);
        holder.flat.setText(model.getFlat());
        holder.due.setText(model.getDue());
        holder.payer.setText(model.getPayer());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView flat,due, payer;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            flat = itemView.findViewById(R.id.flat);
            due = itemView.findViewById(R.id.due);
            payer = itemView.findViewById(R.id.payer);

        }
    }



}
