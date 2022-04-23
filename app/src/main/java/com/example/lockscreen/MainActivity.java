package com.example.lockscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv_1;
    private Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_10,btn_11,btn_12;
    String code="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_1 = findViewById(R.id.tv_1);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_10 = findViewById(R.id.btn_10);
        btn_11 = findViewById(R.id.btn_11);
        btn_12 = findViewById(R.id.btn_12);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv_1.getText().toString().length() < 4)
                    tv_1.setText(tv_1.getText().toString() + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv_1.getText().toString().length() < 4)
                    tv_1.setText(tv_1.getText().toString() + "2");

            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv_1.getText().toString().length() < 4)
                    tv_1.setText(tv_1.getText().toString() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv_1.getText().toString().length() < 4)
                    tv_1.setText(tv_1.getText().toString() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv_1.getText().toString().length() < 4)
                    tv_1.setText(tv_1.getText().toString() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv_1.getText().toString().length() < 4)
                    tv_1.setText(tv_1.getText().toString() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv_1.getText().toString().length() < 4)
                    tv_1.setText(tv_1.getText().toString() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (tv_1.getText().toString().length() < 4)
                    tv_1.setText(tv_1.getText().toString() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv_1.getText().toString().length() < 4)
                    tv_1.setText(tv_1.getText().toString() + "9");
            }
        });
        btn_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv_1.getText().toString().length() < 4)
                    tv_1.setText(tv_1.getText().toString() + "0");
            }
        });
        btn_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              {
                  if(tv_1.getText().toString().equals(code)) {
                      Intent Login = new Intent(MainActivity.this, Success.class);
                      startActivity(Login);
                  }
                  else {
                      Toast.makeText(getApplicationContext(),"INCORRECT PASSWORD",Toast.LENGTH_SHORT);
                  }
                }
            }
        });

    }


}