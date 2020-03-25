package src.Lesson1.classwork;

public class human {
    private String name;
    private String surname;
    private int age;

    public human(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void main(String[] args) {

        human human1 = new human("Вася", "Обломов", 36);
        System.out.println("Имя: " + human1.name + "\nФамилия: " + human1.surname + "\nВозраст: " + human1.age);

    }

}