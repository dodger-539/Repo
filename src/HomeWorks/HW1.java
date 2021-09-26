package HomeWorks;

public class HW1 {
    public static void main (String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 6;
        int c = a+b;
        if (c >= 0) {
            System.out.println("РЎСѓРјРјР° РїРѕР»РѕР¶РёС‚РµР»СЊРЅР°СЏ");
        } else {
            System.out.println("РЎСѓРјРјР° РѕС‚СЂРёС†Р°С‚РµР»СЊРЅР°СЏ");
        }
    }
    public static void printColor() {
        int value = 22;
        if (value <= 0) {
            System.out.println("РљСЂР°СЃРЅС‹Р№");
        } else if (value < 0 && value <= 100) {
            System.out.println("Р–РµР»С‚С‹Р№");
        } else {
            System.out.println("Р—РµР»РµРЅС‹Р№");
        }
    }

    public static void compareNumbers() {
        int a = 33;
        int b = 44;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
