package com.example.hui.saoleigame;

import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

   /* public  static  int mineNum2;
    public  static  int ROW2;
    public  static  int COL2;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main2);
       /* Intent intent=getIntent();
         String  x= intent.getStringExtra("row");
        ROW2= Integer.parseInt(x);
        System.out.print(ROW2);
          x= intent.getStringExtra("col");
        COL2= Integer.parseInt(x);
        System.out.print(COL2);
          x= intent.getStringExtra("minenum");
        mineNum2= Integer.parseInt(x);
        System.out.print(mineNum2);*/
        setContentView(new MainView(this));
    }
}
