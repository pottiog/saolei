package com.example.hui.saoleigame;

public class Point {
     int x;
     int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    @Override
    public  int hashCode() {
        // TODO Auto-generated method stub
        return 2*x+y;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.hashCode()==((Point)(obj)).hashCode();

    }
}
