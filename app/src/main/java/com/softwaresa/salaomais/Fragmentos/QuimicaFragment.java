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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.softwaresa.salaomais.Activity.MenuActivity;
import com.softwaresa.salaomais.Entidades.Procedimentos;
import com.softwaresa.salaomais.Helper.ProcedimentosPreferencias;
import com.softwaresa.salaomais.R;


public class QuimicaFragment extends Fragment {


    private LinearLayout linearquimdesejadal;
    private FrameLayout frameBase;
    private FrameLayout frameQuimiPossui;
    private FrameLayout frameQuimi1;
    private FrameLayout frameTempo;
    private RadioGroup rgQuimicatrans;
    private RadioGroup rgTempoAplicacao;
    private RadioButton rbQuimiSim;
    private RadioButton rbQuimiNao;
    private FrameLayout frameQuimi2;
    private RadioGroup rgQuiAtual;
    private RadioGroup rgQuimiDesejada;
    private RadioGroup rgBaseigual;
    private RadioButton rbBIgualSim;
    private RadioButton rbBIgualNao;
    private RadioButton rbAli2;
    private RadioButton rbCol2;
    private RadioButton rbDes2;
    private RadioButton rbPer2;
    private RadioButton rbAli1;
    private RadioButton rbCol1;
    private RadioButton rbDes1;
    private RadioButton rbPer1;
    private RadioButton rbTempoUm;
    private RadioButton rbTempoDois;
    private RadioButton rbTempoTres;
    private ToqueMechasFragment toqueMechasFragment;
    private ProcedimentosPreferencias procedimentosPreferencias;
    private Procedimentos salvarProcedimentosQuimicaTransformacao;
    private Procedimentos salvarProcedimentosQuimiDesejada;
    private Procedimentos salvarProcedimentosQumiAtual;
    private Procedimentos salvarProcedimentosBaseigual;
    private Procedimentos salvarBasesiguai;


    public QuimicaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment


        View viewquimica = inflater.inflate(R.layout.fragment_quimica, container, false);
        frameQuimiPossui = viewquimica.findViewById(R.id.frameQuimiPossuiId);
        frameQuimi1 = viewquimica.findViewById(R.id.frameQuimi1Id);
        frameQuimi2 = viewquimica.findViewById(R.id.frameQuimi2Id);
        rgQuimicatrans = viewquimica.findViewById(R.id.rgQuimicatransId);
        rgQuiAtual = viewquimica.findViewById(R.id.rgQuiAtualId);
        rgBaseigual = viewquimica.findViewById(R.id.rgBaseigualId);
        frameBase = viewquimica.findViewById(R.id.frameBaseId);
        frameTempo = viewquimica.findViewById(R.id.frameTempoId);
        rgTempoAplicacao = viewquimica.findViewById(R.id.rgTempoId);
        rbTempoUm = viewquimica.findViewById(R.id.rbTempoUmId);
        rbTempoDois = viewquimica.findViewById(R.id.rbTempoDoisId);
        rbTempoTres = viewquimica.findViewById(R.id.rbTempotresId);
        rgQuimiDesejada = viewquimica.findViewById(R.id.rgQuimiDesejadaId);
        rbQuimiSim = viewquimica.findViewById(R.id.rbQuimiSimId);
        rbQuimiNao = viewquimica.findViewById(R.id.rbQuimiNaoid);
        rbBIgualNao = viewquimica.findViewById(R.id.rbBIgualNaoId);
        rbBIgualSim = viewquimica.findViewById(R.id.rbBIgualSimId);
        rbAli1 = viewquimica.findViewById(R.id.rbAli1Id);
        rbAli2 = viewquimica.findViewById(R.id.rbAli2Id);
        rbCol1 = viewquimica.findViewById(R.id.rbCol1Id);
        rbCol2 = viewquimica.findViewById(R.id.rbCol2Id);


        procedimentosPreferencias = new ProcedimentosPreferencias(getActivity());

