package com.example.summit;

public abstract class Shape {
    private int x;
    private int y;
    String color = "yellow";

    public Shape (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}
    public int getY() {return y;}

    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
}
