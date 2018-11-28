package com.softwaresa.salaomais.Fragmentos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.softwaresa.salaomais.Entidades.Procedimentos;
import com.softwaresa.salaomais.Helper.Preferencias;
import com.softwaresa.salaomais.Helper.ProcedimentosPreferencias;
import com.softwaresa.salaomais.R;



public class TipoCabeloFragment extends Fragment {

    private TipoCabeloFragment tipoCabeloFragment;

    private LinearLayout linearScroll;
    private ScrollView scrollImagens;
    private LinearLayout linearTcabelo;
    private ImageView imgOndulado2a;
    private ImageView imgLiso1a;
    private ImageView imgCrespo4b;
    private ImageView imgCacheado3a;
    private ImageView imgLisom;
    private ImageView imgonduladom;
    private ImageView imgcacheadom;
    private ImageView imgcrespom;
    private Button btnProximo;
    private QuimicaFragment quimicaFragment;
    private ProcedimentosPreferencias procedimentosPreferencias;
    private Procedimentos salvarProcedimentosTipoCabelo;


    //Construtor
    public TipoCabeloFragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        quimicaFragment = new QuimicaFragment();

         final  View viewTipoCabelo = inflater.inflate(R.layout.fragment_tipo_cabelo, container, false);

       imgLiso1a = viewTipoCabelo.findViewById(R.id.imgLiso1aId);
       imgOndulado2a = viewTipoCabelo.findViewById(R.id.imgOndulado2aId);
       imgCacheado3a = viewTipoCabelo.findViewById(R.id.imgCacheado3aId);
       imgCrespo4b = viewTipoCabelo.findViewById(R.id.imgCrespo4bId);
       imgLisom = viewTipoCabelo.findViewById(R.id.imgLisomId);
       imgcrespom = viewTipoCabelo.findViewById(R.id.imgcrespomId);
       imgcacheadom = viewTipoCabelo.findViewById(R.id.imgcacheadomId);
       imgonduladom = viewTipoCabelo.findViewById(R.id.imgonduladomId);
       btnProximo = viewTipoCabelo.findViewById(R.id.btProximoId);

       procedimentosPreferencias  = new ProcedimentosPreferencias(getActivity());
       salvarProcedimentosTipoCabelo  = new Procedimentos();

