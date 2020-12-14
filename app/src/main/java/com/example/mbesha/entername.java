package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class entername extends AppCompatActivity {
    private TextView entername;
    private TextView send;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entername);

        entername = findViewById(R.id.enterPhoneno);
        send = findViewById(R.id.sendno);
        name = findViewById(R.id.edittextenterphone);


    }
}