package com.yakovenko.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static int count(String filepath){
        int amount = 0;
        try (BufferedReader file = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = file.readLine()) != null) {
                line = line.trim();
                if(!line.isEmpty()){
                    amount += line.split(" +").length;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file path");
        } catch (IOException e) {
            System.out.println("Input error");
        }
        return amount;
    }
}
