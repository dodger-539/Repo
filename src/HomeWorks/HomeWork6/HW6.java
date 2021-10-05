package HomeWorks.HomeWork6;

public class HW6 {

    public static void main(String[] args) {
        String tempWinEvent = " это получилось";
        String tempLossEvent = " это не получилось";
        String eventName;
        String eventResult;

        cat cat1 = new cat("Кот", "Матроскин", 200, 3);
        cat cat2 = new cat("Кот", "Рыжик", 250, 4);
        cat cat3 = new cat("Кот", "Том", 180, 5);
        dog dog1 = new dog("Собака", "Шарик", 500, 10);
        dog dog2 = new dog("Собака", "Барбос", 400, 17);
        dog dog3 = new dog("Собака", "Спайк", 600, 5);

        int runLength  = 250;
        int swimLength = 10;

        animal[] animals = {cat1, cat2, cat3, dog1, dog2, dog3};

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getKind() + " " + animals[i].getName() + " может ";


            eventName = "пробежать на " + animals[i].getRun() + " м. Пытается пробежать на ";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "проплыть на " + animals[i].getSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == animal.SWIM_NONE)
                eventResult = " это не получилось, т.к. не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);
        }

        System.out.println("All animals = " + animal.countAnimal + " > cat count = " + cat.countCat + " > dog count = " + dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);

    }


    }

