package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class enterAgentno extends AppCompatActivity {
    private TextView agentno;
    private EditText agentnotext;
    private Button Ok;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_agentno);

        agentno = findViewById(R.id.enterAgentnotxt);
        agentnotext = findViewById(R.id.editTextAgentno);
        Ok = findViewById(R.id.agentbuttonOK);
        cancel = findViewById(R.id.agentbtncancel);
    }
}