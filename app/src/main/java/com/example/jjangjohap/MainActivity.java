package com.example.jjangjohap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView ctg_all, ctg_naembi, ctg_pan, ctg_refri, ctg_micro, ctg_oven, ctg_airfryer, ctg_no;
    private TextView name_all, name_naembi, name_pan, name_refri, name_micro, name_oven, name_airfryer, name_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctg_all = findViewById(R.id.ctg_all);
        ctg_naembi = findViewById(R.id.ctg_naembi);
        ctg_pan = findViewById(R.id.ctg_pan);
        ctg_refri = findViewById(R.id.ctg_refri);
        ctg_micro = findViewById(R.id.ctg_micro);
        ctg_oven = findViewById(R.id.ctg_oven);
        ctg_no = findViewById(R.id.ctg_no);
        ctg_airfryer = findViewById(R.id.ctg_airfryer);

        name_all = findViewById(R.id.name_all);
        name_naembi = findViewById(R.id.name_naembi);
        name_pan = findViewById(R.id.name_pan);
        name_refri = findViewById(R.id.name_refri);
        name_micro = findViewById(R.id.name_micro);
        name_oven = findViewById(R.id.name_oven);
        name_airfryer = findViewById(R.id.name_airfryer);
        name_no = findViewById(R.id.name_no);

        ctg_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res_all = new Intent(getApplicationContext(), Category_Layout.class);
                startActivity(res_all);
            }
        });

        ctg_naembi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res_naembi = new Intent(getApplicationContext(), Category_Layout.class);
                startActivity(res_naembi);
            }
        });

        ctg_pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res_pan = new Intent(getApplicationContext(), Category_Layout.class);
                startActivity(res_pan);
            }
        });

        ctg_refri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res_refri = new Intent(getApplicationContext(), Category_Layout.class);
                startActivity(res_refri);
            }
        });

        ctg_micro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res_micro = new Intent(getApplicationContext(), Category_Layout.class);
                startActivity(res_micro);
            }
        });

        ctg_oven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res_oven = new Intent(getApplicationContext(), Category_Layout.class);
                startActivity(res_oven);
            }
        });

        ctg_airfryer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res_airfryer = new Intent(getApplicationContext(), Category_Layout.class);
                startActivity(res_airfryer);
            }
        });

        ctg_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res_refri = new Intent(getApplicationContext(), Category_Layout.class);
                startActivity(res_refri);
            }
        });

    }
}