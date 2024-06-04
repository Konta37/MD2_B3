package TT.TTB2;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int studentId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên:");
        String studentName = sc.nextLine();
        boolean sex = true;
        System.out.println("Nhập class:");
        String className = sc.nextLine();
        System.out.println("Nhập tuoi:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap address");
        String address = sc.nextLine();

        students students = new students(studentId, studentName, sex, className, age, address);
        System.out.println("Hien : \n" + students.display());

    }

}
