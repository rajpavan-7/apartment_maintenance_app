package com.example.maintenance_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Total_money extends AppCompatActivity {

    TextInputLayout total_received, total_spent, total_due;
    ImageButton add_button;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_money);

        total_received = findViewById(R.id.Total_received);
        total_spent = findViewById(R.id.Total_spent);
        total_due = findViewById(R.id.Total_due);
        add_button = findViewById(R.id.add_one);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("total");

                String Total_received = total_received.getEditText().getText().toString();
                String Total_spent = total_spent.getEditText().getText().toString();
                String Total_due = total_due.getEditText().getText().toString();

                HelperClass2 helperClass = new HelperClass2(Total_received, Total_spent, Total_due);

                reference.setValue(helperClass);
//                reference.child(Total_received).setValue(helperClass);

            }
        });
    }
}