package com.example.u1tema3.Ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.u1tema3.R;

public class DetalleCorreo extends AppCompatActivity {
  TextView txtde,txtexto,txtasunto;
   String de,texto,asunto;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detalle_correo);
    Bundle extras=getIntent().getExtras();
    de=extras.getString("de");
    texto=extras.getString("texto");
    asunto=extras.getString("asunto");

    txtde=findViewById(R.id.tv_de);
    txtexto=findViewById(R.id.tv_texto);
    txtasunto=findViewById(R.id.tv_asunto);
    txtde.setText(de);
    txtexto.setText(texto);
    txtasunto.setText(asunto);
  }
}