        toqueMechasFragment = new ToqueMechasFragment();
        salvarProcedimentosQuimicaTransformacao = new Procedimentos();
        salvarProcedimentosQuimiDesejada = new Procedimentos();
        salvarProcedimentosQumiAtual = new Procedimentos();
        salvarProcedimentosBaseigual = new Procedimentos();
        salvarBasesiguai = new Procedimentos();


        rgQuimicatrans.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbQuimiSimId) {
                    frameQuimiPossui.setVisibility(View.GONE);
                    //frameTempo.setVisibility(View.VISIBLE);
                    frameQuimi2.setVisibility(View.VISIBLE);




                } else if (checkedId == R.id.rbQuimiNaoid) {
                    frameQuimi1.setVisibility(View.VISIBLE);
                    //frameQuimiPossui.setVisibility(View.GONE);
                    frameQuimi2.setVisibility(View.GONE);



                }
            }
        });


        rgQuimiDesejada.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                //RaioButton Alisamento 1--------------------------------------------------------

                if (checkedId == R.id.rbAli1Id) {

                    procedimentosPreferencias.setQuimidesejada("alisamento");


                    if (procedimentosPreferencias.getQuimicatual().equals("alisamento")) {

                        frameBase.setVisibility(View.VISIBLE);



                    } else {




                        FragmentTransaction tansacaotoquemechas = getFragmentManager().beginTransaction();
                        tansacaotoquemechas.replace(R.id.contProcedimentoId, toqueMechasFragment);
                        tansacaotoquemechas.commit();
                    }


                    //RaioButton Coloração 1------------------------------------------------------------------------

                } else if (checkedId == R.id.rbCol1Id) {

                    procedimentosPreferencias.setQuimidesejada("coloracao");


                    if (procedimentosPreferencias.getQuimicatual().equals("coloracao")) {
                        frameBase.setVisibility(View.VISIBLE);

                    }


                    //RaioButton Descoloração 1------------------------------------------------------------------

                } else if (checkedId == R.id.rbDes1Id) {

                    procedimentosPreferencias.setQuimidesejada("descoloracao");

                    if (procedimentosPreferencias.getQuimicatual().equals("descoloracao")) {
                        frameBase.setVisibility(View.VISIBLE);


                    } else {


                        FragmentTransaction tansacaotoquemechas = getFragmentManager().beginTransaction();
                        tansacaotoquemechas.replace(R.id.contProcedimentoId, toqueMechasFragment);
                        tansacaotoquemechas.commit();
                    }

                    //RaioButton Permanente 1------------------------------------------------------------

                } else {


                    procedimentosPreferencias.setQuimidesejada("permanente");

                    if (procedimentosPreferencias.getQuimicatual().equals("permanente")) {
                        frameBase.setVisibility(View.VISIBLE);



                    } else {
                        frameBase.setVisibility(View.GONE);

                        FragmentTransaction tansacaotoquemechas = getFragmentManager().beginTransaction();
                        tansacaotoquemechas.replace(R.id.contProcedimentoId, toqueMechasFragment);
                        tansacaotoquemechas.commit();
                    }


                }
            }
        });

        rgQuiAtual.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rbAli2Id) {

                    procedimentosPreferencias.setQuimicatual("alisamento");
                    frameQuimi1.setVisibility(View.VISIBLE);
                    // frameTempo.setVisibility(View.VISIBLE);
                    frameQuimi2.setVisibility(View.GONE);



                } else if (checkedId == R.id.rbCol2Id) {

                    procedimentosPreferencias.setQuimicatual("coloracao");
                    frameQuimi1.setVisibility(View.VISIBLE);
                    //frameTempo.setVisibility(View.VISIBLE);
                    frameQuimi2.setVisibility(View.GONE);



                } else if (checkedId == R.id.rbDes2Id) {

                    procedimentosPreferencias.setQuimicatual("descoloracao");
                    frameQuimi1.setVisibility(View.VISIBLE);
                    //frameTempo.setVisibility(View.VISIBLE);
                    frameQuimi2.setVisibility(View.GONE);






                } else {

                    procedimentosPreferencias.setQuimicatual("permanente");
                    frameQuimi1.setVisibility(View.VISIBLE);
                    // frameTempo.setVisibility(View.VISIBLE);
                    frameQuimi2.setVisibility(View.GONE);



                }
            }
        });

        /*rgTempoAplicacao.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rbTempoUmId) {

                    procedimentosPreferencias.setTempoAplicacao("seis meses a um ano");
                    frameQuimi1.setVisibility(View.VISIBLE);
                    frameTempo.setVisibility(View.GONE);

                } else if (checkedId == R.id.rbTempoDoisId) {

                    procedimentosPreferencias.setTempoAplicacao("tres meses a cinco meses");
                    frameQuimi1.setVisibility(View.VISIBLE);
                    frameTempo.setVisibility(View.GONE);

                } else {

                    procedimentosPreferencias.setTempoAplicacao("quinze dias a um mes");
                    frameQuimi1.setVisibility(View.VISIBLE);
                    frameTempo.setVisibility(View.GONE);
                }
            }
        });*/

        rgBaseigual.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbBIgualSimId) {

                    procedimentosPreferencias.setBaseigual(true);
                    //Toast.makeText(getActivity(), String.valueOf(checkedId), Toast.LENGTH_SHORT).show();

                    FragmentTransaction tansacaotoquemechas = getFragmentManager().beginTransaction();
                    tansacaotoquemechas.replace(R.id.contProcedimentoId, toqueMechasFragment);
                    tansacaotoquemechas.commit();

                } else if (checkedId == R.id.rbBIgualNaoId) {

                    procedimentosPreferencias.setBaseigual(false);
                    //Toast.makeText(getActivity(), String.valueOf(checkedId), Toast.LENGTH_SHORT).show();

                    salvarProcedimentosBaseigual.setId(procedimentosPreferencias.getId() + 1);

                    salvarProcedimentosBaseigual.setCabelo(procedimentosPreferencias.getQuimicatual()); //trocar por base

                    //salvarProcedimentosBaseigual.salvar();
                    procedimentosPreferencias.apagarPreferecias();


                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setCancelable(true);
                    builder.setTitle("ATENÇÂO!");
                    builder.setMessage("As químicas que você selecionou são incompatíveis");

                    builder.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            Intent intent = new Intent(getActivity(), MenuActivity.class);
                            startActivity(intent);
                            dialog.cancel();
                        }
                    });
                    builder.show();
                }
            }
        });


        return viewquimica;
    }

}

