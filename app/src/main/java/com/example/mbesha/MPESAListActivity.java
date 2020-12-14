package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MPESAListActivity extends AppCompatActivity {

    private TextView sendmoney;
    private TextView withdraw;
    private TextView buyAirtime;
    private TextView loans;
    private TextView myaccount;
    private TextView lipa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        sendmoney = findViewById(R.id.send);
        withdraw = findViewById(R.id.withdraw);
        buyAirtime = findViewById(R.id.buy);
        loans = findViewById(R.id.loans);
        myaccount = findViewById(R.id.account);
        lipa = findViewById(R.id.lipa);

        sendmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MPESAListActivity.this, SendMoney.class));
                finish();
            }
        });

        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MPESAListActivity.this, WithdrawCash.class));
                finish();
            }
        });

        buyAirtime. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MPESAListActivity.this, BuyAirtime.class));
                finish();
            }
        });

        loans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MPESAListActivity.this, LoansSavings.class));
            }
        });

        lipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MPESAListActivity.this, LipaMPESA.class));
            }
        });

        myaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MPESAListActivity.this, MyAccount.class));
            }
        });


    }
}