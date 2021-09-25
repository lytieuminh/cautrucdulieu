package com.minhlt200410044.tuan02;
import java.util.Scanner;


public class lab1bai3 {
   
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print(" nhập độ dài của cạnh khối lập phương: "); 
        double canh = scanner.nextInt();  
        System.out.println("thể tích khối lập phương là :" + (canh*canh*canh));
        scanner.close();
    }

}



