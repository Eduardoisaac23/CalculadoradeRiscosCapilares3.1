package com.softwaresa.salaomais.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.softwaresa.salaomais.R;

import androidx.appcompat.app.AppCompatActivity;

public class HistoricoActivity extends AppCompatActivity {

    private FloatingActionButton proximo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);

        proximo = findViewById(R.id.floActproximo);

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentproximo = new Intent(HistoricoActivity.this, MenuActivity.class);
                startActivity(intentproximo);

            }
        });

    }
}
