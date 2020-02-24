package ru.yakovenko;

import java.util.Random;

public class Main {

    private static int[] generateArray(int num) {
        Random random = new Random(System.currentTimeMillis());
        return random.ints(num, 0, 100).toArray();
    }

    private static void replaceMinMax(int[] array){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, ind_max = 0, ind_min = 0, tmp;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                ind_min = i;
            }
            if (array[i] > max) {
                max = array[i];
                ind_max = i;
            }
        }

        tmp = array[array.length - 1];
        array[array.length - 1] = max;
        array[ind_max] = tmp;

        tmp = array[0];
        array[0] = min;
        array[ind_min] = tmp;
    }

    public static void main(String[] args) {
        int amount = 15;
        int[] input_array = generateArray(amount);
        if (input_array != null) {
            for (int a : input_array) {
                System.out.print(a);
                System.out.print(' ');
            }
            System.out.println();
            replaceMinMax(input_array);
            for (int a : input_array) {
                System.out.print(a);
                System.out.print(' ');
            }
        } else {
            System.out.println("Null array");
        }
    }
}