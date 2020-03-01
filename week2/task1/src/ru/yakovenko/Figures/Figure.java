package ru.yakovenko.Figures;

public abstract class Figure{
    Point [] points;

    public abstract boolean find(int x, int y);

    public abstract void print();

    public static class Point {
        int x;
        int y;

        Point(){
            this.x = 0;
            this.y = 0;
        }

        public String toString(){
            return "x: " + this.x + " y: " + this.y;
        }

        void set(int x, int y){
            this.x = x;
            this.y = y;
        }

        void update(int dx, int dy){
            this.x += dx;
            this.y += dy;
        }
    }
}