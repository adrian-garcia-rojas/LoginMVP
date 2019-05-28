package com.adriangarciarojas.loginmvp.Login.interactor;

import com.adriangarciarojas.loginmvp.Login.presenter.LoginPresenter;
import com.adriangarciarojas.loginmvp.Login.repository.LoginRepository;
import com.adriangarciarojas.loginmvp.Login.repository.LoginRepositoryImpl;

public class LoginInteractorImpl implements LoginInteractor {

    //para que esto funcione se necesita la entidad del repository

    private LoginPresenter presenter;
    private LoginRepository repository;


    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
        repository = new LoginRepositoryImpl(presenter);
    }

    @Override
    public void singIn(String username, String password) {
        repository.singIn(username, password);
    }
}
