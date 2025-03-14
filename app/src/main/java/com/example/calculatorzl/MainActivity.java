package com.example.calculatorzl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicar;
    private Button btn_dividir;
    private TextView resultat;
    private EditText text_num1;
    private EditText text_num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn_suma = findViewById(R.id.btn_suma);
        btn_resta = findViewById(R.id.btn_resta);
        btn_multiplicar = findViewById(R.id.btn_multiplicar);
        btn_dividir = findViewById(R.id.btn_dividir);
        resultat = findViewById(R.id.resultat);
        text_num1 = findViewById(R.id.text_num1);
        text_num2 = findViewById(R.id.text_num2);

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultat.setText(String.valueOf(suma(Integer.parseInt(text_num1.getText().toString()),
                        Integer.parseInt(text_num2.getText().toString()))));
            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultat.setText(String.valueOf(resta(Integer.parseInt(text_num1.getText().toString()),
                        Integer.parseInt(text_num2.getText().toString()))));
            }
        });
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultat.setText(String.valueOf(mult(Integer.parseInt(text_num1.getText().toString()),
                        Integer.parseInt(text_num2.getText().toString()))));
            }
        });
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultat.setText(String.valueOf(subs(Integer.parseInt(text_num1.getText().toString()),
                        Integer.parseInt(text_num2.getText().toString()))));
            }
        });

    }
    public int suma(int a, int b) {return a+b;}
    public int resta(int a, int b) {return a-b;}
    public int mult(int a, int b) {return a*b;}
    public int subs(int a, int b) {return a/b;}
}