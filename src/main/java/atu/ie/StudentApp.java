package atu.ie;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter your course: ");
        String course = sc.nextLine();
        System.out.println(" ");
        System.out.println(" ");

        //first person
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setCourse(course);

        //second person

        System.out.println("Enter your name: ");
        String name2 = sc.nextLine();
        System.out.println("Enter your email: ");
        String email2 = sc.nextLine();
        System.out.println("Enter your course: ");
        String course2 = sc.nextLine();
        System.out.println(" ");
        System.out.println(" ");


        Student student2 = new Student();
        student2.setName(name2);
        student2.setEmail(email2);
        student2.setCourse(course2);


        //third student
        System.out.println("Enter your name: ");
        String name3 = sc.nextLine();
        System.out.println("Enter your email: ");
        String email3 = sc.nextLine();
        System.out.println("Enter your course: ");
        String course3 = sc.nextLine();
        System.out.println(" ");
        System.out.println(" ");


        Student student3 = new Student();
        student3.setName(name3);
        student3.setEmail(email3);
        student3.setCourse(course3);

        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
    }
}
