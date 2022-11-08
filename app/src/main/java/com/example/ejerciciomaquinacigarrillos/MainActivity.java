package com.example.ejerciciomaquinacigarrillos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.ejerciciomaquinacigarrillos.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private int numCigarrillos = 20;
    private float dinero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.txtNumCigarrilos.setText(String.valueOf(numCigarrillos));
        binding.txtDineroCigarrilos.setText(String.valueOf(dinero));
        binding.btnUsarMaquina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numCigarrillos >1){
                    numCigarrillos--;
                    binding.txtNumCigarrilos.setText(String.valueOf(numCigarrillos));
                }else {
                    dinero = dinero +5;
                    numCigarrillos = 20;
                    binding.txtNumCigarrilos.setText(String.valueOf(numCigarrillos));
                    binding.txtDineroCigarrilos.setText(String.valueOf(dinero));
                }
            }
        });
    }
}