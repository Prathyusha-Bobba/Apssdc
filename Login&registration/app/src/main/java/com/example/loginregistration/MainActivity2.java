package com.example.loginregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void submit(View view){
        String data = et.getText().toString();
        if(data.isEmpty()){
            Toast.makeText(this,"Please Enter Email ID",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i=new Intent(register.this,MainActivity2.class);
            startActivity(i);
        }
    }
}