package com.adriangarciarojas.loginmvp.Login.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.adriangarciarojas.loginmvp.Login.presenter.LoginPresenter;
import com.adriangarciarojas.loginmvp.Login.presenter.LoginPresenterImpl;
import com.adriangarciarojas.loginmvp.NuevaActividad.view.NuevaActividad;
import com.adriangarciarojas.loginmvp.R;

public class LoginActivity extends AppCompatActivity implements LoginView {


    private EditText username, password;
    private Button login;
    private ProgressBar progressbarLogin;

    private LoginPresenter presenter; //la vista llama al presenter Interace

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.txtUser);
        password = (EditText) findViewById(R.id.txtPassword);
        login = (Button) findViewById(R.id.btnLogin);
        progressbarLogin = (ProgressBar) findViewById(R.id.progressbarLogin);
        ocultarProgressBar();

        presenter = new LoginPresenterImpl(this); // nos pide la implementacion de loginView

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //crear las validaciones necesarias segun el caso de uso antes de ejecutar el metodo del presenter

                presenter.singIn(username.getText().toString(), password.getText().toString());
            }
        });

    }

    @Override
    public void inputsHabilitados() {
        username.setEnabled(true);
        password.setEnabled(true);
        login.setEnabled(true);
    }

    @Override
    public void inputsDesabilitados() {
        username.setEnabled(false);
        password.setEnabled(false);
        login.setEnabled(false);
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
        Toast.makeText(this, "Ocurrio este error: " + error, Toast.LENGTH_SHORT).show();
    }
}
