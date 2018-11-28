package com.softwaresa.salaomais.Fragmentos;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.softwaresa.salaomais.Activity.MenuActivity;
import com.softwaresa.salaomais.Entidades.Procedimentos;
import com.softwaresa.salaomais.Helper.ProcedimentosPreferencias;
import com.softwaresa.salaomais.R;



public class SexoFragment extends Fragment {

    private RadioGroup rgGestante;
    private int contaBotaoSexo;
    private Button avancarSexo;
    private Button btnAvancar3;
    private Button btnAvancar4;

    private RadioGroup rgSexo;
    //Layout

    private FrameLayout sexoFrame;
    private FrameLayout gestanteFrame;
    private ProcedimentosPreferencias procedimentosPreferencias;
    private Procedimentos salvaProcedimentoSexo;
    private Procedimentos salvarProcedimentosGestante;
    private TipoCabeloFragment tipoCabeloFragment;
    private LinearLayout linearTcabelosMas;
    private  LinearLayout linearTcabelosFemi;


    public SexoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        tipoCabeloFragment = new TipoCabeloFragment();

        // Inflate the layout for this fragment
        final View viewSexo =  inflater.inflate(R.layout.fragment_sexo, container, false);
        sexoFrame = viewSexo.findViewById(R.id.sexoFrameId);
        avancarSexo = viewSexo.findViewById(R.id.btnAvancaSexoId);
        rgGestante = viewSexo.findViewById(R.id.rgGestanteId);
        btnAvancar3 = viewSexo.findViewById(R.id.btnAvancar3Id);
        btnAvancar4  = viewSexo.findViewById(R.id.btnAvancar4Id);
        rgSexo = viewSexo.findViewById(R.id.rgSexo);
        gestanteFrame = viewSexo.findViewById(R.id.gestanteFrameId);
       // linearTcabelosMas = viewSexo.findViewById(R.id.linearTcabelosMasId);
        linearTcabelosFemi = viewSexo.findViewById(R.id.linearTcabelosFemiId);

        procedimentosPreferencias  = new ProcedimentosPreferencias(getActivity());
        salvaProcedimentoSexo = new Procedimentos();
        salvarProcedimentosGestante = new  Procedimentos();


        rgSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                //descobrir qual botão de opção está selecionado


                if (checkedId == R.id.rbFemi) {

                  procedimentosPreferencias.setSexo("feminino");

                    sexoFrame.setVisibility(View.GONE);
                    gestanteFrame.setVisibility(View.VISIBLE);

                    //salvando firebase--------------------------------


                    salvaProcedimentoSexo.setId(procedimentosPreferencias.getId()+1);

                    salvaProcedimentoSexo.setSexo(procedimentosPreferencias.getSexo());

                    salvaProcedimentoSexo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------



                    rgGestante.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {

                            if (checkedId == R.id.rbSimGes) {

                               // btnAvancar3.setVisibility(View.GONE);
                               // gestanteFrame.setVisibility(View.GONE);
                                //btnAvancar4.setVisibility(View.GONE);
                               // sexoFrame.setVisibility(View.GONE);

                                procedimentosPreferencias.setGestante(true);

                                //salvando firebase--------------------------------


                                salvarProcedimentosGestante.setId(procedimentosPreferencias.getId()+1);

                                salvarProcedimentosGestante.setGestante(procedimentosPreferencias.isGestante());

                                salvarProcedimentosGestante.salvar();
                                procedimentosPreferencias.apagarPreferecias();

                                //---------------------------------

                                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                                builder.setCancelable(true);
                                builder.setTitle("ATENÇÂO!");
                                builder.setMessage("Esses procedimentos não indicados para você. Há graves riscos de danos ao bebê.");

                                builder.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                        Intent intent = new  Intent(getActivity(),  MenuActivity.class );
                                        startActivity(intent);
                                        dialog.cancel();
                                    }
                                });

                                builder.show();

