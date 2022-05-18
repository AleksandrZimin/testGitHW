package Lesson7;

import java.util.Scanner;

public class Lesson07 extends Object{

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        String testString = "Hello";
        StringBuilder stringBuilder = new StringBuilder("Hello");

        System.out.println("Start test: " + testString.equals(stringBuilder.toString()));

        long startTest = System.nanoTime(); //Hex-format // Unix-Time

        for (int i = 0; i < 50000; i++) {
            testString += i; //Hello0123456...49999
        }

        float endTest = System.nanoTime() - startTest;

        System.out.println(testString);
        System.out.println("Time cycle testString: " + (endTest * 0.000001f) + " ms");

        startTest = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            stringBuilder.append(i);
        }

        endTest = System.nanoTime() - startTest;

        System.out.println(stringBuilder.toString());
        System.out.println("Time cycle stringBuilder: " + (endTest * 0.000001f) + " ms");
        System.out.println(testString.equals(stringBuilder.toString()));

    }

}
