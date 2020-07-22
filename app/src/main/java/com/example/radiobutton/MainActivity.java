package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    RadioButton rbUSD,rbCAD;
    TextView display;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.e1);
        rbUSD = (RadioButton)findViewById(R.id.rbUSD);
        rbCAD = (RadioButton)findViewById(R.id.rbCAD);
        display = (TextView)findViewById(R.id.display);
        btnConvert = (Button)findViewById(R.id.btnConver);
    }

    public void convert_method(View view) {
        String s = e1.getText().toString();
        double result = Double.parseDouble(s);
        if(rbUSD.isChecked()){
            result = result/83.42;
            display.setText(String.valueOf(result));
        }
       else if(rbCAD.isChecked()){
            result = result/63.47;
            display.setText( String.valueOf(result));
        }
       else{
            Toast.makeText(getApplicationContext(),"Select One Option Please",Toast.LENGTH_SHORT).show();
        }
    }

    public void method_reset(View view) {
        display.setText("");
        e1.setText("");
        rbUSD.setChecked(false);
        rbCAD.setChecked(false);

    }
}