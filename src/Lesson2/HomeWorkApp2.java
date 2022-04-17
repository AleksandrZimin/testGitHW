package Lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(sumNumber(1, 9));

        numberTwo(10);
        numberTree(2);
        stringFour("Aleksandr", 4);

        System.out.println(yearFive(2020));

    }

    public static boolean sumNumber(int a, int b) {

        System.out.println("*******1*******");

        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void numberTwo(int x) {

        System.out.println("*******2*******");

        if (x >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void numberTree(int y) {

        System.out.println("*******3*******");

        if (y < 0) {
            System.out.println("true");
        } else
        {
            System.out.println("false");
        }
    }

    public static void stringFour(String name, int n) {

        System.out.println("*******4*******");

        for (int i = 1; i <= n; i++) {
            System.out.println( i + ")" + " " + name);
        }
    }

    public static boolean yearFive(int year) {

        System.out.println("*******5*******");

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
             return true;
            }

        else {

             return false;

            }
    }


}




