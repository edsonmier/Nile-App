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
        samsungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.amazon.com.mx/SAMSUNG-LS24R350FZLXZX-Monitor-Experiencia-inmersiva/dp/B09PRSV4MR/ref=sr_1_1?keywords=samsung+ls24r350fzlxzx&qid=1664082839&qu=eyJxc2MiOiIxLjMyIiwicXNhIjoiMS4xNiIsInFzcCI6IjAuNjcifQ%3D%3D&s=electronics&sprefix=samsung+l%2Celectronics%2C121&sr=1-1&ufe=app_do%3Aamzn1.fos.66c34496-0d28-4d73-a0a1-97a8d87ec0b2");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        hpButton = (LinearLayout) findViewById(R.id.hpButton);
        hpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.amazon.com.mx/HEWLETT-PACKARD-Ink-Advantage-2775/dp/B08PXLMTK8/ref=sr_1_1?keywords=hp%2Bdeskjet&qid=1664082855&qu=eyJxc2MiOiIzLjI1IiwicXNhIjoiMi41NCIsInFzcCI6IjEuOTYifQ%3D%3D&s=electronics&sprefix=hp%2Bdesk%2Celectronics%2C126&sr=1-1&th=1");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        msiButton = (LinearLayout) findViewById(R.id.msiButton);
        msiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.amazon.com.mx/MSI-Computadora-GF63-Gr%C3%A1ficos-i5-10300H/dp/B08YRZ2LLJ/ref=sr_1_1?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=WIL4D4LZISFL&keywords=msi+gf63&qid=1664082893&qu=eyJxc2MiOiIzLjk2IiwicXNhIjoiMy43NSIsInFzcCI6IjIuODEifQ%3D%3D&s=electronics&sprefix=msi+gf63%2Celectronics%2C136&sr=1-1&ufe=app_do%3Aamzn1.fos.66c34496-0d28-4d73-a0a1-97a8d87ec0b2");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ryzenButton = (LinearLayout) findViewById(R.id.ryzenButton);
        ryzenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.amazon.com.mx/AMD-Procesador-RyzenTM-5600G-Socket-AM4-3-90GHz/dp/B092L9GF5N/ref=sr_1_1?keywords=ryzen&qid=1664082906&qu=eyJxc2MiOiI0LjgzIiwicXNhIjoiMy43NiIsInFzcCI6IjMuMTkifQ%3D%3D&s=electronics&sprefix=ryzen%2Celectronics%2C136&sr=1-1&ufe=app_do%3Aamzn1.fos.66c34496-0d28-4d73-a0a1-97a8d87ec0b2&th=1");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}