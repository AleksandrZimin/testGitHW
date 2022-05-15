package Lesson6;

public class Animal {

   protected String name;
   protected int health;
   protected int power;
   protected int speed;

   public Animal(String name, int health, int power,  int speed ) {

      this.name = name;
      this.health = health;
      this.power = power;
      this.speed = speed;
   }

   public void speak() {
      System.out.println(name + " says: - Hello! ");
   }

   public void run(int i) {
      System.out.println(name + " run with speed: " + speed);
   }



}

