package ru.yakovenko;

import java.util.Scanner;

public class Main {

    private static String printBytes(long bytes){
        float flbytes = (float) bytes;
        int name = 0;
        if (bytes < 0){
            return "less than 0";
        }
        String [] str_bytes = {"B", "KB", "MB", "GB", "TB", "PB", "EB"};
        String result;
        while(flbytes >= 1024){
            flbytes = flbytes / 1024;
            name++;
        }
        if (name < str_bytes.length){
            result = String.format("%.1f %s", flbytes, str_bytes[name]);
        }
        else {
            result = "WTF";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount (max = 2^63 - 1) ");
        long input = 0;
        try {
            input = sc.nextLong();
        } catch (Exception ignored) {
            System.out.println("Too big number");
        }

        System.out.print("Result ");
        System.out.print(printBytes(input));
    }
}
