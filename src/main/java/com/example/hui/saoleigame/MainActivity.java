package com.example.hui.saoleigame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    public  static  int W;
    public  static  int H;
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

        setContentView(new MainView(this));
        new AlertDialog.Builder(this)
                .setCancelable(false)
                .setTitle("游戏规则")
                .setMessage("把你认为不是雷的位置全部点开，只留着有雷的位置，每局游戏有10个雷。\n\n--卧槽工作室")
                .setPositiveButton("我知道了",null)
                .create()
                .show();
    }

    }

