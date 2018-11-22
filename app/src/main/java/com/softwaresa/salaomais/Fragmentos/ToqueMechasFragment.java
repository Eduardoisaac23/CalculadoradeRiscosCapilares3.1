package com.softwaresa.salaomais.Fragmentos;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.softwaresa.salaomais.Activity.MenuActivity;
import com.softwaresa.salaomais.Helper.ProcedimentosPreferencias;
import com.softwaresa.salaomais.R;



public class ToqueMechasFragment extends Fragment {


    private  ToqueMechasFragment toqueMechasFragment;
    private ProcedimentosPreferencias procedimentosPreferencias;
    private RadioGroup rgAlergial;
    private RadioGroup rgtesteMechas;
    private RadioButton rbAlergSim;
    private RadioButton rbAlergNao;
    private RadioButton rbtesteMechasSim;
    private RadioButton rbtesteMechasNao;




    public ToqueMechasFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       final View viewToqueMechas = inflater.inflate(R.layout.fragment_toque_mechas, container, false);

       toqueMechasFragment = new ToqueMechasFragment();
        procedimentosPreferencias  = new ProcedimentosPreferencias(getActivity());
        rgAlergial = viewToqueMechas.findViewById(R.id.rgAlergialId);
        rgtesteMechas = viewToqueMechas.findViewById(R.id.rgtesteMechasId);
        rbAlergSim = viewToqueMechas.findViewById(R.id.rbAlergSimId);
        rbAlergNao = viewToqueMechas.findViewById(R.id.rbAlergNaoId);
        rbtesteMechasSim = viewToqueMechas.findViewById(R.id.rbtesteMechasSimId);
        rbtesteMechasNao = viewToqueMechas.findViewById(R.id.rbtesteMechasNaoId);

        rgAlergial.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rbAlergSimId){
                    procedimentosPreferencias.setAlergia(true);

                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setCancelable(true);
                    builder.setTitle("ATENÇÂO!");
                    builder.setMessage("Risco muito alto não e indicado utilizar essa determinada  químicas !");

                    builder.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            Intent intent = new  Intent(getActivity(),  MenuActivity.class );
                            startActivity(intent);
                            dialog.cancel();
                        }
                    });
                    builder.show();

                }else if (checkedId == R.id.rbBIgualNaoId){
                    procedimentosPreferencias.setAlergia(false);

                }
            }
        });


        return viewToqueMechas;

    }

}
