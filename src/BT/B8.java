package BT;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textValue = "Hello World";

        String[] arr =textValue.split("");
        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j =0; j < arr.length; j++) {
//                if (arr[i].equals(arr[j])) {
//                    count++;
//                }
//            }
//            System.out.println("Kí tự "+arr[i]+ " xuất hiện "+ count);
//        }
        int count=0;
        System.out.println("Nhap ki tu muon tim");
        char c = sc.next().charAt(0);
        for(int i=0;i<textValue.length();i++){
            if(c==textValue.charAt(i)){
                count++;
            }
        }
        if(count==0){
            System.out.println("Ko ton tai ki tu muon tim");
        } else {
            System.out.println("Ton tai ki tu " + count + " lan");
        }
    }
}
