package com.softwaresa.salaomais.Helper;

import android.content.Context;
import android.content.SharedPreferences;

public class ProcedimentosPreferencias {

    //instancias construtor

    private Context context;
    private SharedPreferences preferences;
    private String NOME_ARQUIVO = "ConfiguracaoFirebase";
    private int MODE = 0;
    private SharedPreferences.Editor editor;


    //Instancias variaveis
    private String id;
    private String sexo;              // Masculino feminino
    private boolean gestante;        // Sim não
    private String tipocabelo;      // Liso, Ondulado, Cacheado, Crespo
    private Boolean quimidesejada;    // Alisamento, colorção, Descoloração, Permanente
    private String quimicatual;// Alisamento, colorção, Descoloração, Permanente
    private boolean baseigual;    // Sim Não
    private boolean alergia;     // sim Não
    private boolean testemechas;// escamação, coçeiras, irritabilidade capilar
    private boolean quimiTrans;
    private boolean danoscapilares;
    private String tempoaplicacao;


    private int contaBotaoSexo = 0;


    public ProcedimentosPreferencias(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, MODE);

        editor = preferences.edit();
        editor.apply();
    }

    //getters settres
    public String getSexo() {

        return preferences.getString("Sexo", "");
    }

    public void setSexo(String sexo) {

        editor.putString("Sexo", sexo);
        editor.commit();
    }

    public boolean getGestante() {

        return preferences.getBoolean("Gestante", false);
    }

    public void setGestante(boolean gestante) {

        editor.putBoolean("Gestante", false);
        editor.commit();
    }

    public String getTipocabelo() {

        return preferences.getString("Tipo cabelo", "");
    }

    public void setTipocabelo(String tipocabelo) {

        editor.putString("Tipo cabelo", tipocabelo);
        editor.commit();
    }

    public String getQuimidesejada() {

        return preferences.getString("Quimica desejada", "");
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

    public boolean getBaseigual() {
        return preferences.getBoolean("baseiguais", false);
    }

    public void setBaseigual(boolean baseigual) {
        editor.putBoolean("Base igual", baseigual);
        editor.commit();
    }

    public boolean isAlergia() {
        return preferences.getBoolean("Alergia", false);
    }

    public void setAlergia(boolean alergia) {
        editor.putBoolean("alergia", alergia);
        editor.commit();
    }

    public boolean isTestemechas() {
        return preferences.getBoolean("Testedemechas", false);
    }

    public void setTestemechas(boolean testemechas) {
        editor.putBoolean("Teste de mecha", testemechas);
        editor.commit();
    }


    public int getContaBotaoSexo() {
        return preferences.getInt("BotaoSexo", 0);
    }

    public void setContaBotaoSexo(int contaBotaoSexo) {
        editor.putInt("BotaoSexo", contaBotaoSexo);
        editor.commit();
    }

    public String getTempoAplicacao() {
        return preferences.getString("Aplicacao", "");
    }

    public void setTempoAplicacao(String aplicacao) {
        editor.putString("Aplicacao", aplicacao);
        editor.commit();
    }

    public String getId() {
        return preferences.getString("identificacao", "");
    }

    public void setId(String id) {
        editor.putString("identificacao", id);
        editor.commit();
    }

    public boolean isQuimiTrans() {
        return preferences.getBoolean("Quimicadetransformacao", false);
    }

    public void setQuimiTrans(boolean quimiTrans) {
        editor.putBoolean("Quimicadetransformacao", false);
        editor.commit();
    }

    public boolean isDanoscapilares() {
        return preferences.getBoolean("Danoscapilares", false);
    }

    public void setDanoscapilares(boolean danoscapilares) {
        editor.putBoolean("Danoscapilares", false);
        editor.commit();
    }


    public void apagarPreferecias() {
        editor.putString("Sexo", "");
        editor.putBoolean("Gestante", false);
        editor.putString("Tipocabelo", "");
        editor.putString("Quimicadesejada", "");
        editor.putString("Aplicacao", "");
        editor.putString("Quimicaanterior", "");
        editor.putBoolean("Baseigual", false);
        editor.putBoolean("alergia", false);
        editor.putBoolean("Testedemecha", false);
        editor.putBoolean("danoscapilares", false);
        editor.commit();

    }
}

/*
 exemplo de boolean

  public boolean isAlergia() {
        return preferences.getBoolean("Alergia",false);
    }

    public void setAlergia(boolean alergia) {
        editor.putBoolean("alergia",alergia);
        editor.commit();
    }
 */