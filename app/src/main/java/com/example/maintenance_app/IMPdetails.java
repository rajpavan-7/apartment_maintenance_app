package com.example.maintenance_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class IMPdetails extends AppCompatActivity {

    TextInputLayout maintainer_number, watchman_number;
    ImageButton add_button;

    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_m_pdetails);

        maintainer_number = findViewById(R.id.Maintainer_Number);
        watchman_number = findViewById(R.id.Watchman_Number);
        add_button = findViewById(R.id.add_one);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("imp");

                String Maintainer_number = maintainer_number.getEditText().getText().toString();
                String Matchman_number = watchman_number.getEditText().getText().toString();

                HelperClass4 helperClass = new HelperClass4(Maintainer_number, Matchman_number);

                reference.setValue(helperClass);
//                reference.child(Total_received).setValue(helperClass);

            }
        });
    }
}