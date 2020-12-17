package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ATMagentno extends AppCompatActivity {
    private TextView agentno;
    private EditText agentnotext;
    private Button Ok;
    private Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_t_magentno);

        agentno = findViewById(R.id.enterATMtxt);
        agentnotext = findViewById(R.id.editTextatm);
        Ok = findViewById(R.id.atmbuttonOK);
        cancel = findViewById(R.id.agentbtncancel);



    }
}