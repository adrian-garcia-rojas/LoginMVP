package com.adriangarciarojas.loginmvp.Login.presenter;

import com.adriangarciarojas.loginmvp.Login.interactor.LoginInteractor;
import com.adriangarciarojas.loginmvp.Login.interactor.LoginInteractorImpl;
import com.adriangarciarojas.loginmvp.Login.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter {

    //Necesitamos dos Entidades la de la Vista y la del Interactor

    private LoginView loginView; //este se llama desde la vista
    private LoginInteractor interactor;

    //para que el presenter pueda funcionar nececitamos que en su metodo contructor se este inyectando la vista (ctrl + N)
    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl(this);
    }



    @Override
    public void singIn(String username, String password) {
        loginView.inputsDesabilitados();
        loginView.mostrarProgressBar();

        interactor.singIn(username, password);
    }

    @Override
    public void loginSuccess() {
        loginView.abrirNuevaActividad();

        loginView.ocultarProgressBar();
    }

    @Override
    public void loginError(String error) {
        loginView.inputsHabilitados();
        loginView.ocultarProgressBar();
        loginView.loginError(error);

    }
}
