package ru.yakovenko.figures;

public class Circle extends Figure{
    private int radius;

    public Circle(int x, int y, int rad){
        this.points = new Point[1];
        this.points[0] = new Point();
        this.points[0].set(x,y);
        if(rad > 0) {
            this.radius = rad;
        } else throw new IllegalArgumentException("Radius must be more than 0");
    }

    @Override
    public boolean find(int x, int y) {
        int dx = x-this.points[0].x;
        int dy = y-this.points[0].y;
        int tmp = dx*dx + dy*dy;
        return tmp <= this.radius * this.radius;
    }

    @Override
    public String toString() {
        StringBuilder points = new StringBuilder();
        for (Point a: this.points) {
            points.append(a.toString());
            points.append('\n');
        }
        return "Radius: " + this.radius + '\n' + points.toString();
    }
}