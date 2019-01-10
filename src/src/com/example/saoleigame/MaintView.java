package com.example.saoleigame;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

public class MaintView extends View {
    private int TouchNum=0;//xy
    private Mine mine;
    private boolean isFirst = true;//����Ƿ��Ǳ��ֵ�һ�ε����Ļ
    private Context context;
    int idxX;
    int idxY;
    private int mineNum = 25;//�������׵ĸ���10
    private int ROW = 18;//Ҫ���ɵľ����15
    private int COL = 13;//Ҫ���ɵľ����8
    public int TILE_WIDTH;//���С50
    private boolean isFalse = false;
    private boolean mPressBreak = false;
    private float atime;
    public MaintView(Context context) {
        super(context);
        this.context = context;
        TILE_WIDTH = MainActivity.W / 14;
        mine = new Mine((MainActivity.W - COL * TILE_WIDTH) / 3, (MainActivity.H - ROW * TILE_WIDTH) / 3, COL, ROW, mineNum, TILE_WIDTH);
        try {
            mine.init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * ��Ϸ�߼�
     */
    public void logic() {
        int count = 0;

        for (int i = 0; i < mine.mapRow; i++) {
            for (int j = 0; j < mine.mapCol; j++) {
                if (!mine.tile[i][j].open) {
                    count++;
                }
            }
        }
        //�߼��ж��Ƿ�ʤ��
        if (count == mineNum) {
            new AlertDialog.Builder(context)
                    .setMessage("��ϲ�㣬���ҳ���������")
                    .setCancelable(false)
                    .setPositiveButton("����", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            mine.init();
                            invalidate();
                            isFirst = true;
                        }
                    })
                    .setNegativeButton("�˳�", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            System.exit(0);
                        }
                    })
                    .create()
                    .show();
        }
    }


    /**
     * ˢ��View
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        mine.draw(canvas);
    }

    /**
     * �����Ļ�¼�
     *
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN)
        {
            int x=(int)event.getX();
            int y=(int)event.getY();
            //�ж��Ƿ���ڷ�Χ��
            if(x>=mine.x&&y>=mine.y&&x<=(mine.mapWidth+mine.x)&&y<=(mine.y+mine.mapHeight))
            {
                int idxX=(x-mine.x)/mine.tileWidth;
                int idxY=(y-mine.y)/mine.tileWidth;
                mine.open(new Point(idxX,idxY),isFirst);
                isFirst=false;

                if(mine.tile[idxY][idxX].value==-1)
                {
                    mine.isDrawAllMine=true;
                    new AlertDialog.Builder(context)
                            .setCancelable(false)
                            .setMessage("���ź�����ȵ����ˣ�")
                            .setPositiveButton("����", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    mine.init();
                                    isFalse=true;
                                    isFirst=true;

                                    invalidate();
                                }
                            })
                            .setNegativeButton("�˳�", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    System.exit(0);
                                }
                            })
                            .create()
                            .show();
                }
                logic();
                invalidate();
            }
        }
        return true;
    }
}




