package com.example.bank2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;

public class custominfo extends AppCompatActivity {
    Button b,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    TextView t2,t4;
    SQLiteDatabase db;
    int cu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custominfo);
        Intent i=getIntent();
        b=findViewById(R.id.b);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        t2=findViewById(R.id.t2);
        t4=findViewById(R.id.t4);
        db=openOrCreateDatabase("customerrr",MODE_PRIVATE,null);

        Intent c=getIntent();


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(custominfo.this,info.class);
                db.execSQL("create table if not exists customerrr(name varchar(10) ,Email varchar(20),adress varchar(20),account_no varcher(20),current_balance varchar(20))");
                String name="Rajesh Prasad";
                String Email="rajeshprasad9@gmail.com";
                String adress="ranagar sector 6 bhilai chattisgargh";
                String num="";
                int account_no = 324334678;
                int current_balance=500;
                db.execSQL("insert into customerrr values('"+name+"','"+Email+"','"+adress+"',"+account_no+","+current_balance+")");
                num="NAME  : "+name+"\n Email ID  : "+Email+"\n Address  : "+adress+"\nAccount Number  : "+account_no+"\nCurrent balance  : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("hi",account_no);
                startActivity(i4);


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(custominfo.this,info.class);
                db.execSQL("create table if not exists customerrr(name varchar(10) ,Email varchar(20),adress varchar(20),account_no varcher(20),current_balance varchar(20))");
                String name="Avneet Kaur";
                String Email="kauravneet6@gmail.com";
                String adress="Rajiv road line 61 ludiana,punjab";
                String num="";
                int account_no = 875634678;
                int current_balance=1000;

                db.execSQL("insert into customerrr values('"+name+"','"+Email+"','"+adress+"',"+account_no+","+current_balance+")");
                num="NAME  :"+name+"\n Email ID  : "+Email+"\n Address  : "+adress+"\nAccount Number  : "+account_no+"\nCurrent balance  : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("hi",account_no);
                startActivity(i4);


            }

                });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(custominfo.this, info.class);
                db.execSQL("create table if not exists customerrr(name varchar(10) ,Email varchar(20),adress varchar(20),account_no varcher(20),current_balance varchar(20))");
                String name = "Piyush Pandey";
                String Email = "piyush pandey91@gmail.com";
                String adress = "K 69b, Bal Udhyan Road, Uttam Nagar,Delhi";
                String num = "";
                int account_no = 234534678;
                int current_balance =2000;

                db.execSQL("insert into customerrr values('" + name + "','" + Email + "','" + adress + "',"+account_no+"," + current_balance + ")");
                num = "NAME  : " + name + "\n Email ID  : " + Email + "\n Address  : " + adress + "\nAccount Number  : "+account_no+"\nCurrent balance  : " + current_balance + "";
                i4.putExtra("s", num);
                i4.putExtra("hi",account_no);
                startActivity(i4);


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i4=new Intent(custominfo.this,info.class);
                            db.execSQL("create table if not exists customerrr(name varchar(10) ,Email varchar(20),adress varchar(20),account_no varcher(20),current_balance varchar(20))");
                            String name="Pavandeep Singh";
                            String Email="singhpavandeep39@gmail.com";
                            String adress="10/7, 1 St Flr, Narayan Ashram, Dr Ambedkar Rd, Near Ganesh Galli, Parel,Mumbai";
                            String num="";
                            int account_no = 678534678;
                            int current_balance=10000;
                            db.execSQL("insert into customerrr values('"+name+"','"+Email+"','"+adress+"',"+account_no+","+current_balance+")");
                            num="NAME  :"+name+"\n Email ID  : "+Email+"\n Address  :  "+adress+"\nAccount Number  : "+account_no+"\nCurrent balance  : "+current_balance+"";
                            i4.putExtra("s",num);
                            i4.putExtra("hi",account_no);
                            startActivity(i4);


                        }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(custominfo.this,info.class);
                db.execSQL("create table if not exists customerrr(name varchar(10) ,Email varchar(20),adress varchar(20),account_no varcher(20),current_balance varchar(20))");
                String name="Sohan Prajapati";
                String Email="sohan prajapati39@gmail.com";
                String adress="116, Gundecha Chambers, N Master Road, Bse, Hutatma Chowk,Mumbai";
                String num="";
                int account_no = 875654678;
                int current_balance=8000;

                db.execSQL("insert into customerrr values('"+name+"','"+Email+"','"+adress+"',"+account_no+","+current_balance+")");
                num="NAME  :"+name+"\n Email ID  : "+Email+"\n Address  : "+adress+"\nAccount Number  : "+account_no+"\nCurrent balance  : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("hi",account_no);
                startActivity(i4);


            }

        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(custominfo.this,info.class);
                db.execSQL("create table if not exists customerrr(name varchar(10) ,Email varchar(20),adress varchar(20),account_no varcher(20),current_balance varchar(20))");
                String name="Akil Ahmned";
                String Email="akil8ahmned39@gmail.com";
                String adress="16, Amina Manzil, Lala Nigam Rd, Opp.colaba Mkt, Colaba,Mumbai";
                String num="";
                int account_no = 974334678;
                int current_balance=7000;

                db.execSQL("insert into customerrr values('"+name+"','"+Email+"','"+adress+"',"+account_no+","+current_balance+")");
                num="NAME  :"+name+"\n Email ID  : "+Email+"\n Address  : "+adress+"\nAccount Number  : "+account_no+"\nCurrent balance  : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("hi",account_no);
                startActivity(i4);


            }

        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(custominfo.this,info.class);
                db.execSQL("create table if not exists customerrr(name varchar(10) ,Email varchar(20),adress varchar(20),account_no varcher(20),current_balance varchar(20))");
                String name="Priya Arora";
                String Email="priya arora09@gmail.com";
                String adress="12856, Bazar Sirkiwalan2856, Hauz Quaz,Hydrabad";
                String num="";
                int account_no = 324976678;
                int current_balance=9000;

                db.execSQL("insert into customerrr values('"+name+"','"+Email+"','"+adress+"',"+account_no+","+current_balance+")");
                num="NAME  :"+name+"\n Email ID  : "+Email+"\n Address  : "+adress+"\nAccount Number  : "+account_no+"\nCurrent balance  : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("hi",account_no);
                startActivity(i4);


            }

        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(custominfo.this,info.class);
                db.execSQL("create table if not exists customerrr(name varchar(10) ,Email varchar(20),adress varchar(20),account_no varcher(20),current_balance varchar(20))");
                String name="Jasleen Kaur";
                String Email="kaurjasleen@gmail.com";
                String adress="1 A/17, 6 Th Flr, Brindavan Apt, Rajastani Seva Rd, Evershine Nagar, Malad (west),bengal";
                String num="";
                int account_no = 543398668;
                int current_balance=20000;

                db.execSQL("insert into customerrr values('"+name+"','"+Email+"','"+adress+"',"+account_no+","+current_balance+")");
                num="NAME  :"+name+"\n Email ID  : "+Email+"\n Address  : "+adress+"\nAccount Number  : "+account_no+"\nCurrent balance  : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("hi",account_no);
                startActivity(i4);


            }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(custominfo.this,info.class);
                db.execSQL("create table if not exists customerrr(name varchar(10) ,Email varchar(20),adress varchar(20),account_no varcher(20),current_balance varchar(20))");
                String name="Rahul Rai";
                String Email="rahulrai89@gmail.com";
                String adress="7, Lawyer Chamber, Supreme Court,Delhi";
                String num="";
                int account_no = 646334678;
                int current_balance=15000;

                db.execSQL("insert into customerrr values('"+name+"','"+Email+"','"+adress+"',"+account_no+","+current_balance+")");
                num="NAME  :"+name+"\n Email ID  : "+Email+"\n Address  : "+adress+"\nAccount Number  : "+account_no+"\nCurrent balance  : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("hi",account_no);
                startActivity(i4);


            }

        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(custominfo.this,info.class);
                db.execSQL("create table if not exists customerrr(name varchar(10) ,Email varchar(20),adress varchar(20),account_no varcher(20),current_balance varchar(20))");
                String name="Arun Agrawal";
                String Email="arunagrawal90@gmail.com";
                String adress="B-10, 02, Type Buldg No.2, Sector - 15, Vashi, Navi Mumbai,Mumbai";
                String num="";
                int account_no = 764334678;
                int current_balance=13000;
                db.execSQL("insert into customerrr values('"+name+"','"+Email+"','"+adress+"',"+account_no+","+current_balance+")");
                num="NAME  :"+name+"\n Email ID  : "+Email+"\n Address  : "+adress+"\nAccount Number  : "+account_no+"\nCurrent balance  : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("hi",account_no);
                startActivity(i4);


            }

        });
    }
}