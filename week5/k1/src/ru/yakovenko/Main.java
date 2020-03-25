package ru.yakovenko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String res = Palindrome.Reverse(input);
        System.out.println(res);
    }
}
