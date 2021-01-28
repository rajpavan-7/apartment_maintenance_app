package com.example.maintenance_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class add_user2 extends AppCompatActivity {

    TextInputLayout flat_No, payer, due;
    ImageButton add_button;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user2);

        flat_No = findViewById(R.id.flat_No);
        payer = findViewById(R.id.payer);
        due = findViewById(R.id.due);
        add_button = findViewById(R.id.add_one);


        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("paid");

                String flat = flat_No.getEditText().getText().toString();
                String own = payer.getEditText().getText().toString();
                String tent = due.getEditText().getText().toString();

                HelperClass1 helperClass = new HelperClass1(flat, own, tent);

                reference.child(flat).setValue(helperClass);

            }
        });


    }
}