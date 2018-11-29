package com.softwaresa.salaomais.Fragmentos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.softwaresa.salaomais.Entidades.Procedimentos;
import com.softwaresa.salaomais.Helper.ProcedimentosPreferencias;
import com.softwaresa.salaomais.R;


public class TipocabeloMascFragment extends Fragment {

    private ImageView imgLiso;
    private ImageView imgonduladom;
    private ImageView imgcacheadom;
    private ImageView imgcrespom;
    private Button proximo2;
    private ProcedimentosPreferencias procedimentosPreferencias;
    private QuimicaFragment quimicaFragment;
    private Procedimentos  salvaProcedimentoTipocabelo;



    public TipocabeloMascFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
       View viewTipoCabeloM =  inflater.inflate(R.layout.fragment_tipocabelo_masc, container, false);




        imgLiso = viewTipoCabeloM.findViewById(R.id.imgLisoId);
        imgcrespom = viewTipoCabeloM.findViewById(R.id.imgcrespomId);
        imgcacheadom = viewTipoCabeloM.findViewById(R.id.imgcacheadomId);
        imgonduladom = viewTipoCabeloM.findViewById(R.id.imgonduladomId);
        proximo2 = viewTipoCabeloM.findViewById(R.id.btProximoMId);

        procedimentosPreferencias = new ProcedimentosPreferencias(getActivity());
        salvaProcedimentoTipocabelo = new Procedimentos();

        quimicaFragment = new QuimicaFragment();

        imgLiso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgLiso.isClickable()) {
                    procedimentosPreferencias.setTipocabelo("liso");
                     Toast.makeText(getActivity(),"Liso",Toast.LENGTH_LONG).show();
                    proximo2.setVisibility(View.VISIBLE);


                }
            }
        });
        imgonduladom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgonduladom.isClickable()) {
                    procedimentosPreferencias.setTipocabelo("ondulado");
                      Toast.makeText(getActivity(),"Ondulado",Toast.LENGTH_LONG).show();
                    proximo2.setVisibility(View.VISIBLE);


                }
            }
        });
        imgcacheadom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgcacheadom.isClickable()) {
                    procedimentosPreferencias.setTipocabelo("cacheado");
                     Toast.makeText(getActivity(),"Cacheado",Toast.LENGTH_LONG).show();
                    proximo2.setVisibility(View.VISIBLE);


                }
            }
        });
        imgcrespom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgcrespom.isClickable()) {
                    procedimentosPreferencias.setTipocabelo("crespo");
                     Toast.makeText(getActivity(),"Crespo",Toast.LENGTH_LONG).show();
                    proximo2.setVisibility(View.VISIBLE);

                }
            }
        });

        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( proximo2.isClickable()) {
                    FragmentTransaction transacaoQuimi = getFragmentManager().beginTransaction();
                    transacaoQuimi.replace(R.id.contProcedimentoId,quimicaFragment );
                    transacaoQuimi.commit();


                }
            }
        });
        return viewTipoCabeloM;
    }

}
