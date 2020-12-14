package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoansSavings extends AppCompatActivity {
    private TextView mshwari;
    private TextView kcb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loans_savings);

        mshwari = findViewById(R.id.mshwari);
        kcb = findViewById(R.id.kcb);

    }
}