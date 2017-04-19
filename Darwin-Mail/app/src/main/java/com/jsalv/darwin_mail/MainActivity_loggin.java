package com.jsalv.darwin_mail;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity_loggin extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_loggin);
//        Button boton = (Button)findViewById(R.id.Alumno);
//        boton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent datos = new Intent(getApplicationContext(),datos_admin.class);
//                startActivity(datos);
//
//
//            }
//        });


        Button alumno=(Button)findViewById(R.id.Alumno);
        Button admin=(Button)findViewById(R.id.Adm);
        Typeface TF = Typeface.createFromAsset(getAssets(),"Roboto-Medium.ttf");
        alumno.setTypeface(TF);
        admin.setTypeface(TF);

    }


}
