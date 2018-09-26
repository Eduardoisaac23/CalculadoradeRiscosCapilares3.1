package com.softwaresa.salaomais.Activity;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.softwaresa.salaomais.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProcedimentosFragment extends Fragment {

    public RadioButton rbfemi;
    public RadioButton rbmasc;
    public RadioGroup rgSexo;
    public RadioButton rbSim;
    public RadioButton rbNao;
    public RadioGroup rgresp;
    public TextView textVGestante;
    private String sexo = "";
    private TextView textVTipoCabelo;
    private HorizontalScrollView scrollTipoCabelo;


    public ProcedimentosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_procedimentos, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rbfemi = view.findViewById(R.id.rbFemi);
        rgresp = view.findViewById(R.id.rgresp);
        rbmasc = view.findViewById(R.id.rbMasc);
        rgresp = view.findViewById(R.id.rgresp);
        textVGestante = view.findViewById(R.id.textVGestante);
        scrollTipoCabelo = view.findViewById(R.id.scrollTipoCabelo);
        textVTipoCabelo = view.findViewById(R.id.textVTipoCabelo);

        rbfemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rbmasc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (rbmasc.isChecked()) { sexo = "Masculino";
                            textVGestante.setVisibility(View.GONE);
                            rgresp.setVisibility(View.GONE);
                            textVTipoCabelo.setVisibility(View.GONE);
                            scrollTipoCabelo.setVisibility(View.GONE);
                            Toast.makeText(getActivity(),"Masculino",Toast.LENGTH_LONG).show();
                        }
                    }
                });

                if (rbfemi.isChecked()){
                    textVGestante.setVisibility(View.VISIBLE);
                    rgresp.setVisibility(View.VISIBLE);
                    textVTipoCabelo.setVisibility(View.VISIBLE);
                    scrollTipoCabelo.setVisibility(View.VISIBLE);


                    Toast.makeText(getActivity(),"Feminino",Toast.LENGTH_LONG).show();

                }






            }
        });
    }

}
