package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
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

    }
}