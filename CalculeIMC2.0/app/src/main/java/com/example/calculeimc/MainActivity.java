package com.example.calculeimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularIMC(View view){
        double peso = Double.parseDouble(inputPeso.getText().toString());
        double altura = Double.parseDouble(inputAltura.getText().toString());
        double imc = peso / (altura * altura);

        if (imc < 18.5){
            resultTextView.setText("Seu IMC está abaixo do peso.");
        }else if (imc >= 18.5 && imc <= 24.99){
            resultTextView.setText("Seu IMC está dentro do peso normal.");
        }else if (imc >= 25 && imc <= 29.99){
            resultTextView.setText("Seu IMC está acima do peso (sobrepeso).");
        }else{
            resultTextView.setText("Seu IMC está na faixa de obesidade.");
        }
    }
}

