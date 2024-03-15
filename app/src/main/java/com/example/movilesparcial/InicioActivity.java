package com.example.movilesparcial;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InicioActivity extends
        AppCompatActivity {

    @Override
    protected void onCreate (Bundle
                            savedIntanceState){
    super.onCreate(savedIntanceState);
    setContentView(R.layout.activity_main);

        Button btniniciar =
    findViewById(R.id.btniniciar);
        botonInicio.setOnClikListener(new
                View.OnClickListener(){
            @Override
                    public void onClick(View v){

            }
                })
    }
}

