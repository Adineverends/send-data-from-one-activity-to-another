package com.example.sendintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e=findViewById(R.id.editTextTextPersonName);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                String s=e.getText().toString();
                Intent Intent=new Intent(MainActivity.this,MainActivity2.class);
                Intent.putExtra("my_text",s);
                startActivity(Intent);
            }
        });
    }
}