package src.Lesson1.classwork;

public class Cat{

    public String name;
    public int runLimit;
    public double jumpLimit;

    public Cat() {
        this.name = "Васька";
        this.runLimit = 150;
        this.jumpLimit = 2;
        System.out.println("Кот " + name + " может пробежать "
                + runLimit + " метров, и прыгает на высоту "
                + jumpLimit + " метра(ов)");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();

    }
}
