package com.skyimager.ifpe.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imagemI;
    private Button bt1I;
    private Button bt2I;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Bruna","Início");
        setContentView(R.layout.activity_main);
       // imagemI = (ImageView) findViewById(R.id.imagem1);
        bt1I= (Button)findViewById(R.id.bt1);
        bt2I= (Button)findViewById(R.id.bt2);

        bt1I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metodo1();
            }
        });
        bt2I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metodo2();
            }
        });
    }
    public void metodo1(){
        Log.i("Bruna","Entrou: Metodo1();");
        Intent intent0= new Intent(this,Main4Activity.class);
        startActivity(intent0);
    }
    public void metodo2(){
        Log.i("Bruna","Entrou: Metodo2();");
        Intent intent1 = new Intent(this,Main2Activity.class);
        startActivity(intent1);
    }

}