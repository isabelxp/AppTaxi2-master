package com.example.joseris.apptaxi.Interfaces;

import com.example.joseris.apptaxi.Modelos.Request.RequestCrearUsuario;
import com.example.joseris.apptaxi.Modelos.Request.RequestLogin;
import com.example.joseris.apptaxi.Modelos.Responses.Example;
import com.example.joseris.apptaxi.Modelos.Responses.ResponseRegistroUsuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Joseris on 13/02/2017.
 */

public interface InterLogin {
    @POST("login")
    Call<Example> loginUsuario(@Body RequestLogin request);
}
