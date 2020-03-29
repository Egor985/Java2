package src.Lesson1.classwork;

public class Robot {
    private String name;
    public int runLimit;
    public double jumpLimit;

    public Robot(String name) {

        this.name = name;
        this.runLimit = 1000;
        this.jumpLimit = 0;
        System.out.println("Робот: " + name);
        System.out.println(name + " может пробежать "
                + runLimit + " метров, и не умеет прыгать");
    }

    public static void main(String[] args) {
        Robot robot = new Robot("Железяка");


    }
}
