package com.example.catalogdapur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button bt_pertama = findViewById(R.id.bt_pertama);
        bt_pertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button bt_berikut = findViewById(R.id.bt_berikut);
        bt_berikut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        Button bt_kembali = findViewById(R.id.bt_kembali);
        bt_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button bt_terakhir = findViewById(R.id.bt_terakhir);
        bt_terakhir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity7.class);
                startActivity(intent);
            }
        });

    }
}