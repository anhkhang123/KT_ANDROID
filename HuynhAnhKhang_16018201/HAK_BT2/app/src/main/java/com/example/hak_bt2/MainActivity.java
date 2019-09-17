package com.example.hak_bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB, edtC;
    Button btn_Giai, btn_QuayLai;
    TextView tvKetQua;
    String ketQua;
    double n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtA = (EditText) findViewById(R.id.plaintextA);
        edtB = (EditText) findViewById(R.id.plaintextB);
        edtC = (EditText) findViewById(R.id.plaintextB);

        btn_Giai = (Button) findViewById(R.id.btnGiai);
        btn_QuayLai = (Button) findViewById(R.id.btnQuaiLai);
        tvKetQua = (TextView) findViewById(R.id.tvKetQua);

        btn_Giai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(edtA.getText().toString());
                Double b = Double.parseDouble(edtB.getText().toString());
                Double c = Double.parseDouble(edtC.getText().toString());

                double denta = (b*b)-4*a*c;
                if (denta>0)
                {
                    n1 = (-b - Math.sqrt(denta)/2*a);
                    n2 = (-b + Math.sqrt(denta)/2*a);
                    ketQua = "n1: "+ n1 +"n2:"+n2;
                }
                else if (denta ==0)
                {
                    n1 = (-b/2*a);
                    ketQua = "Nghiệm kép: "+n1;
                }
                else if (denta<0)
                {
                    ketQua ="PT vô nghiệm";
                }
                byExtras();
            }
        });



    }
    public void byExtras(){
        Intent intent = new Intent(this,ActivityB.class);
        intent.putExtra("key1",ketQua.toString());
        startActivity(intent);
    }
}
