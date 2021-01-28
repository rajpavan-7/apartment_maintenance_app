package com.example.maintenance_app;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.MyViewHolder> {


    ArrayList<model> mlist;
    Context context;
//    private ImageButton deleteButton;
//
//    deleteButton = findViewById(R.id.Deletebutton);
//        deleteButton.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            int ID = list.get(getadapterPosition())
//            root.child(String.valueOf(flatNo)).setValue(null);
//        }
//    });



    public MyAdaptor(Context context, ArrayList<model> mlist){
        this.mlist = mlist;
        this.context =context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.singleitem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        model model = mlist.get(position);
        holder.flatNo.setText(model.getFlatNo());
        holder.owner.setText(model.getOwner());
        holder.tenant.setText(model.getTenant());
        holder.contactNo.setText(model.getContactNo());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView flatNo;
        TextView owner;
        TextView tenant;
        TextView contactNo;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            flatNo = itemView.findViewById(R.id.flat);
            owner = itemView.findViewById(R.id.owner);
            tenant = itemView.findViewById(R.id.tenant);
            contactNo = itemView.findViewById(R.id.ContactNo);

        }


    }

}
