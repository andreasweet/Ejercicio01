package com.example.ejercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnReset;
    private Button btnSaludar;
    private TextView lblFrase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaVistas();

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblFrase.setText("");
            }
        });

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                if(nombre.equals("")){
                    Toast.makeText(MainActivity.this, "No has puesto el nombre", Toast.LENGTH_SHORT).show();
                }else{
                    lblFrase.setText("Hola, "+ nombre +"," + " Buenos dias");
                    txtNombre.setText("");
                }

            }

        });



    }
    private void inicializaVistas() {
        txtNombre = findViewById(R.id.txtNombreMain);
        btnReset = findViewById(R.id.btnResetMain);
        btnSaludar = findViewById(R.id.btnSaludarMain);
        lblFrase = findViewById(R.id.lblFraseMain);

    }
}