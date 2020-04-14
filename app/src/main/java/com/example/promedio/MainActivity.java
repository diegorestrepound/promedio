package com.example.promedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.promedio.clases.Promedio;

public class MainActivity extends AppCompatActivity {
    Promedio prom = new Promedio();

    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private EditText nota4;
    private Button calcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = findViewById(R.id.txtnota1);
        nota2 = findViewById(R.id.txtnota2);
        nota3 = findViewById(R.id.txtnota3);
        nota4 = findViewById(R.id.txtnota4);
        calcular = findViewById(R.id.btncalcular);
        resultado = findViewById(R.id.txtresultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                prom.setNota1(Double.parseDouble(nota1.getText().toString()));
                prom.setNota2(Double.parseDouble(nota2.getText().toString()));
                prom.setNota3(Double.parseDouble(nota3.getText().toString()));
                prom.setNota4(Double.parseDouble(nota4.getText().toString()));

                resultado.setText(String.valueOf(prom.promedioNotas()));
                resultado.setVisibility(View.VISIBLE);

                if( prom.promedioNotas()>= 3){

                    Toast.makeText(MainActivity.this, "Materia aprobada", Toast.LENGTH_SHORT).show();

                }else{

                    Toast.makeText(MainActivity.this, "Materia reprobada", Toast.LENGTH_LONG).show();

                }
            }
        });


    }
}
