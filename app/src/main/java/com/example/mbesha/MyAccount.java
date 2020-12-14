package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MyAccount extends AppCompatActivity {
    private TextView ministatement;
    private TextView checkbalance;
    private TextView ChangePIN;
    private TextView Changelanguage;
    private TextView Updatemenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        ministatement = findViewById(R.id.ministatement);
        checkbalance = findViewById(R.id.checkBalance);
        ChangePIN = findViewById(R.id.changePin);
        Changelanguage = findViewById(R.id.changeLanguage);
        Updatemenu = findViewById(R.id.updateMenu);

    }
}