package ru.yakovenko.figures;

public class BoundingBox extends Figure{
    public BoundingBox(int x1, int y1, int x2, int y2){
        this.points = new Point[2];
        this.points[0] = new Point();
        this.points[1] = new Point();
        if (x1 <= x2 && y1 <= y2){
            this.points[0].set(x1, y1);
            this.points[1].set(x2, y2);
        }
        else if(x1 >= x2 && y1 >= y2){
            this.points[1].set(x1, y1);
            this.points[0].set(x2, y2);
        }
        else throw new IllegalArgumentException("You should give left low conner and right up conner");
    }

    @Override
    public boolean find(int x, int y) {
        if (x >= this.points[0].x && x <=this.points[1].x){
            return y >= this.points[0].y && y <= this.points[1].y;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder points = new StringBuilder();
        for (Point a: this.points) {
            points.append(a.toString());
            points.append('\n');
        }
        return points.toString();
    }

}