package com.example.prilozhenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button(View view){
        Intent intent;
        intent = new Intent(MainActivity.this, MainMenu.class);
        startActivity(intent);}

    public void Buttons(View view){
        Intent intent;
        intent = new Intent(MainActivity.this, Samo.class);
        startActivity(intent);}
}

