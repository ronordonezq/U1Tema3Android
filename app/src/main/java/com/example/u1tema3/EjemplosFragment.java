package com.example.u1tema3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.u1tema3.Ejemplo1.MainActivity;
import com.example.u1tema3.Ejemplo2.ListaCorreo;
import com.example.u1tema3.Ejemplo3.MainFragmentCorreo;

public class EjemplosFragment extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ejemplos_fragment);
  }

  public void go_main_activity(View view) {
    startActivity(new Intent(this, MainActivity.class));
  }

  public void go_lista_correo(View view) {
    startActivity(new Intent(this, ListaCorreo.class));
  }

  public void go_lista_correo_fragment(View view) { startActivity(new Intent(this, MainFragmentCorreo.class));
  }
}
