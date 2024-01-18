package com.example.payparity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn= findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edt=findViewById(R.id.edt);
                String value=edt.getText().toString();
                int value2=Integer.parseInt(value);
                double parity=(value2/22.9);
                String value3=String.valueOf(parity);
                Toast.makeText(MainActivity.this,"US Salary= "+ value3, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

