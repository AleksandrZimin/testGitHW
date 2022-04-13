package Lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign(){
        int a = 12, b = 2;

        if ((a + b) > 0) {
            System.out.println("Summ +");
        }
        if ((a + b) < 0) {
            System.out.println("Summ -");
        }
    }

    public static void main(String[] args) {
        printColor();
    }
    public static void printColor(){
        int value = 150;

        if (value <= 0){
            System.out.println("Red");
        }
        else if (value > 0 & value <= 100){
            System.out.println("Yellow");
        }
        else  {
            System.out.println("Green");
        }
    }

    public static void main(String[] args) {
        compareNumbers();
    }
    public static void compareNumbers(){
        int a = 12, b = 2;

        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }

    }

    public static void main(String[] args) {
        printThreeWords();
        compareNumbers();

    }

// Каждое задание воспроизводится отдельно, Остальное нужно закомментировать.
// Не разобрался как все сразу запустить без ошибок.
