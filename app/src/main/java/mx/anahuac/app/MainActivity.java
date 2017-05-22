package mx.anahuac.app;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnComida;
    private ImageButton btnBares;
    private ImageButton btnEntretenimiento;
    private ImageButton btnHospedaje;
    private ImageButton btnTiendas;
    private ImageButton btnServicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnComida = (ImageButton) findViewById(R.id.btnComida);
        btnBares = (ImageButton) findViewById(R.id.btnBares);
        btnEntretenimiento = (ImageButton) findViewById(R.id.btnEntretenimiento);
        btnHospedaje = (ImageButton) findViewById(R.id.btnHospedaje);
        btnTiendas = (ImageButton) findViewById(R.id.btnTiendas);
        btnServicios = (ImageButton) findViewById(R.id.btnServicios);

        btnComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePape(Comida.class);
            }
        });
        btnBares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePape(Bares.class);
            }
        });
        btnEntretenimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePape(Entretenimiento.class);
            }
        });
        btnHospedaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePape(Hospedaje.class);
            }
        });
        btnTiendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePape(Tiendas.class);
            }
        });
        btnServicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePape(Servicios.class);
            }
        });

    }
    public void changePape(Class<?> Destino){
        Intent myIntent = new Intent(MainActivity.this, Destino );
        MainActivity.this.startActivity(myIntent);
    }
}
