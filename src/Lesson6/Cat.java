package Lesson6;

public class Cat extends Animal{

    private int jump;
    private int run;

    public Cat(String name, int health, int power,  int speed, int jump) {
        super(name, health, power, speed);
        this.jump = jump;
        this.run = run;
    }



    public void getJump() {
        System.out.println(name + " jump on : " + jump);
    }


}
