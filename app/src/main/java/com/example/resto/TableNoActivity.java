package com.example.resto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class TableNoActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner table;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_no);

        table = findViewById(R.id.spinner);
        next = findViewById(R.id.button_next);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.TableNo,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        table.setAdapter(adapter);
        table.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView , View view, int i, long l) {
        //String text =  adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
