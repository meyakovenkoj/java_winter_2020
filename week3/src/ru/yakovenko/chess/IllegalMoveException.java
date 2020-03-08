package ru.yakovenko.chess;

public class IllegalMoveException extends Exception{
    public IllegalMoveException(Position first, Position second){
        super(first.toString() + " -> " + second.toString());
    }
}
