package Lessons;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 20.09.2021
 */

public class ArrayClass {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

//        int a = 15;
//        int b = 36;
//        int c;
//
//        if (a > b) {
//            c = a;
//        } else {
//            c = b;
//        }
//
//        //РўРµСЂРЅР°СЂРЅС‹Р№ РѕРїРµСЂР°С‚РѕСЂ
//        c = (a > b) ? a : b;
//
//        System.out.println("Result > " + c);
//        String tmp = scanner.next();
//        int userData = scanner.nextInt();
//
//        System.out.println("Hello " + welcomeUser("Enter your name:"));
//
//        System.out.println("Your number > " + (userData * 10));

//        for (int i = 0; i < 5; i++) {
//            System.out.println(random.nextInt()); //[-int;+int]
//            System.out.println(random.nextInt(30)); //[0;30)
//            System.out.println(random.nextDouble()); //[0;1)
//            System.out.println(random.nextFloat()); //[0;1)
//            System.out.print(myRandom(-30, 30) + " ");
//            System.out.println(randomPassword(myRandom(-10, 10)));
//            System.out.println(randomPassword(myRandom(inputIntDataUser("Р’РІРµРґРёС‚Рµ С‡РёСЃР»Рѕ min > "),
//                    inputIntDataUser("Р’РІРµРґРёС‚Рµ С‡РёСЃР»Рѕ max > ")))); // СѓСЃР»РѕР¶РЅРµРЅРЅС‹Р№ РїСЂРёРјРµСЂ СЃРѕ СЃРєР°РЅРµСЂРѕРј
//        }

//        int[] myArrayInt = new int[5];
//        myArrayInt[0] = 67;
//        myArrayInt[1] = 54;
//        myArrayInt[2] = 13;
//        myArrayInt[3] = 2;
//        myArrayInt[4] = 99;

//        System.out.println(myArrayInt[3] + myArrayInt[1]);
//        System.out.println(myArrayInt[0]);
//
//        myArrayInt[0] = 555;
//
//        System.out.println(myArrayInt[0]);

//        String[] myArrayStr = new String[2];
//        myArrayStr[0] = "Vasia";
//        myArrayStr[1] = "Boris";

//        int[] arrayTest1 = new int[20];
//        recordInArray(arrayTest1);

//        for (int i = 0; i < arrayTest1.length; i++) {
//            arrayTest1[i] = myRandom(-30, 30);
//        }

//        for (int i = 0; i < arrayTest1.length; i++) {
//            System.out.print(arrayTest1[i] + " | ");
//        }

//        int[] arrayTest2 = new int[35];
//        for (int i = 0; i < arrayTest2.length; i++) {
//            arrayTest2[i] = myRandom(-30, 30);
//        }
//        recordInArray(arrayTest2);

//        String[] boxes = new String[myRandom(10, 40)];

//        printNameToBox("IphoneX13", boxes);
//        printArray(boxes);

//        addPassToBox(boxes);
//        printArray(boxes);
//        int[][] myArray2 = new int[2][5];
//        addDataToArray2(myArray2);
//        printTable(myArray2);

//        int y = 10;
//        int x = 10;
//
//        studyTwoSize(y, x);
//
//        int[][] testArray = new int[y][x];
//        testArray[1][3] = 15;

//        int[][][][][][] array6 = new int[1][5][7][8][99][1946];
//
//        for (int i = 0; i < array6.length; i++) {
//            for (int j = 0; j < array6[i].length; j++) {
//                for (int k = 0; k < array6[i][j].length; k++) {
//                    for (int l = 0; l < ; l++) {
//                        for (int m = 0; m < ; m++) {
//                            for (int n = 0; n < ; n++) {
//
//                            }
//                        }
//                    }
//                }
//            }
//        }

        String[] testArrayString1 = {"Boris", "Anna", "zeBrubis"}; //СЏРІРЅРѕРµ РѕР±СЉРµРІР»РµРЅРёРµ РјР°СЃСЃРёРІР°
        String[][] testArrayString2 = {{"Boris", "Anna"},
                {"zeBrubis", "Elizaveta"}}; //СЏРІРЅРѕРµ РѕР±СЉРµРІР»РµРЅРёРµ РјР°СЃСЃРёРІР°

    }

//    public static void addPassToBox(String[] inputBoxes) {
//        for (int i = 0; i < inputBoxes.length; i++) {
//            inputBoxes[i] = randomPassword(5);
//        }
//    }
//
//    public static void printNameToBox(String nameBox, String[] inputBoxes) {
//        for (int i = 0; i < inputBoxes.length; i++) {
//            inputBoxes[i] = nameBox + "#" + (i + 1);
//        }
//    }
//
//    public static void printArray(String[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(inputArray[i] + " | ");
//        }
//    }

    public static void studyTwoSize(int length1Size, int length2Size) {
        String[][] array = new String[length1Size][length2Size];

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                array[y][x] = "[" + y + ";" + x + "]";
            }
        }

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                System.out.print(array[y][x] + "\t");
            }
            System.out.println();
        }

    }

    public static void addDataToArray2(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = myRandom(-30, 30);
            }
        }
    }

    public static void printTable(int[][] arrayToPrint) {
        for (int y = 0; y < arrayToPrint.length; y++) {
            for (int x = 0; x < arrayToPrint[y].length; x++) {
                System.out.print(arrayToPrint[y][x] + "\t");
            }
            System.out.println();
        }

    }


//    public static void recordInArray(int[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = myRandom(-30, 30);
//        }
//    }


//    public static String welcomeUser(String msg) {
//        System.out.print(msg);
//        return scanner.next();
//    }

//    public static int inputIntDataUser(String msg) {
//        System.out.print(msg);
//        return scanner.nextInt();
//    }

    public static int myRandom(int min, int max) {
        int tmp = max - min;
        int value = random.nextInt(tmp);
        return min + value;
    }

    public static String randomPassword(int countChar) {
        if (countChar < 0) {
            countChar *= -1;
        }
        String ourPassword = "";
        for (int i = 0; i < countChar; i++) {
            int valueFromAscii = myRandom(50, 130);
            char tmpChar = (char) valueFromAscii;
            ourPassword += tmpChar;
        }

        return ourPassword;
    }
}
