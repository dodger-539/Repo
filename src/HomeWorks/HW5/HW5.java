package HomeWorks.HW5;

public class HW5 {
    public static void main(String[] args) {
        ClassWorker classWorker1 = new ClassWorker("Иван", "Иванов", "Иванович", "менеджер", "aaa@mail.ru", "89991112233", 5000, 11);
        System.out.println();
        ClassWorker classWorker2 = new ClassWorker("Иван", "Иванов", "Иванович", "менеджер", "aaa@mail.ru", "89991112233", 5000, 22);
        System.out.println();
        ClassWorker classWorker3 = new ClassWorker("Иван", "Иванов", "Иванович", "менеджер", "aaa@mail.ru", "89991112233", 5000, 33);
        System.out.println();
        ClassWorker classWorker4 = new ClassWorker("Иван", "Иванов", "Иванович", "менеджер", "aaa@mail.ru", "89991112233", 5000, 44);
        System.out.println();
        ClassWorker classWorker5 = new ClassWorker("Иван", "Иванов", "Иванович", "менеджер", "aaa@mail.ru", "89991112233", 5000, 55);


        System.out.println();
        System.out.println();

        ClassWorker[] array = {
                new ClassWorker("Иван", "Иванов", "Иванович", "менеджер", "aaa@mail.ru", "89991112233", 5000, 11),
                new ClassWorker("Иван", "Иванов", "Иванович", "менеджер", "aaa@mail.ru", "89991112233", 5000, 22),
                new ClassWorker("Иван", "Иванов", "Иванович", "менеджер", "aaa@mail.ru", "89991112233", 5000, 33),
                new ClassWorker("Иван", "Иванов", "Иванович", "менеджер", "aaa@mail.ru", "89991112233", 5000, 44),
                new ClassWorker("Иван", "Иванов", "Иванович", "менеджер", "aaa@mail.ru", "89991112233", 5000, 55),
        };
        System.out.println(array);

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getAll());
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 40) {
                System.out.println(array[i].getAll());
            }

        }
    }
}
