package com.example.ahsan.fashionapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GetStarted extends AppCompatActivity {

    Button btn_started;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_started);

        btn_started = (Button)findViewById(R.id.btn_started);
        btn_started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GetStarted.this, Home.class);
                startActivity(intent);

            }
        });



    }
}
