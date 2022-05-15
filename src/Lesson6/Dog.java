package Lesson6;

public class Dog extends Animal {

    private int swim;
    private int volume;
    private int run;

    public Dog(String name, int health, int power, int speed, int volume) {
        super(name, health, power, speed);
        this.swim = swim;
        this.volume = volume;
        this.run = run;

    }

    public void swim(int i) {
        System.out.println(name + " swim with speed: " + speed);
    }

    public void gav() {
        System.out.println(name + " gav with volume: " + volume);
    }



}
