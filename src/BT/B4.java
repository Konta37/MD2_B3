package BT;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Nhập:");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
        int maxNumber=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (maxNumber <= array[i][j]) {
                    maxNumber = array[i][j];
                }
            }
        }
        System.out.println("Số LN là: "+maxNumber);
    }
}
