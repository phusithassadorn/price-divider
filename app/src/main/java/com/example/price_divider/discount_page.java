package com.example.price_divider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class discount_page extends AppCompatActivity {

    ImageButton back_btn;
    EditText e1,e2;
    TextView result;
    ImageButton div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_page);
        ///////////////////////////////////////////////////////////////////////////////////
        e1 = findViewById(R.id.price_value);
        e2 = findViewById(R.id.discount_price_value);
        result = findViewById(R.id.cal_sum);
        div = findViewById(R.id.cal_btn);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().length()==0){
                    e1.setText("0");
                }
                if (e2.getText().toString().length()==0){
                    e2.setText("0");
                }
                float v1 = Float.valueOf(e1.getText().toString());
                float v2 = Float.valueOf(e2.getText().toString());

                float div =(v2/v1)*100;
                result.setText(String.valueOf(div)+"%");
            }
        });
        /////////////////////////////////////////////////////////////////////////////////
        back_btn = (ImageButton)findViewById(R.id.discount_back);
        back_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ///////////////////////////////////////////////////////////////////////////////
    }
}