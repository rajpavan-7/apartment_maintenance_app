package com.example.maintenance_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptor2 extends RecyclerView.Adapter<MyAdaptor2.MyViewHolder> {

    ArrayList<model2> mlist;
    Context context;



    public MyAdaptor2(Context context, ArrayList<model2> mlist){
        this.mlist = mlist;
        this.context =context;
    }

    @NonNull
    @Override
    public MyAdaptor2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.singleitem3, parent, false);
        return new MyAdaptor2.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdaptor2.MyViewHolder holder, int position) {

        model2 model = mlist.get(position);
        holder.amount.setText(model.getAmount());
        holder.onWhat.setText(model.getOnWhat());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView amount, onWhat;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            amount = itemView.findViewById(R.id.Aamount);
            onWhat = itemView.findViewById(R.id.OonWhat);

        }
    }

}
