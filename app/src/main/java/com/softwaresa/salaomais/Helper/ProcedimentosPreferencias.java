package com.softwaresa.salaomais.Helper;

import android.content.Context;
import android.content.SharedPreferences;

public class ProcedimentosPreferencias {

    //instancias construtor

    private Context context;
    private SharedPreferences preferences;
    private String NOME_ARQUIVO = "ConfiguracaoFirebase";
    private int MODE =0;
    private SharedPreferences.Editor editor;

    //Instancias variaveis

    private String sexo;              // Masculino feminino
    private boolean gestante;        // Sim não
    private String tipocabelo;      // Liso, Ondulado, Cacheado, Crespo
    private String quimidesejada;    // Alisamento, colorção, Descoloração, Permanente
    private String quimicatual;// Alisamento, colorção, Descoloração, Permanente
    private boolean baseigual;    // Sim Não
    private boolean alergia;     // sim Não
    private boolean testemechas;// escamação, coçeiras, irritabilidade capilar



    private String tempoaplicacao;

    private int contaBotaoSexo = 0;



    public ProcedimentosPreferencias(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences(NOME_ARQUIVO,MODE);

        editor = preferences.edit();
        editor.apply();
    }

    //getters settres
    public String getSexo() {

        return preferences.getString("Sexo", null);
    }

    public void setSexo(String sexo) {

        editor.putString("Sexo", sexo);
        editor.commit();
    }

    public boolean isGestante() {

        return preferences.getBoolean("Gestante", false);
    }

    public void setGestante(boolean gestante) {

        editor.putBoolean("Gestante", gestante);
        editor.commit();
    }

    public String getTipocabelo() {

        return preferences.getString("Tipo cabelo", "");
    }

    public void setTipocabelo(String tipocabelo) {

        editor.putString("Tipo cabelo",tipocabelo);
        editor.commit();
    }

    public String getQuimidesejada() {

        return preferences.getString("Quimica desejada","");
    }

    public void setQuimidesejada(String quimidesejada) {
        editor.putString("Quimica desejada", quimidesejada);
        editor.commit();
    }

    public String getQuimicatual() {
        return preferences.getString("Quimica anterior", "");
    }

    public void setQuimicatual(String quimicatual) {
        editor.putString("Quimica anterior", quimicatual);
        editor.commit();
    }

    public boolean isBaseigual() {
        return preferences.getBoolean("Base igual",false);
    }

    public void setBaseigual(boolean baseigual) {
        editor.putBoolean("Base igual", baseigual);
        editor.commit();
    }

    public boolean isAlergia() {
        return preferences.getBoolean("Alergia",false);
    }

    public void setAlergia(boolean alergia) {
        editor.putBoolean("alergia",alergia);
        editor.commit();
    }

    public boolean getTestemechas() {
        return preferences.getBoolean("Teste de mechas", false);
    }

    public void setTestemechas(boolean testemechas) {
        editor.putBoolean("Teste de mecha", testemechas);
        editor.commit();
    }


    public int getContaBotaoSexo() {
        return    preferences.getInt("Botao Sexo", 0 ) ;
    }

    public void setContaBotaoSexo(int contaBotaoSexo) {
        editor.putInt("Botao Sexo",contaBotaoSexo );
        editor.commit();
    }
    public String getTempoAplicacao() {
        return preferences.getString("Aplicacao","");
    }

    public void setTempoAplicacao(String aplicacao) {
        editor.putString("Aplicacao", aplicacao);
        editor.commit();
    }

    public void apagarPreferecias(){
        editor.putString("Sexo", "");
        editor.putBoolean("Gestante", false);
        editor.putString("Tipo cabelo","");
        editor.putString("Quimica desejada", "");
        editor.putString("Aplicacao", "");
        editor.putString("Quimica anterior", "");
        editor.putBoolean("Base igual", false);
        editor.putBoolean("alergia", false);
        editor.putBoolean("Teste de mecha", false);
        editor.commit();






    }
}

