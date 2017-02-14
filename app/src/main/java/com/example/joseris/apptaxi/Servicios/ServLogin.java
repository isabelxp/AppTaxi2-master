package com.example.joseris.apptaxi.Servicios;

import android.util.Log;

import com.example.joseris.apptaxi.Interfaces.InterLogin;
import com.example.joseris.apptaxi.Interfaces.RegistroUsuario;
import com.example.joseris.apptaxi.Modelos.Request.RequestCrearUsuario;
import com.example.joseris.apptaxi.Modelos.Request.RequestLogin;
import com.example.joseris.apptaxi.Modelos.Responses.Example;
import com.example.joseris.apptaxi.Modelos.Responses.ResponseRegistroUsuario;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Joseris on 13/02/2017.
 */

public class ServLogin {

    public void LoginUsuario(RequestLogin loginUsuario)
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://apptaxi.esy.es/API/public/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        InterLogin service=retrofit.create(InterLogin.class);
        Call<Example> call=service.loginUsuario(loginUsuario);
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                if (response.isSuccessful()) {
                    Log.e("Bien", ":" + call.request().url().toString());
                }
            }
            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.e("Error base datos", "------"+ t);
            }
        });

    }
}
