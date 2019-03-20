package com.example.ciclovida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "CICLO DE VIDA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toastMensaje = Toast.makeText(MainActivity.this, "Adios",Toast.LENGTH_LONG);
        toastMensaje.setGravity(Gravity.CENTER,0,0);
        toastMensaje.show();

        Log.i(TAG,"Método onCreate();");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"On Pause",Toast.LENGTH_LONG).show();
        Log.i(TAG,"Método onPause();");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this,"On Restart",Toast.LENGTH_LONG).show();
        Log.i(TAG,"Método onRestart();");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"On Start",Toast.LENGTH_LONG).show();
        Log.i(TAG,"Método onStart();");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"On Stop",Toast.LENGTH_LONG).show();
        Log.i(TAG,"Método onStop();");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Método onDestroy();");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this,"On Resume",Toast.LENGTH_LONG).show();
        Log.i(TAG,"Método onResume();");
    }

}
