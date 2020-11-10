package com.skyimager.ifpe.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        //setContentView(R.layout.activity_main);
        Log.i("Bruna", this.getClassName()+ ".onCreate() chamado:"+ icicle);

    }

    protected void onStart() {
        super.onStart();
        Log.i("Bruna",getClassName()+ ".onStart() chamado");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("Bruna",getClassName()+ ".onRestart() chamado.");
    }

    protected void onResume() {
        super.onResume();
        Log.i("Bruna",getClassName()+ ".onResume() chamado.");
    }

    protected void onPause() {
        super.onPause();
        Log.i("Bruna",getClassName()+ ".onPause() chamado.");
    }

    //@Override
    protected void OnSaveInstaceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i("Bruna",getClassName()+ ".onSaveInstanceState() chamado.");
    }

    protected void onStop(){
        super.onStop();
        Log.i("Bruna", getClassName()+ ".onStop() chamado.");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i("Bruna",getClassName()+".onDestroy() chamado.");
    }

    private String getClassName(){
        String s= getClass().getName();return s.substring(s.lastIndexOf("."));// OBS
    }

}
