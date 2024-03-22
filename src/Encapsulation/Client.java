package Encapsulation;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "yash";
        student.age = 29;
        student.psp = 99;

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.psp);

        student.scheduleSession();
    }
}
