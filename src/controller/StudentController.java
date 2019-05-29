package controller;

import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private static ArrayList<Student> list = new ArrayList<>();

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID:");
        String id = scanner.nextLine();
        System.out.println("First name:");
        String firstName = scanner.nextLine();
        System.out.println("Last name:");
        String lastName = scanner.nextLine();
        System.out.println("Age:");
        String age = scanner.nextLine();
        Student student = new Student(id, firstName, lastName, age);
        list.add(student);
    }

    public void save() {
        try {
            FileWriter writer = new FileWriter("D:\\Java Project\\thi\\src\\students.dat");
            BufferedWriter buffer = new BufferedWriter(writer);

            for (Student student : list) {
                buffer.write(student.getEnrolID() + "@" + student.getFirstName() + "@" + student.getLastName() + "@" + student.getAge() + "\n");
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void display() {
        try {
            FileReader fileReader = new FileReader("D:\\Java Project\\thi\\src\\students.dat");
            BufferedReader br = new BufferedReader(fileReader);
            System.out.printf("%-17s%-18s%s\n", "EnrolID", "FullName", "Age");
            System.out.printf("%-13s%-20s%s\n", "---------", "-----------------", "-------");
            String line;
            while ((line = br.readLine()) != null) {
                String[] student = line.split("@");
                System.out.printf("%-15s%-20s%-15s\n", student[0], student[1] + " " + student[2], student[3]);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

