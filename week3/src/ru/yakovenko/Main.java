package ru.yakovenko;

import ru.yakovenko.chess.IllegalMoveException;
import ru.yakovenko.chess.Position;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static boolean checkMove(Position posOne, Position posTwo){
        int x1 = posOne.getX(), x2 = posTwo.getX();
        int y1 = posOne.getY(), y2 = posTwo.getY();
        return (abs(x1 - x2) == 1 && abs(y1 - y2) == 2) || (abs(x1 - x2) == 2 && abs(y1 - y2) == 1);
    }

    private static int abs(int i) {
        return i < 0 ? -i : i;
    }

    public static boolean checkSteps(Position [] steps) throws IllegalMoveException {
        for (int i = 0; i < steps.length - 1; i++) {
            if (! checkMove(steps[i], steps[i + 1])){
                throw new IllegalMoveException(steps[i], steps[i + 1]);
            }
        }
        return true;
    }

    public static boolean checkString(String movements){
        boolean found = false;
        try {
            found = movements.matches("^\\s*([a-h][1-8]\\s*)+$");
        } catch (PatternSyntaxException ex) {
            return false;
        }
        return found;
    }

    public static Position [] getSteps(){
        Scanner in = new Scanner(System.in);
        String movements = in.nextLine();
        Position[] steps = null;
        if (checkString(movements)) {
            String[] strSteps = movements.trim().split("\\s+");
            steps = new Position[strSteps.length];
            int i = 0;
            for (String step : strSteps) {
                steps[i] = new Position(step.charAt(0), step.charAt(1));
                i++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println("Enter sequence of steps (like: 'g8 e7 c8'):");
        Position [] steps = getSteps();
        boolean result = false;
        if (steps != null) {
            try {
                result = checkSteps(steps);
            } catch (IllegalMoveException e) {
                System.out.println("Конь так не ходит: " + e.getMessage());
            } finally {
                if (result) {
                    System.out.println("ОК");
                }
            }
        } else {
            System.out.println("You've entered string in wrong format");
        }
    }
}
