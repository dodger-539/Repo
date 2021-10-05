package HomeWorks.HomeWork6;

public class dog extends animal {

    public static int countDog = 0;



    dog(String kind, String name, int run, int swim) {
        super("Собака", name, run, swim);
        ++countDog;
    }


}
