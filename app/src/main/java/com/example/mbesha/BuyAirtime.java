package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;

public class BuyAirtime extends AppCompatActivity {
    private TextView myphone;
    private TextView otherphone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_airtime);

        myphone = findViewById(R.id.mPhone);
        otherphone = findViewById(R.id.oPhone);

        myphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuyAirtime.this, airtimeAMT.class));
                finish();
            }
        });

        otherphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuyAirtime.this, buyOtherNo.class));
            }
        });

    }
}