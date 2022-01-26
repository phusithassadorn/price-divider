package com.example.price_divider;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class divide_page extends AppCompatActivity {

    private ImageButton back_btn;
    EditText e1,e2;
    TextView result;
    ImageButton div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide_page);
        ///////////////////////////////////////////////////////////////////////////////
        e1 = findViewById(R.id.price_value);
        e2 = findViewById(R.id.people_value);
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

                float div =v1/v2;
                result.setText(String.valueOf(div)+" บาท");
            }
        });
        ///////////////////////////////////////////////////////////////////////////////
        back_btn = (ImageButton)findViewById(R.id.divide_back);
        back_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ///////////////////////////////////////////////////////////////////////////////

    }

    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (getCurrentFocus() != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        return super.dispatchTouchEvent(ev);
    }
}