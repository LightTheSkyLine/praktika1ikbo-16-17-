package com.company;

public class Ball {
    private String color;
    private int  radius;
    public Ball(String c, int r){
        color = c;
        radius = r;
    }
    public Ball(String c){
        color = c;
    }
    public Ball(){
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public int getRadius(){
        return radius;
    }
}



