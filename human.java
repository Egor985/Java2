package src.Lesson1.classwork;

public class human {
    private String name;
    private String surname;
    private int age;
    public int runLimit;
    public double jumpLimit;

    public human(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.runLimit = 800;
        this.jumpLimit = 1;
        System.out.println("Имя: " + name
                + "\nФамилия: " + surname
                + "\nВозраст: " + age);
        System.out.println(name + " может пробежать "
                + runLimit + " метров, и прыгает на высоту "
                + jumpLimit + " метра(ов)");
    }

    public static void main(String[] args) {

        human human = new human("Вася", "Обломов", 36);

    }

}