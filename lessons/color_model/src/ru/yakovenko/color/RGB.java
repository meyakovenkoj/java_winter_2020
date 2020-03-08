package ru.yakovenko.color;

public class RGB extends Color{
    int red;
    int green;
    int blue;

    public RGB(int red, int green, int blue){
        if(red > 255 || red < 0 || green > 255 || green < 0 || blue > 255 || blue < 0)
            throw new IllegalArgumentException("Wrong parameter");
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int dist(Color another){
        RGB target = another.toRgb();
        int dr = target.red - this.red;
        int dg = target.green - this.green;
        int db = target.blue - this.blue;
        return dr * dr + dg * dg + db * db;
    }

    public void update(int red, int green, int blue){
        if(red > 255 || red < 0 || green > 255 || green < 0 || blue > 255 || blue < 0)
            throw new IllegalArgumentException("Wrong parameter");
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public RGB toRgb() {
        return this;
    }
}
