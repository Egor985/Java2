package src.Lesson1.classwork;

public class Robot {
    private String name;

    public Robot(String name) {
            this.name = name;
        }
        public static void main(String[] args) {
            Robot robot = new Robot("Железяка");
        System.out.println("Робот: " + robot.name);

    }
}
