package Lessons;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 16.09.2021
 */

public class GoodClass {

    public static int valueFromClass = 15;

    //
    public static void main(String[] args) {
//        int valueFromMethod = 99;
//
//        System.out.println(valueFromClass);
//        System.out.println(valueFromMethod);
//
//        learnSwitch();

//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");
//        System.out.println("6");
//        System.out.println("7");
//        System.out.println("8");
//        System.out.println("9");
//        System.out.println("10");
//
//        for (int i = 1; i <= 10; i++) { //i++ > i = i + 1;
//            System.out.println(i);
//        }

//        System.out.println("Result myMath = " + myMath(2, 10));
//        printChar(55, 99);
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 3; j++) {
//
//            }
//        }

//        printTable(10,10);

//        int a = 10;
//
//        while (a < 10) {
//            a++;
//            if (a == 5 || a == 7) continue;
//            if (a == 8) break;
//            System.out.print(a + " ");
//        }
//
//        int b = 0;
//
//        do {
//            b++;
//            System.out.print(b + " ");
//        } while (b < 10);

        System.out.println(task(1111));
    }

    public static void learnSwitch() {
        System.out.println(valueFromClass);
        String nameLetter = "Qwerty";

        if (nameLetter == "Alex") {
            System.out.println("Send letter to Alex");
        } else if (nameLetter == "Olga") {
            System.out.println("Send letter to Olga");
        } else if (nameLetter == "Boris") {
            System.out.println("Send letter to Boris");
        } else if (nameLetter == "Maria") {
            System.out.println("Send letter to Maria");
        } else {
            System.out.println("go out office");
        }

        System.out.println("***********************");

        switch (nameLetter) {
            case "Alex":
                System.out.println("Send letter to Alex");
                break;
            case "Olga":
                System.out.println("Send letter to Olga");
                break;
            case "Boris":
                System.out.println("Send letter to Boris");
                break;
            case "Maria":
                System.out.println("Send letter to Maria");
                break;
            default:
                System.out.println("go out office");
                break;
        }
    }

    public static int myMath(int base, int signature) {
        int result = base;

        for (int i = 1; i < signature; i++) {
            result = result * base;
        }

        return result;
    }

    public static void printChar(int valueStart, int valueFinish) {
        for (int i = valueStart; i <= valueFinish; i++) {
            System.out.print((char) i + " > ");
        }
    }

    public static void printTable(int width, int height) {
        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= width; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();
        }

    }

    public static String task(int value) {
        if (value >= 100 && value <= 999) {
            return value + " <> " + (value % 10 + "" + (value % 100) / 10 + "" + value / 100);
        } else {
            return "Error: " + value + " invalid number";
        }
    }

}
