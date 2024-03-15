package com.example.movilesparcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        Button producto1 =
    findViewById(R.id.producto1);
        Button producto2 =
    findViewById(R.id.producto2);
        producto1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        ResultadoActivity.class).putExtra("producto",
                        "tomate"));

            }
        });

        producto2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new
                        Intent(MainActivity.this,
                        ResultadoActivity.class).putExtra("producto",
                "cebolla"));
            }
        });

        };

    public void onClick(View mockView) {
    }


}
