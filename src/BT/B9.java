package BT;

import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = 0, max2 = 0, maxIndex = 0, max2Index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max2 = max;
                max = array[i];
                max2Index = maxIndex;
                maxIndex = i;
            }
            if (max2 < array[i] && max > array[i]) {
                max2 = array[i];
                max2Index = i;
            }
        }
        System.out.println("Max la: " + max + " vi tri cua max la: " + maxIndex + "vi tri max thứ 2 do la: " + max2Index);
    }

}
