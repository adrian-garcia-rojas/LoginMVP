package com.adriangarciarojas.loginmvp.Login.view;

public interface LoginView {

    void inputsHabilitados();
    void inputsDesabilitados();
    void mostrarProgressBar();
    void ocultarProgressBar();

    void crearCuenta();
    void abrirNuevaActividad();
    void loginError(String error);

}
