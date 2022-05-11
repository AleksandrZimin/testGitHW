package Lesson5;


public class HomeWorkApp5 {


    private static boolean howOld;

    public static void main(String[] args) {
//        President president1 = new President();

        President president1 = new President("Vladimir Putin", "President", "putin@russia.ru", +71111111111L, 99999999L, 72  );
        President president2 = new President("Barak Obama", "President", "barak@usa.gov", +7988646545L, 10000L, 38  );
        President president3 = new President("Donald Tramp", "President", "tramp@usa.gov", +7111456545L, 18000L, 59  );
        President president4 = new President("Angela Merkel", "President", "merkel@sssr.de", +984651663L, 150000L, 61  );
        President president5 = new President("Kim Chen In", "President", "KPSS@china.ch", -888888888L, 999900L, 33  );
        president1.howOld();

    System.out.println(howOld);



    }
}