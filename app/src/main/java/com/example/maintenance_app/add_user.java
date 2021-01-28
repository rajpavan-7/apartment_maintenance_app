package com.example.maintenance_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class add_user extends AppCompatActivity {

    TextInputLayout flatNo, owner, tenant, contactNo;
    ImageButton add_button;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        flatNo = findViewById(R.id.FlatNo);
        owner = findViewById(R.id.Owner);
        tenant = findViewById(R.id.Tenant);
        contactNo = findViewById(R.id.ContactNo);
        add_button = findViewById(R.id.add_one);


        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("members");

                String flat = flatNo.getEditText().getText().toString();
                String own = owner.getEditText().getText().toString();
                String tent = tenant.getEditText().getText().toString();
                String phone = contactNo.getEditText().getText().toString();

                HelperClass helperClass = new HelperClass(flat, own, tent, phone);

                reference.child(flat).setValue(helperClass);

            }
        });


    }
}