package com.minhlt2004110044.tuan02;
import java.util.Scanner;
public class lab2bai1 {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in); 
        System.out.print("nhập a  "); 
        double a = scanner.nextInt();    
        System.out.print("nhập b: "); 
        double b = scanner.nextInt(); 
        if (a==0){
            if(b==0){
            System.out.println(" phương trình có vô số nghiệm");
            }else{
                System.out.println(" phương trình vô nghiệm ");
            }
        }else{
        
        System.out.println(" phương trình có nghiệm x = "+ (-b/a));
        scanner.close();
    }

}

}