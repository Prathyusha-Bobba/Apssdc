package com.example.scoreboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button reset;
    TextView tv1;
    TextView tv2;
    //varaibles
    int a=0;
    int b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        reset=findViewById(R.id.reset);

        tv1=findViewById(R.id.a_count);
        tv2=findViewById(R.id.b_count);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a++;
                tv1.setText(""+a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a+=2;
                tv1.setText(""+a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                a+=3;
                tv1.setText(""+a);
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                b++;
                tv2.setText(""+b);
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                b+=2;
                tv2.setText(""+b);
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                b+=3;
                tv2.setText(""+b);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = 0;
                tv2.setText("" + b);
                a = 0;
                tv1.setText("" + a);
            }

        });
        if(savedInstanceState!=null){
            String s = savedInstanceState.getString("prathyusha");
            String s1 = savedInstanceState.getString("prathyu");
            tv1.setText(s);
            tv2.setText(s1);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("prathyusha",tv1.getText().toString());
        outState.putString("prathyu",tv2.getText().toString());

    }
}