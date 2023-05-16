package com.example.textfields;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editTextEmail, editTextSenha;
    private TextInputLayout textLayoutEmail, textLayoutSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.et_email);
        editTextSenha = findViewById(R.id.et_senha);

        textLayoutEmail = findViewById(R.id.txt_layout_email);
        textLayoutSenha = findViewById(R.id.txt_layout_senha);

        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateForm();
            }
        });
    }

    private void validateForm(){

        if(editTextEmail.getText().toString().isEmpty()){
            textLayoutEmail.setErrorEnabled(true);
            textLayoutEmail.setError("Preencha seu e-mail!");
        }else{
            textLayoutEmail.setErrorEnabled(false);
        }

        if(editTextSenha.getText().toString().isEmpty()){
            textLayoutSenha.setErrorEnabled(true);
            textLayoutSenha.setError("Preencha sua senha!");
        }else{
            textLayoutSenha.setErrorEnabled(false);
        }
    }
}
