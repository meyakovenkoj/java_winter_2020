package ru.yakovenko.chess;

public class Position {
    private int x;
    private int y;
    private char[] row = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    private boolean isCoordinatesWrong(int x, int y){
        return x < 0 || x > 7 || y < 0 || y > 7;
    }

    public Position(int x, int y){
        if (isCoordinatesWrong(x, y)){
            throw new IllegalArgumentException("Position is out of board");
        } else {
            this.x = x;
            this.y = y;
        }
    }

    public Position(char x, char y){
        try{
            this.y = y - '1';
        } catch (Exception e){
            throw new IllegalArgumentException("Position is out of board");
        }
        boolean notFound = true;
        for (int k = 0; k < this.row.length; k++) {
            if (x == this.row[k]) {
                notFound = false;
                this.x = k;
                break;
            }
        }
        if(notFound) {
            throw new IllegalArgumentException("Position is out of board");
        }
    }

    public void setCoordinates(int x, int y){
        if (isCoordinatesWrong(x, y)){
            throw new IllegalArgumentException("Position is out of board");
        } else {
            this.x = x;
            this.y = y;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString(){
        return this.row[this.x] + Integer.toString(this.y + 1);
    }
}
