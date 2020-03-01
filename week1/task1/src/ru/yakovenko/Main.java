package ru.yakovenko;

import java.util.Random;

public class Main {

    private static int[] generateArray(int num) {
        Random random = new Random(System.currentTimeMillis());
        return random.ints(num, 0, 100).toArray();
    }

    private static void replaceMinMax(int[] array){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, indMax = 0, indMin = 0, tmp;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indMin = i;
            }
        }
        tmp = array[0];
        array[0] = min;
        array[indMin] = tmp;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indMax = i;
            }
        }
        tmp = array[array.length - 1];
        array[array.length - 1] = max;
        array[indMax] = tmp;
    }

    public static void main(String[] args) {
        int amount = 15;
        int [] inputArray = new int[] {7,-1,7,0};
//        int [] inputArray = generateArray(amount);
        if (inputArray != null && inputArray.length != 0) {
            for (int a : inputArray) {
                System.out.print(a);
                System.out.print(' ');
            }
            System.out.println();
            replaceMinMax(inputArray);
            for (int a : inputArray) {
                System.out.print(a);
                System.out.print(' ');
            }
        } else {
            System.out.println("Empty (or null) array");
        }
    }
}