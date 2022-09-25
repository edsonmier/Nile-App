package com.example.nile_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout macButton;
    LinearLayout samsungButton;
    LinearLayout hpButton;
    LinearLayout msiButton;
    LinearLayout ryzenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        macButton = (LinearLayout) findViewById(R.id.macButton);
        macButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.amazon.com.mx/Apple-MacBook-Air-Pulgadas-n%C3%BAcleos/dp/B0B3BJP6YV/ref=sr_1_2_sspa?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2B7YNJDXC1KSV&keywords=apple+macbook+air+13&qid=1664078976&qu=eyJxc2MiOiIzLjE5IiwicXNhIjoiMi4zNCIsInFzcCI6IjAuOTkifQ%3D%3D&s=electronics&sprefix=apple+macbook+air+1%2Celectronics%2C212&sr=1-2-spons&psc=1");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        samsungButton = (LinearLayout) findViewById(R.id.samsButton);
        hpButton = (LinearLayout) findViewById(R.id.hpButton);
        msiButton = (LinearLayout) findViewById(R.id.msiButton);
        ryzenButton = (LinearLayout) findViewById(R.id.ryzenButton);
    }
}