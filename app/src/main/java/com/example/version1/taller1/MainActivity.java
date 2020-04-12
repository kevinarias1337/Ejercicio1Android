package com.example.version1.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText valorhora;
    private EditText cantidadhoras;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorhora = findViewById(R.id.lblvalorhora);
        cantidadhoras = findViewById(R.id.lblcantidadhoras);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = valorhora.getText().toString();
                double valor = Double.parseDouble(a);
                String b = cantidadhoras.getText().toString();
                double cantidad = Double.parseDouble(b);
                double resultado = valor*cantidad;

                Toast.makeText(getApplicationContext(), "El salario total es de: "+resultado, Toast.LENGTH_SHORT);
            }
        });
    }
}
