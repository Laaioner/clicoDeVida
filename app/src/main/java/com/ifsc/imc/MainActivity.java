package com.ifsc.imc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editTextAltura, editTextPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextAltura = findViewById(R.id.editTextAltura);
        editTextPeso = findViewById(R.id.editTextPeso);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MsgActivity.class);
                String altura = editTextAltura.getText().toString();
                String peso = editTextPeso.getText().toString();
                i.putExtra("msg",altura);
                startActivity(i);
            }
        });

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