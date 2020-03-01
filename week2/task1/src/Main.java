import ru.yakovenko.Annotation;
import ru.yakovenko.figures.BoundingBox;
import ru.yakovenko.figures.Circle;
import ru.yakovenko.figures.Figure;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static Circle getCircle(){
        System.out.println("Enter x, y, rad:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int rad = in.nextInt();
        Circle newone = null;
        try {
            newone = new Circle(x, y, rad);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return newone;
    }

    public static BoundingBox getBoundingBox(){
        System.out.println("Enter x1, y1, x2, y2:");
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        BoundingBox newone = null;
        try {
            newone = new BoundingBox(x1, y1, x2, y2);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return newone;
    }

    public static Annotation [] addAnnotations(Annotation [] list){
        System.out.println("Circle or BB? answer 0 or 1");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        Figure obj;
        if (i == 0){
            obj = getCircle();
        } else if (i == 1){
            obj = getBoundingBox();
        } else {
            System.out.println("Wrong parameter");
            return list;
        }
        if (obj != null) {
            Annotation an = new Annotation(obj, "fig " + Integer.toString(list.length + 1));
            list = Arrays.copyOf(list, list.length + 1);
            list[list.length - 1] = an;
        }
        return list;
    }

    public static Annotation findByPoint(Annotation [] list, int x, int y){
        for (Annotation a : list) {
            if (a.checkPoint(x, y)){
                return a;
            }
        }
        return null;
    }

    public static int menu(){
        int choice = 0;
        Scanner in = new Scanner(System.in);
        while(choice <= 0 || choice > 4) {
            System.out.println("Menu");
            System.out.println("1. add annotation");
            System.out.println("2. move exist");
            System.out.println("3. show all");
            System.out.println("4. exit");
            choice = in.nextInt();
        }
        return choice;
    }

    public static void main(String[] args){
        Annotation [] list = new Annotation[0];
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while(choice != 4) {
            choice = menu();
            switch (choice) {
                case 1:
                    list = addAnnotations(list);
                    break;
                case 2:
                    System.out.println("Enter displacement");
                    int x = in.nextInt();
                    int y = in.nextInt();
                    System.out.println("Enter point to find");
                    int targetX = in.nextInt();
                    int targetY = in.nextInt();
                    Annotation a = findByPoint(list, targetX, targetY);
                    if (a != null) {
                        System.out.println(a);
                        a.getFigure().move(x, y);
                    } else {
                        System.out.println("nothing");
                    }
                    break;
                case 3:
                    for (Annotation each : list) {
                        System.out.println(each);
                    }
                    break;
            }
        }
    }
}