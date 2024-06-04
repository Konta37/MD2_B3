package BT;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[5][5];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = (int) (Math.random() * 100);
            }
        }
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
        int total=0;
        //first X
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if(row == column){
                    total+=array[row][column];
                }
            }
        }
        //second X
        for (int row = 0; row < array.length; row++){
            total += array[row][array[row].length-1-row];
        }
        System.out.println("Tổng 2 đường chéo chính trong mảng 2 chiều là: "+total);
    }
}
