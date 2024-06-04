package BT;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        int size;
        int[] array;
        int[] arrayNew;
        Scanner sc = new Scanner(System.in);

        //gioi han tong phan tu trong mang
        do{
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("The array is too large (>20).");
            }
        } while(size > 20);

        array = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Phần tử trong dãy là: ", "");
        for (int i =0; i<size; i++){
            System.out.print(array[i] + "\t");
        }

        System.out.println("\nNhập vị trí phần tử muốn xoá: ");
        int index = sc.nextInt();
        arrayNew = new int[size-1];
        for(int i=0, k=0; i<size; i++){
            if(i!=index){
                arrayNew[k] = array[i];
                k++;
            }
        }
        System.out.printf("%-20s%s", "Phần tử trong dãy sau khi xoa là: ", "");
        for(int i=0; i<arrayNew.length; i++){
            System.out.print(arrayNew[i] + "\t");
        }
    }
}
