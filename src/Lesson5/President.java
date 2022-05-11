package Lesson5;

public class President {

    String Name;
    String Profession;
    String email;
    long telephone;
    long Salary;
    int age;


    public President(String Name, String Profession, String email, long telephone, long Salary, int age){
        this.Name = Name;
        this.Profession = Profession;
        this.email = email;
        this.telephone = telephone;
        this.Salary = Salary;
        this.age = age;

        System.out.println("Presidents: " + Name + " " + Profession + " " + email + " " + Salary + " " +  telephone + " " + age);

    }

    public President(){
        System.out.println("Presidents: " + Name + " " + Profession + " " + email + " " + Salary + " " +  telephone + " " + age);
    }

    void howOld() {
        if (age>=40) return;

        }
    }

