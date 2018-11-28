package com.softwaresa.salaomais.Entidades;

import com.google.firebase.database.DatabaseReference;
import com.softwaresa.salaomais.Configuracoes.ConfiguracaoFirebase;

public class Procedimentos {


    private String Gestante;
    private int id;
    private String Cabelo;
    private String QuimicaAnterior;
    private String QuimicaAtual;
    private String Base;
    private String alergia;
    private String DanosCapilares;
    private String Procedimento;

    public Procedimentos() {

    }

    public void salvar(){

        DatabaseReference referneciasFirebase = ConfiguracaoFirebase.getFirebase();
        referneciasFirebase.child("usuario").child(String.valueOf(getId())).child("usuario").setValue(this);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