//Tempo da química
                                 /* if (procedimentosPreferencias.getTempoAplicacao().equals("Seis mesea a um ano")){
                              }else {
                             AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                              builder.setCancelable(true);
                              builder.setTitle("ATENÇÂO!");
                              builder.setMessage("Tempo não é suficiente para uma outa aplicação");
                              builder.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Intent intent = new  Intent(getActivity(),  MenuActivity.class );
                                startActivity(intent);
                                dialog.cancel();
                            }
                              });
                                 builder.show();
                              }*/


/* if (procedimentosPreferencias.getTempoAplicacao().equals("tres meses a cinco meses")||
                                (procedimentosPreferencias.getTempoAplicacao().equals("quinze dias a um mes"))){

                            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                            builder.setCancelable(true);
                            builder.setTitle("ATENÇÂO!");
                            builder.setMessage("Tempo não é suficiente para uma outa aplicação");
                            builder.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                    Intent intent = new  Intent(getActivity(),  MenuActivity.class );
                                    startActivity(intent);
                                    dialog.cancel();
                                }
                            });
                            builder.show();

                        }else {

                            FragmentTransaction tansacaotoquemechas = getFragmentManager().beginTransaction();
                            tansacaotoquemechas.replace(R.id.contProcedimentoId,toqueMechasFragment);
                            tansacaotoquemechas.commit();
                        }*/