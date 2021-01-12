package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class buyOtherNo extends AppCompatActivity {
    private TextView enterPhone;
    private TextView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_other_no);

        enterPhone = findViewById(R.id.airtimeenterPhone);
        search = findViewById(R.id.airtimesearchContact);


        enterPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(buyOtherNo.this, enterphone.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(buyOtherNo.this, entername.class));
            }
        });
    }
}