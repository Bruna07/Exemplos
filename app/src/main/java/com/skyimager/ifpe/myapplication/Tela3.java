package com.skyimager.ifpe.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class Tela3 extends Main2Activity {
private EditText consumo_W,consumo_R;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        Log.i("Bruna","Entrou: tela3");
        consumo_W= (EditText) findViewById(R.id.text_W);
        consumo_R= (EditText) findViewById(R.id.text_R);
        mostraResul();
    }
    public void mostraResul(){
        Log.i("Bruna","Entrou:mostraResul()");
        String consumoW= Double.toString(Main2Activity.getConsumo_W());
        consumo_W.setText("Consumo (W):"+consumoW);
        String consumoR= Double.toString(Main2Activity.getConsumo_R());
        consumo_R.setText("Consumo R$:"+ consumoR);

    }
}
