package com.softwaresa.salaomais.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;
import com.softwaresa.salaomais.Configuracoes.ConfiguracaoFirebase;
import com.softwaresa.salaomais.Entidades.Usuarios;
import com.softwaresa.salaomais.Helper.Base64Custom;
import com.softwaresa.salaomais.Helper.Preferencias;
import com.softwaresa.salaomais.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {


     private RadioButton rbFem;
     private RadioButton rbMas;
     private  EditText editTSenha;
     private  EditText editTEmail;
     private  EditText editTConSenha;
     private  EditText editTNome;
     private FloatingActionButton floaActionBtnSalavr;
     private Button btnSalvar;
     private Usuarios usuarios;
     private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        rbFem  = findViewById(R.id.rbFem);
        rbMas  = findViewById(R.id.rbMas);
        editTNome = findViewById(R.id.editTNome);
        editTSenha = findViewById(R.id.editTSenha);
        editTEmail = findViewById(R.id.editTEmail);
        editTConSenha = findViewById(R.id.editTConSenha);
        btnSalvar = findViewById(R.id.btnSalvar);
        floaActionBtnSalavr = findViewById(R.id.floaActionBtnSalavr);


        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTSenha.getText().toString().equals(editTConSenha.getText().toString())) {
                    usuarios = new Usuarios();
                    usuarios.setNome(editTNome.getText().toString());
                    usuarios.setEmail(editTEmail.getText().toString());
                    usuarios.setRecuperar(editTConSenha.getText().toString());
                    usuarios.setSenha(editTSenha.getText().toString());

                    cadastroDeUsuario();

                    if(rbFem.isChecked()){
                        usuarios.setSexo("Feminno");
                    }else{
                        usuarios.setSexo("Masculino");
                    }

                }else {

                    Toast.makeText(CadastroActivity.this, "Senhas não conferem:", Toast.LENGTH_LONG).show();
                }
            }
        });

        floaActionBtnSalavr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });


    }

    private void cadastroDeUsuario(){

     autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();
     autenticacao.createUserWithEmailAndPassword(

             usuarios.getEmail(),
             usuarios.getSenha()
     ).addOnCompleteListener(CadastroActivity.this, new OnCompleteListener<AuthResult>() {
         @Override
         public void onComplete(@NonNull Task<AuthResult> task) {

             if (task.isSuccessful()){

                 Toast.makeText(CadastroActivity.this,"Usuário cadastrado com sucesso", Toast.LENGTH_LONG).show();

                 String identificadorUsuario = Base64Custom.codificarBase64(usuarios.getEmail());
                 FirebaseUser usuarioFirebase = task.getResult().getUser();
                 usuarios.setId(identificadorUsuario);
                 usuarios.salvar();

                 Preferencias preferenciasAndroid = new Preferencias(CadastroActivity.this);
                 preferenciasAndroid.salvarUsuarioPreferencias(identificadorUsuario, usuarios.getNome());

                 //abrirLogin();

             }else if (!editTEmail.getText().toString().equals("") || !editTSenha.getText().toString().equals("")
                     || !editTNome.getText().toString().equals("") || !editTConSenha.getText().toString().equals("")){

                 Toast.makeText(CadastroActivity.this,"Preencha todos os campos.", Toast.LENGTH_LONG).show();



             }else {
                 String erroExecao = "";
                 try {

                     throw task.getException();

                 } catch (FirebaseAuthWeakPasswordException e) {
                     erroExecao = "Digite uma senha mais forte contendo minimo de 8 caracteres ente letras e números";

                 } catch (FirebaseAuthInvalidCredentialsException e) {
                     erroExecao = "O email digitado é inválido! Digite um novo email.";

                 } catch (FirebaseAuthUserCollisionException e) {
                     switch (erroExecao = "Este email já está cadastrado no sistema.") {
                     }

                 } catch (Exception e) {
                     erroExecao = "Erro ao efetuar o cadastro!";
                     e.printStackTrace();
                 }
                 Toast.makeText(CadastroActivity.this, "Erro:" + erroExecao, Toast.LENGTH_LONG).show();

             }
         }
     });

    }
}
