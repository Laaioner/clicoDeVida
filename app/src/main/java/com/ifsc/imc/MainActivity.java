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

    Float resultado;

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
                Float altura = Float.valueOf(editTextAltura.getText().toString()) / 100;
                Float peso = Float.valueOf(editTextPeso.getText().toString());
                resultado = peso / (altura * altura);
                i.putExtra("imc",Float.toString(resultado));
                startActivity(i);
            }
        });

        Log.d("clicodevida", "OnCreate");
        Toast.makeText(this,"OnCreate", Toast.LENGTH_LONG).show();

    }

}