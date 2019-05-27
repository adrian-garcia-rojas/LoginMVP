package com.adriangarciarojas.loginmvp.Login.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.adriangarciarojas.loginmvp.NuevaActividad.view.NuevaActividad;
import com.adriangarciarojas.loginmvp.R;

public class MainActivity extends AppCompatActivity implements LoginView {


    private EditText txtUser, txtPassword;
    private Button bntLogin;
    private ProgressBar progressbarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = (EditText) findViewById(R.id.txtUser);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        bntLogin = (Button) findViewById(R.id.btnLogin);
        progressbarLogin = (ProgressBar) findViewById(R.id.progressbarLogin);

    }

    @Override
    public void inputsHabilitados() {
        txtUser.setEnabled(true);
        txtPassword.setEnabled(true);
        bntLogin.setEnabled(true);
    }

    @Override
    public void inputsDesabilitados() {
        txtUser.setEnabled(false);
        txtPassword.setEnabled(false);
        bntLogin.setEnabled(false);
    }

    @Override
    public void mostrarProgressBar() {
        progressbarLogin.setVisibility(View.VISIBLE);
    }

    @Override
    public void ocultarProgressBar() {
        progressbarLogin.setVisibility(View.GONE);
    }

    @Override
    public void crearCuenta() {
        //Intent intent = new Intent(this, crearCuentaActivity.class);
        //startActivity(intent);
    }

    @Override
    public void abrirNuevaActividad() {
        Intent intent = new Intent(this, NuevaActividad.class);
        startActivity(intent);
    }

    @Override
    public void loginError(String error) {

    }
}
