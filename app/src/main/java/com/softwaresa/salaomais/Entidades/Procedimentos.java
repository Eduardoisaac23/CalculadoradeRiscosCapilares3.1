package com.softwaresa.salaomais.Entidades;

import com.google.firebase.database.DatabaseReference;
import com.softwaresa.salaomais.Configuracoes.ConfiguracaoFirebase;

public class Procedimentos {

    private String usuarioAtual;
    private boolean Gestante;
    private String id;
    private String Cabelo;
    private String QuimicaAnterior;
    private String quimicatual;
    private Boolean quimidesejada;
    private String QuimicaAtual;
    private boolean Base;
    private boolean alergia;
    private boolean DanosCapilares;
    private String Procedimento;
    private String Sexo;
    private boolean testemechas;
    private boolean quimiTrans;

    public boolean isTestemechas() {
        return testemechas;
    }




  /*  private String usuarioAtual;
    private boolean Gestante;
    private String id;
    private String Cabelo;
    private String QuimicaAnterior;
    private String QuimicaAtual;
    private boolean Base;
    private boolean alergia;
    private boolean DanosCapilares;
    private String Procedimento;
    private String Sexo;
    private boolean testemechas;
    private boolean quimiTrans;*/

    public Procedimentos() {

    }

    public void salvar(){

        DatabaseReference referneciasFirebase = ConfiguracaoFirebase.getFirebase();
        referneciasFirebase.child("usuario").child(getUsuarioAtual()).child("procedimentos").child(String.valueOf(getId())).setValue(this);
    }



    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public boolean getGestante() {
        return Gestante;
    }

    public void setGestante(boolean gestante) {
        Gestante = gestante;
    }

    public String getCabelo() {
        return Cabelo;
    }

    public void setCabelo(String cabelo) {
        Cabelo = cabelo;
    }

    public String getQuimicaAnterior() {
        return QuimicaAnterior;
    }

    public void setQuimicaAnterior(String quimicaAnterior) {
        QuimicaAnterior = quimicaAnterior;
    }

    public String getQuimicaAtual() {
        return QuimicaAtual;
    }

    public void setQuimicaAtual(String quimicaAtual) {
        QuimicaAtual = quimicaAtual;
    }

    public boolean getBase() {
        return Base;
    }

    public void setBase(boolean base) {
        Base = base;
    }

    public boolean getAlergia() {
        return alergia;
    }

    public void setAlergia(boolean alergia) {
        this.alergia = alergia;
    }

    public boolean getDanosCapilares() {
        return DanosCapilares;
    }

    public void setDanosCapilares(boolean danosCapilares) {
        DanosCapilares = danosCapilares;
    }

    public String getProcedimento() {
        return Procedimento;
    }

    public void setProcedimento(String procedimento) {
        Procedimento = procedimento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuarioAtual() {
        return usuarioAtual;
    }

    public void setUsuarioAtual(String usuarioAtual) {
        this.usuarioAtual = usuarioAtual;
    }

    public void setTestemechas(boolean testemechas) {
        this.testemechas = testemechas;
    }

    public boolean isQuimiTrans() {
        return quimiTrans;
    }

    public void setQuimiTrans(boolean quimiTrans) {
        this.quimiTrans = quimiTrans;
    }


}


/*
public class Procedimentos {


    private String Gestante;
    private String Cabelo;
    private String QuimicaAnterior;
    private String QuimicaAtual;
    private String Base;
    private String alergia;
    private String DanosCapilares;
    private String Procedimento;

    public Procedimentos() {

    }

    private String Sexo;

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getGestante() {
        return Gestante;
    }

    public void setGestante(String gestante) {
        Gestante = gestante;
    }

    public String getCabelo() {
        return Cabelo;
    }

    public void setCabelo(String cabelo) {
        Cabelo = cabelo;
    }

    public String getQuimicaAnterior() {
        return QuimicaAnterior;
    }

    public void setQuimicaAnterior(String quimicaAnterior) {
        QuimicaAnterior = quimicaAnterior;
    }

    public String getQuimicaAtual() {
        return QuimicaAtual;
    }

    public void setQuimicaAtual(String quimicaAtual) {
        QuimicaAtual = quimicaAtual;
    }

    public String getBase() {
        return Base;
    }

    public void setBase(String base) {
        Base = base;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getDanosCapilares() {
        return DanosCapilares;
    }

    public void setDanosCapilares(String danosCapilares) {
        DanosCapilares = danosCapilares;
    }

    public String getProcedimento() {
        return Procedimento;
    }

    public void setProcedimento(String procedimento) {
        Procedimento = procedimento;
    }

/*
    private String usuarioAtual;
    private boolean Gestante;
    private String id;
    private String Cabelo;
    private String QuimicaAnterior;
    private String quimicatual;
    private Boolean quimidesejada;
    private String QuimicaAtual;
    private boolean Base;
    private boolean alergia;
    private boolean DanosCapilares;
    private String Procedimento;
    private String Sexo;
    private boolean testemechas;
    private boolean quimiTrans;





    public Procedimentos() {

    }


    public void salvar() {

        DatabaseReference referneciasFirebase = ConfiguracaoFirebase.getFirebase();
       // DatabaseReference referneciasFirebase = ConfiguracaoFirebase.getFirebase();
        referneciasFirebase.child("usuario").child(getUsuarioAtual()).child("procedimentos").child(String.valueOf(getId())).setValue(this);
    }




    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public boolean getGestante() {
        return Gestante;
    }

    public void setGestante(boolean gestante) {
        Gestante = gestante;
    }

    public String getCabelo() {
        return Cabelo;
    }

    public void setCabelo(String cabelo) {
        Cabelo = cabelo;
    }

    public String getQuimicaAnterior() {
        return QuimicaAnterior;
    }

    public void setQuimicaAnterior(String quimicaAnterior) {
        QuimicaAnterior = quimicaAnterior;
    }

    public String getQuimicaAtual() {
        return QuimicaAtual;
    }

    public void setQuimicaAtual(String quimicaAtual) {
        QuimicaAtual = quimicaAtual;
    }

    public boolean getBase() {
        return Base;
    }

    public void setBase(boolean base) {
        Base = base;
    }

    public boolean getAlergia() {
        return alergia;
    }

    public void setAlergia(boolean alergia) {
        this.alergia = alergia;
    }

    public boolean getDanosCapilares() {
        return DanosCapilares;
    }

    public void setDanosCapilares(boolean danosCapilares) {
        DanosCapilares = danosCapilares;
    }

    public String getProcedimento() {
        return Procedimento;
    }

    public void setProcedimento(String procedimento) {
        Procedimento = procedimento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuarioAtual() {
        return usuarioAtual;
    }

    public void setUsuarioAtual(String usuarioAtual) {
        this.usuarioAtual = usuarioAtual;
    }

    public String getQuimicatual() {
        return quimicatual;
    }

    public void setQuimicatual(String quimicatual) {
        this.quimicatual = quimicatual;
    }

    public Boolean getQuimidesejada() {
        return quimidesejada;
    }

    public void setQuimidesejada(Boolean quimidesejada) {
        this.quimidesejada = quimidesejada;
    }

    public boolean isTestemechas() {
        return testemechas;
    }

    public void setTestemechas(boolean testemechas) {
        this.testemechas = testemechas;
    }

    public boolean isQuimiTrans() {
        return quimiTrans;
    }

    public void setQuimiTrans(boolean quimiTrans) {
        this.quimiTrans = quimiTrans;
    }

}*/
