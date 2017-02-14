package com.example.joseris.apptaxi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.joseris.apptaxi.FragmnetsRegistroUsuario.Actividad_principalTaxi;
import com.example.joseris.apptaxi.Modelos.Request.RequestCrearUsuario;
import com.example.joseris.apptaxi.Modelos.Request.RequestLogin;
import com.example.joseris.apptaxi.Servicios.ServLogin;
import com.example.joseris.apptaxi.Servicios.ServRegistroUsuario;

public class Login extends AppCompatActivity {
    TextView TextRegistro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextRegistro = (TextView) findViewById(R.id.textregistro);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        TextRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, RegistroUsuario.class);
                startActivity(i);
                overridePendingTransition(R.anim.left_in,R.anim.left_out);
            }
        });
        CoordinatorLayout vista=(CoordinatorLayout)findViewById(R.id.coordinatorlayout);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  onShowDialogHeadersClick();

                //ServLogin login=new ServLogin();
                //RequestLogin requestLogin = new RequestLogin("12345","isabel201999@gmail.com","kdmmdjdkdndjn");
                //login.LoginUsuario(requestLogin);

                //ServRegistroUsuario registro=new ServRegistroUsuario();
                //RequestCrearUsuario requestCrearUsuario = new RequestCrearUsuario("V2236945","12345","Isa23","4142122",1,"isabel201999@gmail.com","pasajero",null,null);
                //registro.registrarUsuario(requestCrearUsuario);

                //Intent i = new Intent(Login.this, Actividad_principalTaxi.class);
               // startActivity(i);
               // overridePendingTransition(R.anim.left_in,R.anim.left_out);
            }
        });


    }



}
