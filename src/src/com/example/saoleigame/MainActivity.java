package com.example.saoleigame;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


public class MainActivity extends Activity {
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
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("��Ϸ����");
        builder.setMessage("������Ϊ�����׵�λ��ȫ���㿪�����׵�λ�ó�������ǡ�");
        builder.setPositiveButton("��֪����", null);

         btn1 = (Button) findViewById(R.id.button2);
        btn2 = (Button) findViewById(R.id.button3);
 
        //����button�¼�
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
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

        builder.create();
        builder.show();


    }

    }

