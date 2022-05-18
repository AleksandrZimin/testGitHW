package Lesson6;

public class mainClass {

    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 100, 20, 20, 10);
        Dog dog = new Dog("Sharik", 80, 30, 15, 20);

        cat.speak();
        cat.getJump();
        cat.run(200);

        dog.speak();
        dog.swim(10);
        dog.run(500);
        dog.gav();
    }
}
