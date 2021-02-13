package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Mshwari extends AppCompatActivity {
    private TextView sendtoMshwari;
    private TextView withdrawMshwari;
    private TextView locksavings;
    private TextView loan;
    private TextView checkbalance;
    private TextView miniStatement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mshwari);
        sendtoMshwari = findViewById(R.id.sendtoMshwari);

        sendtoMshwari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mshwari.this, sendtoMshwari.class));
                finish();

            }
        });
    }
}