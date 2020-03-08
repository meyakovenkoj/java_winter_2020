package ru.yakovenko;

import ru.yakovenko.color.Color;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Color [] Palette = null;
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size < 0){
            System.out.println("Size can't be less than 0");
            System.exit(0);
        } else {
            Palette = new Color[size];
        }
    }
}
