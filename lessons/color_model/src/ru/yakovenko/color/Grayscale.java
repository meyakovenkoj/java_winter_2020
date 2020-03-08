package ru.yakovenko.color;

public class Grayscale extends Color{
    int grey;

    public Grayscale(int grey){
        if(grey > 255 || grey < 0 )
            throw new IllegalArgumentException("Wrong parameter");
        this.grey = grey;
    }

    public void update(int grey) {
        if(grey > 255 || grey < 0 )
            throw new IllegalArgumentException("Wrong parameter");
        this.grey = grey;
    }

    @Override
    public RGB toRgb() {
        return new RGB(this.grey, this.grey, this.grey);
    }
}
