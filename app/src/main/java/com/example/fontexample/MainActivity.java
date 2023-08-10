package com.example.fontexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtener los elementos de la interfaz para ello utilizamos el findViewById
        EditText texto= findViewById(R.id.editTextWord);
        RadioButton boton1= findViewById(R.id.radioButton);
        RadioButton boton2= findViewById(R.id.radioButton2);
        RadioButton boton3= findViewById(R.id.radioButton3);
        TextView mostrarTexto= findViewById(R.id.textViewShowText);

        //Obtengo las fuente de la carpeta font que esta en la carpeta resources (res)
        Typeface typefaceDancing= getResources().getFont(R.font.dancing_script);
        Typeface typefaceJosefinSans= getResources().getFont(R.font.josefinsans_italic);
        Typeface typefaceLibusa= getResources().getFont(R.font.lisubosa_bold_italic);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Desmarco los otros dos radio buttons
                    boton2.setChecked(false);
                    boton3.setChecked(false);
                //Le asigno el texto que llega desde el EditText
                    mostrarTexto.setText(texto.getText().toString());
                //Modifico el tipo de fuente
                    mostrarTexto.setTypeface(typefaceDancing);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    boton1.setChecked(false);
                    boton3.setChecked(false);
                    mostrarTexto.setText(texto.getText().toString());
                    mostrarTexto.setTypeface(typefaceJosefinSans);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    boton2.setChecked(false);
                    boton1.setChecked(false);
                    mostrarTexto.setText(texto.getText().toString());
                    mostrarTexto.setTypeface(typefaceLibusa);
            }
        });

    }
}