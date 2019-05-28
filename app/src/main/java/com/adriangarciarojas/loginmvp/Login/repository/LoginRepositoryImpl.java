package com.adriangarciarojas.loginmvp.Login.repository;

import com.adriangarciarojas.loginmvp.Login.presenter.LoginPresenter;

public class LoginRepositoryImpl implements LoginRepository {

    //necesitamos el presenter, ya que en algun momento necesitaremos cumunicarnos con la vista
    // para indicarle que el login fue exitoso

    LoginPresenter presenter;

    public LoginRepositoryImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void singIn(String username, String password) {

        //simulamos una validacion corecta en la consulta de algun servicio o fuente de datos

        Boolean success = true;
        if(success){
            presenter.loginSuccess();
        }else{
            presenter.loginError("Ocurrio un Error");
        }

    }
}
