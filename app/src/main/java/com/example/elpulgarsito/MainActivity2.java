package com.example.elpulgarsito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    RadioButton dom;
    CheckBox op1,op2,op3,op4,op5,op6,op7,op8;
    Button cal, can;
    TextView tot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        dom = findViewById(R.id.rbdomicilio);
        op1 = findViewById(R.id.cbsopadepollo);
        op2 = findViewById(R.id.carnealaplancha);
        op3 = findViewById(R.id.sopaderes);
        op4 = findViewById(R.id.rellenodechile);
        op5 = findViewById(R.id.refresconaturales);
        op6 = findViewById(R.id.cocacola);
        op7 = findViewById(R.id.licuados);
        op8 = findViewById(R.id.jugos);

        tot=findViewById(R.id.txttotal);
    }
        public void calcular (View v)

    Double total=0.0;
    if (dom.isChecked())
        total = total + 10;

    if (op1.isChecked())
        total = total + 3.50;

    if (op2.isChecked())
        total = total + 2.75;

    if (op3.isChecked())
        total = total + 3.00;

    if (op4.isChecked())
        total = total + 2.25;

    if (op5.isChecked())
        total = total + 0.75;

    if (op6.isChecked())
        total = total + 1.00;

    if (op7.isChecked())
        total = total + 1.25;

    if (op8.isChecked())
        total = total + 1.00;


}