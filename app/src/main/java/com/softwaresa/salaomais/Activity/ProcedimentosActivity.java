package com.softwaresa.salaomais.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.softwaresa.salaomais.R;
import com.softwaresa.salaomais.Fragmentos.SexoFragment;


public class ProcedimentosActivity extends AppCompatActivity {





   /* private LinearLayout linearLayoutSexo;
    private LinearLayout layougesta;
    private LinearLayout linearLayoutProb;
    private LinearLayout linearLayoutScroll;
    private LinearLayout   lineQiumiDese;
    private LinearLayout  linearLayoutBase;
    private LinearLayout linearLayoutquimAtual;
    private LinearLayout linearLayotTipocabelo;
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
    private RadioButton rbFemi;
    private RadioButton rbMasc;
    private RadioButton rbDes1;
    private RadioButton rbPro1;
    private RadioButton rbDes2;
    private RadioButton rbPro2;
    private RadioGroup rgBase;
    private RadioGroup rgGestante;
    private RadioGroup rgSexo;
    private RadioGroup rgTrnasf;
    private RadioGroup rgQuiAtual;
    private RadioGroup rgQuiDse;
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
    private Procedimentos procedimentos;
    private TextView texVSex;
    private Button btnSalPro;
    String Sexo = "";
    int Ges  = 0;
    String Gestante = "";
    String Cabelo = "";
    String Quimica = "";
    int P2 = 0;
    int P1 = 0;
    int total = 0;*/


    // private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    // private   DatabaseReference procedimentosReference  = databaseReference.child("Procedimentos");

