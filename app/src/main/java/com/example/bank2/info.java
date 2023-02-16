package com.example.bank2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class info extends AppCompatActivity {
    TextView textView,t8,t9;
    String s="s";
    String s2="hi";
    Button b12;
    EditText e2;
    ImageView i8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        textView=findViewById(R.id.textView);
        t8=findViewById(R.id.t8);
        t9=findViewById(R.id.t9);
        e2=findViewById(R.id.e2);
        b12=findViewById(R.id.b12);
        i8=findViewById(R.id.i8);
        Intent i1=getIntent();
        String num1=i1.getStringExtra(s);
        int num12=i1.getIntExtra(s2,0);
        textView.setText(" "+num1+" ");

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i7=Integer.parseInt(e2.getText().toString());
                Intent i10=new Intent(info.this,final1.class);
                i10.putExtra("num5",i7);
                i10.putExtra("hello",num12);
                startActivity(i10);

            }
        });




    }
}