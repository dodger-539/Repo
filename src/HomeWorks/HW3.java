package HomeWorks;

import java.net.StandardProtocolFamily;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class HW3 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Задание № 1");
        task1();
        System.out.println();
        System.out.println("Задание № 2");
        task2(100);
        System.out.println();
        System.out.println("Задание № 3");
        task3();
        System.out.println();
        System.out.println("Задание № 4");
        task4();
        System.out.println();
        System.out.println("Задание № 5");
        task5(len(), initialValue());
        System.out.println();
        System.out.println("Задание № 6");
        task6();
        System.out.println();
        System.out.println("Задание № 7");
        task7();
    }

    public static void task1() {
        int[] array = new int[10];
        int[] shiftArray = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(2);
            shiftArray[i] = (array[i] == 0) ? 1 : 0;

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(shiftArray));
    }

    public static void task2(int len) {
        int[] array = new int[len];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] < 6) ? array[i]*2 : array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task4() {
        int[][] array2 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array2[i][j] = (i == j) || (i+j == array2.length - 1) ? 1 : 0;
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void task5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int len() {
        System.out.print("Введите длину массива: ");
        return scanner.nextInt();
    }

    public static int initialValue() {
        System.out.print("Введите значение: ");
        return scanner.nextInt();
    }

    public static void task6() {
        int[] arr = new int[10];
        int max = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
            max = (max >= arr[i]) ? max : arr[i];
        }
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Максимальное значение: " + max);
    }

    public static void task7() {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10);
            sum = arr[i]++;
        }
        int l = 0;

        for (int i = 0; i < 10; i++) {
            l = arr[i]++;
            int r = sum - l;
            boolean checkBalance = (l==r);
            System.out.println(Arrays.toString(arr) + " - " + checkBalance);
        }

    }
}