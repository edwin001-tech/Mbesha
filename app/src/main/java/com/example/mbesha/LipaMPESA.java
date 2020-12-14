package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LipaMPESA extends AppCompatActivity {

    private TextView payBill;
    private TextView buyGoods;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lipa_m_p_e_s);

        payBill = findViewById(R.id.pBill);
        buyGoods = findViewById(R.id.buygoods);

    }
}