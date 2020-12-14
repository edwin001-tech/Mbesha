package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class enterphone extends AppCompatActivity {
    private TextView enterphoneno;
    private TextView sendno;
    private EditText phoneno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterphone);

        enterphoneno = findViewById(R.id.enterPhoneno);
        sendno = findViewById(R.id.sendno);
        phoneno = findViewById(R.id.edittextenterphone);
    }
}