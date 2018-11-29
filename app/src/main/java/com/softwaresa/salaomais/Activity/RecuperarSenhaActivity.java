package com.softwaresa.salaomais.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.softwaresa.salaomais.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class RecuperarSenhaActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private EditText editEmailrecup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);


        firebaseAuth = FirebaseAuth.getInstance();
        editEmailrecup = findViewById(R.id.editEmailrecup);
        Button btnV = findViewById(R.id.btnV);
        Button btnRecup = findViewById(R.id.btnRecup);

        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentv = new Intent(RecuperarSenhaActivity.this, LoginActivity.class);
                startActivity(intentv);

            }
        });


        btnRecup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editEmailrecup.getText().toString().trim();
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Entre com email", Toast.LENGTH_LONG).show();
                    return;
                }

                firebaseAuth.sendPasswordResetEmail(email)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(RecuperarSenhaActivity.this, " email enviado com sucesso", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(RecuperarSenhaActivity.this, "Falha ao enviar email de redefinição de senha", Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
            }
        });


    }
}
