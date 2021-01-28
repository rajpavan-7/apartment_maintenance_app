package com.example.maintenance_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Spent extends AppCompatActivity {

    TextInputLayout amount, onWhat;
    ImageButton add_button;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spent);

        amount = findViewById(R.id.Amount);
        onWhat = findViewById(R.id.OnWhat);
        add_button = findViewById(R.id.add_one);


        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("spent");

                String Amount = amount.getEditText().getText().toString();
                String OnWhat = onWhat.getEditText().getText().toString();

                HelperClass3 helperClass = new HelperClass3(Amount, OnWhat);

                reference.child(Amount).setValue(helperClass);

            }
        });
    }
}