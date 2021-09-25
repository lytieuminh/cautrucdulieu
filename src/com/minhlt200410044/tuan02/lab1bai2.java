package com.minhlt200410044.tuan02;



import java.util.Scanner;



public class lab1bai2 {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print(" nhập chiều dài: "); 
        double dai = scanner.nextInt();  
        System.out.print(" nhập chiều rộng : "); 
        double rong = scanner.nextInt(); 
        System.out.println("chu vi hình chữ nhật là :" + (dai+rong)*2);
        System.out.println("diện tích hình chữ nhật là :" + (dai*rong));
        System.out.println("cạnh nhỏ nhất hình chữ nhật là :" + Math.min(dai, rong));
        scanner.close();
    }

}

