package atu.ie;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Welcome to StudentApp");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter your course: ");
        String course = sc.nextLine();

        //first person
        App app = new App();
        app.setName(name);
        app.setEmail(email);
        app.setCourse(course);

        //second person
        App app2 = new App(name,email,course);

    }
}
