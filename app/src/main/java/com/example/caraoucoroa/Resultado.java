package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Resultado extends AppCompatActivity {
    private ImageButton btn_voltar;
    private ImageView img_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        btn_voltar = findViewById(R.id.btn_voltar);
        img_resultado = findViewById(R.id.img_resultado);

        Intent it = getIntent();
        int numero = it.getIntExtra("num",0);

        if(numero == 0){ // cara
            img_resultado.setImageResource(R.drawable.moeda_cara);

        }else{ // coroa
            img_resultado.setImageResource(R.drawable.moeda_coroa);
        }
        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}