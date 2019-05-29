package main;

import controller.StudentController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------Menu----------------");
            System.out.println("1. Add new student");
            System.out.println("2. Save.");
            System.out.println("3. Display all student.");
            System.out.println("4. Exit.");
            System.out.println("---------------------------------");
            System.out.println("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    controller.add();
                    break;
                case 2:
                    controller.save();
                    break;
                case 3:
                    controller.display();
                    break;
                case 4:
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Lựa chọn sai, vui lòng nhập số trong khoảng từ 1 đến 3.");
                    break;
            }
        }

    }
}
