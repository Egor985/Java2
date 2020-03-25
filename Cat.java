package Lesson1.classwork;

public abstract class Cat extends Animal{
    public String name = "Васька ";
    public String color;
    public int age;
    public int counter = 1;

    @Override
    public String toString(){
        return name;
    }

    public Cat(String color, int age) {
        name += counter;
        this.color = color;
        this.age = age;
        this.runLimit = 200;
        this.jumpLimit = 2;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat("Коричневый", 5) {
            @Override
            public void run(int length) {
            if (length <= runLimit) {
                System.out.println("Первый кот: " + this.name + "\nЦвет: " + this.color + "\nВозраст: " + this.age);
                System.out.println(this + " бежит " + length + " метра(ов)");
                } else {
                    System.out.println(this + " не может пробежать столько");
                }
            }

            @Override
            public void jump(int height) {
                if (height <= jumpLimit) {
                    System.out.println(this + " прыгает на высоту " + height + " метра(ов)");
                } else {
                    System.out.println(this + " не может запрыгнуть на эту высоту");
                }
            }
        };

        Cat cat2 = new Cat("Белый", 2) {
            @Override
            public void run(int length) {
            if (length <= runLimit) {
                System.out.println("Второй кот: " + this.name + "\nЦвет: " + this.color + "\nВозраст: " + this.age);
                System.out.println(this + " бежит " + length + " метра(ов)");
                } else {
                System.out.println(this + " не может пробежать столько");
                }
            }

            @Override
            public void jump(int height) {
                if (height <= jumpLimit) {
                    System.out.println(this + " прыгает на высоту " + height + " метра(ов)");
                } else {
                    System.out.println(this + " не может запрыгнуть на эту высоту");
                }
            }
        };

        Cat[] cats = new Cat[2];

        cat1.run(100);
        cat1.jump(1);
        cat2.run(180);
        cat2.jump(2);

    }
}
