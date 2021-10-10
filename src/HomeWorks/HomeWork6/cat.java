package HomeWorks.HomeWork6;

public class cat extends animal {

    public static int countCat = 0;


    cat(String kind, String name, int run, int swim) {
        super("Кот", name, run, swim);
        ++countCat;
    }

    @Override
    protected int swim(float distance) {
        return animal.SWIM_NONE;
    }
    }

