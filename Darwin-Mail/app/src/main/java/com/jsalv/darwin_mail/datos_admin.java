package com.jsalv.darwin_mail;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by jsalv on 04/03/2017.
 */

public class datos_admin extends AppCompatActivity {
    Spinner tipos;
    EditText Nombre, Correo, Telefono;
    Button OK;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.datos_admin);



        tipos = (Spinner)findViewById(R.id.Tipo);
        Nombre = (EditText)findViewById(R.id.Nombre);
        Correo = (EditText)findViewById(R.id.Correo);
        Telefono = (EditText)findViewById(R.id.Telefono);
        OK = (Button)findViewById(R.id.OK);

//        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.TipoDeUsuario,
//                R.layout.support_simple_spinner_dropdown_item);
//
    }
}
