package com.minhlt2004110044.tuan04;  
import java.util.Arrays;
import java.util.Scanner;

public class lab3bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] mangA;
        int N;

        do {
            System.out.print("Nhập kích thước số phần tử mảng: ");
            N = input.nextInt();
        } while ((N < 0 && N > 100));
        mangA = new int[N]; 
        
        for (int i = 0; i < N; i++) {
            System.out.printf("Nhập số nguyên thứ %d: ", i+1);
            mangA[i] = input.nextInt();
        }

        Arrays.sort(mangA);
        System.out.print("\n=============================");
        System.out.println("\nSắp xếp mảng vừa nhập theo thứ tự thấp đến cao");
        
        for(int i = 0; i < mangA.length; i++){
           System.out.print(mangA[i] + "  ");
       
        }

        
        int Min = mangA[0]; 
        System.out.print("\n=============================");
        for (int i = 0; i < mangA.length; i++) {
            if(mangA[i]< Min)
                Min = mangA[i];      
        }
        System.out.println("\nPhần tử nhỏ nhất trong mảng\n" + Min);


        int tong = 0;
        for(int i=0; i<mangA.length; i++){
        	tong = tong + mangA[i];
        }
        int trungbinh = tong / 3;
    
        System.out.format("\nTrung bình cộng các phần tử chia hết cho 3 = " + trungbinh);
        input.close();
    }
}
