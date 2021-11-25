package com.example.jjangjohap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    }
}