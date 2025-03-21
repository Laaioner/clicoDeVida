package com.ifsc.imc;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MsgActivity extends AppCompatActivity {

    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);

        textView2 = findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        textView2.setText(bundle.getString("msg"));

    }
}