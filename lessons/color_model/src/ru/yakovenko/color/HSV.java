package ru.yakovenko.color;

public class HSV extends Color{
    int h;
    int s;
    int v;

    public HSV(int h, int s, int v){
        if(h > 360 || h < 0 || s > 100 || s < 0 || v > 100 || v < 0)
            throw new IllegalArgumentException("Wrong parameter");
        this.h = h;
        this.s = s;
        this.v = v;
    }

    public void update(int h, int s, int v){
        if(h > 360 || h < 0 || s > 100 || s < 0 || v > 100 || v < 0)
            throw new IllegalArgumentException("Wrong parameter");
        this.h = h;
        this.s = s;
        this.v = v;
    }

    int to255(double p){
        return (int) (p * 255 / 100);
    }

    @Override
    public RGB toRgb() {
        int hi = (int) Math.floor(this.h / 60.0) % 6;
        double vmin = (100 - this.s) * this.v / 100.0;
        double a = (this.v - vmin) * (this.h % 60) / 60.0;
        double vinc = vmin + a;
        double vdec = this.v - a;
        switch (hi) {
            case 0:
                return new RGB(to255(this.v), to255(vinc), to255(vmin));
            case 1:
                return new RGB(to255(vdec), to255(this.v), to255(vmin));
            case 2:
                return new RGB(to255(vmin), to255(this.v), to255(vinc));
            case 3:
                return new RGB(to255(vmin), to255(vdec), to255(this.v));
            case 4:
                return new RGB(to255(vinc), to255(vmin), to255(this.v));
            case 5:
                return new RGB(to255(this.v), to255(vmin), to255(vdec));
        }
        return null;
    }
}
