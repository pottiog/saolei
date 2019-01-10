package com.example.hui.saoleigame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    public  static  int W;
    public  static  int H;
    public  static  int mineNum1;
    public  static  int ROW1;
    public  static  int COL1;
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowManager wm=this.getWindowManager();
        W=wm.getDefaultDisplay().getWidth();
        H=wm.getDefaultDisplay().getHeight();
//        DisplayMetrics dm = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//        W = dm.widthPixels;//宽度
//        H = dm.heightPixels ;//高度
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("游戏规则");
        builder.setMessage("把你认为不是雷的位置全部点开，有雷的位置长按做标记。");
        builder.setPositiveButton("我知道了", null);

         btn1 = (Button) findViewById(R.id.button2);
        btn2 = (Button) findViewById(R.id.button3);
      /*  public void btn1Click(){

        }*/
        //监听button事件
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* ROW1=15;
                COL1=8;
                mineNum1=10;*/


                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                /*intent.putExtra("row", ROW1);
                intent.putExtra("col", COL1);
                intent.putExtra("minenum", mineNum1);*/
                startActivity(intent);


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

    /*    builder.setPositiveButton("简单", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ROW1=15;
                COL1=8;
                mineNum1=10;
            }
        });
        builder.setNegativeButton("困难", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ROW1=20;
                COL1=12;
                mineNum1=20;
               // setContentView(new MainView(this));
            }
        });*/
        builder.create();
        builder.show();


    }

    }

