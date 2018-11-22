package com.softwaresa.salaomais.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.softwaresa.salaomais.DAO.ConfiguracaoFirebase;
import com.softwaresa.salaomais.Entidades.Usuarios;
import com.softwaresa.salaomais.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTEmail;
    private EditText editTSenha;
    private TextView textVRecSenha;
    private TextView textVCadastrar;
    private Button btnLogar;
    private FirebaseAuth autenticacao;
    private Usuarios usuarios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTEmail = findViewById(R.id.editTEmail);
        editTSenha = findViewById(R.id.editTSenha);
        textVCadastrar = findViewById(R.id.textVCadastrar);
        textVRecSenha = findViewById(R.id.textVRecSenha);
        btnLogar = findViewById(R.id.btnLogar);

        textVCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(intent);
            }
        });

        textVRecSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirRecSenha = new Intent( LoginActivity.this,  RecuperarSenhaActivity .class );
                startActivity(abrirRecSenha);
            }
        });

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!editTEmail.getText().toString().equals("") || !editTSenha.getText().toString().equals("")){

                    usuarios = new Usuarios();
                    usuarios.setEmail(editTEmail.getText().toString());
                    usuarios.setSenha(editTSenha.getText().toString());

                    valiadrlogin();

                } else {
                    Toast.makeText(LoginActivity.this, "Preencha os campos email e senha.", Toast.LENGTH_LONG).show();
                }



            }
        });


    }
    private void valiadrlogin(){

        autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();
        autenticacao.signInWithEmailAndPassword(usuarios.getEmail(),usuarios.getSenha()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){

                    telaHistorico();

                    Toast.makeText(LoginActivity.this, "login efetuado com sucesso.",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(LoginActivity.this, "Usuário ou senha inválidos.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void telaHistorico(){
        Intent intent = new  Intent(LoginActivity.this, MenuActivity.class);
        startActivity(intent);
        finish();
  }



}
