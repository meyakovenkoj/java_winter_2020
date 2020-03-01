package ru.yakovenko.Figures;
import ru.yakovenko.Figures.Figure;

import static java.lang.Math.sqrt;

public class Circle extends Figure implements Moveable{
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
    public void move(int dx, int dy) {
        this.points[0].update(dx, dy);
    }

    @Override
    public boolean find(int x, int y) {
        int dx = x-this.points[0].x;
        int dy = y-this.points[0].y;
        int tmp = dx*dx + dy*dy;
        return tmp <= this.radius * this.radius;
    }

    @Override
    public void print() {
        System.out.print("Radius: ");
        System.out.println(this.radius);
        for (Point a: this.points) {
            System.out.println(a);
        }
    }
}