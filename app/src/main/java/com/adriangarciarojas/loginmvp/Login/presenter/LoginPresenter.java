package com.adriangarciarojas.loginmvp.Login.presenter;

public interface LoginPresenter {

    // el presenter debe contener los metodos que interactuen con los INTERACTORES y las VISTAS
    void singIn(String username, String password);
    void loginSuccess();
    void loginError();

}
