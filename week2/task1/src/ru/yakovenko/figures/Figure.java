package ru.yakovenko.figures;

public abstract class Figure implements Moveable{
    Point [] points;

    public abstract boolean find(int x, int y);

    public void move(int dx, int dy) {
        for (Point point : this.points) {
            point.update(dx, dy);
        }
    }

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