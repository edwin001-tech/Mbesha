package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SendMoney extends AppCompatActivity {
    private TextView searchcontact;
    private TextView enterphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);

        searchcontact = findViewById(R.id.airtimesearchContact);
        enterphone = findViewById(R.id.airtimeenterPhone);

        searchcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SendMoney.this, entername.class));
                finish();
            }
        });

        enterphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SendMoney.this, enterphone.class));
                finish();
            }
        });
    }
}