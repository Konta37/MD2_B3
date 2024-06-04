package TT.TTB4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caculator caculator = new Caculator();
        System.out.println("Nhap a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap b: ");
        double b = Double.parseDouble(sc.nextLine());

        //Đưa value qua caculator
        caculator.setA(a);
        caculator.setB(b);
        //Tinh toan
        System.out.println("Tong: "+caculator.add());
        System.out.println("Hieu: "+caculator.sub());
        System.out.println("Tich: "+caculator.multi());
        System.out.println("Chia: "+caculator.div());


    }
}
