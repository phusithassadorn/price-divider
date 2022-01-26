package com.example.price_divider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton divide_btn,discount_ps_btn,discount_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        divide_btn = (ImageButton) findViewById(R.id.divide);
        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent divide_btn = new Intent(MainActivity.this,divide_page.class);
                startActivity(divide_btn);
            }
        });
        discount_ps_btn = (ImageButton) findViewById(R.id.discount_ps);
        discount_ps_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discount_ps_btn = new Intent(MainActivity.this,discount_ps_page.class);
                startActivity(discount_ps_btn);
            }
        });
        discount_btn = (ImageButton) findViewById(R.id.discount);
        discount_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discount_btn = new Intent(MainActivity.this,discount_page.class);
                startActivity(discount_btn);
            }
        });


    }
}