                                /*builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                });*/


                            }else if (checkedId == R.id.rbNaoGes ){

                                procedimentosPreferencias.setGestante(false);


                                salvarProcedimentosGestante.setId(procedimentosPreferencias.getId()+1);

                                salvarProcedimentosGestante.setGestante(procedimentosPreferencias.isGestante());

                                salvarProcedimentosGestante.salvar();
                                procedimentosPreferencias.apagarPreferecias();

                                //---------------------------------



                                Toast.makeText(getActivity(), String.valueOf(checkedId), Toast.LENGTH_SHORT).show();
                                FragmentTransaction trascaocabelo = getFragmentManager().beginTransaction();
                                trascaocabelo.replace(R.id.contProcedimentoId, tipoCabeloFragment);
                                trascaocabelo.commit();

                                //  procedimentosPreferencias.setContaBotaoSexo(1);

                            }
                        }
                    });


                } else if (checkedId == R.id.rbMasc) {

                    procedimentosPreferencias.setSexo("masculino");

                    //avancarSexo.setVisibility(View.VISIBLE);
                    //btnAvancar3.setVisibility(View.GONE);

                    //salvando firebase--------------------------------


                    salvaProcedimentoSexo.setId(procedimentosPreferencias.getId()+1);

                    salvaProcedimentoSexo.setSexo(procedimentosPreferencias.getSexo());

                    salvaProcedimentoSexo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------

                    Toast.makeText(getActivity(), String.valueOf(checkedId), Toast.LENGTH_SHORT).show();
                    FragmentTransaction trascaocabelo = getFragmentManager().beginTransaction();
                    trascaocabelo.replace(R.id.contProcedimentoId, tipoCabeloFragment);
                    trascaocabelo.commit();

                }

            }
        });



        /*avancarSexo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (avancarSexo.isClickable()){
                   // Toast.makeText(getActivity(), String.valueOf(checkedId), Toast.LENGTH_SHORT).show();
                    FragmentTransaction trascaocabelo = getFragmentManager().beginTransaction();
                    trascaocabelo.replace(R.id.contProcedimentoId, tipoCabeloFragment);
                    trascaocabelo.commit();
                }
            }
        });
        btnAvancar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnAvancar3.isClickable()){
                    gestanteFrame.setVisibility(View.VISIBLE);
                     //sexoFrame.setVisibility(View.GONE);
                }
            }
        });
        btnAvancar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnAvancar4.isClickable()){
                    FragmentTransaction trascaocabelo = getFragmentManager().beginTransaction();
                    trascaocabelo.replace(R.id.contProcedimentoId, tipoCabeloFragment);
                    trascaocabelo.commit();
                }
            }
        });*/

       /* avancarSexo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(procedimentosPreferencias.getContaBotaoSexo() == 0){
                    sexoFrame.setVisibility(View.GONE);
                    gestanteFrame.setVisibility(View.VISIBLE);

                    /*if (procedimentosPreferencias.getSexo().equals("feminino")){

                        rgGestante.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {

                                if (checkedId == R.id.rbSimGes) {

                                    procedimentosPreferencias.setGestante(true);

                                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                                    builder.setCancelable(true);
                                    builder.setTitle("ATENÇÂO!");
                                    builder.setTitle("Uso de produtos químicos em gestantes não e indicado!");
                                    builder.setMessage("Deseja continuar?");

                                    builder.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {



                                            Intent intent = new  Intent(getActivity(),  MenuActivity.class );
                                            startActivity(intent);
                                            dialog.cancel();


                                        }
                                    });

                                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {

                                        }
                                    });


                                    builder.show();



                                }else if (checkedId == R.id.rbNaoGes ){

                                    procedimentosPreferencias.setGestante(false);

                                    Toast.makeText(getActivity(), String.valueOf(checkedId), Toast.LENGTH_SHORT).show();
                                    FragmentTransaction trascaocabelo = getFragmentManager().beginTransaction();
                                    trascaocabelo.replace(R.id.contProcedimentoId, tipoCabeloFragment);
                                    trascaocabelo.commit();
                                  //  procedimentosPreferencias.setContaBotaoSexo(1);

                                }
                            }
                        });

                    }else {
                        FragmentTransaction trascaocabelo = getFragmentManager().beginTransaction();
                        trascaocabelo.replace(R.id.contProcedimentoId, tipoCabeloFragment);
                        trascaocabelo.commit();

                    }

                   // procedimentosPreferencias.setContaBotaoSexo(1) ;
                }else {

                }


               // Toast.makeText(getActivity(),"ok",Toast.LENGTH_LONG ).show();
            }
        });*/


        return viewSexo;
    }



}

