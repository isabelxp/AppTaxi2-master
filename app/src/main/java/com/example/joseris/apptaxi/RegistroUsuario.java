package com.example.joseris.apptaxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.joseris.apptaxi.FragmnetsRegistroUsuario.RegistroUsuarioCuatro;
import com.example.joseris.apptaxi.FragmnetsRegistroUsuario.RegistroUsuarioDos;
import com.example.joseris.apptaxi.FragmnetsRegistroUsuario.RegistroUsuarioTres;
import com.example.joseris.apptaxi.FragmnetsRegistroUsuario.RegistroUsuarioUno;

public class RegistroUsuario extends AppCompatActivity {



    public RegistroUsuarioUno fragment1 = new RegistroUsuarioUno();
    public RegistroUsuarioDos frgment2 = new RegistroUsuarioDos();
    public RegistroUsuarioTres frgment3 = new RegistroUsuarioTres();
    public RegistroUsuarioCuatro frgment4 = new RegistroUsuarioCuatro();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);




        Registrouno();



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // getSupportActionBar().setTitle("Registro de usuario");

        toolbar.setOverflowIcon(getResources().getDrawable(R.drawable.ic_more_vert));
        toolbar.setTitle("Registro de usuario");
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorAccent));

        if (toolbar != null)
            setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistroUsuario.this, "hola", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_actividad_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.action_settings:
                action(R.string.action_settings);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void action(int resid) {
        Toast.makeText(this, getText(resid), Toast.LENGTH_SHORT).show();
    }

    public void Registrouno()
    {

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container2, fragment1).commit();
    }
    public void RegistroDos()
    {


        getSupportFragmentManager().beginTransaction()
                .remove(fragment1).commit();

        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.left_in, R.anim.left_out)
                .replace(R.id.fragment_container2, frgment2).commit();
       // overridePendingTransition(R.anim.left_in,R.anim.left_out);
    }
    public void RegistroTres()
    {
        getSupportFragmentManager().beginTransaction()
                .remove(frgment2).commit();

        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.left_in, R.anim.left_out)
                .replace(R.id.fragment_container2, frgment3).commit();
        overridePendingTransition(R.anim.left_in,R.anim.left_out);
    }
    public void RegistroCuatro()
    {
        getSupportFragmentManager().beginTransaction()
                .remove(frgment3).commit();

        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.left_in, R.anim.left_out)
                .replace(R.id.fragment_container2, frgment4).commit();
        overridePendingTransition(R.anim.left_in,R.anim.left_out);
    }




}
