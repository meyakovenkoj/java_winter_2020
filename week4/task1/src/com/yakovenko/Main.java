package com.yakovenko;

import com.yakovenko.files.WordCounter;

public class Main {
    public static void main(String[] args) {
        if(args.length > 0) {
            int amount = WordCounter.count(args[0]);
            System.out.println(amount + " word" +  (amount<=1?"":"s") + " in the file.");
        } else {
            System.out.println("usage: <program> <filepath>");
        }
    }
}
