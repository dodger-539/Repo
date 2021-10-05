package HomeWorks.HomeWork6;

public class animal {
    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    private String kind;
    private String name;
    private int run;
    private int swim;

    public static int countAnimal = 0;
    public animal(String kind, String name, int run, int swim) {
        this.kind = kind;
        this.name = name;
        this.run = run;
        this.swim = swim;
        ++countAnimal;
    }

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }
    protected boolean run(float distance) {
        return (distance <= run);
    }

    protected int swim(float distance) {
        return (distance <= swim) ? SWIM_OK : SWIM_FAIL;
    }
}
