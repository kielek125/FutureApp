package com.example.malavero.futureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.malavero.futureapp.Activities.DonateActivity;
import com.example.malavero.futureapp.Activities.InfoActivity;
import com.example.malavero.futureapp.Activities.OptionsActivity;

public class MainActivity extends AppCompatActivity {

    AppCompatButton GiveMoney;
    AppCompatButton EternalLife;
    AppCompatButton Teleportation;
    AppCompatButton AskGod;
    AppCompatButton ConnectWithAlien;
    AppCompatButton FutureTravel;
    AppCompatButton AskAboutFuture;
    AppCompatButton BackToPast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);

        prepareComponents();
        setClickListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_options: {
                Intent intentOptions = new Intent(this, OptionsActivity.class);
                startActivity(intentOptions);
                return true;
            }
            case R.id.action_infoApp: {
                Intent intentInfo = new Intent(this, InfoActivity.class);
                startActivity(intentInfo);
                return true;
            }
            case R.id.action_donate: {
                Intent intentDonate = new Intent(this, DonateActivity.class);
                startActivity(intentDonate);
                return true;
            }
            case R.id.action_exitApp: {
                finish();
                System.exit(0);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void prepareComponents() {
        GiveMoney = findViewById(R.id.btn_giveMoney);
        EternalLife = findViewById(R.id.btn_eternalLive);
        Teleportation = findViewById(R.id.btn_Teleportation);
        AskGod = findViewById(R.id.btn_askGod);
        ConnectWithAlien = findViewById(R.id.btn_connectWithAlien);
        FutureTravel = findViewById(R.id.btn_futureTravel);
        AskAboutFuture = findViewById(R.id.btn_askAboutFuture);
        BackToPast = findViewById(R.id.btn_backToPast);
    }

    private void setClickListeners() {
        GiveMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        EternalLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Teleportation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        AskGod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ConnectWithAlien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        FutureTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        AskAboutFuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        BackToPast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
