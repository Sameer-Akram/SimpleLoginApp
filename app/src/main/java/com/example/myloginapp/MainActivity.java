package com.example.myloginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username=(TextView) findViewById(R.id.username);
        TextView password=(TextView) findViewById(R.id.password);
        Button loginbtn=(Button) findViewById(R.id.loginbtn);
        //admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin")&& password.getText().toString().equals("admin"))
                {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULLY", Toast.LENGTH_LONG).show();
                }
                else
                {
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN Failed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}