package com.example.bank2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class final1 extends AppCompatActivity {
    Button b17,b18,b19,b20,b21,b22,b23,b24,b25,b26;
    SQLiteDatabase db;
    String s90="num5";
    String s91="hello";
    ImageView i55;
    TextView t22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final1);
        b17=findViewById(R.id.b17);
        b18=findViewById(R.id.b18);
        b19=findViewById(R.id.b19);
        b20=findViewById(R.id.b20);
        b21=findViewById(R.id.b21);
        b22=findViewById(R.id.b22);
        b23=findViewById(R.id.b23);
        b24=findViewById(R.id.b24);
        b25=findViewById(R.id.b25);
        b26=findViewById(R.id.b26);
        i55=findViewById(R.id.i55);
        t22=findViewById(R.id.t22);
        db=openOrCreateDatabase("customerrr",MODE_PRIVATE,null);


        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20=getIntent();
                int num11=i20.getIntExtra(s90,0);                                              //amount
                int num55=i20.getIntExtra(s91,0);                                              //  acc_no
                AlertDialog.Builder ad=new AlertDialog.Builder(final1.this);
                ad.setTitle("Alert");
                ad.setMessage("Want to send Money");
                ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.execSQL("update customerrr set current_balance=current_balance-"+ num11 + " where account_no="+num55+"");
                        db.execSQL("update customerrr set current_balance=current_balance+"+ num11 + " where account_no=875634678");
                        Toast.makeText(final1.this, "The money send Sucessfully to Avneet kaur", Toast.LENGTH_SHORT).show();

                        db.execSQL("create table  if not exists transactions(sender_account_no varchar(20),reciver_account_number varchar(20),amount varchar(20))");
                        db.execSQL("insert into transactions values("+num55+","+875634678+","+num11+")");
                        Intent p=new Intent(final1.this,custominfo.class);
                        startActivity(p);

                    }

                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog a=ad.create();
                a.show();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20=getIntent();
                int num11=i20.getIntExtra(s90,0);                                              //amount
                int num55=i20.getIntExtra(s91,0);                                              //  acc_no
                AlertDialog.Builder ad=new AlertDialog.Builder(final1.this);
                ad.setTitle("Alert");
                ad.setMessage("Want to send Money");
                ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.execSQL("update customerrr set current_balance=current_balance-"+ num11 + " where account_no="+num55+"");
                        db.execSQL("update customerrr set current_balance=current_balance+"+ num11 + " where account_no=324334678");


                        Toast.makeText(final1.this, "The money send Sucessfully to Rajesh prasad", Toast.LENGTH_SHORT).show();
                        db.execSQL("create table  if not exists transactions(sender_account_no varchar(20),reciver_account_number varchar(20),amount varchar(20))");
                        db.execSQL("insert into transactions values("+num55+","+324334678+","+num11+")");
                        Intent p=new Intent(final1.this,custominfo.class);
                        startActivity(p);

                    }

                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog a=ad.create();
                a.show();
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20=getIntent();
                int num11=i20.getIntExtra(s90,0);                                              //amount
                int num55=i20.getIntExtra(s91,0);                                              // acc_no
                AlertDialog.Builder ad=new AlertDialog.Builder(final1.this);
                ad.setTitle("Alert");
                ad.setMessage("Want to send Money");
                ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.execSQL("update customerrr set current_balance=current_balance-"+ num11 + " where account_no="+num55+"");
                        db.execSQL("update customerrr set current_balance=current_balance+"+ num11 + " where account_no=234534678");


                        Toast.makeText(final1.this, "The money send Sucessfully to piyush pandey", Toast.LENGTH_SHORT).show();
                        db.execSQL("create table  if not exists transactions(sender_account_no varchar(20),reciver_account_number varchar(20),amount varchar(20))");
                        db.execSQL("insert into transactions values("+num55+","+234534678+","+num11+")");
                        Intent p=new Intent(final1.this,custominfo.class);
                        startActivity(p);

                    }

                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog a=ad.create();
                a.show();
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20=getIntent();
                int num11=i20.getIntExtra(s90,0);                                              //amount
                int num55=i20.getIntExtra(s91,0);                                              //  acc_no
                AlertDialog.Builder ad=new AlertDialog.Builder(final1.this);
                ad.setTitle("Alert");
                ad.setMessage("Want to send Money");
                ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.execSQL("update customerrr set current_balance=current_balance-"+ num11 + " where account_no="+num55+"");
                        db.execSQL("update customerrr set current_balance=current_balance+"+ num11 + " where account_no=678534678");


                        Toast.makeText(final1.this, "The money send Sucessfully to pavandeep singh", Toast.LENGTH_SHORT).show();
                        db.execSQL("create table  if not exists transactions(sender_account_no varchar(20),reciver_account_number varchar(20),amount varchar(20))");
                        db.execSQL("insert into transactions values("+num55+","+678534678+","+num11+")");
                        Intent p=new Intent(final1.this,custominfo.class);
                        startActivity(p);

                    }

                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog a=ad.create();
                a.show();
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20=getIntent();
                int num11=i20.getIntExtra(s90,0);                                              //amount
                int num55=i20.getIntExtra(s91,0);                                              //  acc_no
                AlertDialog.Builder ad=new AlertDialog.Builder(final1.this);
                ad.setTitle("Alert");
                ad.setMessage("Want to send Money");
                ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.execSQL("update customerrr set current_balance=current_balance-"+ num11 + " where account_no="+num55+"");
                        db.execSQL("update customerrr set current_balance=current_balance+"+ num11 + " where account_no=875654678");


                        Toast.makeText(final1.this, "The money send Sucessfully to sohan prajapati", Toast.LENGTH_SHORT).show();
                        db.execSQL("create table  if not exists transactions(sender_account_no varchar(20),reciver_account_number varchar(20),amount varchar(20))");
                        db.execSQL("insert into transactions values("+num55+","+875634678+","+num11+")");
                        Intent p=new Intent(final1.this,custominfo.class);
                        startActivity(p);

                    }

                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog a=ad.create();
                a.show();
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20=getIntent();
                int num11=i20.getIntExtra(s90,0);                                              //amount
                int num55=i20.getIntExtra(s91,0);                                              //  acc_no
                AlertDialog.Builder ad=new AlertDialog.Builder(final1.this);
                ad.setTitle("Alert");
                ad.setMessage("Want to send Money");
                ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.execSQL("update customerrr set current_balance=current_balance-"+ num11 + " where account_no="+num55+"");
                        db.execSQL("update customerrr set current_balance=current_balance+"+ num11 + " where account_no=974334678");


                        Toast.makeText(final1.this, "The money send Sucessfully to akil ahmned", Toast.LENGTH_SHORT).show();
                        db.execSQL("create table  if not exists transactions(sender_account_no varchar(20),reciver_account_number varchar(20),amount varchar(20))");
                        db.execSQL("insert into transactions values("+num55+","+974334678+","+num11+")");
                        Intent p=new Intent(final1.this,custominfo.class);
                        startActivity(p);

                    }

                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog a=ad.create();
                a.show();
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20=getIntent();
                int num11=i20.getIntExtra(s90,0);                                              //amount
                int num55=i20.getIntExtra(s91,0);                                              // acc_no
                AlertDialog.Builder ad=new AlertDialog.Builder(final1.this);
                ad.setTitle("Alert");
                ad.setMessage("Want to send Money");
                ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.execSQL("update customerrr set current_balance=current_balance-"+ num11 + " where account_no="+num55+"");
                        db.execSQL("update customerrr set current_balance=current_balance+"+ num11 + " where account_no=543398668");


                        Toast.makeText(final1.this, "The money send Sucessfully to jasleen kaur ", Toast.LENGTH_SHORT).show();
                        db.execSQL("create table  if not exists transactions(sender_account_no varchar(20),reciver_account_number varchar(20),amount varchar(20))");
                        db.execSQL("insert into transactions values("+num55+","+543398668+","+num11+")");
                        Intent p=new Intent(final1.this,custominfo.class);
                        startActivity(p);

                    }

                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog a=ad.create();
                a.show();
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20=getIntent();
                int num11=i20.getIntExtra(s90,0);                                              //amount
                int num55=i20.getIntExtra(s91,0);                                              //  acc_no
                AlertDialog.Builder ad=new AlertDialog.Builder(final1.this);
                ad.setTitle("Alert");
                ad.setMessage("Want to send Money");
                ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.execSQL("update customerrr set current_balance=current_balance-"+ num11 + " where account_no="+num55+"");
                        db.execSQL("update customerrr set current_balance=current_balance+"+ num11 + " where account_no=324976678");


                        Toast.makeText(final1.this, "The money send Sucessfully to priya arora", Toast.LENGTH_SHORT).show();
                        db.execSQL("create table  if not exists transactions(sender_account_no varchar(20),reciver_account_number varchar(20),amount varchar(20))");
                        db.execSQL("insert into transactions values("+num55+","+324976678+","+num11+")");
                        Intent p=new Intent(final1.this,custominfo.class);
                        startActivity(p);

                    }

                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog a=ad.create();
                a.show();
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20=getIntent();
                int num11=i20.getIntExtra(s90,0);                                              //amount
                int num55=i20.getIntExtra(s91,0);                                              //  acc_no
                AlertDialog.Builder ad=new AlertDialog.Builder(final1.this);
                ad.setTitle("Alert");
                ad.setMessage("Want to send Money");
                ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.execSQL("update customerrr set current_balance=current_balance-"+ num11 + " where account_no="+num55+"");
                        db.execSQL("update customerrr set current_balance=current_balance+"+ num11 + " where account_no=646334678");


                        Toast.makeText(final1.this, "The money send Sucessfully to rahul rai", Toast.LENGTH_SHORT).show();
                        db.execSQL("create table  if not exists transactions(sender_account_no varchar(20),reciver_account_number varchar(20),amount varchar(20))");
                        db.execSQL("insert into transactions values("+num55+","+646334678+","+num11+")");
                        Intent p=new Intent(final1.this,custominfo.class);
                        startActivity(p);

                    }

                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog a=ad.create();
                a.show();
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20=getIntent();
                int num11=i20.getIntExtra(s90,0);                                              //amount
                int num55=i20.getIntExtra(s91,0);                                              //  acc_no
                AlertDialog.Builder ad=new AlertDialog.Builder(final1.this);
                ad.setTitle("Alert");
                ad.setMessage("Want to send Money");
                ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.execSQL("update customerrr set current_balance=current_balance-"+ num11 + " where account_no="+num55+"");
                        db.execSQL("update customerrr set current_balance=current_balance+"+ num11 + " where account_no=764334678");


                        Toast.makeText(final1.this, "The money send Sucessfully to arun agrawal", Toast.LENGTH_SHORT).show();
                        db.execSQL("create table  if not exists transactions(sender_account_no varchar(20),reciver_account_number varchar(20),amount varchar(20))");
                        db.execSQL("insert into transactions values("+num55+","+764334678+","+num11+")");
                        Intent p=new Intent(final1.this,custominfo.class);
                        startActivity(p);

                    }

                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog a=ad.create();
                a.show();
            }
        });
    }


}