package ru.yakovenko;

import java.io.*;

public class Main {

    private static void readStream(InputStream in, long t0) throws IOException {
        int b;
        long bytesRead = 0;
        while((b = in.read()) != -1){
            bytesRead++;
        }
        System.out.println("time: " + (System.nanoTime() - t0)/1e6);
    }
    public class inner{

    }

    public static void main(String[] args) throws IOException {
        Main.inner a = new Main().new inner();
        String path = "/Users/ivanyakovenko/Downloads/big_one.txt";
        System.out.println("Case 1");
        long t0 = System.nanoTime();
        try( InputStream in = new FileInputStream(path) ){
            readStream(in, t0);
        }
        System.out.println("Case 2");
        long t1 = System.nanoTime();
        try(InputStream in = new BufferedInputStream(new FileInputStream(path)) ){
            readStream(in, t1);
        }
    }
}
