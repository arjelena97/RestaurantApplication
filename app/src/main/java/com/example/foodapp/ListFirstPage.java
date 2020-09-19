package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListFirstPage extends AppCompatActivity {

    private Button btnVapiano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_first_page);

        btnVapiano = (Button)findViewById(R.id.btnVapiano);


        btnVapiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signIn = new Intent(ListFirstPage.this, PonudaActivity.class);
                startActivity(signIn);
            }
        });


    }
}