package com.example.prilozhenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Samo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samo);
    }
    public void inets(View view) {
        ConnectivityManager connectivityManager = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast toast1 = Toast.makeText(getApplicationContext(),
                    "Ура\n Добро пожаловать!",Toast.LENGTH_LONG);
            toast1.show();
        }
        else{
            Toast toast2 = Toast.makeText(getApplicationContext(),
                    "Нет подключения\n Повт попытку",Toast.LENGTH_LONG);
            toast2.show();
        }

        }
    }