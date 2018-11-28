package com.softwaresa.salaomais.Entidades;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.softwaresa.salaomais.Configuracoes.ConfiguracaoFirebase;

import java.util.HashMap;
import java.util.Map;

public class Usuarios {

    private String id;
    private String nome;
    private String senha;
    private String recuperar;
    private String email;



    private String sexo;

    public Usuarios() {

    }




    public void salvar(){

        DatabaseReference referneciasFirebase = ConfiguracaoFirebase.getFirebase();
        referneciasFirebase.child("usuario").child(String.valueOf(getId())).child("usuario").setValue(this);
    }

    @Exclude

    public Map<String, Object> toMap(){

        HashMap<String, Object> hashMapUsuarios = new HashMap<>();

        hashMapUsuarios.put("id",getId());
        hashMapUsuarios.put("nome",getNome());
        hashMapUsuarios.put("senha",getSenha());
        hashMapUsuarios.put("recuperar",getRecuperar());
        hashMapUsuarios.put("email",getEmail());
        hashMapUsuarios.put("sexo",getSexo()) ;

        return hashMapUsuarios;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private String getRecuperar() {
        return recuperar;
    }

    public void setRecuperar(String recuperar) {
        this.recuperar = recuperar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
