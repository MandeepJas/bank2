package com.example.bank2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    ImageView i1,i5,i11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        i11=findViewById(R.id.i11);
        t1=findViewById(R.id.t1);
        i1=findViewById(R.id.i1);
        i5=findViewById(R.id.i5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,custominfo.class);
                startActivity(i);
            }
        });
    }
}