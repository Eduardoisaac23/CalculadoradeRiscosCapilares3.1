package com.softwaresa.salaomais.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


import com.softwaresa.salaomais.R;

public class ProcedimentosActivity extends AppCompatActivity {

    private LinearLayout linearLayoutSexo;
    private LinearLayout layougesta;
    private LinearLayout linearLayoutProb;
    private LinearLayout linearLayoutTipCab;
    private LinearLayout linearLayoutquimAtual;
    private RadioButton rbFeminino;
    private RadioButton rbMasculino;
    private RadioButton rbSimGes;
    private RadioButton rbNaoGes;
    private RadioButton rbquiSimQuiTrans;
    private RadioButton rbquiNaoQuiTrans;
    private RadioButton rbAli2;
    private RadioButton rbCol2;
    private RadioButton Des2;
    private RadioButton Per2;
    private RadioButton Pro2;
    private RadioButton rbAli1;
    private RadioButton rbCol1;
    private RadioButton Des1;
    private RadioButton Per1;
    private RadioButton Pro1;
    private ImageView imageVgestante;
    private ImageView imgravidaproibido;
    private ScrollView ScrollImagens;
    private ImageView imgLiso1a;
    private ImageView imgOndulado2a;
    private ImageView imgCacheado3a;
    private ImageView imgCrespo4b;
    private ImageView imgLisom;
    private ImageView imgonduladom;
    private ImageView imgcacheadom;
    private ImageView imgcrespom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedimentos);

        rbFeminino = findViewById(R.id.rbFeminino);
        rbMasculino = findViewById(R.id.rbMasculino);
        rbSimGes  = findViewById(R.id.rbSimGes);
        rbNaoGes  = findViewById(R.id.rbNaoGes);
        layougesta = findViewById(R.id.layougesta);
        linearLayoutTipCab = findViewById(R.id.linearLayoutTipCab);
        imgLiso1a  = findViewById(R.id.imgLiso1a);
        imgOndulado2a  = findViewById(R.id.imgOndulado2a);
        imgCacheado3a  = findViewById(R.id.imgCacheado3a);
        imgCrespo4b  = findViewById(R.id.imgCrespo4b);
        imgLisom  = findViewById(R.id.imgLisom);
        imgcrespom  = findViewById(R.id.imgcrespom);
        imgcacheadom  = findViewById(R.id.imgcacheadom);
        imgonduladom  = findViewById(R.id.imgonduladom);




        rbFeminino.setOnClickListener(new View.OnClickListener() {
            String sexo = "";

            @Override
            public void onClick(View v) {
                if (rbFeminino.isChecked()){
                    sexo = "Feminino";
                    layougesta.setVisibility(View.VISIBLE);

                }else{
                    rbMasculino.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (rbMasculino.isChecked()){
                                sexo = "Masculino";
                                layougesta.setVisibility(View.GONE);
                            }
                        }
                    });
                }
            }
        });

        rbSimGes.setOnClickListener(new View.OnClickListener() {
            String gestante = "";
             int total = 0;
            @Override
            public void onClick(View v) {

                if (rbSimGes.isChecked()){
                    gestante = "Sim";
                    total = 25;

                } else {

                    rbNaoGes.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (rbNaoGes.isChecked()){
                                gestante = "Não";
                                total = 0;
                            }
                        }
                    });

                } if (total == 25){

                    Toast.makeText(ProcedimentosActivity.this, "Não é indicado", Toast.LENGTH_LONG).show();

                }else {
                    linearLayoutTipCab.setVisibility(View.VISIBLE);
                }
            }
        });





    }
}
