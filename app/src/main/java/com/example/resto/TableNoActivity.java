package com.example.resto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TableNoActivity extends AppCompatActivity {
    EditText table;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_no);

        table = findViewById(R.id.editTextTableNo);
        next = findViewById(R.id.button_next);
    }


}
