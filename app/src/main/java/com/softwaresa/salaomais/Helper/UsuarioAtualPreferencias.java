package com.softwaresa.salaomais.Helper;

import android.content.Context;
import android.content.SharedPreferences;

public class UsuarioAtualPreferencias
{
    // Instanciando elementos construtor

    private Context contexto;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private static final String ARQUIVO_PREFERENCIA= "PreferenciaUsuarioAtual";
    private int MODE=0;

    // Construtor
    public UsuarioAtualPreferencias(Context c) {
        this.contexto = c;
        this.preferences = c.getSharedPreferences(ARQUIVO_PREFERENCIA,MODE);
        this.editor= preferences.edit();
    }

    public void inserirUsuarioAtualPreferencia(String usuario){

        this.editor.putString("usuarioAtual", usuario);
        this.editor.commit();

    }

    public String recuperaUsuarioAtual() {
        String usuario;

        usuario= preferences.getString("usuarioAtual", null);
        return usuario;
    }

}