    // Estancias dos fragmentos
    private SexoFragment sexoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedimentos);

        sexoFragment = new SexoFragment();
        FragmentTransaction transacoaSexo = getSupportFragmentManager().beginTransaction();
        transacoaSexo.replace(R.id.contProcedimentoId, sexoFragment);
        transacoaSexo.commit();





       /* rgGestante = findViewById(R.id.rgGestante);
        rgSexo = findViewById(R.id.rgSexo);
        rgQuiDse = findViewById(R.id.rgQuiDse);
        rgQuiAtual = findViewById(R.id.rgQuiAtual);
        rgTrnasf = findViewById(R.id.rgTrnasf);
        rgBase  = findViewById(R.id.rgBase);
        rbFemi = findViewById(R.id.rbFemi);
        rbMasc = findViewById(R.id.rbMasc);
        rbDes1 = findViewById(R.id.rbDes1);
        rbPro1 = findViewById(R.id.rbPro1);
        rbAli2 = findViewById(R.id.rbAli2);
        rbCol2 = findViewById(R.id.rbCol2);
        rbDes2 = findViewById(R.id.rbDes2);
        rbPro2 = findViewById(R.id.rbPro2);
        rbAli1 = findViewById(R.id.rbAli1);
        texVSex = findViewById(R.id.texVSexo);
        rbCol1 = findViewById(R.id.rbCol1);
        rbSimGes = findViewById(R.id.rbSimGes);
        rbNaoGes = findViewById(R.id.rbNaoGes);
        layougesta = findViewById(R.id.layougesta);
        linearLayoutScroll = findViewById(R.id.linearLayoutScroll);
        linearLayoutBase = findViewById(R.id.linearLayoutBase);
        linearLayoutquimAtual = findViewById(R.id.linearLayoutquimAtual);
        linearLayotTipocabelo  = findViewById(R.id.linearLayotTipocabelo);
        lineQiumiDese = findViewById(R.id.lineQiumiDese);
        imgLiso1a = findViewById(R.id.imgLiso1a);
        imgOndulado2a = findViewById(R.id.imgOndulado2a);
        imgCacheado3a = findViewById(R.id.imgCacheado3a);
        imgCrespo4b = findViewById(R.id.imgCrespo4b);
        imgLisom = findViewById(R.id.imgLisom);
        imgcrespom = findViewById(R.id.imgcrespom);
        imgcacheadom = findViewById(R.id.imgcacheadom);
        imgonduladom = findViewById(R.id.imgonduladom);
        btnSalPro = findViewById(R.id.btnSalPro);

        //procedimentosReference.child("001").setValue("Quimica");
            //RadioGrup sexo
        rgSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                        //descobrir qual botão de opção está selecionado
                if (checkedId == R.id.rbFemi) {

                    //Toast.makeText(getApplicationContext(), "Feminino", Toast.LENGTH_SHORT).show();
                    linearLayotTipocabelo.setVisibility(View.VISIBLE);
                    linearLayoutScroll.setVisibility(View.VISIBLE);
                    layougesta.setVisibility(View.VISIBLE);
                    imgCrespo4b.setVisibility(View.VISIBLE);
                    imgLiso1a.setVisibility(View.VISIBLE);
                    imgOndulado2a.setVisibility(View.VISIBLE);
                    imgCrespo4b.setVisibility(View.VISIBLE);
                    imgCacheado3a.setVisibility(View.VISIBLE);
                    imgonduladom.setVisibility(View.GONE);
                    imgcacheadom.setVisibility(View.GONE);
                    imgcrespom.setVisibility(View.GONE);
                    imgLisom.setVisibility(View.GONE);


                } else if (checkedId == R.id.rbMasc) {

                    //Toast.makeText(getApplicationContext(), "Masculino", Toast.LENGTH_SHORT).show();
                    linearLayotTipocabelo.setVisibility(View.VISIBLE);
                    linearLayoutScroll.setVisibility(View.VISIBLE);
                    imgcacheadom.setVisibility(View.VISIBLE);
                    imgcrespom.setVisibility(View.VISIBLE);
                    imgLisom.setVisibility(View.VISIBLE);
                    imgonduladom.setVisibility(View.VISIBLE);
                    layougesta.setVisibility(View.GONE);
                    imgOndulado2a.setVisibility(View.GONE);
                    imgLiso1a.setVisibility(View.GONE);
                    imgCrespo4b.setVisibility(View.GONE);
                    imgCacheado3a.setVisibility(View.GONE);
                }

            }
        });


        //RadioGrup Gestante
        rgGestante.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                if (checkedId == R.id.rbSimGes) {

                    Ges = 31;
                }
                if (Ges >= 11) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ProcedimentosActivity.this);
                    builder.setCancelable(true);
                    builder.setTitle("ATENÇÂO!");
                    builder.setTitle("Uso de produtos químicos em gestantes não e indicado!");
                    builder.setMessage("Deseja continuar?");

                    builder.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            finish();
                        }
                    });
                    builder.show();

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Ges = 31;

                        }
                    });

                }else if (checkedId == R.id.rbNaoGes ){

                    Ges = 0;
                }
            }
        });

            //click das imagens
        imgOndulado2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgOndulado2a.isClickable()){
                    Cabelo = "Ondulado";
                    Toast.makeText(getApplicationContext()," Tipo de cabelo que você escolheu é: Ondulado",Toast.LENGTH_LONG).show();
                }
            }
        });
        imgLiso1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgLiso1a.isClickable()){
                    Cabelo = "Liso";
                    Toast.makeText(getApplicationContext()," Tipo de cabelo que você escolheu é: Liso",Toast.LENGTH_LONG).show();
                }
            }
        });
        imgCrespo4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imgCrespo4b.isClickable()){
                    Cabelo = "Crespo";
                    Toast.makeText(getApplicationContext()," Tipo de cabelo que você escolheu é: Crespo",Toast.LENGTH_LONG).show();
                }
            }
        });
        imgCacheado3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgCacheado3a.isClickable()){
                    Cabelo = "Cacheado";
                    Toast.makeText(getApplicationContext()," Tipo de cabelo que você escolheu é: Cacheado",Toast.LENGTH_LONG).show();
                }
            }
        });



            // Possui Quimica de transformação
        rgTrnasf.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rbquiSimQuiTrans ){

                    linearLayoutquimAtual.setVisibility(View.VISIBLE);
                    lineQiumiDese.setVisibility(View.VISIBLE);
                    linearLayoutBase.setVisibility(View.VISIBLE);

                }else if (checkedId == R.id.rbquiNaoQuiTrans){

                    lineQiumiDese.setVisibility(View.VISIBLE);
                    linearLayoutquimAtual.setVisibility(View.GONE);
                    linearLayoutBase.setVisibility(View.GONE);

                }
            }
        });
                // Química atual
        rgQuiAtual.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbAli2){
                    Quimica = "Alisamento";
                    P2 = 5;
                    Toast.makeText(getApplicationContext()," Deu certo",Toast.LENGTH_LONG).show();
                }else if (checkedId == R.id.rbCol2){
                    Quimica = "Coloração";
                    P2 = 2;
                }else if (checkedId == R.id.rbDes2){
                    Quimica = "Descoloração";
                    P2 = 4;
                }else  if (checkedId  == R.id.rbPro2){
                    Quimica = "Progressiva";
                    P2 = 5;
                }
            }
        });
        //Selecione química desejada
        rgQuiDse.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbAli1){
                    Quimica = "Alisamento";
                    P1 = 5;
                    Toast.makeText(getApplicationContext()," Deu certo",Toast.LENGTH_LONG).show();
                }else if (checkedId == R.id.rbCol1){
                    Quimica = "Coloração";
                    P1 = 2;
                }else if (checkedId == R.id.rbDes1){
                    Quimica = "Descoloração";
                    P1 = 4;
                }else  if (checkedId  == R.id.rbPro1){
                    Quimica = "Progressiva";
                    P1 = 5;
                }


            }
        });
                    // Bases iguais
        rgBase.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbBaseSim){
                       total = P1 + P2 + Ges ;

                }else if (checkedId == R.id.rbBaseNao){
                    total = P1 + P2 + Ges + 10 ;
                }
            }
        });*/


    }

}





        /*rbFemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (rbFemi.isChecked()) {
                   // procedimentos.setSexo("Feminino");
                    linearLayoutScroll.setVisibility(View.VISIBLE);
                    layougesta.setVisibility(View.VISIBLE);
                    imgCrespo4b.setVisibility(View.VISIBLE);
                    imgLiso1a.setVisibility(View.VISIBLE);
                    imgOndulado2a.setVisibility(View.VISIBLE);
                    imgCrespo4b.setVisibility(View.VISIBLE);
                    imgCacheado3a.setVisibility(View.VISIBLE);
                    imgonduladom.setVisibility(View.GONE);
                    imgcacheadom.setVisibility(View.GONE);
                    imgcrespom.setVisibility(View.GONE);
                    imgLisom.setVisibility(View.GONE);
                }

                rbMasc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (rbMasc.isChecked()) {
                           // procedimentos.setSexo("Masculino");
                            linearLayoutScroll.setVisibility(View.VISIBLE);
                            imgcacheadom.setVisibility(View.VISIBLE);
                            imgcrespom.setVisibility(View.VISIBLE);
                            imgLisom.setVisibility(View.VISIBLE);
                            imgonduladom.setVisibility(View.VISIBLE);
                            layougesta.setVisibility(View.GONE);
                            imgOndulado2a.setVisibility(View.GONE);
                            imgLiso1a.setVisibility(View.GONE);
                            imgCrespo4b.setVisibility(View.GONE);
                            imgCacheado3a.setVisibility(View.GONE);
                        }


                    }
                });

            }
        });

        rbSimGes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rbSimGes.isChecked()) {

                        //procedimentos.setGestante("Sim");

                        Ges = 31;
                    }
                    if (Ges >= 11) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(ProcedimentosActivity.this);
                        builder.setCancelable(true);
                        builder.setTitle("ATENÇÂO!");
                        builder.setMessage("Uso de produtos químicos em gestantes não e indicado!");
                        builder.setMessage("Deseja continuar?");

                        builder.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                finish();
                            }
                        });

                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Ges = 31;

                            }
                        });
                        builder.show();
                    }

                }

        });


    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.imgLiso1a:
                Cabelo = "Liso";
                Toast.makeText( ProcedimentosActivity.this, "Liso", Toast.LENGTH_LONG).show();
                break;
            case R.id.imgOndulado2a:
                Cabelo = "Ondulado";
                Toast.makeText( ProcedimentosActivity.this, "Ondulado", Toast.LENGTH_LONG).show();
                break;
            case R.id.imgCacheado3a:
                Cabelo = "Cacheado";
                Toast.makeText( ProcedimentosActivity.this, "Cacheado", Toast.LENGTH_LONG).show();
                break;
            case R.id.imgCrespo4b:
                Cabelo = "Crespo";
                Toast.makeText( ProcedimentosActivity.this, "Crespo", Toast.LENGTH_LONG).show();
                break;
            case R.id.imgLisom:
                Cabelo = "Liso";
                Toast.makeText( ProcedimentosActivity.this, "Liso", Toast.LENGTH_LONG).show();
                break;
            case R.id.imgonduladom:
                Cabelo = "Ondulado";
                Toast.makeText( ProcedimentosActivity.this, "Ondulado", Toast.LENGTH_LONG).show();
                break;
            case R.id.imgcacheadom:
                Cabelo = "Cacheado";
                Toast.makeText( ProcedimentosActivity.this, "Cacheado", Toast.LENGTH_LONG).show();
                break;
            case R.id.imgcrespom:
                Cabelo = "Crespo";
                Toast.makeText( ProcedimentosActivity.this, "Crespo", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }

        rbquiSimQuiTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbquiSimQuiTrans.isChecked()){

                    linearLayoutquimAtual.setVisibility(View.VISIBLE);
                    lineQiumiDese.setVisibility(View.VISIBLE);
                }
            }
        });

       rbquiNaoQuiTrans.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (rbquiNaoQuiTrans.isChecked()){
                   linearLayoutquimAtual.setVisibility(View.GONE);
                   lineQiumiDese.setVisibility(View.VISIBLE);
               }
           }
       });*/