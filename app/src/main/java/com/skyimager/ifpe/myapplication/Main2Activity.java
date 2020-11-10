package com.skyimager.ifpe.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
private EditText edit_potencia, edit_horas,edit_dias,edit_tarifa;
private Button bt_calular;
    private static double consumoW;
    private static double consumoR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edit_potencia=(EditText)findViewById(R.id.text1);
        edit_horas=(EditText)findViewById(R.id.text2);
        edit_dias= (EditText)findViewById(R.id.text3);
        edit_tarifa=(EditText)findViewById(R.id.text4);
        bt_calular=(Button)findViewById(R.id.btcal1);


        bt_calular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            calcular();
            }
        });

    }
public  void calcular(){
    Log.i("Bruna","Entrou: Calcular() ");
    String potencia= edit_potencia.getText().toString();
    String dias= edit_dias.getText().toString();
    String horas= edit_horas.getText().toString();
    String tarifa= edit_tarifa.getText().toString();

    if(potencia.isEmpty()||horas.isEmpty()||dias.isEmpty()||tarifa.isEmpty()){
        Toast.makeText(this,"preencha todos os campos",Toast.LENGTH_SHORT).show();

    }else{
       setConsumo_w (Double.parseDouble(potencia)*Double.parseDouble(horas)*Double.parseDouble(dias)/1000);
       setConsumo_R(consumoW*Double.parseDouble(tarifa));
       Intent intent2 = new Intent(this,Tela3.class);
        startActivity(intent2);
    }
}

    public void setConsumo_w(double consumow) {
        this.consumoW = consumow;
    }
    public static double getConsumo_W(){
        return consumoW;
    }
    public void setConsumo_R(double consumor) {
        this.consumoR = consumor;
    }
    public static double getConsumo_R(){
        return consumoR;
    }
}
