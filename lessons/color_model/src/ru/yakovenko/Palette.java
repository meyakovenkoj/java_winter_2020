package ru.yakovenko;

import ru.yakovenko.color.Color;
import ru.yakovenko.color.RGB;

public class Palette {
    Color [] colors;

    public Palette(int size){
        if (size < 0){
            throw new IllegalArgumentException("Size can't be less than 0");
        } else {
            this.colors = new Color[size];
        }
    }

    public Color findNearest(Color another){
        RGB target = another.toRgb();
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < this.colors.length; i++) {
            if (this.colors[i] != null){
                int dist = target.dist(this.colors[i]);
                if (dist < min){
                    min = dist;
                    result = i;
                }
            }
        }
        return this.colors[result];
    }
}
