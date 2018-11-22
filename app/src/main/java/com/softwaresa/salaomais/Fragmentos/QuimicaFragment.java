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
import com.softwaresa.salaomais.Helper.ProcedimentosPreferencias;
import com.softwaresa.salaomais.R;


public class QuimicaFragment extends Fragment {


    private LinearLayout linearquimdesejadal;
    private FrameLayout frameQuimiPossui;
    private FrameLayout frameQuimi1;
    private RadioGroup rgQuimicatrans;
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
    private FrameLayout frameBase;
    private ToqueMechasFragment toqueMechasFragment;
    private ProcedimentosPreferencias procedimentosPreferencias;





    public QuimicaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment


        View viewquimica = inflater.inflate(R.layout.fragment_quimica, container, false);
        frameQuimiPossui =  viewquimica.findViewById(R.id.frameQuimiPossuiId);
        frameQuimi1 = viewquimica.findViewById(R.id.frameQuimi1Id);
        frameQuimi2  = viewquimica.findViewById(R.id.frameQuimi2Id);
        rgQuimicatrans = viewquimica.findViewById(R.id.rgQuimicatransId);
        rgQuiAtual = viewquimica.findViewById(R.id.rgQuiAtualId);
        rgBaseigual = viewquimica.findViewById(R.id.rgBaseigualId);
        frameBase = viewquimica.findViewById(R.id.frameBaseId);
        rgQuimiDesejada = viewquimica.findViewById(R.id.rgQuimiDesejadaId);
        rbQuimiSim  = viewquimica.findViewById(R.id.rbQuimiSimId);
        rbQuimiNao  = viewquimica.findViewById(R.id.rbQuimiNaoid);
        rbBIgualNao  = viewquimica.findViewById(R.id.rbBIgualNaoId);
        rbBIgualSim  = viewquimica.findViewById(R.id.rbBIgualSimId);
        rbAli1 = viewquimica.findViewById(R.id.rbAli1Id);
        rbAli2 = viewquimica.findViewById(R.id.rbAli2Id);
        rbCol1 = viewquimica.findViewById(R.id.rbCol1Id);
        rbCol2 = viewquimica.findViewById(R.id.rbCol2Id);
        procedimentosPreferencias  = new ProcedimentosPreferencias(getActivity());

        toqueMechasFragment = new ToqueMechasFragment();

                rgQuimicatrans.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbQuimiSimId){
                    frameQuimiPossui.setVisibility(View.GONE);
                    frameQuimi2.setVisibility(View.VISIBLE);


                }else if (checkedId  == R.id.rbQuimiNaoid){
                    frameQuimi1.setVisibility(View.VISIBLE);
                    frameQuimiPossui.setVisibility(View.GONE);

                }
            }
        });



        rgQuimiDesejada.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbAli1Id ){

                   procedimentosPreferencias.setQuimidesejada("alisamento");

                    if (procedimentosPreferencias.getQuimicatual().equals("alisamento")){
                        frameQuimi1.setVisibility(View.GONE);
                        frameBase.setVisibility(View.VISIBLE);
                    }else {

                        FragmentTransaction tansacaotoquemechas = getFragmentManager().beginTransaction();
                        tansacaotoquemechas.replace(R.id.contProcedimentoId,toqueMechasFragment);
                        tansacaotoquemechas.commit();
                    }

                }else if (checkedId == R.id.rbCol1Id){

                    procedimentosPreferencias.setQuimidesejada("coloracao");

                    if (procedimentosPreferencias.getQuimicatual().equals("coloracao")){
                        frameQuimi1.setVisibility(View.GONE);
                        frameBase.setVisibility(View.VISIBLE);
                    }else {

                        FragmentTransaction tansacaotoquemechas = getFragmentManager().beginTransaction();
                        tansacaotoquemechas.replace(R.id.contProcedimentoId,toqueMechasFragment);
                        tansacaotoquemechas.commit();

                    }

                }else if (checkedId == R.id.rbDes1Id){

                    procedimentosPreferencias.setQuimidesejada("descoloracao");

                    if (procedimentosPreferencias.getQuimicatual().equals("descoloracao")){
                        frameQuimi1.setVisibility(View.GONE);
                        frameBase.setVisibility(View.VISIBLE);
                    }else {

                        FragmentTransaction tansacaotoquemechas = getFragmentManager().beginTransaction();
                        tansacaotoquemechas.replace(R.id.contProcedimentoId,toqueMechasFragment);
                        tansacaotoquemechas.commit();

                    }

                }else{

                    procedimentosPreferencias.setQuimidesejada("permanente");

                    if (procedimentosPreferencias.getQuimicatual().equals("permanente")){
                        frameQuimi1.setVisibility(View.GONE);
                        frameBase.setVisibility(View.VISIBLE);
                    }else {

                        FragmentTransaction tansacaotoquemechas = getFragmentManager().beginTransaction();
                        tansacaotoquemechas.replace(R.id.contProcedimentoId,toqueMechasFragment);
                        tansacaotoquemechas.commit();

                    }
                }
            }
        });

        rgQuiAtual.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId  == R.id.rbAli2Id ){


                    frameQuimi1.setVisibility(View.VISIBLE);
                    frameQuimi2.setVisibility(View.GONE);

                    procedimentosPreferencias.setQuimicatual("alisamento");


                }else if (checkedId == R.id.rbCol2Id){

                    frameQuimi1.setVisibility(View.VISIBLE);
                    frameQuimi2.setVisibility(View.GONE);
                    procedimentosPreferencias.setQuimicatual("coloracao");


                }else if (checkedId == R.id.rbDes2Id){

                    frameQuimi1.setVisibility(View.VISIBLE);
                    frameQuimi2.setVisibility(View.GONE);
                    procedimentosPreferencias.setQuimicatual("descoloracao");


                }else {

                    frameQuimi1.setVisibility(View.VISIBLE);
                    frameQuimi2.setVisibility(View.GONE);
                    procedimentosPreferencias.setQuimicatual("permanente");


                }
            }
        });

        rgBaseigual.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbBIgualSimId){

                    procedimentosPreferencias.setBaseigual(true);
                    //Toast.makeText(getActivity(), String.valueOf(checkedId), Toast.LENGTH_SHORT).show();
                    FragmentTransaction tansacaotoquemechas = getFragmentManager().beginTransaction();
                    tansacaotoquemechas.replace(R.id.contProcedimentoId,toqueMechasFragment);
                    tansacaotoquemechas.commit();

                }else if (checkedId == R.id.rbBIgualNaoId){

                    procedimentosPreferencias.setBaseigual(false);
                    //Toast.makeText(getActivity(), String.valueOf(checkedId), Toast.LENGTH_SHORT).show();

                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setCancelable(true);
                    builder.setTitle("ATENÇÂO!");
                    builder.setMessage("Risco muito alto não e indicado utilizar químicas diferentes!");

                    builder.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            Intent intent = new  Intent(getActivity(),  MenuActivity.class );
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
