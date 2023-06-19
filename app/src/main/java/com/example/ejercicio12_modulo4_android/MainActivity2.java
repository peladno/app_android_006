package com.example.ejercicio12_modulo4_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicio12_modulo4_android.databinding.ActivityMain2Binding;


public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding main2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        main2Binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(main2Binding.getRoot());

        main2Binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

    }
}