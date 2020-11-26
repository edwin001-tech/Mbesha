package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WithdrawCash extends AppCompatActivity {
    private TextView fAgent;
    private TextView fATM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw_cash);

        fAgent = findViewById(R.id.fAgent);
        fATM = findViewById(R.id.fATM);



    }
}