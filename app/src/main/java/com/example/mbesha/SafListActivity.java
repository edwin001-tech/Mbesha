package com.example.mbesha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SafListActivity extends AppCompatActivity {
    private TextView mbank;
    private TextView myacct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saf_list);

        mbank = findViewById(R.id.mbank);
        myacct = findViewById(R.id.myacct);
    }
}