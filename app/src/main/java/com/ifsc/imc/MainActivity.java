package com.ifsc.imc;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("clicodevida", "OnCreate");
        Toast.makeText(this,"OnCreate", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("clicodevida", "onStart");
        Toast.makeText(this,"onStart", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("clicodevida", "onResume");
        Toast.makeText(this,"onResume", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("clicodevida", "onPause");
        Toast.makeText(this,"onPause", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("clicodevida", "onStop");
        Toast.makeText(this,"onStop", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("clicodevida", "OnRestart");
        Toast.makeText(this,"onRestart", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("clicodevida", "onDestroy");
        Toast.makeText(this,"onDestroy", Toast.LENGTH_LONG).show();

    }
}