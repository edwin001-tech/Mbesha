package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class airtimeAMT extends AppCompatActivity {
    private TextView airtimeAMT;
    private EditText airtimeEdittext;
    private Button airtimeOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airtime_a_m_t);

        airtimeAMT = findViewById(R.id.MshwariAMT);
        airtimeEdittext = findViewById(R.id.sendMshwariEditText);
        airtimeOK = findViewById(R.id.sendMshwariButton);
    }
}