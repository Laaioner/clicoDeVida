package com.ifsc.imc;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.skydoves.colorpickerview.ColorEnvelope;
import com.skydoves.colorpickerview.ColorPickerDialog;
import com.skydoves.colorpickerview.listeners.ColorEnvelopeListener;

public class MainActivity extends AppCompatActivity {

    Button bntlimpa;
    SimplePaint simplePaint;

    Button buttonColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("clicodevida", "OnCreate");
        Toast.makeText(this,"OnCreate", Toast.LENGTH_LONG).show();
        bntlimpa = findViewById(R.id.bntlimpa);
        simplePaint = findViewById(R.id.simplePaint);
        buttonColor = findViewById(R.id.buttonColor);


        buttonColor.setOnClickListener(v -> {
            new ColorPickerDialog.Builder(this)
                    .setTitle("ColorPicker Dialog")
                    .setPreferenceName("MyColorPickerDialog")
                    .setPositiveButton("Confirma",
                            new ColorEnvelopeListener() {
                                @Override
                                public void onColorSelected(ColorEnvelope envelope, boolean fromUser) {
                                    v.setBackgroundColor(envelope.getColor());
                                    simplePaint.changeColor(envelope.getColor());
                                }
                            })
                    .setNegativeButton("Cancela",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            })
                    .attachAlphaSlideBar(true) // the default value is true.
                    .attachBrightnessSlideBar(true)  // the default value is true.
                    .setBottomSpace(12) // set a bottom space between the last slidebar and buttons.
                    .show();

        });
        bntlimpa.setOnClickListener( v -> {
            simplePaint.clearDreaw();
        });
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