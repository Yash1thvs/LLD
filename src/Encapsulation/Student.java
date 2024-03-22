package Encapsulation;

public class Student {
    String name;
    int age;
    double psp;

    void scheduleSession(){
        System.out.println("Schedule a session for" + this.name);
    }

    void changePsp(double psp){
        this.psp = psp;
    }
}