        imgLiso1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgLiso1a.isClickable()){
                    procedimentosPreferencias.setTipocabelo("liso");
                   // Toast.makeText(getActivity(),"Liso",Toast.LENGTH_LONG).show();
                    btnProximo.setVisibility(View.VISIBLE);

                    //salvando firebase--------------------------------


                    salvarProcedimentosTipoCabelo.setId(procedimentosPreferencias.getId()+1);

                    salvarProcedimentosTipoCabelo.setCabelo(procedimentosPreferencias.getTipocabelo());

                    salvarProcedimentosTipoCabelo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------

                }
            }
        });
        imgOndulado2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgOndulado2a.isClickable()){
                    procedimentosPreferencias.setTipocabelo("ondulado");
                   // Toast.makeText(getActivity(),"Ondulado",Toast.LENGTH_LONG).show();
                    btnProximo.setVisibility(View.VISIBLE);

                    //salvando firebase--------------------------------


                    salvarProcedimentosTipoCabelo.setId(procedimentosPreferencias.getId()+1);

                    salvarProcedimentosTipoCabelo.setCabelo(procedimentosPreferencias.getTipocabelo());

                    salvarProcedimentosTipoCabelo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------
                }
            }
        });
        imgCacheado3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgCacheado3a.isClickable()){
                    procedimentosPreferencias.setTipocabelo("cacheado");
                   // Toast.makeText(getActivity(),"Cacheado",Toast.LENGTH_LONG).show();
                    btnProximo.setVisibility(View.VISIBLE);

                    //salvando firebase--------------------------------


                    salvarProcedimentosTipoCabelo.setId(procedimentosPreferencias.getId()+1);

                    salvarProcedimentosTipoCabelo.setCabelo(procedimentosPreferencias.getTipocabelo());

                    salvarProcedimentosTipoCabelo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------
                }
            }
        });
        imgCrespo4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (imgCrespo4b.isClickable()){
                    procedimentosPreferencias.setTipocabelo("crespo");
                  //  Toast.makeText(getActivity(),"Crespo",Toast.LENGTH_LONG).show();
                    btnProximo.setVisibility(View.VISIBLE);

                    //salvando firebase--------------------------------


                    salvarProcedimentosTipoCabelo.setId(procedimentosPreferencias.getId()+1);

                    salvarProcedimentosTipoCabelo.setCabelo(procedimentosPreferencias.getTipocabelo());

                    salvarProcedimentosTipoCabelo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------
                }
            }
        });
        imgLisom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgLisom.isClickable()){
                    procedimentosPreferencias.setTipocabelo("liso");
                   // Toast.makeText(getActivity(),"Liso",Toast.LENGTH_LONG).show();
                    btnProximo.setVisibility(View.VISIBLE);

                    //salvando firebase--------------------------------


                    salvarProcedimentosTipoCabelo.setId(procedimentosPreferencias.getId()+1);

                    salvarProcedimentosTipoCabelo.setCabelo(procedimentosPreferencias.getTipocabelo());

                    salvarProcedimentosTipoCabelo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------
                }
            }
        });
        imgonduladom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgonduladom.isClickable()){
                    procedimentosPreferencias.setTipocabelo("ondulado");
                  //  Toast.makeText(getActivity(),"Ondulado",Toast.LENGTH_LONG).show();
                    btnProximo.setVisibility(View.VISIBLE);

                    //salvando firebase--------------------------------


                    salvarProcedimentosTipoCabelo.setId(procedimentosPreferencias.getId()+1);

                    salvarProcedimentosTipoCabelo.setCabelo(procedimentosPreferencias.getTipocabelo());

                    salvarProcedimentosTipoCabelo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------
                }
            }
        });
        imgcacheadom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgcacheadom.isClickable()){
                    procedimentosPreferencias.setTipocabelo("cacheado");
                   // Toast.makeText(getActivity(),"Cacheado",Toast.LENGTH_LONG).show();
                    btnProximo.setVisibility(View.VISIBLE);

                    //salvando firebase--------------------------------


                    salvarProcedimentosTipoCabelo.setId(procedimentosPreferencias.getId()+1);

                    salvarProcedimentosTipoCabelo.setCabelo(procedimentosPreferencias.getTipocabelo());

                    salvarProcedimentosTipoCabelo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------
                }
            }
        });
        imgcrespom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgcrespom.isClickable()){
                    procedimentosPreferencias.setTipocabelo("crespo");
                   // Toast.makeText(getActivity(),"Crespo",Toast.LENGTH_LONG).show();
                    btnProximo.setVisibility(View.VISIBLE);

                    //salvando firebase--------------------------------


                    salvarProcedimentosTipoCabelo.setId(procedimentosPreferencias.getId()+1);

                    salvarProcedimentosTipoCabelo.setCabelo(procedimentosPreferencias.getTipocabelo());

                    salvarProcedimentosTipoCabelo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------
                }
            }
        });

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnProximo.isClickable()){
                    FragmentTransaction transacaoQuimi = getFragmentManager().beginTransaction();
                    transacaoQuimi.replace(R.id.contProcedimentoId,quimicaFragment);
                    transacaoQuimi.commit();

                    //salvando firebase--------------------------------


                    salvarProcedimentosTipoCabelo.setId(procedimentosPreferencias.getId()+1);

                    salvarProcedimentosTipoCabelo.setCabelo(procedimentosPreferencias.getTipocabelo());

                    salvarProcedimentosTipoCabelo.salvar();
                    procedimentosPreferencias.apagarPreferecias();

                    //---------------------------------
                }
            }
        });

         return viewTipoCabelo;
    }

}
