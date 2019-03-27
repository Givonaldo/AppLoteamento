package com.example.loteamentobemviver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView info;
    private EditText usuario, senha;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.info = (TextView) findViewById(R.id.textViewInfo);
        this.usuario = (EditText) findViewById(R.id.editTextUsuario);
        this.senha = (EditText) findViewById(R.id.EditTextSenha);
        this.login = (Button) findViewById(R.id.btnEntrar);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarUsuario(usuario.getText().toString(), senha.getText().toString());
            }
        });
    }


    public void validarUsuario(String usuario, String senha){
        if ((usuario == "admin") && (senha == "123")) {
            Intent intent = new Intent(MainActivity.this, ActivityPrincipal.class);
            startActivity(intent);
        }else {
            info.setText("Senha incorreta, tente novamente. Você precisa fazer parte da equipe de vendas para entrar no sistema.");
        }

    }


}
