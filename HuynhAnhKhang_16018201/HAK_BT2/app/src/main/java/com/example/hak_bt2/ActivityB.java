package com.example.hak_bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
public class ActivityB extends AppCompatActivity {

    TextView tv ;
    Button btnQuayLai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ketqua);

        tv = (TextView) findViewById(R.id.tvKetQua);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("key1");


        tv = (TextView) findViewById(R.id.tvKetQua);
        btnQuayLai = (Button) findViewById(R.id.btnQuaiLai) ;
        tv.setText(value1);

        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byExtras();
            }
        });
    }
    public void byExtras(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
