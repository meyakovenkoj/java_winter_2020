package ru.yakovenko;

public class Palindrome {

    private static boolean isVowel(char symbol){
        String set = "aeiouyAEIOUY";
        return set.contains(String.valueOf(symbol));
    }

    private static int getVowel(String input, int index){
        for(int i = index; i < input.length(); i++){
            if (isVowel(input.charAt(i))){
                return i;
            }
        }
        return input.length();
    }

    public static String Reverse(String input){
        char [] inpStr = input.toCharArray();
        StringBuilder buffer = new StringBuilder(input);
        buffer.reverse();
        int lastIndex = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            if (isVowel(inpStr[i])){
                lastIndex = getVowel(buffer.toString(), lastIndex);
                result.append(buffer.charAt(lastIndex));
                lastIndex++;
            } else {
                result.append(inpStr[i]);
            }
        }
        return result.toString();
    }
}
