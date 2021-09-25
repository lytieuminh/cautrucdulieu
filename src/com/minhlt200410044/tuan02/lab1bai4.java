package com.minhlt200410044.tuan02;
import java.util.Scanner;
public class lab1bai4 { 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print(" ta có phương trình dạng ax^2+bx+c=0  "); 
        System.out.print(" nhập a  "); 
        double a = scanner.nextInt();  
        System.out.print(" nhập b   "); 
        double b = scanner.nextInt(); 
        System.out.print(" nhập c   "); 
        double c = scanner.nextInt(); 
        System.out.println("tính delta :" + (b*b - 4 * a * c));
        System.out.println("tính căn của delta :" + Math.sqrt(b*b - 4 * a * c));
        scanner.close();
    }   
    
}
