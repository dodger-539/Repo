package Lessons;

//One-line comment

/*
Multi-line comment
 */

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 13.09.2021
 */

public class MyFirstClass {

    public static void main(String[] args) {
//        System.out.print("Hello Java. This is my first Program!");
//        System.out.println("Hello Java. This is my first Program!");

//        //С†РµР»С‹Рµ С‡РёСЃР»Р°
//        byte myByte = 15; // 1 byte <-128 .. +127>
//        short myShort = 1500; // 2 bytes <-32768 .. +32767>
//        int myInteger = 150000; // 4 bytes <-2.1mlrd .. +2.1mlrd> DEFAULT
//        long myLong = 30000000000L; // 8 bytes <-2^63 .. +2^63>
//
//        //С‡РёСЃР»Р° СЃ С‚РѕС‡РєРѕР№
//        float myFloat = 645.987f; // 4 bytes <>.0000000
//        double myDouble = 645.987; // 8 bytes <>.00000000000000 DEFAULT

//       System.out.println(myInteger);

        //char
//        char myChar = 'f'; // 2 bytes
//        int myCharValue = 35;
//        System.out.println((char) myCharValue);
//        System.out.println((int) myChar);
//
//        boolean myBooleanTrue = true; // 1 byte
//        boolean myBooleanFalse = false;
//
//        String myString = "jkkjfdhglkjs";

        //Math operation
        //+,-,*,/,%,^

//        int a = 15;
//        int b = 35;
//        int c = a * b * a * b - a + b / a;
//        System.out.println(c);

        //РєРѕРЅРєР°С‚РµРЅР°С†РёСЏ СЃС‚СЂРѕРє
//        String string1 = "Hello";
//        String string2 = "_World";
//        System.out.println(string1 + string2);

//        System.out.println("Hello " + myDouble + myString + myBooleanFalse);

//        System.out.println("Result: " + (25 + 35));

//        int abc = 350;
//
//        if (abc > 200) {
//            System.out.println("OK");
//        } else {
//            System.out.println("FAIL");
//        }
//
//        if (abc > 200) {
//            System.out.println("abc > 200");
//        } else if (abc > 200) {
//            System.out.println("abc > 110");
//        } else {
//            System.out.println("FAIL");
//        }
//
//        if (abc > 200) {
//            System.out.println("OK");
//        }
//        //>, <, <=, >=, ==

//        int money = 5000;
//        int cashBackEkaterina;
//        String nameHusband = "Michael";

//        goToShop(money, nameHusband);
//        System.out.println("************");
//        goToShop(300, "Alex");
//        System.out.println("************");
        goToWork();

//        cashBackEkaterina = goToShopAndReturnCashBack(50, nameHusband);
//        System.out.println("Cash-back: " + cashBackEkaterina);


//        System.out.println(welcomeUser(nameHusband));

    }

    public static String welcomeUser(String name) {
        return "Welcome our system, " + name;
    }

    public static void goToShop(int valueCash, String name) {
        System.out.println(name + " take your money: " + valueCash);
        System.out.println(name + " Go out home");
        System.out.println(name + " Go to shop");
        System.out.println(name + " Buy something");
        System.out.println(name + " Take cashback = " + (valueCash - 100));
        System.out.println(name + " do something...");
    }

    public static int goToShopAndReturnCashBack(int valueCash, String name) {
        int cashBack = 0;
        System.out.println(name + " take your money: " + valueCash);
        System.out.println(name + " Go out home");
        System.out.println(name + " Go to shop");
        if (valueCash > 100) {
            System.out.println(name + " Buy something");
            cashBack = valueCash - 100;
            System.out.println(name + " Take cashback = " + cashBack);
            System.out.println(name + " do something...");
        }
        if (cashBack > 0) {
            return cashBack;
        } else {
            System.out.println("CashBack fail");
            return 0;
        }
    }



    public static void goToWork() {
        System.out.println("Go out home");
        System.out.println("Go to work");
        System.out.println("Working....");
        System.out.println("Go to home");
    }



}
