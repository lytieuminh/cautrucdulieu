package com.minhlt200410044.tuan02;
import java.util.Scanner;
public class lab2bai2 {
  
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in); 
        System.out.print("nhập a  "); 
        Float a = scanner.nextFloat();    
        System.out.print("nhập b: "); 
        Float b = scanner.nextFloat(); 
        System.out.print("nhập c: "); 
        Float c = scanner.nextFloat(); 
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: x =" + (-c / b));
            }
        }
        
        Float delta = b*b - 4*a*c;
        Float x1;
        Float x2;
        
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép x1 = x2 = "+ x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
            scanner.close();
        }
    }
}
