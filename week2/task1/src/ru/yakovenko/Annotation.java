package ru.yakovenko;

import ru.yakovenko.figures.Figure;

public class Annotation{
    private String name;
    private Figure object;

    public Annotation(Figure f, String name){
        this.name = name;
        this.object = f;
    }

    public Figure getFigure(){
        return this.object;
    }

    public String toString(){
        return "Name: " + this.name + '\n' + this.object.toString();
    }

    public boolean checkPoint(int x, int y){
        return this.object.find(x, y);
    }
}
