package com.example.jjangjohap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    private TextView complete_button;
    private ImageView back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        complete_button = findViewById(R.id.complete_button);
        back_button = findViewById(R.id.back_button);

        complete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res_complete = new Intent(getApplicationContext(), Category_Layout.class);
                startActivity(res_complete);
            }
        });

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res_back = new Intent(getApplicationContext(), Category_Layout.class);
                startActivity(res_back);
            }
        });

    }
}