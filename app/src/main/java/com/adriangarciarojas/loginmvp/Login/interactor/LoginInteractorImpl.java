package com.adriangarciarojas.loginmvp.Login.interactor;

import com.adriangarciarojas.loginmvp.Login.presenter.LoginPresenter;

public class LoginInteractorImpl implements LoginInteractor {

    //para que esto funcione se necesita la entidad del repository

    private LoginPresenter loginPresenter;

    public LoginInteractorImpl(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    @Override
    public void singIn(String username, String password) {

    }
}
