package BT;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] totalArray = new int[array1.length + array2.length];
        int i=0;
        while(i<array1.length){
            System.out.println("Mảng 1. Nhập phần tử thứ " + i+" là: ");
            array1[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        int j=0;
        while(j<array2.length){
            System.out.println("Mảng 2. Nhập phần tử thứ " + j+" là: ");
            array2[j] = Integer.parseInt(sc.nextLine());
            j++;
        }
        int k=0;
        j=0;
        while(k<totalArray.length){
            if(k<array1.length){
                totalArray[k] = array1[k];
            }else {
                totalArray[k] = array2[j];
                j++;
            }
            k++;
        }
        k=0;
        System.out.printf("%-20s%s", "Phần tử trong dãy sau khi them là: ", "");
        while(k<totalArray.length){
            System.out.print(totalArray[k] + "\t");
            k++;
        }



    }
}
