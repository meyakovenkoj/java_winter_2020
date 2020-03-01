package ru.yakovenko;

import ru.yakovenko.Figures.Figure;

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

    public void print(){
        System.out.print("Name: ");
        System.out.println(this.name);
        this.object.print();
    }

    public boolean checkPoint(int x, int y){
        return this.object.find(x, y);
    }
}
