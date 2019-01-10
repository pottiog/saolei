package com.example.xl;

import android.app.Activity;
import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends Activity {

   /* public  static  int mineNum2;
    public  static  int ROW2;
    public  static  int COL2;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("TAG","into Main2Activity");
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