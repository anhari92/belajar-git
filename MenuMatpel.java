package com.anhariasrilgmail.elerningasril;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class MenuMatpel extends AppCompatActivity {
Button btnIndonesia;
    Button btnSejarah;
    Button btnInggris;
    Button btnUmum;
    Button btnIslam;
    Button btnMtk;
    Button btnIps;
    Button btnIpa;
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_matpel);
        btnIndonesia = (Button) findViewById(R.id.btn_indonesia);
        btnSejarah = (Button) findViewById(R.id.btn_sejarah);
        btnInggris = (Button) findViewById(R.id.btn_inggris);
        btnUmum = (Button) findViewById(R.id.btn_umum);
        btnIslam = (Button) findViewById(R.id.btn_pai);
        cardView = (CardView) findViewById(R.id.cardview);
        btnMtk = (Button) findViewById(R.id.btn_matematika);
        btnIps = (Button) findViewById(R.id.btn_ips);
        btnIpa = (Button) findViewById(R.id.btn_ipa);
        btnIndonesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indonesia = new Intent(MenuMatpel.this,MainActivity.class);
                startActivity(indonesia);
            }
        });
        btnInggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inggris = new Intent(MenuMatpel.this,InggrisActivity.class);
                startActivity(inggris);
            }
        });
        btnSejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sejarah = new Intent(MenuMatpel.this,SejarahActivity.class);
                startActivity(sejarah);


            }
        });
        btnUmum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent umum = new Intent(MenuMatpel.this,UmumActivity.class);
                startActivity(umum);
            }
        });
        btnIslam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent islam = new Intent(MenuMatpel.this,IslamActivity.class);
                startActivity(islam);
            }
        });
        btnMtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mtk = new Intent(MenuMatpel.this,MatematikaActivity.class);
                startActivity(mtk);
            }
        });
        btnIps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ips = new Intent(MenuMatpel.this,IpsActivity.class);
                startActivity(ips);
            }
        });
        btnIpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ipa = new Intent(MenuMatpel.this,IpaActivity.class);
                startActivity(ipa);
            }
        });

        cardView.setCardBackgroundColor(Color.TRANSPARENT);
        cardView.setCardElevation(30);
    }
}
